/**
 */
package org.ros.model.urdf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ros.model.urdf.Dynamics;
import org.ros.model.urdf.UrdfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.impl.DynamicsImpl#getDamping <em>Damping</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.DynamicsImpl#getFriction <em>Friction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicsImpl extends MinimalEObjectImpl.Container implements Dynamics {
	/**
	 * The default value of the '{@link #getDamping() <em>Damping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamping()
	 * @generated
	 * @ordered
	 */
	protected static final double DAMPING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDamping() <em>Damping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamping()
	 * @generated
	 * @ordered
	 */
	protected double damping = DAMPING_EDEFAULT;

	/**
	 * This is true if the Damping attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dampingESet;

	/**
	 * The default value of the '{@link #getFriction() <em>Friction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriction()
	 * @generated
	 * @ordered
	 */
	protected static final double FRICTION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFriction() <em>Friction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriction()
	 * @generated
	 * @ordered
	 */
	protected double friction = FRICTION_EDEFAULT;

	/**
	 * This is true if the Friction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frictionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UrdfPackage.Literals.DYNAMICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDamping() {
		return damping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDamping(double newDamping) {
		double oldDamping = damping;
		damping = newDamping;
		boolean oldDampingESet = dampingESet;
		dampingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.DYNAMICS__DAMPING, oldDamping, damping, !oldDampingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDamping() {
		double oldDamping = damping;
		boolean oldDampingESet = dampingESet;
		damping = DAMPING_EDEFAULT;
		dampingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.DYNAMICS__DAMPING, oldDamping, DAMPING_EDEFAULT, oldDampingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDamping() {
		return dampingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFriction() {
		return friction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFriction(double newFriction) {
		double oldFriction = friction;
		friction = newFriction;
		boolean oldFrictionESet = frictionESet;
		frictionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.DYNAMICS__FRICTION, oldFriction, friction, !oldFrictionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFriction() {
		double oldFriction = friction;
		boolean oldFrictionESet = frictionESet;
		friction = FRICTION_EDEFAULT;
		frictionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.DYNAMICS__FRICTION, oldFriction, FRICTION_EDEFAULT, oldFrictionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFriction() {
		return frictionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UrdfPackage.DYNAMICS__DAMPING:
				return getDamping();
			case UrdfPackage.DYNAMICS__FRICTION:
				return getFriction();
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
			case UrdfPackage.DYNAMICS__DAMPING:
				setDamping((Double)newValue);
				return;
			case UrdfPackage.DYNAMICS__FRICTION:
				setFriction((Double)newValue);
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
			case UrdfPackage.DYNAMICS__DAMPING:
				unsetDamping();
				return;
			case UrdfPackage.DYNAMICS__FRICTION:
				unsetFriction();
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
			case UrdfPackage.DYNAMICS__DAMPING:
				return isSetDamping();
			case UrdfPackage.DYNAMICS__FRICTION:
				return isSetFriction();
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
		result.append(" (damping: ");
		if (dampingESet) result.append(damping); else result.append("<unset>");
		result.append(", friction: ");
		if (frictionESet) result.append(friction); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DynamicsImpl
