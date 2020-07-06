/**
 */
package org.ros.model.urdf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ros.model.urdf.Mimic;
import org.ros.model.urdf.UrdfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mimic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.impl.MimicImpl#getJoint <em>Joint</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.MimicImpl#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.MimicImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MimicImpl extends MinimalEObjectImpl.Container implements Mimic {
	/**
	 * The default value of the '{@link #getJoint() <em>Joint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoint()
	 * @generated
	 * @ordered
	 */
	protected static final String JOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJoint() <em>Joint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoint()
	 * @generated
	 * @ordered
	 */
	protected String joint = JOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final double MULTIPLIER_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
	protected double multiplier = MULTIPLIER_EDEFAULT;

	/**
	 * This is true if the Multiplier attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multiplierESet;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double OFFSET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected double offset = OFFSET_EDEFAULT;

	/**
	 * This is true if the Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean offsetESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MimicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UrdfPackage.Literals.MIMIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJoint() {
		return joint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoint(String newJoint) {
		String oldJoint = joint;
		joint = newJoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.MIMIC__JOINT, oldJoint, joint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMultiplier() {
		return multiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplier(double newMultiplier) {
		double oldMultiplier = multiplier;
		multiplier = newMultiplier;
		boolean oldMultiplierESet = multiplierESet;
		multiplierESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.MIMIC__MULTIPLIER, oldMultiplier, multiplier, !oldMultiplierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMultiplier() {
		double oldMultiplier = multiplier;
		boolean oldMultiplierESet = multiplierESet;
		multiplier = MULTIPLIER_EDEFAULT;
		multiplierESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.MIMIC__MULTIPLIER, oldMultiplier, MULTIPLIER_EDEFAULT, oldMultiplierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMultiplier() {
		return multiplierESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(double newOffset) {
		double oldOffset = offset;
		offset = newOffset;
		boolean oldOffsetESet = offsetESet;
		offsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.MIMIC__OFFSET, oldOffset, offset, !oldOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOffset() {
		double oldOffset = offset;
		boolean oldOffsetESet = offsetESet;
		offset = OFFSET_EDEFAULT;
		offsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.MIMIC__OFFSET, oldOffset, OFFSET_EDEFAULT, oldOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOffset() {
		return offsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UrdfPackage.MIMIC__JOINT:
				return getJoint();
			case UrdfPackage.MIMIC__MULTIPLIER:
				return getMultiplier();
			case UrdfPackage.MIMIC__OFFSET:
				return getOffset();
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
			case UrdfPackage.MIMIC__JOINT:
				setJoint((String)newValue);
				return;
			case UrdfPackage.MIMIC__MULTIPLIER:
				setMultiplier((Double)newValue);
				return;
			case UrdfPackage.MIMIC__OFFSET:
				setOffset((Double)newValue);
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
			case UrdfPackage.MIMIC__JOINT:
				setJoint(JOINT_EDEFAULT);
				return;
			case UrdfPackage.MIMIC__MULTIPLIER:
				unsetMultiplier();
				return;
			case UrdfPackage.MIMIC__OFFSET:
				unsetOffset();
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
			case UrdfPackage.MIMIC__JOINT:
				return JOINT_EDEFAULT == null ? joint != null : !JOINT_EDEFAULT.equals(joint);
			case UrdfPackage.MIMIC__MULTIPLIER:
				return isSetMultiplier();
			case UrdfPackage.MIMIC__OFFSET:
				return isSetOffset();
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
		result.append(" (joint: ");
		result.append(joint);
		result.append(", multiplier: ");
		if (multiplierESet) result.append(multiplier); else result.append("<unset>");
		result.append(", offset: ");
		if (offsetESet) result.append(offset); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MimicImpl
