/**
 */
package org.ros.model.urdf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ros.model.urdf.GapJointTransmission;
import org.ros.model.urdf.UrdfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gap Joint Transmission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.impl.GapJointTransmissionImpl#getL0 <em>L0</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.GapJointTransmissionImpl#getA <em>A</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.GapJointTransmissionImpl#getB <em>B</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.GapJointTransmissionImpl#getGearRatio <em>Gear Ratio</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.GapJointTransmissionImpl#getH <em>H</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.GapJointTransmissionImpl#getMechanicalReduction <em>Mechanical Reduction</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.GapJointTransmissionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.GapJointTransmissionImpl#getPhi0 <em>Phi0</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.GapJointTransmissionImpl#getR <em>R</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.GapJointTransmissionImpl#getScrewReduction <em>Screw Reduction</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.GapJointTransmissionImpl#getT0 <em>T0</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.GapJointTransmissionImpl#getTheta0 <em>Theta0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GapJointTransmissionImpl extends MinimalEObjectImpl.Container implements GapJointTransmission {
	/**
	 * The default value of the '{@link #getL0() <em>L0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL0()
	 * @generated
	 * @ordered
	 */
	protected static final double L0_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getL0() <em>L0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL0()
	 * @generated
	 * @ordered
	 */
	protected double l0 = L0_EDEFAULT;

	/**
	 * This is true if the L0 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean l0ESet;

	/**
	 * The default value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected static final double A_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected double a = A_EDEFAULT;

	/**
	 * This is true if the A attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aESet;

	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final double B_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected double b = B_EDEFAULT;

	/**
	 * This is true if the B attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bESet;

	/**
	 * The default value of the '{@link #getGearRatio() <em>Gear Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGearRatio()
	 * @generated
	 * @ordered
	 */
	protected static final double GEAR_RATIO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGearRatio() <em>Gear Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGearRatio()
	 * @generated
	 * @ordered
	 */
	protected double gearRatio = GEAR_RATIO_EDEFAULT;

	/**
	 * This is true if the Gear Ratio attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gearRatioESet;

	/**
	 * The default value of the '{@link #getH() <em>H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH()
	 * @generated
	 * @ordered
	 */
	protected static final double H_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getH() <em>H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH()
	 * @generated
	 * @ordered
	 */
	protected double h = H_EDEFAULT;

	/**
	 * This is true if the H attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hESet;

	/**
	 * The default value of the '{@link #getMechanicalReduction() <em>Mechanical Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanicalReduction()
	 * @generated
	 * @ordered
	 */
	protected static final double MECHANICAL_REDUCTION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMechanicalReduction() <em>Mechanical Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanicalReduction()
	 * @generated
	 * @ordered
	 */
	protected double mechanicalReduction = MECHANICAL_REDUCTION_EDEFAULT;

	/**
	 * This is true if the Mechanical Reduction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mechanicalReductionESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhi0() <em>Phi0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhi0()
	 * @generated
	 * @ordered
	 */
	protected static final double PHI0_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPhi0() <em>Phi0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhi0()
	 * @generated
	 * @ordered
	 */
	protected double phi0 = PHI0_EDEFAULT;

	/**
	 * This is true if the Phi0 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phi0ESet;

	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final double R_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected double r = R_EDEFAULT;

	/**
	 * This is true if the R attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rESet;

	/**
	 * The default value of the '{@link #getScrewReduction() <em>Screw Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrewReduction()
	 * @generated
	 * @ordered
	 */
	protected static final double SCREW_REDUCTION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScrewReduction() <em>Screw Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrewReduction()
	 * @generated
	 * @ordered
	 */
	protected double screwReduction = SCREW_REDUCTION_EDEFAULT;

	/**
	 * This is true if the Screw Reduction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean screwReductionESet;

	/**
	 * The default value of the '{@link #getT0() <em>T0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT0()
	 * @generated
	 * @ordered
	 */
	protected static final double T0_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getT0() <em>T0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT0()
	 * @generated
	 * @ordered
	 */
	protected double t0 = T0_EDEFAULT;

	/**
	 * This is true if the T0 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean t0ESet;

	/**
	 * The default value of the '{@link #getTheta0() <em>Theta0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheta0()
	 * @generated
	 * @ordered
	 */
	protected static final double THETA0_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTheta0() <em>Theta0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheta0()
	 * @generated
	 * @ordered
	 */
	protected double theta0 = THETA0_EDEFAULT;

	/**
	 * This is true if the Theta0 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean theta0ESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GapJointTransmissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UrdfPackage.Literals.GAP_JOINT_TRANSMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getA() {
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(double newA) {
		double oldA = a;
		a = newA;
		boolean oldAESet = aESet;
		aESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.GAP_JOINT_TRANSMISSION__A, oldA, a, !oldAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetA() {
		double oldA = a;
		boolean oldAESet = aESet;
		a = A_EDEFAULT;
		aESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.GAP_JOINT_TRANSMISSION__A, oldA, A_EDEFAULT, oldAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetA() {
		return aESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(double newB) {
		double oldB = b;
		b = newB;
		boolean oldBESet = bESet;
		bESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.GAP_JOINT_TRANSMISSION__B, oldB, b, !oldBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetB() {
		double oldB = b;
		boolean oldBESet = bESet;
		b = B_EDEFAULT;
		bESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.GAP_JOINT_TRANSMISSION__B, oldB, B_EDEFAULT, oldBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetB() {
		return bESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGearRatio() {
		return gearRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGearRatio(double newGearRatio) {
		double oldGearRatio = gearRatio;
		gearRatio = newGearRatio;
		boolean oldGearRatioESet = gearRatioESet;
		gearRatioESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.GAP_JOINT_TRANSMISSION__GEAR_RATIO, oldGearRatio, gearRatio, !oldGearRatioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGearRatio() {
		double oldGearRatio = gearRatio;
		boolean oldGearRatioESet = gearRatioESet;
		gearRatio = GEAR_RATIO_EDEFAULT;
		gearRatioESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.GAP_JOINT_TRANSMISSION__GEAR_RATIO, oldGearRatio, GEAR_RATIO_EDEFAULT, oldGearRatioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGearRatio() {
		return gearRatioESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getH() {
		return h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setH(double newH) {
		double oldH = h;
		h = newH;
		boolean oldHESet = hESet;
		hESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.GAP_JOINT_TRANSMISSION__H, oldH, h, !oldHESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetH() {
		double oldH = h;
		boolean oldHESet = hESet;
		h = H_EDEFAULT;
		hESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.GAP_JOINT_TRANSMISSION__H, oldH, H_EDEFAULT, oldHESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetH() {
		return hESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getL0() {
		return l0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL0(double newL0) {
		double oldL0 = l0;
		l0 = newL0;
		boolean oldL0ESet = l0ESet;
		l0ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.GAP_JOINT_TRANSMISSION__L0, oldL0, l0, !oldL0ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetL0() {
		double oldL0 = l0;
		boolean oldL0ESet = l0ESet;
		l0 = L0_EDEFAULT;
		l0ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.GAP_JOINT_TRANSMISSION__L0, oldL0, L0_EDEFAULT, oldL0ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetL0() {
		return l0ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMechanicalReduction() {
		return mechanicalReduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMechanicalReduction(double newMechanicalReduction) {
		double oldMechanicalReduction = mechanicalReduction;
		mechanicalReduction = newMechanicalReduction;
		boolean oldMechanicalReductionESet = mechanicalReductionESet;
		mechanicalReductionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.GAP_JOINT_TRANSMISSION__MECHANICAL_REDUCTION, oldMechanicalReduction, mechanicalReduction, !oldMechanicalReductionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMechanicalReduction() {
		double oldMechanicalReduction = mechanicalReduction;
		boolean oldMechanicalReductionESet = mechanicalReductionESet;
		mechanicalReduction = MECHANICAL_REDUCTION_EDEFAULT;
		mechanicalReductionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.GAP_JOINT_TRANSMISSION__MECHANICAL_REDUCTION, oldMechanicalReduction, MECHANICAL_REDUCTION_EDEFAULT, oldMechanicalReductionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMechanicalReduction() {
		return mechanicalReductionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.GAP_JOINT_TRANSMISSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPhi0() {
		return phi0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhi0(double newPhi0) {
		double oldPhi0 = phi0;
		phi0 = newPhi0;
		boolean oldPhi0ESet = phi0ESet;
		phi0ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.GAP_JOINT_TRANSMISSION__PHI0, oldPhi0, phi0, !oldPhi0ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPhi0() {
		double oldPhi0 = phi0;
		boolean oldPhi0ESet = phi0ESet;
		phi0 = PHI0_EDEFAULT;
		phi0ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.GAP_JOINT_TRANSMISSION__PHI0, oldPhi0, PHI0_EDEFAULT, oldPhi0ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPhi0() {
		return phi0ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(double newR) {
		double oldR = r;
		r = newR;
		boolean oldRESet = rESet;
		rESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.GAP_JOINT_TRANSMISSION__R, oldR, r, !oldRESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetR() {
		double oldR = r;
		boolean oldRESet = rESet;
		r = R_EDEFAULT;
		rESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.GAP_JOINT_TRANSMISSION__R, oldR, R_EDEFAULT, oldRESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetR() {
		return rESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScrewReduction() {
		return screwReduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrewReduction(double newScrewReduction) {
		double oldScrewReduction = screwReduction;
		screwReduction = newScrewReduction;
		boolean oldScrewReductionESet = screwReductionESet;
		screwReductionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.GAP_JOINT_TRANSMISSION__SCREW_REDUCTION, oldScrewReduction, screwReduction, !oldScrewReductionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScrewReduction() {
		double oldScrewReduction = screwReduction;
		boolean oldScrewReductionESet = screwReductionESet;
		screwReduction = SCREW_REDUCTION_EDEFAULT;
		screwReductionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.GAP_JOINT_TRANSMISSION__SCREW_REDUCTION, oldScrewReduction, SCREW_REDUCTION_EDEFAULT, oldScrewReductionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScrewReduction() {
		return screwReductionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getT0() {
		return t0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setT0(double newT0) {
		double oldT0 = t0;
		t0 = newT0;
		boolean oldT0ESet = t0ESet;
		t0ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.GAP_JOINT_TRANSMISSION__T0, oldT0, t0, !oldT0ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetT0() {
		double oldT0 = t0;
		boolean oldT0ESet = t0ESet;
		t0 = T0_EDEFAULT;
		t0ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.GAP_JOINT_TRANSMISSION__T0, oldT0, T0_EDEFAULT, oldT0ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetT0() {
		return t0ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTheta0() {
		return theta0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheta0(double newTheta0) {
		double oldTheta0 = theta0;
		theta0 = newTheta0;
		boolean oldTheta0ESet = theta0ESet;
		theta0ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.GAP_JOINT_TRANSMISSION__THETA0, oldTheta0, theta0, !oldTheta0ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTheta0() {
		double oldTheta0 = theta0;
		boolean oldTheta0ESet = theta0ESet;
		theta0 = THETA0_EDEFAULT;
		theta0ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.GAP_JOINT_TRANSMISSION__THETA0, oldTheta0, THETA0_EDEFAULT, oldTheta0ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTheta0() {
		return theta0ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UrdfPackage.GAP_JOINT_TRANSMISSION__L0:
				return getL0();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__A:
				return getA();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__B:
				return getB();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__GEAR_RATIO:
				return getGearRatio();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__H:
				return getH();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__MECHANICAL_REDUCTION:
				return getMechanicalReduction();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__NAME:
				return getName();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__PHI0:
				return getPhi0();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__R:
				return getR();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__SCREW_REDUCTION:
				return getScrewReduction();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__T0:
				return getT0();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__THETA0:
				return getTheta0();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UrdfPackage.GAP_JOINT_TRANSMISSION__L0:
				setL0((Double)newValue);
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__A:
				setA((Double)newValue);
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__B:
				setB((Double)newValue);
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__GEAR_RATIO:
				setGearRatio((Double)newValue);
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__H:
				setH((Double)newValue);
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__MECHANICAL_REDUCTION:
				setMechanicalReduction((Double)newValue);
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__NAME:
				setName((String)newValue);
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__PHI0:
				setPhi0((Double)newValue);
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__R:
				setR((Double)newValue);
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__SCREW_REDUCTION:
				setScrewReduction((Double)newValue);
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__T0:
				setT0((Double)newValue);
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__THETA0:
				setTheta0((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UrdfPackage.GAP_JOINT_TRANSMISSION__L0:
				unsetL0();
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__A:
				unsetA();
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__B:
				unsetB();
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__GEAR_RATIO:
				unsetGearRatio();
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__H:
				unsetH();
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__MECHANICAL_REDUCTION:
				unsetMechanicalReduction();
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__PHI0:
				unsetPhi0();
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__R:
				unsetR();
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__SCREW_REDUCTION:
				unsetScrewReduction();
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__T0:
				unsetT0();
				return;
			case UrdfPackage.GAP_JOINT_TRANSMISSION__THETA0:
				unsetTheta0();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UrdfPackage.GAP_JOINT_TRANSMISSION__L0:
				return isSetL0();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__A:
				return isSetA();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__B:
				return isSetB();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__GEAR_RATIO:
				return isSetGearRatio();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__H:
				return isSetH();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__MECHANICAL_REDUCTION:
				return isSetMechanicalReduction();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UrdfPackage.GAP_JOINT_TRANSMISSION__PHI0:
				return isSetPhi0();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__R:
				return isSetR();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__SCREW_REDUCTION:
				return isSetScrewReduction();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__T0:
				return isSetT0();
			case UrdfPackage.GAP_JOINT_TRANSMISSION__THETA0:
				return isSetTheta0();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (l0: ");
		if (l0ESet) result.append(l0); else result.append("<unset>");
		result.append(", a: ");
		if (aESet) result.append(a); else result.append("<unset>");
		result.append(", b: ");
		if (bESet) result.append(b); else result.append("<unset>");
		result.append(", gearRatio: ");
		if (gearRatioESet) result.append(gearRatio); else result.append("<unset>");
		result.append(", h: ");
		if (hESet) result.append(h); else result.append("<unset>");
		result.append(", mechanicalReduction: ");
		if (mechanicalReductionESet) result.append(mechanicalReduction); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", phi0: ");
		if (phi0ESet) result.append(phi0); else result.append("<unset>");
		result.append(", r: ");
		if (rESet) result.append(r); else result.append("<unset>");
		result.append(", screwReduction: ");
		if (screwReductionESet) result.append(screwReduction); else result.append("<unset>");
		result.append(", t0: ");
		if (t0ESet) result.append(t0); else result.append("<unset>");
		result.append(", theta0: ");
		if (theta0ESet) result.append(theta0); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GapJointTransmissionImpl
