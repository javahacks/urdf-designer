/**
 */
package org.ros.model.urdf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ros.model.urdf.UrdfFactory
 * @model kind="package"
 * @generated
 */
public interface UrdfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "urdf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ros.org/model/urdf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "urdf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UrdfPackage eINSTANCE = org.ros.model.urdf.impl.UrdfPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.ActuatorTransmissionImpl <em>Actuator Transmission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.ActuatorTransmissionImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getActuatorTransmission()
	 * @generated
	 */
	int ACTUATOR_TRANSMISSION = 0;

	/**
	 * The feature id for the '<em><b>Mechanical Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_TRANSMISSION__MECHANICAL_REDUCTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_TRANSMISSION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Actuator Transmission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_TRANSMISSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Actuator Transmission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_TRANSMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.AxisImpl <em>Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.AxisImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getAxis()
	 * @generated
	 */
	int AXIS = 1;

	/**
	 * The feature id for the '<em><b>Xyz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__XYZ = 0;

	/**
	 * The feature id for the '<em><b>Xyz Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__XYZ_VECTOR = 1;

	/**
	 * The number of structural features of the '<em>Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.BoxImpl <em>Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.BoxImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getBox()
	 * @generated
	 */
	int BOX = 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__DIMENSION = 1;

	/**
	 * The number of structural features of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.CalibrationImpl <em>Calibration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.CalibrationImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getCalibration()
	 * @generated
	 */
	int CALIBRATION = 3;

	/**
	 * The feature id for the '<em><b>Reference Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION__REFERENCE_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Rising</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION__RISING = 1;

	/**
	 * The feature id for the '<em><b>Falling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION__FALLING = 2;

	/**
	 * The number of structural features of the '<em>Calibration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Calibration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIBRATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.ChildImpl <em>Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.ChildImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getChild()
	 * @generated
	 */
	int CHILD = 4;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD__LINK = 0;

	/**
	 * The number of structural features of the '<em>Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.CollisionImpl <em>Collision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.CollisionImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getCollision()
	 * @generated
	 */
	int COLLISION = 5;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION__ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION__GEOMETRY = 1;

	/**
	 * The feature id for the '<em><b>Verbose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION__VERBOSE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION__NAME = 3;

	/**
	 * The number of structural features of the '<em>Collision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Collision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.ColorImpl <em>Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.ColorImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 6;

	/**
	 * The feature id for the '<em><b>Rgba</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__RGBA = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR__COLOR = 1;

	/**
	 * The number of structural features of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.CylinderImpl <em>Cylinder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.CylinderImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getCylinder()
	 * @generated
	 */
	int CYLINDER = 7;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__RADIUS = 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER__LENGTH = 1;

	/**
	 * The number of structural features of the '<em>Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cylinder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CYLINDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.DocumentRootImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Robot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROBOT = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.DynamicsImpl <em>Dynamics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.DynamicsImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getDynamics()
	 * @generated
	 */
	int DYNAMICS = 9;

	/**
	 * The feature id for the '<em><b>Damping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS__DAMPING = 0;

	/**
	 * The feature id for the '<em><b>Friction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS__FRICTION = 1;

	/**
	 * The number of structural features of the '<em>Dynamics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dynamics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.GapJointTransmissionImpl <em>Gap Joint Transmission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.GapJointTransmissionImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getGapJointTransmission()
	 * @generated
	 */
	int GAP_JOINT_TRANSMISSION = 10;

	/**
	 * The feature id for the '<em><b>L0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_JOINT_TRANSMISSION__L0 = 0;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_JOINT_TRANSMISSION__A = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_JOINT_TRANSMISSION__B = 2;

	/**
	 * The feature id for the '<em><b>Gear Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_JOINT_TRANSMISSION__GEAR_RATIO = 3;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_JOINT_TRANSMISSION__H = 4;

	/**
	 * The feature id for the '<em><b>Mechanical Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_JOINT_TRANSMISSION__MECHANICAL_REDUCTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_JOINT_TRANSMISSION__NAME = 6;

	/**
	 * The feature id for the '<em><b>Phi0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_JOINT_TRANSMISSION__PHI0 = 7;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_JOINT_TRANSMISSION__R = 8;

	/**
	 * The feature id for the '<em><b>Screw Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_JOINT_TRANSMISSION__SCREW_REDUCTION = 9;

	/**
	 * The feature id for the '<em><b>T0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_JOINT_TRANSMISSION__T0 = 10;

	/**
	 * The feature id for the '<em><b>Theta0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_JOINT_TRANSMISSION__THETA0 = 11;

	/**
	 * The number of structural features of the '<em>Gap Joint Transmission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_JOINT_TRANSMISSION_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Gap Joint Transmission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAP_JOINT_TRANSMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.GeometryImpl <em>Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.GeometryImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getGeometry()
	 * @generated
	 */
	int GEOMETRY = 11;

	/**
	 * The feature id for the '<em><b>Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__BOX = 0;

	/**
	 * The feature id for the '<em><b>Cylinder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__CYLINDER = 1;

	/**
	 * The feature id for the '<em><b>Sphere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__SPHERE = 2;

	/**
	 * The feature id for the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__MESH = 3;

	/**
	 * The number of structural features of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.InertiaImpl <em>Inertia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.InertiaImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getInertia()
	 * @generated
	 */
	int INERTIA = 12;

	/**
	 * The feature id for the '<em><b>Ixx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIA__IXX = 0;

	/**
	 * The feature id for the '<em><b>Ixy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIA__IXY = 1;

	/**
	 * The feature id for the '<em><b>Ixz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIA__IXZ = 2;

	/**
	 * The feature id for the '<em><b>Iyy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIA__IYY = 3;

	/**
	 * The feature id for the '<em><b>Iyz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIA__IYZ = 4;

	/**
	 * The feature id for the '<em><b>Izz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIA__IZZ = 5;

	/**
	 * The number of structural features of the '<em>Inertia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Inertia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.InertialImpl <em>Inertial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.InertialImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getInertial()
	 * @generated
	 */
	int INERTIAL = 13;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL__ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL__MASS = 1;

	/**
	 * The feature id for the '<em><b>Inertia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL__INERTIA = 2;

	/**
	 * The number of structural features of the '<em>Inertial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Inertial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INERTIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.JointImpl <em>Joint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.JointImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getJoint()
	 * @generated
	 */
	int JOINT = 14;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__CHILD = 2;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__AXIS = 3;

	/**
	 * The feature id for the '<em><b>Calibration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__CALIBRATION = 4;

	/**
	 * The feature id for the '<em><b>Dynamics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__DYNAMICS = 5;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__LIMIT = 6;

	/**
	 * The feature id for the '<em><b>Safety Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__SAFETY_CONTROLLER = 7;

	/**
	 * The feature id for the '<em><b>Mimic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__MIMIC = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__NAME = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__TYPE = 10;

	/**
	 * The number of structural features of the '<em>Joint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Joint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.LimitImpl <em>Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.LimitImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getLimit()
	 * @generated
	 */
	int LIMIT = 15;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__LOWER = 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__UPPER = 1;

	/**
	 * The feature id for the '<em><b>Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__EFFORT = 2;

	/**
	 * The feature id for the '<em><b>Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT__VELOCITY = 3;

	/**
	 * The number of structural features of the '<em>Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.LinkImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 16;

	/**
	 * The feature id for the '<em><b>Inertial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__INERTIAL = 0;

	/**
	 * The feature id for the '<em><b>Visual</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__VISUAL = 1;

	/**
	 * The feature id for the '<em><b>Collision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__COLLISION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.MassImpl <em>Mass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.MassImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getMass()
	 * @generated
	 */
	int MASS = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Mass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.MaterialImpl <em>Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.MaterialImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getMaterial()
	 * @generated
	 */
	int MATERIAL = 18;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__TEXTURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__NAME = 2;

	/**
	 * The number of structural features of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.MaterialGlobalImpl <em>Material Global</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.MaterialGlobalImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getMaterialGlobal()
	 * @generated
	 */
	int MATERIAL_GLOBAL = 19;

	/**
	 * The feature id for the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_GLOBAL__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_GLOBAL__TEXTURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_GLOBAL__NAME = 2;

	/**
	 * The number of structural features of the '<em>Material Global</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_GLOBAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Material Global</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_GLOBAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.MeshImpl <em>Mesh</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.MeshImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getMesh()
	 * @generated
	 */
	int MESH = 20;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH__FILENAME = 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH__SCALE = 1;

	/**
	 * The feature id for the '<em><b>Scale Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH__SCALE_VECTOR = 2;

	/**
	 * The number of structural features of the '<em>Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mesh</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.MimicImpl <em>Mimic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.MimicImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getMimic()
	 * @generated
	 */
	int MIMIC = 21;

	/**
	 * The feature id for the '<em><b>Joint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIMIC__JOINT = 0;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIMIC__MULTIPLIER = 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIMIC__OFFSET = 2;

	/**
	 * The number of structural features of the '<em>Mimic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIMIC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mimic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIMIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.NameImpl <em>Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.NameImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getName_()
	 * @generated
	 */
	int NAME = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME__NAME = 0;

	/**
	 * The number of structural features of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.ParentImpl <em>Parent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.ParentImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getParent()
	 * @generated
	 */
	int PARENT = 23;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT__LINK = 0;

	/**
	 * The number of structural features of the '<em>Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.PassiveJointTransmissionImpl <em>Passive Joint Transmission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.PassiveJointTransmissionImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getPassiveJointTransmission()
	 * @generated
	 */
	int PASSIVE_JOINT_TRANSMISSION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_JOINT_TRANSMISSION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Passive Joint Transmission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_JOINT_TRANSMISSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Passive Joint Transmission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_JOINT_TRANSMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.PoseImpl <em>Pose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.PoseImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getPose()
	 * @generated
	 */
	int POSE = 25;

	/**
	 * The feature id for the '<em><b>Xyz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE__XYZ = 0;

	/**
	 * The feature id for the '<em><b>Rpy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE__RPY = 1;

	/**
	 * The feature id for the '<em><b>Xyz Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE__XYZ_VECTOR = 2;

	/**
	 * The feature id for the '<em><b>Rpy Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE__RPY_VECTOR = 3;

	/**
	 * The number of structural features of the '<em>Pose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Pose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.RobotTypeImpl <em>Robot Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.RobotTypeImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getRobotType()
	 * @generated
	 */
	int ROBOT_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Joint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_TYPE__JOINT = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_TYPE__LINK = 2;

	/**
	 * The feature id for the '<em><b>Material</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_TYPE__MATERIAL = 3;

	/**
	 * The feature id for the '<em><b>Transmission</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_TYPE__TRANSMISSION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_TYPE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_TYPE__VERSION = 6;

	/**
	 * The number of structural features of the '<em>Robot Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Robot Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.SafetyControllerImpl <em>Safety Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.SafetyControllerImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getSafetyController()
	 * @generated
	 */
	int SAFETY_CONTROLLER = 27;

	/**
	 * The feature id for the '<em><b>Soft Lower Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONTROLLER__SOFT_LOWER_LIMIT = 0;

	/**
	 * The feature id for the '<em><b>Soft Upper Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONTROLLER__SOFT_UPPER_LIMIT = 1;

	/**
	 * The feature id for the '<em><b>KPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONTROLLER__KPOSITION = 2;

	/**
	 * The feature id for the '<em><b>KVelocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONTROLLER__KVELOCITY = 3;

	/**
	 * The number of structural features of the '<em>Safety Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONTROLLER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Safety Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.SphereImpl <em>Sphere</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.SphereImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getSphere()
	 * @generated
	 */
	int SPHERE = 28;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE__RADIUS = 0;

	/**
	 * The number of structural features of the '<em>Sphere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sphere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPHERE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.TextureImpl <em>Texture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.TextureImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getTexture()
	 * @generated
	 */
	int TEXTURE = 29;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE__FILENAME = 0;

	/**
	 * The number of structural features of the '<em>Texture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Texture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.TransmissionImpl <em>Transmission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.TransmissionImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getTransmission()
	 * @generated
	 */
	int TRANSMISSION = 30;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Left Actuator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__LEFT_ACTUATOR = 1;

	/**
	 * The feature id for the '<em><b>Right Actuator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__RIGHT_ACTUATOR = 2;

	/**
	 * The feature id for the '<em><b>Flex Joint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__FLEX_JOINT = 3;

	/**
	 * The feature id for the '<em><b>Roll Joint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__ROLL_JOINT = 4;

	/**
	 * The feature id for the '<em><b>Gap Joint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__GAP_JOINT = 5;

	/**
	 * The feature id for the '<em><b>Passive Joint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__PASSIVE_JOINT = 6;

	/**
	 * The feature id for the '<em><b>Use Simulated Gripper Joint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__USE_SIMULATED_GRIPPER_JOINT = 7;

	/**
	 * The feature id for the '<em><b>Mechanical Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__MECHANICAL_REDUCTION = 8;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__ACTUATOR = 9;

	/**
	 * The feature id for the '<em><b>Joint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__JOINT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__NAME = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__TYPE = 12;

	/**
	 * The number of structural features of the '<em>Transmission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Transmission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.UseSimulatedGripperJointTypeImpl <em>Use Simulated Gripper Joint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.UseSimulatedGripperJointTypeImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getUseSimulatedGripperJointType()
	 * @generated
	 */
	int USE_SIMULATED_GRIPPER_JOINT_TYPE = 31;

	/**
	 * The number of structural features of the '<em>Use Simulated Gripper Joint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_SIMULATED_GRIPPER_JOINT_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Use Simulated Gripper Joint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_SIMULATED_GRIPPER_JOINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.VerboseImpl <em>Verbose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.VerboseImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getVerbose()
	 * @generated
	 */
	int VERBOSE = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBOSE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Verbose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBOSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Verbose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBOSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.VisualImpl <em>Visual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.VisualImpl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getVisual()
	 * @generated
	 */
	int VISUAL = 33;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL__ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL__GEOMETRY = 1;

	/**
	 * The feature id for the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL__MATERIAL = 2;

	/**
	 * The number of structural features of the '<em>Visual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Visual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUAL_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.Vector3Impl <em>Vector3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.Vector3Impl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getVector3()
	 * @generated
	 */
	int VECTOR3 = 34;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3__A = 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3__B = 1;

	/**
	 * The feature id for the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3__C = 2;

	/**
	 * The number of structural features of the '<em>Vector3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vector3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ros.model.urdf.impl.Vector4Impl <em>Vector4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ros.model.urdf.impl.Vector4Impl
	 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getVector4()
	 * @generated
	 */
	int VECTOR4 = 35;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR4__A = 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR4__B = 1;

	/**
	 * The feature id for the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR4__C = 2;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR4__D = 3;

	/**
	 * The number of structural features of the '<em>Vector4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR4_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Vector4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR4_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.ActuatorTransmission <em>Actuator Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator Transmission</em>'.
	 * @see org.ros.model.urdf.ActuatorTransmission
	 * @generated
	 */
	EClass getActuatorTransmission();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.ActuatorTransmission#getMechanicalReduction <em>Mechanical Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanical Reduction</em>'.
	 * @see org.ros.model.urdf.ActuatorTransmission#getMechanicalReduction()
	 * @see #getActuatorTransmission()
	 * @generated
	 */
	EAttribute getActuatorTransmission_MechanicalReduction();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.ActuatorTransmission#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.urdf.ActuatorTransmission#getName()
	 * @see #getActuatorTransmission()
	 * @generated
	 */
	EAttribute getActuatorTransmission_Name();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Axis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axis</em>'.
	 * @see org.ros.model.urdf.Axis
	 * @generated
	 */
	EClass getAxis();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Axis#getXyz <em>Xyz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xyz</em>'.
	 * @see org.ros.model.urdf.Axis#getXyz()
	 * @see #getAxis()
	 * @generated
	 */
	EAttribute getAxis_Xyz();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Axis#getXyzVector <em>Xyz Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xyz Vector</em>'.
	 * @see org.ros.model.urdf.Axis#getXyzVector()
	 * @see #getAxis()
	 * @generated
	 */
	EReference getAxis_XyzVector();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box</em>'.
	 * @see org.ros.model.urdf.Box
	 * @generated
	 */
	EClass getBox();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Box#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.ros.model.urdf.Box#getSize()
	 * @see #getBox()
	 * @generated
	 */
	EAttribute getBox_Size();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Box#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimension</em>'.
	 * @see org.ros.model.urdf.Box#getDimension()
	 * @see #getBox()
	 * @generated
	 */
	EReference getBox_Dimension();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Calibration <em>Calibration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calibration</em>'.
	 * @see org.ros.model.urdf.Calibration
	 * @generated
	 */
	EClass getCalibration();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Calibration#getFalling <em>Falling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Falling</em>'.
	 * @see org.ros.model.urdf.Calibration#getFalling()
	 * @see #getCalibration()
	 * @generated
	 */
	EAttribute getCalibration_Falling();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Calibration#getReferencePosition <em>Reference Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Position</em>'.
	 * @see org.ros.model.urdf.Calibration#getReferencePosition()
	 * @see #getCalibration()
	 * @generated
	 */
	EAttribute getCalibration_ReferencePosition();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Calibration#getRising <em>Rising</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rising</em>'.
	 * @see org.ros.model.urdf.Calibration#getRising()
	 * @see #getCalibration()
	 * @generated
	 */
	EAttribute getCalibration_Rising();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Child <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child</em>'.
	 * @see org.ros.model.urdf.Child
	 * @generated
	 */
	EClass getChild();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Child#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see org.ros.model.urdf.Child#getLink()
	 * @see #getChild()
	 * @generated
	 */
	EAttribute getChild_Link();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Collision <em>Collision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collision</em>'.
	 * @see org.ros.model.urdf.Collision
	 * @generated
	 */
	EClass getCollision();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Collision#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin</em>'.
	 * @see org.ros.model.urdf.Collision#getOrigin()
	 * @see #getCollision()
	 * @generated
	 */
	EReference getCollision_Origin();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Collision#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry</em>'.
	 * @see org.ros.model.urdf.Collision#getGeometry()
	 * @see #getCollision()
	 * @generated
	 */
	EReference getCollision_Geometry();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Collision#getVerbose <em>Verbose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verbose</em>'.
	 * @see org.ros.model.urdf.Collision#getVerbose()
	 * @see #getCollision()
	 * @generated
	 */
	EReference getCollision_Verbose();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Collision#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.urdf.Collision#getName()
	 * @see #getCollision()
	 * @generated
	 */
	EAttribute getCollision_Name();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color</em>'.
	 * @see org.ros.model.urdf.Color
	 * @generated
	 */
	EClass getColor();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Color#getRgba <em>Rgba</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rgba</em>'.
	 * @see org.ros.model.urdf.Color#getRgba()
	 * @see #getColor()
	 * @generated
	 */
	EAttribute getColor_Rgba();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Color#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color</em>'.
	 * @see org.ros.model.urdf.Color#getColor()
	 * @see #getColor()
	 * @generated
	 */
	EReference getColor_Color();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Cylinder <em>Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cylinder</em>'.
	 * @see org.ros.model.urdf.Cylinder
	 * @generated
	 */
	EClass getCylinder();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Cylinder#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.ros.model.urdf.Cylinder#getLength()
	 * @see #getCylinder()
	 * @generated
	 */
	EAttribute getCylinder_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Cylinder#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see org.ros.model.urdf.Cylinder#getRadius()
	 * @see #getCylinder()
	 * @generated
	 */
	EAttribute getCylinder_Radius();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.ros.model.urdf.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.ros.model.urdf.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.ros.model.urdf.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.ros.model.urdf.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.ros.model.urdf.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.ros.model.urdf.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.ros.model.urdf.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.DocumentRoot#getRobot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Robot</em>'.
	 * @see org.ros.model.urdf.DocumentRoot#getRobot()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Robot();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Dynamics <em>Dynamics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamics</em>'.
	 * @see org.ros.model.urdf.Dynamics
	 * @generated
	 */
	EClass getDynamics();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Dynamics#getDamping <em>Damping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damping</em>'.
	 * @see org.ros.model.urdf.Dynamics#getDamping()
	 * @see #getDynamics()
	 * @generated
	 */
	EAttribute getDynamics_Damping();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Dynamics#getFriction <em>Friction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Friction</em>'.
	 * @see org.ros.model.urdf.Dynamics#getFriction()
	 * @see #getDynamics()
	 * @generated
	 */
	EAttribute getDynamics_Friction();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.GapJointTransmission <em>Gap Joint Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gap Joint Transmission</em>'.
	 * @see org.ros.model.urdf.GapJointTransmission
	 * @generated
	 */
	EClass getGapJointTransmission();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.GapJointTransmission#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see org.ros.model.urdf.GapJointTransmission#getA()
	 * @see #getGapJointTransmission()
	 * @generated
	 */
	EAttribute getGapJointTransmission_A();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.GapJointTransmission#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see org.ros.model.urdf.GapJointTransmission#getB()
	 * @see #getGapJointTransmission()
	 * @generated
	 */
	EAttribute getGapJointTransmission_B();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.GapJointTransmission#getGearRatio <em>Gear Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gear Ratio</em>'.
	 * @see org.ros.model.urdf.GapJointTransmission#getGearRatio()
	 * @see #getGapJointTransmission()
	 * @generated
	 */
	EAttribute getGapJointTransmission_GearRatio();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.GapJointTransmission#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>H</em>'.
	 * @see org.ros.model.urdf.GapJointTransmission#getH()
	 * @see #getGapJointTransmission()
	 * @generated
	 */
	EAttribute getGapJointTransmission_H();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.GapJointTransmission#getL0 <em>L0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L0</em>'.
	 * @see org.ros.model.urdf.GapJointTransmission#getL0()
	 * @see #getGapJointTransmission()
	 * @generated
	 */
	EAttribute getGapJointTransmission_L0();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.GapJointTransmission#getMechanicalReduction <em>Mechanical Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanical Reduction</em>'.
	 * @see org.ros.model.urdf.GapJointTransmission#getMechanicalReduction()
	 * @see #getGapJointTransmission()
	 * @generated
	 */
	EAttribute getGapJointTransmission_MechanicalReduction();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.GapJointTransmission#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.urdf.GapJointTransmission#getName()
	 * @see #getGapJointTransmission()
	 * @generated
	 */
	EAttribute getGapJointTransmission_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.GapJointTransmission#getPhi0 <em>Phi0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phi0</em>'.
	 * @see org.ros.model.urdf.GapJointTransmission#getPhi0()
	 * @see #getGapJointTransmission()
	 * @generated
	 */
	EAttribute getGapJointTransmission_Phi0();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.GapJointTransmission#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see org.ros.model.urdf.GapJointTransmission#getR()
	 * @see #getGapJointTransmission()
	 * @generated
	 */
	EAttribute getGapJointTransmission_R();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.GapJointTransmission#getScrewReduction <em>Screw Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Screw Reduction</em>'.
	 * @see org.ros.model.urdf.GapJointTransmission#getScrewReduction()
	 * @see #getGapJointTransmission()
	 * @generated
	 */
	EAttribute getGapJointTransmission_ScrewReduction();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.GapJointTransmission#getT0 <em>T0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>T0</em>'.
	 * @see org.ros.model.urdf.GapJointTransmission#getT0()
	 * @see #getGapJointTransmission()
	 * @generated
	 */
	EAttribute getGapJointTransmission_T0();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.GapJointTransmission#getTheta0 <em>Theta0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theta0</em>'.
	 * @see org.ros.model.urdf.GapJointTransmission#getTheta0()
	 * @see #getGapJointTransmission()
	 * @generated
	 */
	EAttribute getGapJointTransmission_Theta0();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry</em>'.
	 * @see org.ros.model.urdf.Geometry
	 * @generated
	 */
	EClass getGeometry();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Geometry#getBox <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Box</em>'.
	 * @see org.ros.model.urdf.Geometry#getBox()
	 * @see #getGeometry()
	 * @generated
	 */
	EReference getGeometry_Box();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Geometry#getCylinder <em>Cylinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cylinder</em>'.
	 * @see org.ros.model.urdf.Geometry#getCylinder()
	 * @see #getGeometry()
	 * @generated
	 */
	EReference getGeometry_Cylinder();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Geometry#getSphere <em>Sphere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sphere</em>'.
	 * @see org.ros.model.urdf.Geometry#getSphere()
	 * @see #getGeometry()
	 * @generated
	 */
	EReference getGeometry_Sphere();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Geometry#getMesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mesh</em>'.
	 * @see org.ros.model.urdf.Geometry#getMesh()
	 * @see #getGeometry()
	 * @generated
	 */
	EReference getGeometry_Mesh();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Inertia <em>Inertia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inertia</em>'.
	 * @see org.ros.model.urdf.Inertia
	 * @generated
	 */
	EClass getInertia();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Inertia#getIxx <em>Ixx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ixx</em>'.
	 * @see org.ros.model.urdf.Inertia#getIxx()
	 * @see #getInertia()
	 * @generated
	 */
	EAttribute getInertia_Ixx();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Inertia#getIxy <em>Ixy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ixy</em>'.
	 * @see org.ros.model.urdf.Inertia#getIxy()
	 * @see #getInertia()
	 * @generated
	 */
	EAttribute getInertia_Ixy();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Inertia#getIxz <em>Ixz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ixz</em>'.
	 * @see org.ros.model.urdf.Inertia#getIxz()
	 * @see #getInertia()
	 * @generated
	 */
	EAttribute getInertia_Ixz();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Inertia#getIyy <em>Iyy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iyy</em>'.
	 * @see org.ros.model.urdf.Inertia#getIyy()
	 * @see #getInertia()
	 * @generated
	 */
	EAttribute getInertia_Iyy();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Inertia#getIyz <em>Iyz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iyz</em>'.
	 * @see org.ros.model.urdf.Inertia#getIyz()
	 * @see #getInertia()
	 * @generated
	 */
	EAttribute getInertia_Iyz();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Inertia#getIzz <em>Izz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Izz</em>'.
	 * @see org.ros.model.urdf.Inertia#getIzz()
	 * @see #getInertia()
	 * @generated
	 */
	EAttribute getInertia_Izz();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Inertial <em>Inertial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inertial</em>'.
	 * @see org.ros.model.urdf.Inertial
	 * @generated
	 */
	EClass getInertial();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Inertial#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin</em>'.
	 * @see org.ros.model.urdf.Inertial#getOrigin()
	 * @see #getInertial()
	 * @generated
	 */
	EReference getInertial_Origin();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Inertial#getMass <em>Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mass</em>'.
	 * @see org.ros.model.urdf.Inertial#getMass()
	 * @see #getInertial()
	 * @generated
	 */
	EReference getInertial_Mass();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Inertial#getInertia <em>Inertia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inertia</em>'.
	 * @see org.ros.model.urdf.Inertial#getInertia()
	 * @see #getInertial()
	 * @generated
	 */
	EReference getInertial_Inertia();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Joint <em>Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joint</em>'.
	 * @see org.ros.model.urdf.Joint
	 * @generated
	 */
	EClass getJoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Joint#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin</em>'.
	 * @see org.ros.model.urdf.Joint#getOrigin()
	 * @see #getJoint()
	 * @generated
	 */
	EReference getJoint_Origin();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Joint#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent</em>'.
	 * @see org.ros.model.urdf.Joint#getParent()
	 * @see #getJoint()
	 * @generated
	 */
	EReference getJoint_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Joint#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see org.ros.model.urdf.Joint#getChild()
	 * @see #getJoint()
	 * @generated
	 */
	EReference getJoint_Child();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Joint#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Axis</em>'.
	 * @see org.ros.model.urdf.Joint#getAxis()
	 * @see #getJoint()
	 * @generated
	 */
	EReference getJoint_Axis();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Joint#getCalibration <em>Calibration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calibration</em>'.
	 * @see org.ros.model.urdf.Joint#getCalibration()
	 * @see #getJoint()
	 * @generated
	 */
	EReference getJoint_Calibration();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Joint#getDynamics <em>Dynamics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dynamics</em>'.
	 * @see org.ros.model.urdf.Joint#getDynamics()
	 * @see #getJoint()
	 * @generated
	 */
	EReference getJoint_Dynamics();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Joint#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Limit</em>'.
	 * @see org.ros.model.urdf.Joint#getLimit()
	 * @see #getJoint()
	 * @generated
	 */
	EReference getJoint_Limit();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Joint#getSafetyController <em>Safety Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Safety Controller</em>'.
	 * @see org.ros.model.urdf.Joint#getSafetyController()
	 * @see #getJoint()
	 * @generated
	 */
	EReference getJoint_SafetyController();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Joint#getMimic <em>Mimic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mimic</em>'.
	 * @see org.ros.model.urdf.Joint#getMimic()
	 * @see #getJoint()
	 * @generated
	 */
	EReference getJoint_Mimic();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Joint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.urdf.Joint#getName()
	 * @see #getJoint()
	 * @generated
	 */
	EAttribute getJoint_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Joint#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.ros.model.urdf.Joint#getType()
	 * @see #getJoint()
	 * @generated
	 */
	EAttribute getJoint_Type();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Limit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limit</em>'.
	 * @see org.ros.model.urdf.Limit
	 * @generated
	 */
	EClass getLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Limit#getEffort <em>Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effort</em>'.
	 * @see org.ros.model.urdf.Limit#getEffort()
	 * @see #getLimit()
	 * @generated
	 */
	EAttribute getLimit_Effort();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Limit#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see org.ros.model.urdf.Limit#getLower()
	 * @see #getLimit()
	 * @generated
	 */
	EAttribute getLimit_Lower();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Limit#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see org.ros.model.urdf.Limit#getUpper()
	 * @see #getLimit()
	 * @generated
	 */
	EAttribute getLimit_Upper();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Limit#getVelocity <em>Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Velocity</em>'.
	 * @see org.ros.model.urdf.Limit#getVelocity()
	 * @see #getLimit()
	 * @generated
	 */
	EAttribute getLimit_Velocity();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.ros.model.urdf.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Link#getInertial <em>Inertial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inertial</em>'.
	 * @see org.ros.model.urdf.Link#getInertial()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Inertial();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.urdf.Link#getVisual <em>Visual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visual</em>'.
	 * @see org.ros.model.urdf.Link#getVisual()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Visual();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.urdf.Link#getCollision <em>Collision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collision</em>'.
	 * @see org.ros.model.urdf.Link#getCollision()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Collision();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Link#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.urdf.Link#getName()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Link#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.ros.model.urdf.Link#getType()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Type();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Mass <em>Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mass</em>'.
	 * @see org.ros.model.urdf.Mass
	 * @generated
	 */
	EClass getMass();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Mass#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ros.model.urdf.Mass#getValue()
	 * @see #getMass()
	 * @generated
	 */
	EAttribute getMass_Value();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material</em>'.
	 * @see org.ros.model.urdf.Material
	 * @generated
	 */
	EClass getMaterial();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Material#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color</em>'.
	 * @see org.ros.model.urdf.Material#getColor()
	 * @see #getMaterial()
	 * @generated
	 */
	EReference getMaterial_Color();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Material#getTexture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Texture</em>'.
	 * @see org.ros.model.urdf.Material#getTexture()
	 * @see #getMaterial()
	 * @generated
	 */
	EReference getMaterial_Texture();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Material#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.urdf.Material#getName()
	 * @see #getMaterial()
	 * @generated
	 */
	EAttribute getMaterial_Name();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.MaterialGlobal <em>Material Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material Global</em>'.
	 * @see org.ros.model.urdf.MaterialGlobal
	 * @generated
	 */
	EClass getMaterialGlobal();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.MaterialGlobal#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color</em>'.
	 * @see org.ros.model.urdf.MaterialGlobal#getColor()
	 * @see #getMaterialGlobal()
	 * @generated
	 */
	EReference getMaterialGlobal_Color();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.MaterialGlobal#getTexture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Texture</em>'.
	 * @see org.ros.model.urdf.MaterialGlobal#getTexture()
	 * @see #getMaterialGlobal()
	 * @generated
	 */
	EReference getMaterialGlobal_Texture();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.MaterialGlobal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.urdf.MaterialGlobal#getName()
	 * @see #getMaterialGlobal()
	 * @generated
	 */
	EAttribute getMaterialGlobal_Name();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Mesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mesh</em>'.
	 * @see org.ros.model.urdf.Mesh
	 * @generated
	 */
	EClass getMesh();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Mesh#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see org.ros.model.urdf.Mesh#getFilename()
	 * @see #getMesh()
	 * @generated
	 */
	EAttribute getMesh_Filename();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Mesh#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.ros.model.urdf.Mesh#getScale()
	 * @see #getMesh()
	 * @generated
	 */
	EAttribute getMesh_Scale();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Mesh#getScaleVector <em>Scale Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale Vector</em>'.
	 * @see org.ros.model.urdf.Mesh#getScaleVector()
	 * @see #getMesh()
	 * @generated
	 */
	EReference getMesh_ScaleVector();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Mimic <em>Mimic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mimic</em>'.
	 * @see org.ros.model.urdf.Mimic
	 * @generated
	 */
	EClass getMimic();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Mimic#getJoint <em>Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Joint</em>'.
	 * @see org.ros.model.urdf.Mimic#getJoint()
	 * @see #getMimic()
	 * @generated
	 */
	EAttribute getMimic_Joint();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Mimic#getMultiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplier</em>'.
	 * @see org.ros.model.urdf.Mimic#getMultiplier()
	 * @see #getMimic()
	 * @generated
	 */
	EAttribute getMimic_Multiplier();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Mimic#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.ros.model.urdf.Mimic#getOffset()
	 * @see #getMimic()
	 * @generated
	 */
	EAttribute getMimic_Offset();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name</em>'.
	 * @see org.ros.model.urdf.Name
	 * @generated
	 */
	EClass getName_();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Name#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.urdf.Name#getName()
	 * @see #getName_()
	 * @generated
	 */
	EAttribute getName_Name();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Parent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parent</em>'.
	 * @see org.ros.model.urdf.Parent
	 * @generated
	 */
	EClass getParent();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Parent#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see org.ros.model.urdf.Parent#getLink()
	 * @see #getParent()
	 * @generated
	 */
	EAttribute getParent_Link();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.PassiveJointTransmission <em>Passive Joint Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passive Joint Transmission</em>'.
	 * @see org.ros.model.urdf.PassiveJointTransmission
	 * @generated
	 */
	EClass getPassiveJointTransmission();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.PassiveJointTransmission#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.urdf.PassiveJointTransmission#getName()
	 * @see #getPassiveJointTransmission()
	 * @generated
	 */
	EAttribute getPassiveJointTransmission_Name();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Pose <em>Pose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pose</em>'.
	 * @see org.ros.model.urdf.Pose
	 * @generated
	 */
	EClass getPose();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Pose#getRpy <em>Rpy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rpy</em>'.
	 * @see org.ros.model.urdf.Pose#getRpy()
	 * @see #getPose()
	 * @generated
	 */
	EAttribute getPose_Rpy();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Pose#getXyzVector <em>Xyz Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xyz Vector</em>'.
	 * @see org.ros.model.urdf.Pose#getXyzVector()
	 * @see #getPose()
	 * @generated
	 */
	EReference getPose_XyzVector();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Pose#getRpyVector <em>Rpy Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rpy Vector</em>'.
	 * @see org.ros.model.urdf.Pose#getRpyVector()
	 * @see #getPose()
	 * @generated
	 */
	EReference getPose_RpyVector();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Pose#getXyz <em>Xyz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xyz</em>'.
	 * @see org.ros.model.urdf.Pose#getXyz()
	 * @see #getPose()
	 * @generated
	 */
	EAttribute getPose_Xyz();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.RobotType <em>Robot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot Type</em>'.
	 * @see org.ros.model.urdf.RobotType
	 * @generated
	 */
	EClass getRobotType();

	/**
	 * Returns the meta object for the attribute list '{@link org.ros.model.urdf.RobotType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.ros.model.urdf.RobotType#getGroup()
	 * @see #getRobotType()
	 * @generated
	 */
	EAttribute getRobotType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.urdf.RobotType#getJoint <em>Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joint</em>'.
	 * @see org.ros.model.urdf.RobotType#getJoint()
	 * @see #getRobotType()
	 * @generated
	 */
	EReference getRobotType_Joint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.urdf.RobotType#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see org.ros.model.urdf.RobotType#getLink()
	 * @see #getRobotType()
	 * @generated
	 */
	EReference getRobotType_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.urdf.RobotType#getMaterial <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Material</em>'.
	 * @see org.ros.model.urdf.RobotType#getMaterial()
	 * @see #getRobotType()
	 * @generated
	 */
	EReference getRobotType_Material();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.urdf.RobotType#getTransmission <em>Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transmission</em>'.
	 * @see org.ros.model.urdf.RobotType#getTransmission()
	 * @see #getRobotType()
	 * @generated
	 */
	EReference getRobotType_Transmission();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.RobotType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.urdf.RobotType#getName()
	 * @see #getRobotType()
	 * @generated
	 */
	EAttribute getRobotType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.RobotType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.ros.model.urdf.RobotType#getVersion()
	 * @see #getRobotType()
	 * @generated
	 */
	EAttribute getRobotType_Version();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.SafetyController <em>Safety Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Controller</em>'.
	 * @see org.ros.model.urdf.SafetyController
	 * @generated
	 */
	EClass getSafetyController();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.SafetyController#getKPosition <em>KPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>KPosition</em>'.
	 * @see org.ros.model.urdf.SafetyController#getKPosition()
	 * @see #getSafetyController()
	 * @generated
	 */
	EAttribute getSafetyController_KPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.SafetyController#getKVelocity <em>KVelocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>KVelocity</em>'.
	 * @see org.ros.model.urdf.SafetyController#getKVelocity()
	 * @see #getSafetyController()
	 * @generated
	 */
	EAttribute getSafetyController_KVelocity();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.SafetyController#getSoftLowerLimit <em>Soft Lower Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soft Lower Limit</em>'.
	 * @see org.ros.model.urdf.SafetyController#getSoftLowerLimit()
	 * @see #getSafetyController()
	 * @generated
	 */
	EAttribute getSafetyController_SoftLowerLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.SafetyController#getSoftUpperLimit <em>Soft Upper Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soft Upper Limit</em>'.
	 * @see org.ros.model.urdf.SafetyController#getSoftUpperLimit()
	 * @see #getSafetyController()
	 * @generated
	 */
	EAttribute getSafetyController_SoftUpperLimit();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Sphere <em>Sphere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sphere</em>'.
	 * @see org.ros.model.urdf.Sphere
	 * @generated
	 */
	EClass getSphere();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Sphere#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see org.ros.model.urdf.Sphere#getRadius()
	 * @see #getSphere()
	 * @generated
	 */
	EAttribute getSphere_Radius();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Texture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Texture</em>'.
	 * @see org.ros.model.urdf.Texture
	 * @generated
	 */
	EClass getTexture();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Texture#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see org.ros.model.urdf.Texture#getFilename()
	 * @see #getTexture()
	 * @generated
	 */
	EAttribute getTexture_Filename();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Transmission <em>Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmission</em>'.
	 * @see org.ros.model.urdf.Transmission
	 * @generated
	 */
	EClass getTransmission();

	/**
	 * Returns the meta object for the attribute list '{@link org.ros.model.urdf.Transmission#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.ros.model.urdf.Transmission#getGroup()
	 * @see #getTransmission()
	 * @generated
	 */
	EAttribute getTransmission_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.urdf.Transmission#getLeftActuator <em>Left Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left Actuator</em>'.
	 * @see org.ros.model.urdf.Transmission#getLeftActuator()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_LeftActuator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.urdf.Transmission#getRightActuator <em>Right Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right Actuator</em>'.
	 * @see org.ros.model.urdf.Transmission#getRightActuator()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_RightActuator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.urdf.Transmission#getFlexJoint <em>Flex Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flex Joint</em>'.
	 * @see org.ros.model.urdf.Transmission#getFlexJoint()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_FlexJoint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.urdf.Transmission#getRollJoint <em>Roll Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roll Joint</em>'.
	 * @see org.ros.model.urdf.Transmission#getRollJoint()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_RollJoint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.urdf.Transmission#getGapJoint <em>Gap Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gap Joint</em>'.
	 * @see org.ros.model.urdf.Transmission#getGapJoint()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_GapJoint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.urdf.Transmission#getPassiveJoint <em>Passive Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Passive Joint</em>'.
	 * @see org.ros.model.urdf.Transmission#getPassiveJoint()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_PassiveJoint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.urdf.Transmission#getUseSimulatedGripperJoint <em>Use Simulated Gripper Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Use Simulated Gripper Joint</em>'.
	 * @see org.ros.model.urdf.Transmission#getUseSimulatedGripperJoint()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_UseSimulatedGripperJoint();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Transmission#getMechanicalReduction <em>Mechanical Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanical Reduction</em>'.
	 * @see org.ros.model.urdf.Transmission#getMechanicalReduction()
	 * @see #getTransmission()
	 * @generated
	 */
	EAttribute getTransmission_MechanicalReduction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.urdf.Transmission#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actuator</em>'.
	 * @see org.ros.model.urdf.Transmission#getActuator()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_Actuator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ros.model.urdf.Transmission#getJoint <em>Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joint</em>'.
	 * @see org.ros.model.urdf.Transmission#getJoint()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_Joint();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Transmission#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ros.model.urdf.Transmission#getName()
	 * @see #getTransmission()
	 * @generated
	 */
	EAttribute getTransmission_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Transmission#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.ros.model.urdf.Transmission#getType()
	 * @see #getTransmission()
	 * @generated
	 */
	EAttribute getTransmission_Type();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.UseSimulatedGripperJointType <em>Use Simulated Gripper Joint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Simulated Gripper Joint Type</em>'.
	 * @see org.ros.model.urdf.UseSimulatedGripperJointType
	 * @generated
	 */
	EClass getUseSimulatedGripperJointType();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Verbose <em>Verbose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verbose</em>'.
	 * @see org.ros.model.urdf.Verbose
	 * @generated
	 */
	EClass getVerbose();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Verbose#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ros.model.urdf.Verbose#getValue()
	 * @see #getVerbose()
	 * @generated
	 */
	EAttribute getVerbose_Value();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Visual <em>Visual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visual</em>'.
	 * @see org.ros.model.urdf.Visual
	 * @generated
	 */
	EClass getVisual();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Visual#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Origin</em>'.
	 * @see org.ros.model.urdf.Visual#getOrigin()
	 * @see #getVisual()
	 * @generated
	 */
	EReference getVisual_Origin();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Visual#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry</em>'.
	 * @see org.ros.model.urdf.Visual#getGeometry()
	 * @see #getVisual()
	 * @generated
	 */
	EReference getVisual_Geometry();

	/**
	 * Returns the meta object for the containment reference '{@link org.ros.model.urdf.Visual#getMaterial <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Material</em>'.
	 * @see org.ros.model.urdf.Visual#getMaterial()
	 * @see #getVisual()
	 * @generated
	 */
	EReference getVisual_Material();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Vector3 <em>Vector3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector3</em>'.
	 * @see org.ros.model.urdf.Vector3
	 * @generated
	 */
	EClass getVector3();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Vector3#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see org.ros.model.urdf.Vector3#getA()
	 * @see #getVector3()
	 * @generated
	 */
	EAttribute getVector3_A();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Vector3#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see org.ros.model.urdf.Vector3#getB()
	 * @see #getVector3()
	 * @generated
	 */
	EAttribute getVector3_B();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Vector3#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C</em>'.
	 * @see org.ros.model.urdf.Vector3#getC()
	 * @see #getVector3()
	 * @generated
	 */
	EAttribute getVector3_C();

	/**
	 * Returns the meta object for class '{@link org.ros.model.urdf.Vector4 <em>Vector4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector4</em>'.
	 * @see org.ros.model.urdf.Vector4
	 * @generated
	 */
	EClass getVector4();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Vector4#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see org.ros.model.urdf.Vector4#getA()
	 * @see #getVector4()
	 * @generated
	 */
	EAttribute getVector4_A();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Vector4#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see org.ros.model.urdf.Vector4#getB()
	 * @see #getVector4()
	 * @generated
	 */
	EAttribute getVector4_B();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Vector4#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C</em>'.
	 * @see org.ros.model.urdf.Vector4#getC()
	 * @see #getVector4()
	 * @generated
	 */
	EAttribute getVector4_C();

	/**
	 * Returns the meta object for the attribute '{@link org.ros.model.urdf.Vector4#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see org.ros.model.urdf.Vector4#getD()
	 * @see #getVector4()
	 * @generated
	 */
	EAttribute getVector4_D();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UrdfFactory getUrdfFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.ActuatorTransmissionImpl <em>Actuator Transmission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.ActuatorTransmissionImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getActuatorTransmission()
		 * @generated
		 */
		EClass ACTUATOR_TRANSMISSION = eINSTANCE.getActuatorTransmission();

		/**
		 * The meta object literal for the '<em><b>Mechanical Reduction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR_TRANSMISSION__MECHANICAL_REDUCTION = eINSTANCE.getActuatorTransmission_MechanicalReduction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR_TRANSMISSION__NAME = eINSTANCE.getActuatorTransmission_Name();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.AxisImpl <em>Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.AxisImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getAxis()
		 * @generated
		 */
		EClass AXIS = eINSTANCE.getAxis();

		/**
		 * The meta object literal for the '<em><b>Xyz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS__XYZ = eINSTANCE.getAxis_Xyz();

		/**
		 * The meta object literal for the '<em><b>Xyz Vector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS__XYZ_VECTOR = eINSTANCE.getAxis_XyzVector();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.BoxImpl <em>Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.BoxImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getBox()
		 * @generated
		 */
		EClass BOX = eINSTANCE.getBox();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOX__SIZE = eINSTANCE.getBox_Size();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOX__DIMENSION = eINSTANCE.getBox_Dimension();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.CalibrationImpl <em>Calibration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.CalibrationImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getCalibration()
		 * @generated
		 */
		EClass CALIBRATION = eINSTANCE.getCalibration();

		/**
		 * The meta object literal for the '<em><b>Falling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALIBRATION__FALLING = eINSTANCE.getCalibration_Falling();

		/**
		 * The meta object literal for the '<em><b>Reference Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALIBRATION__REFERENCE_POSITION = eINSTANCE.getCalibration_ReferencePosition();

		/**
		 * The meta object literal for the '<em><b>Rising</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALIBRATION__RISING = eINSTANCE.getCalibration_Rising();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.ChildImpl <em>Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.ChildImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getChild()
		 * @generated
		 */
		EClass CHILD = eINSTANCE.getChild();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHILD__LINK = eINSTANCE.getChild_Link();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.CollisionImpl <em>Collision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.CollisionImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getCollision()
		 * @generated
		 */
		EClass COLLISION = eINSTANCE.getCollision();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLISION__ORIGIN = eINSTANCE.getCollision_Origin();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLISION__GEOMETRY = eINSTANCE.getCollision_Geometry();

		/**
		 * The meta object literal for the '<em><b>Verbose</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLISION__VERBOSE = eINSTANCE.getCollision_Verbose();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLISION__NAME = eINSTANCE.getCollision_Name();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.ColorImpl <em>Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.ColorImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getColor()
		 * @generated
		 */
		EClass COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em><b>Rgba</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR__RGBA = eINSTANCE.getColor_Rgba();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOR__COLOR = eINSTANCE.getColor_Color();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.CylinderImpl <em>Cylinder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.CylinderImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getCylinder()
		 * @generated
		 */
		EClass CYLINDER = eINSTANCE.getCylinder();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYLINDER__LENGTH = eINSTANCE.getCylinder_Length();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CYLINDER__RADIUS = eINSTANCE.getCylinder_Radius();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.DocumentRootImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Robot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ROBOT = eINSTANCE.getDocumentRoot_Robot();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.DynamicsImpl <em>Dynamics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.DynamicsImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getDynamics()
		 * @generated
		 */
		EClass DYNAMICS = eINSTANCE.getDynamics();

		/**
		 * The meta object literal for the '<em><b>Damping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMICS__DAMPING = eINSTANCE.getDynamics_Damping();

		/**
		 * The meta object literal for the '<em><b>Friction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMICS__FRICTION = eINSTANCE.getDynamics_Friction();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.GapJointTransmissionImpl <em>Gap Joint Transmission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.GapJointTransmissionImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getGapJointTransmission()
		 * @generated
		 */
		EClass GAP_JOINT_TRANSMISSION = eINSTANCE.getGapJointTransmission();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAP_JOINT_TRANSMISSION__A = eINSTANCE.getGapJointTransmission_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAP_JOINT_TRANSMISSION__B = eINSTANCE.getGapJointTransmission_B();

		/**
		 * The meta object literal for the '<em><b>Gear Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAP_JOINT_TRANSMISSION__GEAR_RATIO = eINSTANCE.getGapJointTransmission_GearRatio();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAP_JOINT_TRANSMISSION__H = eINSTANCE.getGapJointTransmission_H();

		/**
		 * The meta object literal for the '<em><b>L0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAP_JOINT_TRANSMISSION__L0 = eINSTANCE.getGapJointTransmission_L0();

		/**
		 * The meta object literal for the '<em><b>Mechanical Reduction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAP_JOINT_TRANSMISSION__MECHANICAL_REDUCTION = eINSTANCE.getGapJointTransmission_MechanicalReduction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAP_JOINT_TRANSMISSION__NAME = eINSTANCE.getGapJointTransmission_Name();

		/**
		 * The meta object literal for the '<em><b>Phi0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAP_JOINT_TRANSMISSION__PHI0 = eINSTANCE.getGapJointTransmission_Phi0();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAP_JOINT_TRANSMISSION__R = eINSTANCE.getGapJointTransmission_R();

		/**
		 * The meta object literal for the '<em><b>Screw Reduction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAP_JOINT_TRANSMISSION__SCREW_REDUCTION = eINSTANCE.getGapJointTransmission_ScrewReduction();

		/**
		 * The meta object literal for the '<em><b>T0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAP_JOINT_TRANSMISSION__T0 = eINSTANCE.getGapJointTransmission_T0();

		/**
		 * The meta object literal for the '<em><b>Theta0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAP_JOINT_TRANSMISSION__THETA0 = eINSTANCE.getGapJointTransmission_Theta0();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.GeometryImpl <em>Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.GeometryImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getGeometry()
		 * @generated
		 */
		EClass GEOMETRY = eINSTANCE.getGeometry();

		/**
		 * The meta object literal for the '<em><b>Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY__BOX = eINSTANCE.getGeometry_Box();

		/**
		 * The meta object literal for the '<em><b>Cylinder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY__CYLINDER = eINSTANCE.getGeometry_Cylinder();

		/**
		 * The meta object literal for the '<em><b>Sphere</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY__SPHERE = eINSTANCE.getGeometry_Sphere();

		/**
		 * The meta object literal for the '<em><b>Mesh</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY__MESH = eINSTANCE.getGeometry_Mesh();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.InertiaImpl <em>Inertia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.InertiaImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getInertia()
		 * @generated
		 */
		EClass INERTIA = eINSTANCE.getInertia();

		/**
		 * The meta object literal for the '<em><b>Ixx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INERTIA__IXX = eINSTANCE.getInertia_Ixx();

		/**
		 * The meta object literal for the '<em><b>Ixy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INERTIA__IXY = eINSTANCE.getInertia_Ixy();

		/**
		 * The meta object literal for the '<em><b>Ixz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INERTIA__IXZ = eINSTANCE.getInertia_Ixz();

		/**
		 * The meta object literal for the '<em><b>Iyy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INERTIA__IYY = eINSTANCE.getInertia_Iyy();

		/**
		 * The meta object literal for the '<em><b>Iyz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INERTIA__IYZ = eINSTANCE.getInertia_Iyz();

		/**
		 * The meta object literal for the '<em><b>Izz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INERTIA__IZZ = eINSTANCE.getInertia_Izz();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.InertialImpl <em>Inertial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.InertialImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getInertial()
		 * @generated
		 */
		EClass INERTIAL = eINSTANCE.getInertial();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INERTIAL__ORIGIN = eINSTANCE.getInertial_Origin();

		/**
		 * The meta object literal for the '<em><b>Mass</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INERTIAL__MASS = eINSTANCE.getInertial_Mass();

		/**
		 * The meta object literal for the '<em><b>Inertia</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INERTIAL__INERTIA = eINSTANCE.getInertial_Inertia();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.JointImpl <em>Joint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.JointImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getJoint()
		 * @generated
		 */
		EClass JOINT = eINSTANCE.getJoint();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT__ORIGIN = eINSTANCE.getJoint_Origin();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT__PARENT = eINSTANCE.getJoint_Parent();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT__CHILD = eINSTANCE.getJoint_Child();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT__AXIS = eINSTANCE.getJoint_Axis();

		/**
		 * The meta object literal for the '<em><b>Calibration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT__CALIBRATION = eINSTANCE.getJoint_Calibration();

		/**
		 * The meta object literal for the '<em><b>Dynamics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT__DYNAMICS = eINSTANCE.getJoint_Dynamics();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT__LIMIT = eINSTANCE.getJoint_Limit();

		/**
		 * The meta object literal for the '<em><b>Safety Controller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT__SAFETY_CONTROLLER = eINSTANCE.getJoint_SafetyController();

		/**
		 * The meta object literal for the '<em><b>Mimic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT__MIMIC = eINSTANCE.getJoint_Mimic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOINT__NAME = eINSTANCE.getJoint_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOINT__TYPE = eINSTANCE.getJoint_Type();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.LimitImpl <em>Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.LimitImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getLimit()
		 * @generated
		 */
		EClass LIMIT = eINSTANCE.getLimit();

		/**
		 * The meta object literal for the '<em><b>Effort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMIT__EFFORT = eINSTANCE.getLimit_Effort();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMIT__LOWER = eINSTANCE.getLimit_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMIT__UPPER = eINSTANCE.getLimit_Upper();

		/**
		 * The meta object literal for the '<em><b>Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMIT__VELOCITY = eINSTANCE.getLimit_Velocity();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.LinkImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Inertial</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__INERTIAL = eINSTANCE.getLink_Inertial();

		/**
		 * The meta object literal for the '<em><b>Visual</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__VISUAL = eINSTANCE.getLink_Visual();

		/**
		 * The meta object literal for the '<em><b>Collision</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__COLLISION = eINSTANCE.getLink_Collision();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__NAME = eINSTANCE.getLink_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TYPE = eINSTANCE.getLink_Type();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.MassImpl <em>Mass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.MassImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getMass()
		 * @generated
		 */
		EClass MASS = eINSTANCE.getMass();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASS__VALUE = eINSTANCE.getMass_Value();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.MaterialImpl <em>Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.MaterialImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getMaterial()
		 * @generated
		 */
		EClass MATERIAL = eINSTANCE.getMaterial();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL__COLOR = eINSTANCE.getMaterial_Color();

		/**
		 * The meta object literal for the '<em><b>Texture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL__TEXTURE = eINSTANCE.getMaterial_Texture();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL__NAME = eINSTANCE.getMaterial_Name();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.MaterialGlobalImpl <em>Material Global</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.MaterialGlobalImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getMaterialGlobal()
		 * @generated
		 */
		EClass MATERIAL_GLOBAL = eINSTANCE.getMaterialGlobal();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_GLOBAL__COLOR = eINSTANCE.getMaterialGlobal_Color();

		/**
		 * The meta object literal for the '<em><b>Texture</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_GLOBAL__TEXTURE = eINSTANCE.getMaterialGlobal_Texture();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL_GLOBAL__NAME = eINSTANCE.getMaterialGlobal_Name();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.MeshImpl <em>Mesh</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.MeshImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getMesh()
		 * @generated
		 */
		EClass MESH = eINSTANCE.getMesh();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH__FILENAME = eINSTANCE.getMesh_Filename();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESH__SCALE = eINSTANCE.getMesh_Scale();

		/**
		 * The meta object literal for the '<em><b>Scale Vector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESH__SCALE_VECTOR = eINSTANCE.getMesh_ScaleVector();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.MimicImpl <em>Mimic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.MimicImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getMimic()
		 * @generated
		 */
		EClass MIMIC = eINSTANCE.getMimic();

		/**
		 * The meta object literal for the '<em><b>Joint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIMIC__JOINT = eINSTANCE.getMimic_Joint();

		/**
		 * The meta object literal for the '<em><b>Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIMIC__MULTIPLIER = eINSTANCE.getMimic_Multiplier();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIMIC__OFFSET = eINSTANCE.getMimic_Offset();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.NameImpl <em>Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.NameImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getName_()
		 * @generated
		 */
		EClass NAME = eINSTANCE.getName_();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME__NAME = eINSTANCE.getName_Name();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.ParentImpl <em>Parent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.ParentImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getParent()
		 * @generated
		 */
		EClass PARENT = eINSTANCE.getParent();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARENT__LINK = eINSTANCE.getParent_Link();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.PassiveJointTransmissionImpl <em>Passive Joint Transmission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.PassiveJointTransmissionImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getPassiveJointTransmission()
		 * @generated
		 */
		EClass PASSIVE_JOINT_TRANSMISSION = eINSTANCE.getPassiveJointTransmission();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSIVE_JOINT_TRANSMISSION__NAME = eINSTANCE.getPassiveJointTransmission_Name();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.PoseImpl <em>Pose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.PoseImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getPose()
		 * @generated
		 */
		EClass POSE = eINSTANCE.getPose();

		/**
		 * The meta object literal for the '<em><b>Rpy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSE__RPY = eINSTANCE.getPose_Rpy();

		/**
		 * The meta object literal for the '<em><b>Xyz Vector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSE__XYZ_VECTOR = eINSTANCE.getPose_XyzVector();

		/**
		 * The meta object literal for the '<em><b>Rpy Vector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSE__RPY_VECTOR = eINSTANCE.getPose_RpyVector();

		/**
		 * The meta object literal for the '<em><b>Xyz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSE__XYZ = eINSTANCE.getPose_Xyz();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.RobotTypeImpl <em>Robot Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.RobotTypeImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getRobotType()
		 * @generated
		 */
		EClass ROBOT_TYPE = eINSTANCE.getRobotType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_TYPE__GROUP = eINSTANCE.getRobotType_Group();

		/**
		 * The meta object literal for the '<em><b>Joint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_TYPE__JOINT = eINSTANCE.getRobotType_Joint();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_TYPE__LINK = eINSTANCE.getRobotType_Link();

		/**
		 * The meta object literal for the '<em><b>Material</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_TYPE__MATERIAL = eINSTANCE.getRobotType_Material();

		/**
		 * The meta object literal for the '<em><b>Transmission</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT_TYPE__TRANSMISSION = eINSTANCE.getRobotType_Transmission();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_TYPE__NAME = eINSTANCE.getRobotType_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT_TYPE__VERSION = eINSTANCE.getRobotType_Version();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.SafetyControllerImpl <em>Safety Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.SafetyControllerImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getSafetyController()
		 * @generated
		 */
		EClass SAFETY_CONTROLLER = eINSTANCE.getSafetyController();

		/**
		 * The meta object literal for the '<em><b>KPosition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CONTROLLER__KPOSITION = eINSTANCE.getSafetyController_KPosition();

		/**
		 * The meta object literal for the '<em><b>KVelocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CONTROLLER__KVELOCITY = eINSTANCE.getSafetyController_KVelocity();

		/**
		 * The meta object literal for the '<em><b>Soft Lower Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CONTROLLER__SOFT_LOWER_LIMIT = eINSTANCE.getSafetyController_SoftLowerLimit();

		/**
		 * The meta object literal for the '<em><b>Soft Upper Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CONTROLLER__SOFT_UPPER_LIMIT = eINSTANCE.getSafetyController_SoftUpperLimit();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.SphereImpl <em>Sphere</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.SphereImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getSphere()
		 * @generated
		 */
		EClass SPHERE = eINSTANCE.getSphere();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPHERE__RADIUS = eINSTANCE.getSphere_Radius();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.TextureImpl <em>Texture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.TextureImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getTexture()
		 * @generated
		 */
		EClass TEXTURE = eINSTANCE.getTexture();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE__FILENAME = eINSTANCE.getTexture_Filename();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.TransmissionImpl <em>Transmission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.TransmissionImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getTransmission()
		 * @generated
		 */
		EClass TRANSMISSION = eINSTANCE.getTransmission();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION__GROUP = eINSTANCE.getTransmission_Group();

		/**
		 * The meta object literal for the '<em><b>Left Actuator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__LEFT_ACTUATOR = eINSTANCE.getTransmission_LeftActuator();

		/**
		 * The meta object literal for the '<em><b>Right Actuator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__RIGHT_ACTUATOR = eINSTANCE.getTransmission_RightActuator();

		/**
		 * The meta object literal for the '<em><b>Flex Joint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__FLEX_JOINT = eINSTANCE.getTransmission_FlexJoint();

		/**
		 * The meta object literal for the '<em><b>Roll Joint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__ROLL_JOINT = eINSTANCE.getTransmission_RollJoint();

		/**
		 * The meta object literal for the '<em><b>Gap Joint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__GAP_JOINT = eINSTANCE.getTransmission_GapJoint();

		/**
		 * The meta object literal for the '<em><b>Passive Joint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__PASSIVE_JOINT = eINSTANCE.getTransmission_PassiveJoint();

		/**
		 * The meta object literal for the '<em><b>Use Simulated Gripper Joint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__USE_SIMULATED_GRIPPER_JOINT = eINSTANCE.getTransmission_UseSimulatedGripperJoint();

		/**
		 * The meta object literal for the '<em><b>Mechanical Reduction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION__MECHANICAL_REDUCTION = eINSTANCE.getTransmission_MechanicalReduction();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__ACTUATOR = eINSTANCE.getTransmission_Actuator();

		/**
		 * The meta object literal for the '<em><b>Joint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__JOINT = eINSTANCE.getTransmission_Joint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION__NAME = eINSTANCE.getTransmission_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION__TYPE = eINSTANCE.getTransmission_Type();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.UseSimulatedGripperJointTypeImpl <em>Use Simulated Gripper Joint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.UseSimulatedGripperJointTypeImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getUseSimulatedGripperJointType()
		 * @generated
		 */
		EClass USE_SIMULATED_GRIPPER_JOINT_TYPE = eINSTANCE.getUseSimulatedGripperJointType();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.VerboseImpl <em>Verbose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.VerboseImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getVerbose()
		 * @generated
		 */
		EClass VERBOSE = eINSTANCE.getVerbose();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERBOSE__VALUE = eINSTANCE.getVerbose_Value();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.VisualImpl <em>Visual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.VisualImpl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getVisual()
		 * @generated
		 */
		EClass VISUAL = eINSTANCE.getVisual();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUAL__ORIGIN = eINSTANCE.getVisual_Origin();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUAL__GEOMETRY = eINSTANCE.getVisual_Geometry();

		/**
		 * The meta object literal for the '<em><b>Material</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUAL__MATERIAL = eINSTANCE.getVisual_Material();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.Vector3Impl <em>Vector3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.Vector3Impl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getVector3()
		 * @generated
		 */
		EClass VECTOR3 = eINSTANCE.getVector3();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3__A = eINSTANCE.getVector3_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3__B = eINSTANCE.getVector3_B();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3__C = eINSTANCE.getVector3_C();

		/**
		 * The meta object literal for the '{@link org.ros.model.urdf.impl.Vector4Impl <em>Vector4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ros.model.urdf.impl.Vector4Impl
		 * @see org.ros.model.urdf.impl.UrdfPackageImpl#getVector4()
		 * @generated
		 */
		EClass VECTOR4 = eINSTANCE.getVector4();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR4__A = eINSTANCE.getVector4_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR4__B = eINSTANCE.getVector4_B();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR4__C = eINSTANCE.getVector4_C();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR4__D = eINSTANCE.getVector4_D();

	}

} //UrdfPackage
