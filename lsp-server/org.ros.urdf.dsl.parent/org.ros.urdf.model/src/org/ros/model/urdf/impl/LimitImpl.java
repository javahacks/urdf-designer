/**
 */
package org.ros.model.urdf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ros.model.urdf.Limit;
import org.ros.model.urdf.UrdfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.impl.LimitImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.LimitImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.LimitImpl#getEffort <em>Effort</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.LimitImpl#getVelocity <em>Velocity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LimitImpl extends MinimalEObjectImpl.Container implements Limit {
	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final double LOWER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected double lower = LOWER_EDEFAULT;

	/**
	 * This is true if the Lower attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lowerESet;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final double UPPER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected double upper = UPPER_EDEFAULT;

	/**
	 * This is true if the Upper attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean upperESet;

	/**
	 * The default value of the '{@link #getEffort() <em>Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffort()
	 * @generated
	 * @ordered
	 */
	protected static final double EFFORT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEffort() <em>Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffort()
	 * @generated
	 * @ordered
	 */
	protected double effort = EFFORT_EDEFAULT;

	/**
	 * This is true if the Effort attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effortESet;

	/**
	 * The default value of the '{@link #getVelocity() <em>Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVelocity() <em>Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocity()
	 * @generated
	 * @ordered
	 */
	protected double velocity = VELOCITY_EDEFAULT;

	/**
	 * This is true if the Velocity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean velocityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LimitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UrdfPackage.Literals.LIMIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEffort() {
		return effort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffort(double newEffort) {
		double oldEffort = effort;
		effort = newEffort;
		boolean oldEffortESet = effortESet;
		effortESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.LIMIT__EFFORT, oldEffort, effort, !oldEffortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffort() {
		double oldEffort = effort;
		boolean oldEffortESet = effortESet;
		effort = EFFORT_EDEFAULT;
		effortESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.LIMIT__EFFORT, oldEffort, EFFORT_EDEFAULT, oldEffortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffort() {
		return effortESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(double newLower) {
		double oldLower = lower;
		lower = newLower;
		boolean oldLowerESet = lowerESet;
		lowerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.LIMIT__LOWER, oldLower, lower, !oldLowerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLower() {
		double oldLower = lower;
		boolean oldLowerESet = lowerESet;
		lower = LOWER_EDEFAULT;
		lowerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.LIMIT__LOWER, oldLower, LOWER_EDEFAULT, oldLowerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLower() {
		return lowerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(double newUpper) {
		double oldUpper = upper;
		upper = newUpper;
		boolean oldUpperESet = upperESet;
		upperESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.LIMIT__UPPER, oldUpper, upper, !oldUpperESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpper() {
		double oldUpper = upper;
		boolean oldUpperESet = upperESet;
		upper = UPPER_EDEFAULT;
		upperESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.LIMIT__UPPER, oldUpper, UPPER_EDEFAULT, oldUpperESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpper() {
		return upperESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVelocity() {
		return velocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocity(double newVelocity) {
		double oldVelocity = velocity;
		velocity = newVelocity;
		boolean oldVelocityESet = velocityESet;
		velocityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.LIMIT__VELOCITY, oldVelocity, velocity, !oldVelocityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVelocity() {
		double oldVelocity = velocity;
		boolean oldVelocityESet = velocityESet;
		velocity = VELOCITY_EDEFAULT;
		velocityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.LIMIT__VELOCITY, oldVelocity, VELOCITY_EDEFAULT, oldVelocityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVelocity() {
		return velocityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UrdfPackage.LIMIT__LOWER:
				return getLower();
			case UrdfPackage.LIMIT__UPPER:
				return getUpper();
			case UrdfPackage.LIMIT__EFFORT:
				return getEffort();
			case UrdfPackage.LIMIT__VELOCITY:
				return getVelocity();
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
			case UrdfPackage.LIMIT__LOWER:
				setLower((Double)newValue);
				return;
			case UrdfPackage.LIMIT__UPPER:
				setUpper((Double)newValue);
				return;
			case UrdfPackage.LIMIT__EFFORT:
				setEffort((Double)newValue);
				return;
			case UrdfPackage.LIMIT__VELOCITY:
				setVelocity((Double)newValue);
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
			case UrdfPackage.LIMIT__LOWER:
				unsetLower();
				return;
			case UrdfPackage.LIMIT__UPPER:
				unsetUpper();
				return;
			case UrdfPackage.LIMIT__EFFORT:
				unsetEffort();
				return;
			case UrdfPackage.LIMIT__VELOCITY:
				unsetVelocity();
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
			case UrdfPackage.LIMIT__LOWER:
				return isSetLower();
			case UrdfPackage.LIMIT__UPPER:
				return isSetUpper();
			case UrdfPackage.LIMIT__EFFORT:
				return isSetEffort();
			case UrdfPackage.LIMIT__VELOCITY:
				return isSetVelocity();
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
		result.append(" (lower: ");
		if (lowerESet) result.append(lower); else result.append("<unset>");
		result.append(", upper: ");
		if (upperESet) result.append(upper); else result.append("<unset>");
		result.append(", effort: ");
		if (effortESet) result.append(effort); else result.append("<unset>");
		result.append(", velocity: ");
		if (velocityESet) result.append(velocity); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LimitImpl
