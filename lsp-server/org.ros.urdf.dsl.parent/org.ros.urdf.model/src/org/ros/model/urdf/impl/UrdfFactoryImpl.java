/**
 */
package org.ros.model.urdf.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ros.model.urdf.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UrdfFactoryImpl extends EFactoryImpl implements UrdfFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UrdfFactory init() {
		try {
			UrdfFactory theUrdfFactory = (UrdfFactory)EPackage.Registry.INSTANCE.getEFactory(UrdfPackage.eNS_URI);
			if (theUrdfFactory != null) {
				return theUrdfFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UrdfFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrdfFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UrdfPackage.ACTUATOR_TRANSMISSION: return createActuatorTransmission();
			case UrdfPackage.AXIS: return createAxis();
			case UrdfPackage.BOX: return createBox();
			case UrdfPackage.CALIBRATION: return createCalibration();
			case UrdfPackage.CHILD: return createChild();
			case UrdfPackage.COLLISION: return createCollision();
			case UrdfPackage.COLOR: return createColor();
			case UrdfPackage.CYLINDER: return createCylinder();
			case UrdfPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case UrdfPackage.DYNAMICS: return createDynamics();
			case UrdfPackage.GAP_JOINT_TRANSMISSION: return createGapJointTransmission();
			case UrdfPackage.GEOMETRY: return createGeometry();
			case UrdfPackage.INERTIA: return createInertia();
			case UrdfPackage.INERTIAL: return createInertial();
			case UrdfPackage.JOINT: return createJoint();
			case UrdfPackage.LIMIT: return createLimit();
			case UrdfPackage.LINK: return createLink();
			case UrdfPackage.MASS: return createMass();
			case UrdfPackage.MATERIAL: return createMaterial();
			case UrdfPackage.MATERIAL_GLOBAL: return createMaterialGlobal();
			case UrdfPackage.MESH: return createMesh();
			case UrdfPackage.MIMIC: return createMimic();
			case UrdfPackage.NAME: return createName();
			case UrdfPackage.PARENT: return createParent();
			case UrdfPackage.PASSIVE_JOINT_TRANSMISSION: return createPassiveJointTransmission();
			case UrdfPackage.POSE: return createPose();
			case UrdfPackage.ROBOT_TYPE: return createRobotType();
			case UrdfPackage.SAFETY_CONTROLLER: return createSafetyController();
			case UrdfPackage.SPHERE: return createSphere();
			case UrdfPackage.TEXTURE: return createTexture();
			case UrdfPackage.TRANSMISSION: return createTransmission();
			case UrdfPackage.USE_SIMULATED_GRIPPER_JOINT_TYPE: return createUseSimulatedGripperJointType();
			case UrdfPackage.VERBOSE: return createVerbose();
			case UrdfPackage.VISUAL: return createVisual();
			case UrdfPackage.VECTOR3: return createVector3();
			case UrdfPackage.VECTOR4: return createVector4();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorTransmission createActuatorTransmission() {
		ActuatorTransmissionImpl actuatorTransmission = new ActuatorTransmissionImpl();
		return actuatorTransmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis createAxis() {
		AxisImpl axis = new AxisImpl();
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Box createBox() {
		BoxImpl box = new BoxImpl();
		return box;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calibration createCalibration() {
		CalibrationImpl calibration = new CalibrationImpl();
		return calibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Child createChild() {
		ChildImpl child = new ChildImpl();
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collision createCollision() {
		CollisionImpl collision = new CollisionImpl();
		return collision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColor() {
		ColorImpl color = new ColorImpl();
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cylinder createCylinder() {
		CylinderImpl cylinder = new CylinderImpl();
		return cylinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dynamics createDynamics() {
		DynamicsImpl dynamics = new DynamicsImpl();
		return dynamics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GapJointTransmission createGapJointTransmission() {
		GapJointTransmissionImpl gapJointTransmission = new GapJointTransmissionImpl();
		return gapJointTransmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry createGeometry() {
		GeometryImpl geometry = new GeometryImpl();
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inertia createInertia() {
		InertiaImpl inertia = new InertiaImpl();
		return inertia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inertial createInertial() {
		InertialImpl inertial = new InertialImpl();
		return inertial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Joint createJoint() {
		JointImpl joint = new JointImpl();
		return joint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Limit createLimit() {
		LimitImpl limit = new LimitImpl();
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mass createMass() {
		MassImpl mass = new MassImpl();
		return mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Material createMaterial() {
		MaterialImpl material = new MaterialImpl();
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialGlobal createMaterialGlobal() {
		MaterialGlobalImpl materialGlobal = new MaterialGlobalImpl();
		return materialGlobal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mesh createMesh() {
		MeshImpl mesh = new MeshImpl();
		return mesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mimic createMimic() {
		MimicImpl mimic = new MimicImpl();
		return mimic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name createName() {
		NameImpl name = new NameImpl();
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parent createParent() {
		ParentImpl parent = new ParentImpl();
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveJointTransmission createPassiveJointTransmission() {
		PassiveJointTransmissionImpl passiveJointTransmission = new PassiveJointTransmissionImpl();
		return passiveJointTransmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pose createPose() {
		PoseImpl pose = new PoseImpl();
		return pose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotType createRobotType() {
		RobotTypeImpl robotType = new RobotTypeImpl();
		return robotType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyController createSafetyController() {
		SafetyControllerImpl safetyController = new SafetyControllerImpl();
		return safetyController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sphere createSphere() {
		SphereImpl sphere = new SphereImpl();
		return sphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Texture createTexture() {
		TextureImpl texture = new TextureImpl();
		return texture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transmission createTransmission() {
		TransmissionImpl transmission = new TransmissionImpl();
		return transmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseSimulatedGripperJointType createUseSimulatedGripperJointType() {
		UseSimulatedGripperJointTypeImpl useSimulatedGripperJointType = new UseSimulatedGripperJointTypeImpl();
		return useSimulatedGripperJointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Verbose createVerbose() {
		VerboseImpl verbose = new VerboseImpl();
		return verbose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visual createVisual() {
		VisualImpl visual = new VisualImpl();
		return visual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3 createVector3() {
		Vector3Impl vector3 = new Vector3Impl();
		return vector3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector4 createVector4() {
		Vector4Impl vector4 = new Vector4Impl();
		return vector4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrdfPackage getUrdfPackage() {
		return (UrdfPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UrdfPackage getPackage() {
		return UrdfPackage.eINSTANCE;
	}

} //UrdfFactoryImpl
