package org.ros.urdf.generator;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.ros.model.urdf.Axis;
import org.ros.model.urdf.Box;
import org.ros.model.urdf.Color;
import org.ros.model.urdf.LinkRef;
import org.ros.model.urdf.Material;
import org.ros.model.urdf.Mesh;
import org.ros.model.urdf.Pose;
import org.ros.model.urdf.Vector3;
import org.ros.model.urdf.Vector4;

/**
 * 
 * The underlying URDF model was generated from the schema available on
 * https://github.com/ros/urdfdom/tree/master/xsd. The EMF model contains
 * additional transient properties (e.g. Vector3D) to improve the convenience of
 * the DSL. This class is responsible for mapping those transient properties
 * onto the original model.
 * 
 * @author Wolfgang Geck
 *
 */

public class UrdfStateComputer implements IDerivedStateComputer {

	@Override
	public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
		if (!preLinkingPhase) {
			EcoreUtil2.getAllContents(resource, true).forEachRemaining(this::setDerivedState);
		}
	}

	private void setDerivedState(final Object object) {
		if (object instanceof Pose) {
			updatePoseState((Pose) object);
		}
		if (object instanceof Color) {
			updateColorState((Color) object);
		}
		if (object instanceof Box) {
			updateBoxState((Box) object);
		}
		if (object instanceof Mesh) {
			updateMeshState((Mesh) object);
		}
		if (object instanceof Axis) {
			updateAxisState((Axis) object);
		}
		if (object instanceof LinkRef) {
			final LinkRef ref = (LinkRef) object;
			ref.setLink(ref.getLinkRef() != null ? ref.getLinkRef().getName() : ref.getLink());
		}
		if (object instanceof Material) {
			final Material material = (Material) object;
			material.setName(
					(material.getMaterialRef() != null ? material.getMaterialRef().getName() : material.getName()));
		}
	}

	private void updateAxisState(Axis axis) {
		final Vector3 vector = axis.getXyzVector();
		axis.setXyz(vector != null ? vector.toString() : null);
	}

	private void updateMeshState(final Mesh mesh) {
		final Vector3 scaleVector = mesh.getScaleVector();
		mesh.setScale(scaleVector != null ? scaleVector.toString() : null);
	}

	private void updateBoxState(final Box box) {
		final Vector3 dimension = box.getDimension();
		box.setSize(dimension != null ? dimension.toString() : null);
	}

	private void updateColorState(final Color color) {
		final Vector4 colorVec = color.getColor();
		color.setRgba(colorVec != null ? colorVec.toString() : null);
	}

	private void updatePoseState(final Pose pose) {
		final Vector3 xyz = pose.getXyzVector();
		final Vector3 rpY = pose.getRpyVector();
		pose.setRpy(rpY != null ? rpY.toString() : null);
		pose.setXyz(xyz != null ? xyz.toString() : null);
	}

	@Override
	public void discardDerivedState(final DerivedStateAwareResource resource) {
		// nothing to discard
	}

}
