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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ros.model.urdf.Joint;
import org.ros.model.urdf.Link;
import org.ros.model.urdf.MaterialGlobal;
import org.ros.model.urdf.RobotType;
import org.ros.model.urdf.Transmission;
import org.ros.model.urdf.UrdfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.impl.RobotTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.RobotTypeImpl#getJoint <em>Joint</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.RobotTypeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.RobotTypeImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.RobotTypeImpl#getTransmission <em>Transmission</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.RobotTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.RobotTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RobotTypeImpl extends MinimalEObjectImpl.Container implements RobotType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "1.0";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * This is true if the Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean versionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UrdfPackage.Literals.ROBOT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, UrdfPackage.ROBOT_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Joint> getJoint() {
		return getGroup().list(UrdfPackage.Literals.ROBOT_TYPE__JOINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLink() {
		return getGroup().list(UrdfPackage.Literals.ROBOT_TYPE__LINK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MaterialGlobal> getMaterial() {
		return getGroup().list(UrdfPackage.Literals.ROBOT_TYPE__MATERIAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transmission> getTransmission() {
		return getGroup().list(UrdfPackage.Literals.ROBOT_TYPE__TRANSMISSION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.ROBOT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		boolean oldVersionESet = versionESet;
		versionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.ROBOT_TYPE__VERSION, oldVersion, version, !oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVersion() {
		String oldVersion = version;
		boolean oldVersionESet = versionESet;
		version = VERSION_EDEFAULT;
		versionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.ROBOT_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVersion() {
		return versionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UrdfPackage.ROBOT_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case UrdfPackage.ROBOT_TYPE__JOINT:
				return ((InternalEList<?>)getJoint()).basicRemove(otherEnd, msgs);
			case UrdfPackage.ROBOT_TYPE__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case UrdfPackage.ROBOT_TYPE__MATERIAL:
				return ((InternalEList<?>)getMaterial()).basicRemove(otherEnd, msgs);
			case UrdfPackage.ROBOT_TYPE__TRANSMISSION:
				return ((InternalEList<?>)getTransmission()).basicRemove(otherEnd, msgs);
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
			case UrdfPackage.ROBOT_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case UrdfPackage.ROBOT_TYPE__JOINT:
				return getJoint();
			case UrdfPackage.ROBOT_TYPE__LINK:
				return getLink();
			case UrdfPackage.ROBOT_TYPE__MATERIAL:
				return getMaterial();
			case UrdfPackage.ROBOT_TYPE__TRANSMISSION:
				return getTransmission();
			case UrdfPackage.ROBOT_TYPE__NAME:
				return getName();
			case UrdfPackage.ROBOT_TYPE__VERSION:
				return getVersion();
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
			case UrdfPackage.ROBOT_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case UrdfPackage.ROBOT_TYPE__JOINT:
				getJoint().clear();
				getJoint().addAll((Collection<? extends Joint>)newValue);
				return;
			case UrdfPackage.ROBOT_TYPE__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case UrdfPackage.ROBOT_TYPE__MATERIAL:
				getMaterial().clear();
				getMaterial().addAll((Collection<? extends MaterialGlobal>)newValue);
				return;
			case UrdfPackage.ROBOT_TYPE__TRANSMISSION:
				getTransmission().clear();
				getTransmission().addAll((Collection<? extends Transmission>)newValue);
				return;
			case UrdfPackage.ROBOT_TYPE__NAME:
				setName((String)newValue);
				return;
			case UrdfPackage.ROBOT_TYPE__VERSION:
				setVersion((String)newValue);
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
			case UrdfPackage.ROBOT_TYPE__GROUP:
				getGroup().clear();
				return;
			case UrdfPackage.ROBOT_TYPE__JOINT:
				getJoint().clear();
				return;
			case UrdfPackage.ROBOT_TYPE__LINK:
				getLink().clear();
				return;
			case UrdfPackage.ROBOT_TYPE__MATERIAL:
				getMaterial().clear();
				return;
			case UrdfPackage.ROBOT_TYPE__TRANSMISSION:
				getTransmission().clear();
				return;
			case UrdfPackage.ROBOT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UrdfPackage.ROBOT_TYPE__VERSION:
				unsetVersion();
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
			case UrdfPackage.ROBOT_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case UrdfPackage.ROBOT_TYPE__JOINT:
				return !getJoint().isEmpty();
			case UrdfPackage.ROBOT_TYPE__LINK:
				return !getLink().isEmpty();
			case UrdfPackage.ROBOT_TYPE__MATERIAL:
				return !getMaterial().isEmpty();
			case UrdfPackage.ROBOT_TYPE__TRANSMISSION:
				return !getTransmission().isEmpty();
			case UrdfPackage.ROBOT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UrdfPackage.ROBOT_TYPE__VERSION:
				return isSetVersion();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(", version: ");
		if (versionESet) result.append(version); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RobotTypeImpl
