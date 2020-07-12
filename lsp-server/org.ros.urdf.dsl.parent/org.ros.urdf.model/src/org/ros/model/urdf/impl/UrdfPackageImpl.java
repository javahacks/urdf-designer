/**
 */
package org.ros.model.urdf.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.ros.model.urdf.ActuatorTransmission;
import org.ros.model.urdf.Axis;
import org.ros.model.urdf.Box;
import org.ros.model.urdf.Calibration;
import org.ros.model.urdf.Child;
import org.ros.model.urdf.Collision;
import org.ros.model.urdf.Color;
import org.ros.model.urdf.Cylinder;
import org.ros.model.urdf.DocumentRoot;
import org.ros.model.urdf.Dynamics;
import org.ros.model.urdf.GapJointTransmission;
import org.ros.model.urdf.Geometry;
import org.ros.model.urdf.Inertia;
import org.ros.model.urdf.Inertial;
import org.ros.model.urdf.Joint;
import org.ros.model.urdf.Limit;
import org.ros.model.urdf.Link;
import org.ros.model.urdf.LinkRef;
import org.ros.model.urdf.Mass;
import org.ros.model.urdf.Material;
import org.ros.model.urdf.MaterialGlobal;
import org.ros.model.urdf.Mesh;
import org.ros.model.urdf.Mimic;
import org.ros.model.urdf.Name;
import org.ros.model.urdf.Parent;
import org.ros.model.urdf.PassiveJointTransmission;
import org.ros.model.urdf.Pose;
import org.ros.model.urdf.RobotType;
import org.ros.model.urdf.SafetyController;
import org.ros.model.urdf.Sphere;
import org.ros.model.urdf.Texture;
import org.ros.model.urdf.Transmission;
import org.ros.model.urdf.UrdfFactory;
import org.ros.model.urdf.UrdfPackage;
import org.ros.model.urdf.UseSimulatedGripperJointType;
import org.ros.model.urdf.Vector3;
import org.ros.model.urdf.Vector4;
import org.ros.model.urdf.Verbose;
import org.ros.model.urdf.Visual;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UrdfPackageImpl extends EPackageImpl implements UrdfPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorTransmissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calibrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cylinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gapJointTransmissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inertiaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inertialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass limitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass massEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialGlobalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meshEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mimicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passiveJointTransmissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphereEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transmissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useSimulatedGripperJointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verboseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vector3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vector4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkRefEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ros.model.urdf.UrdfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UrdfPackageImpl() {
		super(eNS_URI, UrdfFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UrdfPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UrdfPackage init() {
		if (isInited) return (UrdfPackage)EPackage.Registry.INSTANCE.getEPackage(UrdfPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUrdfPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UrdfPackageImpl theUrdfPackage = registeredUrdfPackage instanceof UrdfPackageImpl ? (UrdfPackageImpl)registeredUrdfPackage : new UrdfPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUrdfPackage.createPackageContents();

		// Initialize created meta-data
		theUrdfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUrdfPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UrdfPackage.eNS_URI, theUrdfPackage);
		return theUrdfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuatorTransmission() {
		return actuatorTransmissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuatorTransmission_MechanicalReduction() {
		return (EAttribute)actuatorTransmissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuatorTransmission_Name() {
		return (EAttribute)actuatorTransmissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAxis() {
		return axisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAxis_Xyz() {
		return (EAttribute)axisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAxis_XyzVector() {
		return (EReference)axisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBox() {
		return boxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBox_Size() {
		return (EAttribute)boxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBox_Dimension() {
		return (EReference)boxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalibration() {
		return calibrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalibration_Falling() {
		return (EAttribute)calibrationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalibration_ReferencePosition() {
		return (EAttribute)calibrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalibration_Rising() {
		return (EAttribute)calibrationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChild() {
		return childEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollision() {
		return collisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollision_Origin() {
		return (EReference)collisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollision_Geometry() {
		return (EReference)collisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollision_Verbose() {
		return (EReference)collisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollision_Name() {
		return (EAttribute)collisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColor() {
		return colorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColor_Rgba() {
		return (EAttribute)colorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColor_Color() {
		return (EReference)colorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCylinder() {
		return cylinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylinder_Length() {
		return (EAttribute)cylinderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylinder_Radius() {
		return (EAttribute)cylinderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Robot() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamics() {
		return dynamicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamics_Damping() {
		return (EAttribute)dynamicsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamics_Friction() {
		return (EAttribute)dynamicsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGapJointTransmission() {
		return gapJointTransmissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGapJointTransmission_A() {
		return (EAttribute)gapJointTransmissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGapJointTransmission_B() {
		return (EAttribute)gapJointTransmissionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGapJointTransmission_GearRatio() {
		return (EAttribute)gapJointTransmissionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGapJointTransmission_H() {
		return (EAttribute)gapJointTransmissionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGapJointTransmission_L0() {
		return (EAttribute)gapJointTransmissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGapJointTransmission_MechanicalReduction() {
		return (EAttribute)gapJointTransmissionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGapJointTransmission_Name() {
		return (EAttribute)gapJointTransmissionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGapJointTransmission_Phi0() {
		return (EAttribute)gapJointTransmissionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGapJointTransmission_R() {
		return (EAttribute)gapJointTransmissionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGapJointTransmission_ScrewReduction() {
		return (EAttribute)gapJointTransmissionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGapJointTransmission_T0() {
		return (EAttribute)gapJointTransmissionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGapJointTransmission_Theta0() {
		return (EAttribute)gapJointTransmissionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometry() {
		return geometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometry_Box() {
		return (EReference)geometryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometry_Cylinder() {
		return (EReference)geometryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometry_Sphere() {
		return (EReference)geometryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeometry_Mesh() {
		return (EReference)geometryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInertia() {
		return inertiaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInertia_Ixx() {
		return (EAttribute)inertiaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInertia_Ixy() {
		return (EAttribute)inertiaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInertia_Ixz() {
		return (EAttribute)inertiaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInertia_Iyy() {
		return (EAttribute)inertiaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInertia_Iyz() {
		return (EAttribute)inertiaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInertia_Izz() {
		return (EAttribute)inertiaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInertial() {
		return inertialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInertial_Origin() {
		return (EReference)inertialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInertial_Mass() {
		return (EReference)inertialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInertial_Inertia() {
		return (EReference)inertialEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoint() {
		return jointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoint_Origin() {
		return (EReference)jointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoint_Parent() {
		return (EReference)jointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoint_Child() {
		return (EReference)jointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoint_Axis() {
		return (EReference)jointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoint_Calibration() {
		return (EReference)jointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoint_Dynamics() {
		return (EReference)jointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoint_Limit() {
		return (EReference)jointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoint_SafetyController() {
		return (EReference)jointEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoint_Mimic() {
		return (EReference)jointEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoint_Name() {
		return (EAttribute)jointEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoint_Type() {
		return (EAttribute)jointEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLimit() {
		return limitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLimit_Effort() {
		return (EAttribute)limitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLimit_Lower() {
		return (EAttribute)limitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLimit_Upper() {
		return (EAttribute)limitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLimit_Velocity() {
		return (EAttribute)limitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Inertial() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Visual() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Collision() {
		return (EReference)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Name() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Type() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMass() {
		return massEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMass_Value() {
		return (EAttribute)massEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterial() {
		return materialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterial_Color() {
		return (EReference)materialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterial_Texture() {
		return (EReference)materialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterial_Name() {
		return (EAttribute)materialEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterial_MaterialRef() {
		return (EReference)materialEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterialGlobal() {
		return materialGlobalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialGlobal_Color() {
		return (EReference)materialGlobalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaterialGlobal_Texture() {
		return (EReference)materialGlobalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaterialGlobal_Name() {
		return (EAttribute)materialGlobalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMesh() {
		return meshEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMesh_Filename() {
		return (EAttribute)meshEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMesh_Scale() {
		return (EAttribute)meshEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMesh_ScaleVector() {
		return (EReference)meshEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMimic() {
		return mimicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMimic_Joint() {
		return (EAttribute)mimicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMimic_Multiplier() {
		return (EAttribute)mimicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMimic_Offset() {
		return (EAttribute)mimicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getName_() {
		return nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getName_Name() {
		return (EAttribute)nameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParent() {
		return parentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassiveJointTransmission() {
		return passiveJointTransmissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassiveJointTransmission_Name() {
		return (EAttribute)passiveJointTransmissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPose() {
		return poseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPose_Rpy() {
		return (EAttribute)poseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPose_XyzVector() {
		return (EReference)poseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPose_RpyVector() {
		return (EReference)poseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPose_Xyz() {
		return (EAttribute)poseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRobotType() {
		return robotTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotType_Group() {
		return (EAttribute)robotTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotType_Joint() {
		return (EReference)robotTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotType_Link() {
		return (EReference)robotTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotType_Material() {
		return (EReference)robotTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRobotType_Transmission() {
		return (EReference)robotTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotType_Name() {
		return (EAttribute)robotTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRobotType_Version() {
		return (EAttribute)robotTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSafetyController() {
		return safetyControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSafetyController_KPosition() {
		return (EAttribute)safetyControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSafetyController_KVelocity() {
		return (EAttribute)safetyControllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSafetyController_SoftLowerLimit() {
		return (EAttribute)safetyControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSafetyController_SoftUpperLimit() {
		return (EAttribute)safetyControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphere() {
		return sphereEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphere_Radius() {
		return (EAttribute)sphereEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTexture() {
		return textureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTexture_Filename() {
		return (EAttribute)textureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransmission() {
		return transmissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransmission_Group() {
		return (EAttribute)transmissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_LeftActuator() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_RightActuator() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_FlexJoint() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_RollJoint() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_GapJoint() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_PassiveJoint() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_UseSimulatedGripperJoint() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransmission_MechanicalReduction() {
		return (EAttribute)transmissionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_Actuator() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_Joint() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransmission_Name() {
		return (EAttribute)transmissionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransmission_Type() {
		return (EAttribute)transmissionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseSimulatedGripperJointType() {
		return useSimulatedGripperJointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerbose() {
		return verboseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerbose_Value() {
		return (EAttribute)verboseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisual() {
		return visualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisual_Origin() {
		return (EReference)visualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisual_Geometry() {
		return (EReference)visualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisual_Material() {
		return (EReference)visualEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVector3() {
		return vector3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector3_A() {
		return (EAttribute)vector3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector3_B() {
		return (EAttribute)vector3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector3_C() {
		return (EAttribute)vector3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVector4() {
		return vector4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector4_A() {
		return (EAttribute)vector4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector4_B() {
		return (EAttribute)vector4EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector4_C() {
		return (EAttribute)vector4EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVector4_D() {
		return (EAttribute)vector4EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkRef() {
		return linkRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkRef_LinkRef() {
		return (EReference)linkRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkRef_Link() {
		return (EAttribute)linkRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrdfFactory getUrdfFactory() {
		return (UrdfFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		actuatorTransmissionEClass = createEClass(ACTUATOR_TRANSMISSION);
		createEAttribute(actuatorTransmissionEClass, ACTUATOR_TRANSMISSION__MECHANICAL_REDUCTION);
		createEAttribute(actuatorTransmissionEClass, ACTUATOR_TRANSMISSION__NAME);

		axisEClass = createEClass(AXIS);
		createEAttribute(axisEClass, AXIS__XYZ);
		createEReference(axisEClass, AXIS__XYZ_VECTOR);

		boxEClass = createEClass(BOX);
		createEAttribute(boxEClass, BOX__SIZE);
		createEReference(boxEClass, BOX__DIMENSION);

		calibrationEClass = createEClass(CALIBRATION);
		createEAttribute(calibrationEClass, CALIBRATION__REFERENCE_POSITION);
		createEAttribute(calibrationEClass, CALIBRATION__RISING);
		createEAttribute(calibrationEClass, CALIBRATION__FALLING);

		childEClass = createEClass(CHILD);

		collisionEClass = createEClass(COLLISION);
		createEReference(collisionEClass, COLLISION__ORIGIN);
		createEReference(collisionEClass, COLLISION__GEOMETRY);
		createEReference(collisionEClass, COLLISION__VERBOSE);
		createEAttribute(collisionEClass, COLLISION__NAME);

		colorEClass = createEClass(COLOR);
		createEAttribute(colorEClass, COLOR__RGBA);
		createEReference(colorEClass, COLOR__COLOR);

		cylinderEClass = createEClass(CYLINDER);
		createEAttribute(cylinderEClass, CYLINDER__RADIUS);
		createEAttribute(cylinderEClass, CYLINDER__LENGTH);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ROBOT);

		dynamicsEClass = createEClass(DYNAMICS);
		createEAttribute(dynamicsEClass, DYNAMICS__DAMPING);
		createEAttribute(dynamicsEClass, DYNAMICS__FRICTION);

		gapJointTransmissionEClass = createEClass(GAP_JOINT_TRANSMISSION);
		createEAttribute(gapJointTransmissionEClass, GAP_JOINT_TRANSMISSION__L0);
		createEAttribute(gapJointTransmissionEClass, GAP_JOINT_TRANSMISSION__A);
		createEAttribute(gapJointTransmissionEClass, GAP_JOINT_TRANSMISSION__B);
		createEAttribute(gapJointTransmissionEClass, GAP_JOINT_TRANSMISSION__GEAR_RATIO);
		createEAttribute(gapJointTransmissionEClass, GAP_JOINT_TRANSMISSION__H);
		createEAttribute(gapJointTransmissionEClass, GAP_JOINT_TRANSMISSION__MECHANICAL_REDUCTION);
		createEAttribute(gapJointTransmissionEClass, GAP_JOINT_TRANSMISSION__NAME);
		createEAttribute(gapJointTransmissionEClass, GAP_JOINT_TRANSMISSION__PHI0);
		createEAttribute(gapJointTransmissionEClass, GAP_JOINT_TRANSMISSION__R);
		createEAttribute(gapJointTransmissionEClass, GAP_JOINT_TRANSMISSION__SCREW_REDUCTION);
		createEAttribute(gapJointTransmissionEClass, GAP_JOINT_TRANSMISSION__T0);
		createEAttribute(gapJointTransmissionEClass, GAP_JOINT_TRANSMISSION__THETA0);

		geometryEClass = createEClass(GEOMETRY);
		createEReference(geometryEClass, GEOMETRY__BOX);
		createEReference(geometryEClass, GEOMETRY__CYLINDER);
		createEReference(geometryEClass, GEOMETRY__SPHERE);
		createEReference(geometryEClass, GEOMETRY__MESH);

		inertiaEClass = createEClass(INERTIA);
		createEAttribute(inertiaEClass, INERTIA__IXX);
		createEAttribute(inertiaEClass, INERTIA__IXY);
		createEAttribute(inertiaEClass, INERTIA__IXZ);
		createEAttribute(inertiaEClass, INERTIA__IYY);
		createEAttribute(inertiaEClass, INERTIA__IYZ);
		createEAttribute(inertiaEClass, INERTIA__IZZ);

		inertialEClass = createEClass(INERTIAL);
		createEReference(inertialEClass, INERTIAL__ORIGIN);
		createEReference(inertialEClass, INERTIAL__MASS);
		createEReference(inertialEClass, INERTIAL__INERTIA);

		jointEClass = createEClass(JOINT);
		createEReference(jointEClass, JOINT__ORIGIN);
		createEReference(jointEClass, JOINT__PARENT);
		createEReference(jointEClass, JOINT__CHILD);
		createEReference(jointEClass, JOINT__AXIS);
		createEReference(jointEClass, JOINT__CALIBRATION);
		createEReference(jointEClass, JOINT__DYNAMICS);
		createEReference(jointEClass, JOINT__LIMIT);
		createEReference(jointEClass, JOINT__SAFETY_CONTROLLER);
		createEReference(jointEClass, JOINT__MIMIC);
		createEAttribute(jointEClass, JOINT__NAME);
		createEAttribute(jointEClass, JOINT__TYPE);

		limitEClass = createEClass(LIMIT);
		createEAttribute(limitEClass, LIMIT__LOWER);
		createEAttribute(limitEClass, LIMIT__UPPER);
		createEAttribute(limitEClass, LIMIT__EFFORT);
		createEAttribute(limitEClass, LIMIT__VELOCITY);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__INERTIAL);
		createEReference(linkEClass, LINK__VISUAL);
		createEReference(linkEClass, LINK__COLLISION);
		createEAttribute(linkEClass, LINK__NAME);
		createEAttribute(linkEClass, LINK__TYPE);

		massEClass = createEClass(MASS);
		createEAttribute(massEClass, MASS__VALUE);

		materialEClass = createEClass(MATERIAL);
		createEReference(materialEClass, MATERIAL__COLOR);
		createEReference(materialEClass, MATERIAL__TEXTURE);
		createEAttribute(materialEClass, MATERIAL__NAME);
		createEReference(materialEClass, MATERIAL__MATERIAL_REF);

		materialGlobalEClass = createEClass(MATERIAL_GLOBAL);
		createEReference(materialGlobalEClass, MATERIAL_GLOBAL__COLOR);
		createEReference(materialGlobalEClass, MATERIAL_GLOBAL__TEXTURE);
		createEAttribute(materialGlobalEClass, MATERIAL_GLOBAL__NAME);

		meshEClass = createEClass(MESH);
		createEAttribute(meshEClass, MESH__FILENAME);
		createEAttribute(meshEClass, MESH__SCALE);
		createEReference(meshEClass, MESH__SCALE_VECTOR);

		mimicEClass = createEClass(MIMIC);
		createEAttribute(mimicEClass, MIMIC__JOINT);
		createEAttribute(mimicEClass, MIMIC__MULTIPLIER);
		createEAttribute(mimicEClass, MIMIC__OFFSET);

		nameEClass = createEClass(NAME);
		createEAttribute(nameEClass, NAME__NAME);

		parentEClass = createEClass(PARENT);

		passiveJointTransmissionEClass = createEClass(PASSIVE_JOINT_TRANSMISSION);
		createEAttribute(passiveJointTransmissionEClass, PASSIVE_JOINT_TRANSMISSION__NAME);

		poseEClass = createEClass(POSE);
		createEAttribute(poseEClass, POSE__XYZ);
		createEAttribute(poseEClass, POSE__RPY);
		createEReference(poseEClass, POSE__XYZ_VECTOR);
		createEReference(poseEClass, POSE__RPY_VECTOR);

		robotTypeEClass = createEClass(ROBOT_TYPE);
		createEAttribute(robotTypeEClass, ROBOT_TYPE__GROUP);
		createEReference(robotTypeEClass, ROBOT_TYPE__JOINT);
		createEReference(robotTypeEClass, ROBOT_TYPE__LINK);
		createEReference(robotTypeEClass, ROBOT_TYPE__MATERIAL);
		createEReference(robotTypeEClass, ROBOT_TYPE__TRANSMISSION);
		createEAttribute(robotTypeEClass, ROBOT_TYPE__NAME);
		createEAttribute(robotTypeEClass, ROBOT_TYPE__VERSION);

		safetyControllerEClass = createEClass(SAFETY_CONTROLLER);
		createEAttribute(safetyControllerEClass, SAFETY_CONTROLLER__SOFT_LOWER_LIMIT);
		createEAttribute(safetyControllerEClass, SAFETY_CONTROLLER__SOFT_UPPER_LIMIT);
		createEAttribute(safetyControllerEClass, SAFETY_CONTROLLER__KPOSITION);
		createEAttribute(safetyControllerEClass, SAFETY_CONTROLLER__KVELOCITY);

		sphereEClass = createEClass(SPHERE);
		createEAttribute(sphereEClass, SPHERE__RADIUS);

		textureEClass = createEClass(TEXTURE);
		createEAttribute(textureEClass, TEXTURE__FILENAME);

		transmissionEClass = createEClass(TRANSMISSION);
		createEAttribute(transmissionEClass, TRANSMISSION__GROUP);
		createEReference(transmissionEClass, TRANSMISSION__LEFT_ACTUATOR);
		createEReference(transmissionEClass, TRANSMISSION__RIGHT_ACTUATOR);
		createEReference(transmissionEClass, TRANSMISSION__FLEX_JOINT);
		createEReference(transmissionEClass, TRANSMISSION__ROLL_JOINT);
		createEReference(transmissionEClass, TRANSMISSION__GAP_JOINT);
		createEReference(transmissionEClass, TRANSMISSION__PASSIVE_JOINT);
		createEReference(transmissionEClass, TRANSMISSION__USE_SIMULATED_GRIPPER_JOINT);
		createEAttribute(transmissionEClass, TRANSMISSION__MECHANICAL_REDUCTION);
		createEReference(transmissionEClass, TRANSMISSION__ACTUATOR);
		createEReference(transmissionEClass, TRANSMISSION__JOINT);
		createEAttribute(transmissionEClass, TRANSMISSION__NAME);
		createEAttribute(transmissionEClass, TRANSMISSION__TYPE);

		useSimulatedGripperJointTypeEClass = createEClass(USE_SIMULATED_GRIPPER_JOINT_TYPE);

		verboseEClass = createEClass(VERBOSE);
		createEAttribute(verboseEClass, VERBOSE__VALUE);

		visualEClass = createEClass(VISUAL);
		createEReference(visualEClass, VISUAL__ORIGIN);
		createEReference(visualEClass, VISUAL__GEOMETRY);
		createEReference(visualEClass, VISUAL__MATERIAL);

		vector3EClass = createEClass(VECTOR3);
		createEAttribute(vector3EClass, VECTOR3__A);
		createEAttribute(vector3EClass, VECTOR3__B);
		createEAttribute(vector3EClass, VECTOR3__C);

		vector4EClass = createEClass(VECTOR4);
		createEAttribute(vector4EClass, VECTOR4__A);
		createEAttribute(vector4EClass, VECTOR4__B);
		createEAttribute(vector4EClass, VECTOR4__C);
		createEAttribute(vector4EClass, VECTOR4__D);

		linkRefEClass = createEClass(LINK_REF);
		createEReference(linkRefEClass, LINK_REF__LINK_REF);
		createEAttribute(linkRefEClass, LINK_REF__LINK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		childEClass.getESuperTypes().add(this.getLinkRef());
		parentEClass.getESuperTypes().add(this.getLinkRef());

		// Initialize classes, features, and operations; add parameters
		initEClass(actuatorTransmissionEClass, ActuatorTransmission.class, "ActuatorTransmission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActuatorTransmission_MechanicalReduction(), theXMLTypePackage.getDouble(), "mechanicalReduction", null, 1, 1, ActuatorTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActuatorTransmission_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ActuatorTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(axisEClass, Axis.class, "Axis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAxis_Xyz(), theXMLTypePackage.getString(), "xyz", "1 0 0", 0, 1, Axis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAxis_XyzVector(), this.getVector3(), null, "xyzVector", null, 0, 1, Axis.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boxEClass, Box.class, "Box", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBox_Size(), theXMLTypePackage.getString(), "size", "0 0 0", 0, 1, Box.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBox_Dimension(), this.getVector3(), null, "dimension", null, 0, 1, Box.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(calibrationEClass, Calibration.class, "Calibration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCalibration_ReferencePosition(), theXMLTypePackage.getDouble(), "referencePosition", null, 0, 1, Calibration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalibration_Rising(), theXMLTypePackage.getDouble(), "rising", null, 0, 1, Calibration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCalibration_Falling(), theXMLTypePackage.getDouble(), "falling", null, 0, 1, Calibration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childEClass, Child.class, "Child", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collisionEClass, Collision.class, "Collision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollision_Origin(), this.getPose(), null, "origin", null, 0, 1, Collision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollision_Geometry(), this.getGeometry(), null, "geometry", null, 1, 1, Collision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollision_Verbose(), this.getVerbose(), null, "verbose", null, 0, 1, Collision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollision_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Collision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColor_Rgba(), theXMLTypePackage.getString(), "rgba", "0 0 0 0", 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColor_Color(), this.getVector4(), null, "color", null, 0, 1, Color.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cylinderEClass, Cylinder.class, "Cylinder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCylinder_Radius(), theXMLTypePackage.getDouble(), "radius", null, 1, 1, Cylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCylinder_Length(), theXMLTypePackage.getDouble(), "length", null, 1, 1, Cylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), theEcorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), theEcorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), theEcorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Robot(), this.getRobotType(), null, "robot", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dynamicsEClass, Dynamics.class, "Dynamics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDynamics_Damping(), theXMLTypePackage.getDouble(), "damping", "0", 0, 1, Dynamics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDynamics_Friction(), theXMLTypePackage.getDouble(), "friction", "0", 0, 1, Dynamics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gapJointTransmissionEClass, GapJointTransmission.class, "GapJointTransmission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGapJointTransmission_L0(), theXMLTypePackage.getDouble(), "l0", null, 1, 1, GapJointTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGapJointTransmission_A(), theXMLTypePackage.getDouble(), "a", null, 1, 1, GapJointTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGapJointTransmission_B(), theXMLTypePackage.getDouble(), "b", null, 1, 1, GapJointTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGapJointTransmission_GearRatio(), theXMLTypePackage.getDouble(), "gearRatio", null, 1, 1, GapJointTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGapJointTransmission_H(), theXMLTypePackage.getDouble(), "h", null, 1, 1, GapJointTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGapJointTransmission_MechanicalReduction(), theXMLTypePackage.getDouble(), "mechanicalReduction", null, 1, 1, GapJointTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGapJointTransmission_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, GapJointTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGapJointTransmission_Phi0(), theXMLTypePackage.getDouble(), "phi0", null, 1, 1, GapJointTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGapJointTransmission_R(), theXMLTypePackage.getDouble(), "r", null, 1, 1, GapJointTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGapJointTransmission_ScrewReduction(), theXMLTypePackage.getDouble(), "screwReduction", null, 1, 1, GapJointTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGapJointTransmission_T0(), theXMLTypePackage.getDouble(), "t0", null, 1, 1, GapJointTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGapJointTransmission_Theta0(), theXMLTypePackage.getDouble(), "theta0", null, 1, 1, GapJointTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geometryEClass, Geometry.class, "Geometry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeometry_Box(), this.getBox(), null, "box", null, 0, 1, Geometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeometry_Cylinder(), this.getCylinder(), null, "cylinder", null, 0, 1, Geometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeometry_Sphere(), this.getSphere(), null, "sphere", null, 0, 1, Geometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeometry_Mesh(), this.getMesh(), null, "mesh", null, 0, 1, Geometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inertiaEClass, Inertia.class, "Inertia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInertia_Ixx(), theXMLTypePackage.getDouble(), "ixx", "0", 0, 1, Inertia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInertia_Ixy(), theXMLTypePackage.getDouble(), "ixy", "0", 0, 1, Inertia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInertia_Ixz(), theXMLTypePackage.getDouble(), "ixz", "0", 0, 1, Inertia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInertia_Iyy(), theXMLTypePackage.getDouble(), "iyy", "0", 0, 1, Inertia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInertia_Iyz(), theXMLTypePackage.getDouble(), "iyz", "0", 0, 1, Inertia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInertia_Izz(), theXMLTypePackage.getDouble(), "izz", "0", 0, 1, Inertia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inertialEClass, Inertial.class, "Inertial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInertial_Origin(), this.getPose(), null, "origin", null, 0, 1, Inertial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInertial_Mass(), this.getMass(), null, "mass", null, 0, 1, Inertial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInertial_Inertia(), this.getInertia(), null, "inertia", null, 0, 1, Inertial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jointEClass, Joint.class, "Joint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJoint_Origin(), this.getPose(), null, "origin", null, 0, 1, Joint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoint_Parent(), this.getParent(), null, "parent", null, 1, 1, Joint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoint_Child(), this.getChild(), null, "child", null, 1, 1, Joint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoint_Axis(), this.getAxis(), null, "axis", null, 0, 1, Joint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoint_Calibration(), this.getCalibration(), null, "calibration", null, 0, 1, Joint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoint_Dynamics(), this.getDynamics(), null, "dynamics", null, 0, 1, Joint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoint_Limit(), this.getLimit(), null, "limit", null, 0, 1, Joint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoint_SafetyController(), this.getSafetyController(), null, "safetyController", null, 0, 1, Joint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoint_Mimic(), this.getMimic(), null, "mimic", null, 0, 1, Joint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoint_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Joint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoint_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, Joint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(limitEClass, Limit.class, "Limit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLimit_Lower(), theXMLTypePackage.getDouble(), "lower", "0", 0, 1, Limit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLimit_Upper(), theXMLTypePackage.getDouble(), "upper", "0", 0, 1, Limit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLimit_Effort(), theXMLTypePackage.getDouble(), "effort", "0", 0, 1, Limit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLimit_Velocity(), theXMLTypePackage.getDouble(), "velocity", "0", 0, 1, Limit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Inertial(), this.getInertial(), null, "inertial", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Visual(), this.getVisual(), null, "visual", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Collision(), this.getCollision(), null, "collision", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(massEClass, Mass.class, "Mass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMass_Value(), theXMLTypePackage.getDouble(), "value", "0", 0, 1, Mass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(materialEClass, Material.class, "Material", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaterial_Color(), this.getColor(), null, "color", null, 0, 1, Material.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaterial_Texture(), this.getTexture(), null, "texture", null, 0, 1, Material.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaterial_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Material.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaterial_MaterialRef(), this.getMaterialGlobal(), null, "materialRef", null, 0, 1, Material.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(materialGlobalEClass, MaterialGlobal.class, "MaterialGlobal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaterialGlobal_Color(), this.getColor(), null, "color", null, 0, 1, MaterialGlobal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMaterialGlobal_Texture(), this.getTexture(), null, "texture", null, 0, 1, MaterialGlobal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaterialGlobal_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, MaterialGlobal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meshEClass, Mesh.class, "Mesh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMesh_Filename(), theXMLTypePackage.getAnyURI(), "filename", null, 1, 1, Mesh.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMesh_Scale(), theXMLTypePackage.getString(), "scale", "1 1 1", 0, 1, Mesh.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMesh_ScaleVector(), this.getVector3(), null, "scaleVector", null, 0, 1, Mesh.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mimicEClass, Mimic.class, "Mimic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMimic_Joint(), theXMLTypePackage.getString(), "joint", null, 1, 1, Mimic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMimic_Multiplier(), theXMLTypePackage.getDouble(), "multiplier", "1", 0, 1, Mimic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMimic_Offset(), theXMLTypePackage.getDouble(), "offset", "0", 0, 1, Mimic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameEClass, Name.class, "Name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getName_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parentEClass, Parent.class, "Parent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(passiveJointTransmissionEClass, PassiveJointTransmission.class, "PassiveJointTransmission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassiveJointTransmission_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PassiveJointTransmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poseEClass, Pose.class, "Pose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPose_Xyz(), theXMLTypePackage.getString(), "xyz", "0 0 0", 0, 1, Pose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPose_Rpy(), theXMLTypePackage.getString(), "rpy", "0 0 0", 0, 1, Pose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPose_XyzVector(), this.getVector3(), null, "xyzVector", null, 0, 1, Pose.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPose_RpyVector(), this.getVector3(), null, "rpyVector", null, 0, 1, Pose.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(robotTypeEClass, RobotType.class, "RobotType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRobotType_Group(), theEcorePackage.getEFeatureMapEntry(), "group", null, 0, -1, RobotType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRobotType_Joint(), this.getJoint(), null, "joint", null, 0, -1, RobotType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRobotType_Link(), this.getLink(), null, "link", null, 0, -1, RobotType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRobotType_Material(), this.getMaterialGlobal(), null, "material", null, 0, -1, RobotType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRobotType_Transmission(), this.getTransmission(), null, "transmission", null, 0, -1, RobotType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, RobotType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRobotType_Version(), theXMLTypePackage.getString(), "version", "1.0", 0, 1, RobotType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(safetyControllerEClass, SafetyController.class, "SafetyController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSafetyController_SoftLowerLimit(), theXMLTypePackage.getDouble(), "softLowerLimit", "0", 0, 1, SafetyController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSafetyController_SoftUpperLimit(), theXMLTypePackage.getDouble(), "softUpperLimit", "0", 0, 1, SafetyController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSafetyController_KPosition(), theXMLTypePackage.getDouble(), "kPosition", "0", 0, 1, SafetyController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSafetyController_KVelocity(), theXMLTypePackage.getDouble(), "kVelocity", null, 1, 1, SafetyController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sphereEClass, Sphere.class, "Sphere", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSphere_Radius(), theXMLTypePackage.getDouble(), "radius", null, 1, 1, Sphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textureEClass, Texture.class, "Texture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTexture_Filename(), theXMLTypePackage.getAnyURI(), "filename", null, 0, 1, Texture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transmissionEClass, Transmission.class, "Transmission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransmission_Group(), theEcorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransmission_LeftActuator(), this.getActuatorTransmission(), null, "leftActuator", null, 0, -1, Transmission.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransmission_RightActuator(), this.getActuatorTransmission(), null, "rightActuator", null, 0, -1, Transmission.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransmission_FlexJoint(), this.getActuatorTransmission(), null, "flexJoint", null, 0, -1, Transmission.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransmission_RollJoint(), this.getActuatorTransmission(), null, "rollJoint", null, 0, -1, Transmission.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransmission_GapJoint(), this.getGapJointTransmission(), null, "gapJoint", null, 0, -1, Transmission.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransmission_PassiveJoint(), this.getPassiveJointTransmission(), null, "passiveJoint", null, 0, -1, Transmission.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransmission_UseSimulatedGripperJoint(), this.getUseSimulatedGripperJointType(), null, "useSimulatedGripperJoint", null, 0, -1, Transmission.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransmission_MechanicalReduction(), theXMLTypePackage.getDouble(), "mechanicalReduction", null, 0, 1, Transmission.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransmission_Actuator(), this.getName_(), null, "actuator", null, 0, -1, Transmission.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTransmission_Joint(), this.getName_(), null, "joint", null, 0, -1, Transmission.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransmission_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransmission_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useSimulatedGripperJointTypeEClass, UseSimulatedGripperJointType.class, "UseSimulatedGripperJointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(verboseEClass, Verbose.class, "Verbose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerbose_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Verbose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visualEClass, Visual.class, "Visual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVisual_Origin(), this.getPose(), null, "origin", null, 0, 1, Visual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisual_Geometry(), this.getGeometry(), null, "geometry", null, 1, 1, Visual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisual_Material(), this.getMaterial(), null, "material", null, 0, 1, Visual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vector3EClass, Vector3.class, "Vector3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVector3_A(), ecorePackage.getEDouble(), "a", null, 0, 1, Vector3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector3_B(), ecorePackage.getEDouble(), "b", null, 0, 1, Vector3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector3_C(), ecorePackage.getEDouble(), "c", null, 0, 1, Vector3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vector4EClass, Vector4.class, "Vector4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVector4_A(), ecorePackage.getEDouble(), "a", null, 0, 1, Vector4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector4_B(), ecorePackage.getEDouble(), "b", null, 0, 1, Vector4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector4_C(), ecorePackage.getEDouble(), "c", null, 0, 1, Vector4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVector4_D(), ecorePackage.getEDouble(), "d", null, 0, 1, Vector4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkRefEClass, LinkRef.class, "LinkRef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkRef_LinkRef(), this.getLink(), null, "linkRef", null, 0, 1, LinkRef.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkRef_Link(), theXMLTypePackage.getString(), "link", null, 1, 1, LinkRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (actuatorTransmissionEClass,
		   source,
		   new String[] {
			   "name", "actuator_transmission",
			   "kind", "empty"
		   });
		addAnnotation
		  (getActuatorTransmission_MechanicalReduction(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "mechanicalReduction"
		   });
		addAnnotation
		  (getActuatorTransmission_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (axisEClass,
		   source,
		   new String[] {
			   "name", "axis",
			   "kind", "empty"
		   });
		addAnnotation
		  (getAxis_Xyz(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xyz"
		   });
		addAnnotation
		  (boxEClass,
		   source,
		   new String[] {
			   "name", "box",
			   "kind", "empty"
		   });
		addAnnotation
		  (getBox_Size(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "size"
		   });
		addAnnotation
		  (calibrationEClass,
		   source,
		   new String[] {
			   "name", "calibration",
			   "kind", "empty"
		   });
		addAnnotation
		  (getCalibration_ReferencePosition(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "reference_position"
		   });
		addAnnotation
		  (getCalibration_Rising(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "rising"
		   });
		addAnnotation
		  (getCalibration_Falling(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "falling"
		   });
		addAnnotation
		  (childEClass,
		   source,
		   new String[] {
			   "name", "child",
			   "kind", "empty"
		   });
		addAnnotation
		  (collisionEClass,
		   source,
		   new String[] {
			   "name", "collision",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCollision_Origin(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "origin",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCollision_Geometry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geometry",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCollision_Verbose(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "verbose",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCollision_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (colorEClass,
		   source,
		   new String[] {
			   "name", "color",
			   "kind", "empty"
		   });
		addAnnotation
		  (getColor_Rgba(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "rgba"
		   });
		addAnnotation
		  (cylinderEClass,
		   source,
		   new String[] {
			   "name", "cylinder",
			   "kind", "empty"
		   });
		addAnnotation
		  (getCylinder_Radius(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "radius"
		   });
		addAnnotation
		  (getCylinder_Length(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "length"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_Robot(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "robot",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (dynamicsEClass,
		   source,
		   new String[] {
			   "name", "dynamics",
			   "kind", "empty"
		   });
		addAnnotation
		  (getDynamics_Damping(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "damping"
		   });
		addAnnotation
		  (getDynamics_Friction(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "friction"
		   });
		addAnnotation
		  (gapJointTransmissionEClass,
		   source,
		   new String[] {
			   "name", "gap_joint_transmission",
			   "kind", "empty"
		   });
		addAnnotation
		  (getGapJointTransmission_L0(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "L0"
		   });
		addAnnotation
		  (getGapJointTransmission_A(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "a"
		   });
		addAnnotation
		  (getGapJointTransmission_B(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "b"
		   });
		addAnnotation
		  (getGapJointTransmission_GearRatio(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "gear_ratio"
		   });
		addAnnotation
		  (getGapJointTransmission_H(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "h"
		   });
		addAnnotation
		  (getGapJointTransmission_MechanicalReduction(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "mechanical_reduction"
		   });
		addAnnotation
		  (getGapJointTransmission_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getGapJointTransmission_Phi0(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "phi0"
		   });
		addAnnotation
		  (getGapJointTransmission_R(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "r"
		   });
		addAnnotation
		  (getGapJointTransmission_ScrewReduction(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "screw_reduction"
		   });
		addAnnotation
		  (getGapJointTransmission_T0(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "t0"
		   });
		addAnnotation
		  (getGapJointTransmission_Theta0(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "theta0"
		   });
		addAnnotation
		  (geometryEClass,
		   source,
		   new String[] {
			   "name", "geometry",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGeometry_Box(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "box",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeometry_Cylinder(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "cylinder",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeometry_Sphere(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sphere",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getGeometry_Mesh(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mesh",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (inertiaEClass,
		   source,
		   new String[] {
			   "name", "inertia",
			   "kind", "empty"
		   });
		addAnnotation
		  (getInertia_Ixx(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ixx"
		   });
		addAnnotation
		  (getInertia_Ixy(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ixy"
		   });
		addAnnotation
		  (getInertia_Ixz(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ixz"
		   });
		addAnnotation
		  (getInertia_Iyy(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "iyy"
		   });
		addAnnotation
		  (getInertia_Iyz(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "iyz"
		   });
		addAnnotation
		  (getInertia_Izz(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "izz"
		   });
		addAnnotation
		  (inertialEClass,
		   source,
		   new String[] {
			   "name", "inertial",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInertial_Origin(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "origin",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInertial_Mass(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mass",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInertial_Inertia(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inertia",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (jointEClass,
		   source,
		   new String[] {
			   "name", "joint",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getJoint_Origin(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "origin",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJoint_Parent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "parent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJoint_Child(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "child",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJoint_Axis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "axis",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJoint_Calibration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "calibration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJoint_Dynamics(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "dynamics",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJoint_Limit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "limit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJoint_SafetyController(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "safety_controller",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJoint_Mimic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mimic",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getJoint_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getJoint_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (limitEClass,
		   source,
		   new String[] {
			   "name", "limit",
			   "kind", "empty"
		   });
		addAnnotation
		  (getLimit_Lower(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lower"
		   });
		addAnnotation
		  (getLimit_Upper(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "upper"
		   });
		addAnnotation
		  (getLimit_Effort(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "effort"
		   });
		addAnnotation
		  (getLimit_Velocity(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "velocity"
		   });
		addAnnotation
		  (linkEClass,
		   source,
		   new String[] {
			   "name", "link",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLink_Inertial(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inertial",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLink_Visual(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "visual",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLink_Collision(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "collision",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLink_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getLink_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (massEClass,
		   source,
		   new String[] {
			   "name", "mass",
			   "kind", "empty"
		   });
		addAnnotation
		  (getMass_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (materialEClass,
		   source,
		   new String[] {
			   "name", "material",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMaterial_Color(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "color",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMaterial_Texture(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "texture",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMaterial_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (materialGlobalEClass,
		   source,
		   new String[] {
			   "name", "material_global",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMaterialGlobal_Color(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "color",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMaterialGlobal_Texture(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "texture",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMaterialGlobal_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (meshEClass,
		   source,
		   new String[] {
			   "name", "mesh",
			   "kind", "empty"
		   });
		addAnnotation
		  (getMesh_Filename(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "filename"
		   });
		addAnnotation
		  (getMesh_Scale(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "scale"
		   });
		addAnnotation
		  (mimicEClass,
		   source,
		   new String[] {
			   "name", "mimic",
			   "kind", "empty"
		   });
		addAnnotation
		  (getMimic_Joint(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "joint"
		   });
		addAnnotation
		  (getMimic_Multiplier(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "multiplier"
		   });
		addAnnotation
		  (getMimic_Offset(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "offset"
		   });
		addAnnotation
		  (nameEClass,
		   source,
		   new String[] {
			   "name", "name",
			   "kind", "empty"
		   });
		addAnnotation
		  (getName_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (parentEClass,
		   source,
		   new String[] {
			   "name", "parent",
			   "kind", "empty"
		   });
		addAnnotation
		  (passiveJointTransmissionEClass,
		   source,
		   new String[] {
			   "name", "passive_joint_transmission",
			   "kind", "empty"
		   });
		addAnnotation
		  (getPassiveJointTransmission_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (poseEClass,
		   source,
		   new String[] {
			   "name", "pose",
			   "kind", "empty"
		   });
		addAnnotation
		  (getPose_Xyz(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xyz"
		   });
		addAnnotation
		  (getPose_Rpy(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "rpy"
		   });
		addAnnotation
		  (robotTypeEClass,
		   source,
		   new String[] {
			   "name", "robot",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRobotType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getRobotType_Joint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "joint",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getRobotType_Link(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "link",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getRobotType_Material(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "material",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getRobotType_Transmission(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "transmission",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getRobotType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getRobotType_Version(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "version"
		   });
		addAnnotation
		  (safetyControllerEClass,
		   source,
		   new String[] {
			   "name", "safety_controller",
			   "kind", "empty"
		   });
		addAnnotation
		  (getSafetyController_SoftLowerLimit(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "soft_lower_limit"
		   });
		addAnnotation
		  (getSafetyController_SoftUpperLimit(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "soft_upper_limit"
		   });
		addAnnotation
		  (getSafetyController_KPosition(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "k_position"
		   });
		addAnnotation
		  (getSafetyController_KVelocity(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "k_velocity"
		   });
		addAnnotation
		  (sphereEClass,
		   source,
		   new String[] {
			   "name", "sphere",
			   "kind", "empty"
		   });
		addAnnotation
		  (getSphere_Radius(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "radius"
		   });
		addAnnotation
		  (textureEClass,
		   source,
		   new String[] {
			   "name", "texture",
			   "kind", "empty"
		   });
		addAnnotation
		  (getTexture_Filename(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "filename"
		   });
		addAnnotation
		  (transmissionEClass,
		   source,
		   new String[] {
			   "name", "transmission",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTransmission_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getTransmission_LeftActuator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "leftActuator",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getTransmission_RightActuator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rightActuator",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getTransmission_FlexJoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "flexJoint",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getTransmission_RollJoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rollJoint",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getTransmission_GapJoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "gap_joint",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getTransmission_PassiveJoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "passive_joint",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getTransmission_UseSimulatedGripperJoint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "use_simulated_gripper_joint",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getTransmission_MechanicalReduction(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "mechanicalReduction",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getTransmission_Actuator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "actuator",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getTransmission_Joint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "joint",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getTransmission_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getTransmission_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (useSimulatedGripperJointTypeEClass,
		   source,
		   new String[] {
			   "name", "use_simulated_gripper_joint_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (verboseEClass,
		   source,
		   new String[] {
			   "name", "verbose",
			   "kind", "empty"
		   });
		addAnnotation
		  (getVerbose_Value(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "value"
		   });
		addAnnotation
		  (visualEClass,
		   source,
		   new String[] {
			   "name", "visual",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVisual_Origin(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "origin",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVisual_Geometry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "geometry",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getVisual_Material(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "material",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getLinkRef_Link(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "link"
		   });
	}

} //UrdfPackageImpl
