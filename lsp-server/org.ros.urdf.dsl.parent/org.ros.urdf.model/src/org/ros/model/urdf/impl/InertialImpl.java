/**
 */
package org.ros.model.urdf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ros.model.urdf.Inertia;
import org.ros.model.urdf.Inertial;
import org.ros.model.urdf.Mass;
import org.ros.model.urdf.Pose;
import org.ros.model.urdf.UrdfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inertial</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.impl.InertialImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.InertialImpl#getMass <em>Mass</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.InertialImpl#getInertia <em>Inertia</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InertialImpl extends MinimalEObjectImpl.Container implements Inertial {
	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Pose origin;

	/**
	 * The cached value of the '{@link #getMass() <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected Mass mass;

	/**
	 * The cached value of the '{@link #getInertia() <em>Inertia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInertia()
	 * @generated
	 * @ordered
	 */
	protected Inertia inertia;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InertialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UrdfPackage.Literals.INERTIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pose getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrigin(Pose newOrigin, NotificationChain msgs) {
		Pose oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.INERTIAL__ORIGIN, oldOrigin, newOrigin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(Pose newOrigin) {
		if (newOrigin != origin) {
			NotificationChain msgs = null;
			if (origin != null)
				msgs = ((InternalEObject)origin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.INERTIAL__ORIGIN, null, msgs);
			if (newOrigin != null)
				msgs = ((InternalEObject)newOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.INERTIAL__ORIGIN, null, msgs);
			msgs = basicSetOrigin(newOrigin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.INERTIAL__ORIGIN, newOrigin, newOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mass getMass() {
		return mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMass(Mass newMass, NotificationChain msgs) {
		Mass oldMass = mass;
		mass = newMass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.INERTIAL__MASS, oldMass, newMass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMass(Mass newMass) {
		if (newMass != mass) {
			NotificationChain msgs = null;
			if (mass != null)
				msgs = ((InternalEObject)mass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.INERTIAL__MASS, null, msgs);
			if (newMass != null)
				msgs = ((InternalEObject)newMass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.INERTIAL__MASS, null, msgs);
			msgs = basicSetMass(newMass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.INERTIAL__MASS, newMass, newMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inertia getInertia() {
		return inertia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInertia(Inertia newInertia, NotificationChain msgs) {
		Inertia oldInertia = inertia;
		inertia = newInertia;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.INERTIAL__INERTIA, oldInertia, newInertia);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInertia(Inertia newInertia) {
		if (newInertia != inertia) {
			NotificationChain msgs = null;
			if (inertia != null)
				msgs = ((InternalEObject)inertia).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.INERTIAL__INERTIA, null, msgs);
			if (newInertia != null)
				msgs = ((InternalEObject)newInertia).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.INERTIAL__INERTIA, null, msgs);
			msgs = basicSetInertia(newInertia, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.INERTIAL__INERTIA, newInertia, newInertia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UrdfPackage.INERTIAL__ORIGIN:
				return basicSetOrigin(null, msgs);
			case UrdfPackage.INERTIAL__MASS:
				return basicSetMass(null, msgs);
			case UrdfPackage.INERTIAL__INERTIA:
				return basicSetInertia(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UrdfPackage.INERTIAL__ORIGIN:
				return getOrigin();
			case UrdfPackage.INERTIAL__MASS:
				return getMass();
			case UrdfPackage.INERTIAL__INERTIA:
				return getInertia();
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
			case UrdfPackage.INERTIAL__ORIGIN:
				setOrigin((Pose)newValue);
				return;
			case UrdfPackage.INERTIAL__MASS:
				setMass((Mass)newValue);
				return;
			case UrdfPackage.INERTIAL__INERTIA:
				setInertia((Inertia)newValue);
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
			case UrdfPackage.INERTIAL__ORIGIN:
				setOrigin((Pose)null);
				return;
			case UrdfPackage.INERTIAL__MASS:
				setMass((Mass)null);
				return;
			case UrdfPackage.INERTIAL__INERTIA:
				setInertia((Inertia)null);
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
			case UrdfPackage.INERTIAL__ORIGIN:
				return origin != null;
			case UrdfPackage.INERTIAL__MASS:
				return mass != null;
			case UrdfPackage.INERTIAL__INERTIA:
				return inertia != null;
		}
		return super.eIsSet(featureID);
	}

} //InertialImpl
