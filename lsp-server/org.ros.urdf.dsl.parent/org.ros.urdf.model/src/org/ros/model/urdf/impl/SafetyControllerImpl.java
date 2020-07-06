/**
 */
package org.ros.model.urdf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ros.model.urdf.SafetyController;
import org.ros.model.urdf.UrdfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.impl.SafetyControllerImpl#getSoftLowerLimit <em>Soft Lower Limit</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.SafetyControllerImpl#getSoftUpperLimit <em>Soft Upper Limit</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.SafetyControllerImpl#getKPosition <em>KPosition</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.SafetyControllerImpl#getKVelocity <em>KVelocity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyControllerImpl extends MinimalEObjectImpl.Container implements SafetyController {
	/**
	 * The default value of the '{@link #getSoftLowerLimit() <em>Soft Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftLowerLimit()
	 * @generated
	 * @ordered
	 */
	protected static final double SOFT_LOWER_LIMIT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSoftLowerLimit() <em>Soft Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftLowerLimit()
	 * @generated
	 * @ordered
	 */
	protected double softLowerLimit = SOFT_LOWER_LIMIT_EDEFAULT;

	/**
	 * This is true if the Soft Lower Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean softLowerLimitESet;

	/**
	 * The default value of the '{@link #getSoftUpperLimit() <em>Soft Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected static final double SOFT_UPPER_LIMIT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSoftUpperLimit() <em>Soft Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftUpperLimit()
	 * @generated
	 * @ordered
	 */
	protected double softUpperLimit = SOFT_UPPER_LIMIT_EDEFAULT;

	/**
	 * This is true if the Soft Upper Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean softUpperLimitESet;

	/**
	 * The default value of the '{@link #getKPosition() <em>KPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKPosition()
	 * @generated
	 * @ordered
	 */
	protected static final double KPOSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getKPosition() <em>KPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKPosition()
	 * @generated
	 * @ordered
	 */
	protected double kPosition = KPOSITION_EDEFAULT;

	/**
	 * This is true if the KPosition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kPositionESet;

	/**
	 * The default value of the '{@link #getKVelocity() <em>KVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double KVELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getKVelocity() <em>KVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKVelocity()
	 * @generated
	 * @ordered
	 */
	protected double kVelocity = KVELOCITY_EDEFAULT;

	/**
	 * This is true if the KVelocity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kVelocityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UrdfPackage.Literals.SAFETY_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getKPosition() {
		return kPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKPosition(double newKPosition) {
		double oldKPosition = kPosition;
		kPosition = newKPosition;
		boolean oldKPositionESet = kPositionESet;
		kPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.SAFETY_CONTROLLER__KPOSITION, oldKPosition, kPosition, !oldKPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKPosition() {
		double oldKPosition = kPosition;
		boolean oldKPositionESet = kPositionESet;
		kPosition = KPOSITION_EDEFAULT;
		kPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.SAFETY_CONTROLLER__KPOSITION, oldKPosition, KPOSITION_EDEFAULT, oldKPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKPosition() {
		return kPositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getKVelocity() {
		return kVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKVelocity(double newKVelocity) {
		double oldKVelocity = kVelocity;
		kVelocity = newKVelocity;
		boolean oldKVelocityESet = kVelocityESet;
		kVelocityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.SAFETY_CONTROLLER__KVELOCITY, oldKVelocity, kVelocity, !oldKVelocityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKVelocity() {
		double oldKVelocity = kVelocity;
		boolean oldKVelocityESet = kVelocityESet;
		kVelocity = KVELOCITY_EDEFAULT;
		kVelocityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.SAFETY_CONTROLLER__KVELOCITY, oldKVelocity, KVELOCITY_EDEFAULT, oldKVelocityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKVelocity() {
		return kVelocityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSoftLowerLimit() {
		return softLowerLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftLowerLimit(double newSoftLowerLimit) {
		double oldSoftLowerLimit = softLowerLimit;
		softLowerLimit = newSoftLowerLimit;
		boolean oldSoftLowerLimitESet = softLowerLimitESet;
		softLowerLimitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.SAFETY_CONTROLLER__SOFT_LOWER_LIMIT, oldSoftLowerLimit, softLowerLimit, !oldSoftLowerLimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSoftLowerLimit() {
		double oldSoftLowerLimit = softLowerLimit;
		boolean oldSoftLowerLimitESet = softLowerLimitESet;
		softLowerLimit = SOFT_LOWER_LIMIT_EDEFAULT;
		softLowerLimitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.SAFETY_CONTROLLER__SOFT_LOWER_LIMIT, oldSoftLowerLimit, SOFT_LOWER_LIMIT_EDEFAULT, oldSoftLowerLimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSoftLowerLimit() {
		return softLowerLimitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSoftUpperLimit() {
		return softUpperLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftUpperLimit(double newSoftUpperLimit) {
		double oldSoftUpperLimit = softUpperLimit;
		softUpperLimit = newSoftUpperLimit;
		boolean oldSoftUpperLimitESet = softUpperLimitESet;
		softUpperLimitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.SAFETY_CONTROLLER__SOFT_UPPER_LIMIT, oldSoftUpperLimit, softUpperLimit, !oldSoftUpperLimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSoftUpperLimit() {
		double oldSoftUpperLimit = softUpperLimit;
		boolean oldSoftUpperLimitESet = softUpperLimitESet;
		softUpperLimit = SOFT_UPPER_LIMIT_EDEFAULT;
		softUpperLimitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.SAFETY_CONTROLLER__SOFT_UPPER_LIMIT, oldSoftUpperLimit, SOFT_UPPER_LIMIT_EDEFAULT, oldSoftUpperLimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSoftUpperLimit() {
		return softUpperLimitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UrdfPackage.SAFETY_CONTROLLER__SOFT_LOWER_LIMIT:
				return getSoftLowerLimit();
			case UrdfPackage.SAFETY_CONTROLLER__SOFT_UPPER_LIMIT:
				return getSoftUpperLimit();
			case UrdfPackage.SAFETY_CONTROLLER__KPOSITION:
				return getKPosition();
			case UrdfPackage.SAFETY_CONTROLLER__KVELOCITY:
				return getKVelocity();
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
			case UrdfPackage.SAFETY_CONTROLLER__SOFT_LOWER_LIMIT:
				setSoftLowerLimit((Double)newValue);
				return;
			case UrdfPackage.SAFETY_CONTROLLER__SOFT_UPPER_LIMIT:
				setSoftUpperLimit((Double)newValue);
				return;
			case UrdfPackage.SAFETY_CONTROLLER__KPOSITION:
				setKPosition((Double)newValue);
				return;
			case UrdfPackage.SAFETY_CONTROLLER__KVELOCITY:
				setKVelocity((Double)newValue);
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
			case UrdfPackage.SAFETY_CONTROLLER__SOFT_LOWER_LIMIT:
				unsetSoftLowerLimit();
				return;
			case UrdfPackage.SAFETY_CONTROLLER__SOFT_UPPER_LIMIT:
				unsetSoftUpperLimit();
				return;
			case UrdfPackage.SAFETY_CONTROLLER__KPOSITION:
				unsetKPosition();
				return;
			case UrdfPackage.SAFETY_CONTROLLER__KVELOCITY:
				unsetKVelocity();
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
			case UrdfPackage.SAFETY_CONTROLLER__SOFT_LOWER_LIMIT:
				return isSetSoftLowerLimit();
			case UrdfPackage.SAFETY_CONTROLLER__SOFT_UPPER_LIMIT:
				return isSetSoftUpperLimit();
			case UrdfPackage.SAFETY_CONTROLLER__KPOSITION:
				return isSetKPosition();
			case UrdfPackage.SAFETY_CONTROLLER__KVELOCITY:
				return isSetKVelocity();
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
		result.append(" (softLowerLimit: ");
		if (softLowerLimitESet) result.append(softLowerLimit); else result.append("<unset>");
		result.append(", softUpperLimit: ");
		if (softUpperLimitESet) result.append(softUpperLimit); else result.append("<unset>");
		result.append(", kPosition: ");
		if (kPositionESet) result.append(kPosition); else result.append("<unset>");
		result.append(", kVelocity: ");
		if (kVelocityESet) result.append(kVelocity); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SafetyControllerImpl
