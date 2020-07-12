package com.javahacks.urdf.server.urdf.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.ros.model.urdf.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ModelConverter {
    public static final String ASSETS_BASE_URL = "/urdf/asset?fileName=";
    private final ResourceSet resourceSet;

    @Autowired
    public ModelConverter(final ResourceSet resourceSet) {
        this.resourceSet = resourceSet;
    }

    public RobotDescription createDescription(final String fileName) throws IOException {
        final RobotDescription robotDescription = new RobotDescription();
        final RobotType model = loadRobotModel(fileName);
        fillMaterials(model, robotDescription);
        fillMeshes(model, robotDescription);
        fillJoints(model.getJoint(), robotDescription);
        setAssetUrls(robotDescription, Paths.get(fileName));
        return robotDescription;
    }


    private void fillMeshes(final RobotType model, final RobotDescription robotDescription) {
        if (model.getLink() == null) {
            return;
        }
        for (final Link link : model.getLink()) {
            for (final Visual visual : link.getVisual()) {
                handleVisual(robotDescription, link, visual);
            }
        }
    }

    private void handleVisual(final RobotDescription robotDescription, final Link link, final Visual visual) {
        if (link.getName() == null) {
            return;
        }

        if (visual.getGeometry().getBox() != null) {
            final BoxMesh mesh = createBoxMesh(link, visual);
            robotDescription.getBoxes().add(mesh);
        }
        if (visual.getGeometry().getCylinder() != null) {
            final CylinderMesh mesh = createCylinderMesh(link, visual);
            robotDescription.getCylinders().add(mesh);
        }
        if (visual.getGeometry().getSphere() != null) {
            final SphereMesh mesh = createSphereMesh(link, visual);
            robotDescription.getSpheres().add(mesh);
        }
        if (visual.getGeometry().getMesh() != null) {
            final MeshVisual mesh = createMesh(link, visual);
            robotDescription.getMeshVisuals().add(mesh);
        }
    }


    private MeshVisual createMesh(final Link link, final Visual visual) {
        final Mesh mesh = visual.getGeometry().getMesh();
        final float[] scale = stringToFloatArray(mesh.getScale(), 3);


        final MeshVisual meshLink = new MeshVisual(link.getName(), mesh.getFilename(), scale[0], scale[1], scale[2]);
        fillBaseProperties(visual.getOrigin(), meshLink);
        meshLink.setMaterialId(resolveMaterialId(visual));
        return meshLink;
    }


    private BoxMesh createBoxMesh(final Link link, final Visual visual) {
        final Box box = visual.getGeometry().getBox();
        final float[] size = stringToFloatArray(box.getSize(), 3);
        final BoxMesh mesh = new BoxMesh(link.getName(), size[0], size[1], size[2]);
        fillBaseProperties(visual.getOrigin(), mesh);
        mesh.setMaterialId(resolveMaterialId(visual));
        return mesh;
    }


    private CylinderMesh createCylinderMesh(final Link link, final Visual visual) {
        final Cylinder cylinder = visual.getGeometry().getCylinder();
        final CylinderMesh mesh = new CylinderMesh(link.getName(), cylinder.getLength(), cylinder.getRadius());
        fillBaseProperties(visual.getOrigin(), mesh);
        mesh.setMaterialId(resolveMaterialId(visual));
        return mesh;
    }

    private SphereMesh createSphereMesh(final Link link, final Visual visual) {
        final Sphere sphere = visual.getGeometry().getSphere();
        final SphereMesh mesh = new SphereMesh(link.getName(), sphere.getRadius());
        fillBaseProperties(visual.getOrigin(), mesh);
        mesh.setMaterialId(resolveMaterialId(visual));
        return mesh;
    }


    private void fillJoints(final EList<Joint> joints, final RobotDescription robotDescription) {
        for (final Joint joint : joints) {
            if (validateJoint(joint)) {
                final String parentId = joint.getParent().getLink();
                final String childId = joint.getChild().getLink();
                final JointInfo jointInfo = new JointInfo(joint.getName(), joint.getType(), parentId, childId);
                fillBaseProperties(joint.getOrigin(), jointInfo);
                fillJointProperties(joint, jointInfo);

                robotDescription.getJoints().add(jointInfo);
            }
        }
    }

    private boolean validateJoint(final Joint joint) {
        boolean parentOk = joint.getParent() != null && joint.getParent().getLink() != null;
        boolean childOk = joint.getChild() != null && joint.getChild().getLink() != null;
        return parentOk && childOk && joint.getName() != null;
    }

    private void fillJointProperties(final Joint joint, final JointInfo jointInfo) {
        if (joint.getAxis() != null && joint.getAxis().getXyzVector() != null) {
            jointInfo.setAxeX(joint.getAxis().getXyzVector().getA());
            jointInfo.setAxeY(joint.getAxis().getXyzVector().getC()); //fix coordinate system by swapping y and z
            jointInfo.setAxeZ(joint.getAxis().getXyzVector().getB());
        }
        if (joint.getLimit() != null) {
            jointInfo.setLowerLimit(joint.getLimit().getLower());
            jointInfo.setUpperLimit(joint.getLimit().getUpper());
        }
    }

    private void fillBaseProperties(final Pose pose, final Location location) {
        if (pose != null && pose.getXyzVector() != null) {
            location.setX(pose.getXyzVector().getA());
            location.setY(pose.getXyzVector().getC()); //fix coordinate system by swapping y and z
            location.setZ(pose.getXyzVector().getB());
        }
        if (pose != null && pose.getRpyVector() != null) {
            location.setRoll(pose.getRpyVector().getA());
            location.setPitch(pose.getRpyVector().getC()); //fix coordinate system by swapping y and z
            location.setYaw(pose.getRpyVector().getB());
        }

    }

    private static String resolveMaterialId(final Visual visual) {
        return visual.getMaterial() != null ? visual.getMaterial().getName() : null;
    }


    private void fillMaterials(final RobotType model, final RobotDescription robotDescription) {
        for (final MaterialGlobal materialGlobal : model.getMaterial()) {
            if (materialGlobal.getColor() != null && materialGlobal.getName() != null) {
                final float[] colors = stringToFloatArray(materialGlobal.getColor().getRgba(), 4);
                final ColorMaterial material = new ColorMaterial(materialGlobal.getName(), colors[0], colors[1], colors[2], colors[3]);
                robotDescription.getColors().add(material);
            }
            if (materialGlobal.getTexture() != null) {
                final TextureMaterial material = new TextureMaterial(materialGlobal.getName(), materialGlobal.getTexture().getFilename());
                robotDescription.getTextures().add(material);
            }
        }
    }

    private void setAssetUrls(final RobotDescription robotDescription, final Path path) {
        for (final MeshVisual meshVisual : robotDescription.getMeshVisuals()) {
            final Path absolutePath = path.resolveSibling(meshVisual.getFileName());
            meshVisual.setFileName(ASSETS_BASE_URL + absolutePath.toString());
        }
        for (final TextureMaterial textureMaterial : robotDescription.getTextures()) {
            final Path absolutePath = path.resolveSibling(textureMaterial.getFileName());
            textureMaterial.setFileName(ASSETS_BASE_URL + absolutePath.toString());
        }
    }

    private float[] stringToFloatArray(final String s, final int size) {
        final float[] result = new float[size];
        final String[] input = s != null ? s.split("\\s+") : new String[0];
        for (int i = 0; i < size && i < input.length; i++) {
            try {
                result[i] = Float.parseFloat(input[i]);
            } catch (final NumberFormatException e) {
                result[i] = 0;
            }
        }
        return result;
    }

    private RobotType loadRobotModel(final String fileName) throws IOException {
        final Resource resource = getOrCreateResource(URI.createURI(fileName));
        resource.load(null);
        return (RobotType) resource.getContents().get(0);
    }

    private Resource getOrCreateResource(final URI modelUri) {
        final Resource existingResource = resourceSet.getResource(modelUri, false);
        if (existingResource != null) {
            existingResource.unload();
            return existingResource;
        }
        return resourceSet.createResource(modelUri);
    }

}
