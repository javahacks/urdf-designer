/**
 */
package org.ros.model.urdf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ros.model.urdf.Calibration;
import org.ros.model.urdf.UrdfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calibration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.impl.CalibrationImpl#getReferencePosition <em>Reference Position</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.CalibrationImpl#getRising <em>Rising</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.CalibrationImpl#getFalling <em>Falling</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalibrationImpl extends MinimalEObjectImpl.Container implements Calibration {
	/**
	 * The default value of the '{@link #getReferencePosition() <em>Reference Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePosition()
	 * @generated
	 * @ordered
	 */
	protected static final double REFERENCE_POSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReferencePosition() <em>Reference Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePosition()
	 * @generated
	 * @ordered
	 */
	protected double referencePosition = REFERENCE_POSITION_EDEFAULT;

	/**
	 * This is true if the Reference Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referencePositionESet;

	/**
	 * The default value of the '{@link #getRising() <em>Rising</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRising()
	 * @generated
	 * @ordered
	 */
	protected static final double RISING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRising() <em>Rising</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRising()
	 * @generated
	 * @ordered
	 */
	protected double rising = RISING_EDEFAULT;

	/**
	 * This is true if the Rising attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean risingESet;

	/**
	 * The default value of the '{@link #getFalling() <em>Falling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalling()
	 * @generated
	 * @ordered
	 */
	protected static final double FALLING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFalling() <em>Falling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalling()
	 * @generated
	 * @ordered
	 */
	protected double falling = FALLING_EDEFAULT;

	/**
	 * This is true if the Falling attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fallingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalibrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UrdfPackage.Literals.CALIBRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFalling() {
		return falling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFalling(double newFalling) {
		double oldFalling = falling;
		falling = newFalling;
		boolean oldFallingESet = fallingESet;
		fallingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.CALIBRATION__FALLING, oldFalling, falling, !oldFallingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFalling() {
		double oldFalling = falling;
		boolean oldFallingESet = fallingESet;
		falling = FALLING_EDEFAULT;
		fallingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.CALIBRATION__FALLING, oldFalling, FALLING_EDEFAULT, oldFallingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFalling() {
		return fallingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReferencePosition() {
		return referencePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencePosition(double newReferencePosition) {
		double oldReferencePosition = referencePosition;
		referencePosition = newReferencePosition;
		boolean oldReferencePositionESet = referencePositionESet;
		referencePositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.CALIBRATION__REFERENCE_POSITION, oldReferencePosition, referencePosition, !oldReferencePositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferencePosition() {
		double oldReferencePosition = referencePosition;
		boolean oldReferencePositionESet = referencePositionESet;
		referencePosition = REFERENCE_POSITION_EDEFAULT;
		referencePositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.CALIBRATION__REFERENCE_POSITION, oldReferencePosition, REFERENCE_POSITION_EDEFAULT, oldReferencePositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferencePosition() {
		return referencePositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRising() {
		return rising;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRising(double newRising) {
		double oldRising = rising;
		rising = newRising;
		boolean oldRisingESet = risingESet;
		risingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.CALIBRATION__RISING, oldRising, rising, !oldRisingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRising() {
		double oldRising = rising;
		boolean oldRisingESet = risingESet;
		rising = RISING_EDEFAULT;
		risingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.CALIBRATION__RISING, oldRising, RISING_EDEFAULT, oldRisingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRising() {
		return risingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UrdfPackage.CALIBRATION__REFERENCE_POSITION:
				return getReferencePosition();
			case UrdfPackage.CALIBRATION__RISING:
				return getRising();
			case UrdfPackage.CALIBRATION__FALLING:
				return getFalling();
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
			case UrdfPackage.CALIBRATION__REFERENCE_POSITION:
				setReferencePosition((Double)newValue);
				return;
			case UrdfPackage.CALIBRATION__RISING:
				setRising((Double)newValue);
				return;
			case UrdfPackage.CALIBRATION__FALLING:
				setFalling((Double)newValue);
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
			case UrdfPackage.CALIBRATION__REFERENCE_POSITION:
				unsetReferencePosition();
				return;
			case UrdfPackage.CALIBRATION__RISING:
				unsetRising();
				return;
			case UrdfPackage.CALIBRATION__FALLING:
				unsetFalling();
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
			case UrdfPackage.CALIBRATION__REFERENCE_POSITION:
				return isSetReferencePosition();
			case UrdfPackage.CALIBRATION__RISING:
				return isSetRising();
			case UrdfPackage.CALIBRATION__FALLING:
				return isSetFalling();
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
		result.append(" (referencePosition: ");
		if (referencePositionESet) result.append(referencePosition); else result.append("<unset>");
		result.append(", rising: ");
		if (risingESet) result.append(rising); else result.append("<unset>");
		result.append(", falling: ");
		if (fallingESet) result.append(falling); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CalibrationImpl
