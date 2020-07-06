/**
 */
package org.ros.model.urdf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ros.model.urdf.Collision;
import org.ros.model.urdf.Inertial;
import org.ros.model.urdf.Link;
import org.ros.model.urdf.UrdfPackage;
import org.ros.model.urdf.Visual;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.impl.LinkImpl#getInertial <em>Inertial</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.LinkImpl#getVisual <em>Visual</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.LinkImpl#getCollision <em>Collision</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.LinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.LinkImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends MinimalEObjectImpl.Container implements Link {
	/**
	 * The cached value of the '{@link #getInertial() <em>Inertial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInertial()
	 * @generated
	 * @ordered
	 */
	protected Inertial inertial;

	/**
	 * The cached value of the '{@link #getVisual() <em>Visual</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisual()
	 * @generated
	 * @ordered
	 */
	protected EList<Visual> visual;

	/**
	 * The cached value of the '{@link #getCollision() <em>Collision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollision()
	 * @generated
	 * @ordered
	 */
	protected EList<Collision> collision;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UrdfPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inertial getInertial() {
		return inertial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInertial(Inertial newInertial, NotificationChain msgs) {
		Inertial oldInertial = inertial;
		inertial = newInertial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.LINK__INERTIAL, oldInertial, newInertial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInertial(Inertial newInertial) {
		if (newInertial != inertial) {
			NotificationChain msgs = null;
			if (inertial != null)
				msgs = ((InternalEObject)inertial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.LINK__INERTIAL, null, msgs);
			if (newInertial != null)
				msgs = ((InternalEObject)newInertial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.LINK__INERTIAL, null, msgs);
			msgs = basicSetInertial(newInertial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.LINK__INERTIAL, newInertial, newInertial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Visual> getVisual() {
		if (visual == null) {
			visual = new EObjectContainmentEList<Visual>(Visual.class, this, UrdfPackage.LINK__VISUAL);
		}
		return visual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Collision> getCollision() {
		if (collision == null) {
			collision = new EObjectContainmentEList<Collision>(Collision.class, this, UrdfPackage.LINK__COLLISION);
		}
		return collision;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.LINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.LINK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UrdfPackage.LINK__INERTIAL:
				return basicSetInertial(null, msgs);
			case UrdfPackage.LINK__VISUAL:
				return ((InternalEList<?>)getVisual()).basicRemove(otherEnd, msgs);
			case UrdfPackage.LINK__COLLISION:
				return ((InternalEList<?>)getCollision()).basicRemove(otherEnd, msgs);
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
			case UrdfPackage.LINK__INERTIAL:
				return getInertial();
			case UrdfPackage.LINK__VISUAL:
				return getVisual();
			case UrdfPackage.LINK__COLLISION:
				return getCollision();
			case UrdfPackage.LINK__NAME:
				return getName();
			case UrdfPackage.LINK__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UrdfPackage.LINK__INERTIAL:
				setInertial((Inertial)newValue);
				return;
			case UrdfPackage.LINK__VISUAL:
				getVisual().clear();
				getVisual().addAll((Collection<? extends Visual>)newValue);
				return;
			case UrdfPackage.LINK__COLLISION:
				getCollision().clear();
				getCollision().addAll((Collection<? extends Collision>)newValue);
				return;
			case UrdfPackage.LINK__NAME:
				setName((String)newValue);
				return;
			case UrdfPackage.LINK__TYPE:
				setType((String)newValue);
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
			case UrdfPackage.LINK__INERTIAL:
				setInertial((Inertial)null);
				return;
			case UrdfPackage.LINK__VISUAL:
				getVisual().clear();
				return;
			case UrdfPackage.LINK__COLLISION:
				getCollision().clear();
				return;
			case UrdfPackage.LINK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UrdfPackage.LINK__TYPE:
				setType(TYPE_EDEFAULT);
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
			case UrdfPackage.LINK__INERTIAL:
				return inertial != null;
			case UrdfPackage.LINK__VISUAL:
				return visual != null && !visual.isEmpty();
			case UrdfPackage.LINK__COLLISION:
				return collision != null && !collision.isEmpty();
			case UrdfPackage.LINK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UrdfPackage.LINK__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //LinkImpl
