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

import org.ros.model.urdf.ActuatorTransmission;
import org.ros.model.urdf.GapJointTransmission;
import org.ros.model.urdf.Name;
import org.ros.model.urdf.PassiveJointTransmission;
import org.ros.model.urdf.Transmission;
import org.ros.model.urdf.UrdfPackage;
import org.ros.model.urdf.UseSimulatedGripperJointType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transmission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.impl.TransmissionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.TransmissionImpl#getLeftActuator <em>Left Actuator</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.TransmissionImpl#getRightActuator <em>Right Actuator</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.TransmissionImpl#getFlexJoint <em>Flex Joint</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.TransmissionImpl#getRollJoint <em>Roll Joint</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.TransmissionImpl#getGapJoint <em>Gap Joint</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.TransmissionImpl#getPassiveJoint <em>Passive Joint</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.TransmissionImpl#getUseSimulatedGripperJoint <em>Use Simulated Gripper Joint</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.TransmissionImpl#getMechanicalReduction <em>Mechanical Reduction</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.TransmissionImpl#getActuator <em>Actuator</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.TransmissionImpl#getJoint <em>Joint</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.TransmissionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.TransmissionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransmissionImpl extends MinimalEObjectImpl.Container implements Transmission {
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
	 * The default value of the '{@link #getMechanicalReduction() <em>Mechanical Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanicalReduction()
	 * @generated
	 * @ordered
	 */
	protected static final double MECHANICAL_REDUCTION_EDEFAULT = 0.0;

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
	protected TransmissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UrdfPackage.Literals.TRANSMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, UrdfPackage.TRANSMISSION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActuatorTransmission> getLeftActuator() {
		return getGroup().list(UrdfPackage.Literals.TRANSMISSION__LEFT_ACTUATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActuatorTransmission> getRightActuator() {
		return getGroup().list(UrdfPackage.Literals.TRANSMISSION__RIGHT_ACTUATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActuatorTransmission> getFlexJoint() {
		return getGroup().list(UrdfPackage.Literals.TRANSMISSION__FLEX_JOINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActuatorTransmission> getRollJoint() {
		return getGroup().list(UrdfPackage.Literals.TRANSMISSION__ROLL_JOINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GapJointTransmission> getGapJoint() {
		return getGroup().list(UrdfPackage.Literals.TRANSMISSION__GAP_JOINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PassiveJointTransmission> getPassiveJoint() {
		return getGroup().list(UrdfPackage.Literals.TRANSMISSION__PASSIVE_JOINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseSimulatedGripperJointType> getUseSimulatedGripperJoint() {
		return getGroup().list(UrdfPackage.Literals.TRANSMISSION__USE_SIMULATED_GRIPPER_JOINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMechanicalReduction() {
		return (Double)getGroup().get(UrdfPackage.Literals.TRANSMISSION__MECHANICAL_REDUCTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMechanicalReduction(double newMechanicalReduction) {
		((FeatureMap.Internal)getGroup()).set(UrdfPackage.Literals.TRANSMISSION__MECHANICAL_REDUCTION, newMechanicalReduction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Name> getActuator() {
		return getGroup().list(UrdfPackage.Literals.TRANSMISSION__ACTUATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Name> getJoint() {
		return getGroup().list(UrdfPackage.Literals.TRANSMISSION__JOINT);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.TRANSMISSION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.TRANSMISSION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UrdfPackage.TRANSMISSION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case UrdfPackage.TRANSMISSION__LEFT_ACTUATOR:
				return ((InternalEList<?>)getLeftActuator()).basicRemove(otherEnd, msgs);
			case UrdfPackage.TRANSMISSION__RIGHT_ACTUATOR:
				return ((InternalEList<?>)getRightActuator()).basicRemove(otherEnd, msgs);
			case UrdfPackage.TRANSMISSION__FLEX_JOINT:
				return ((InternalEList<?>)getFlexJoint()).basicRemove(otherEnd, msgs);
			case UrdfPackage.TRANSMISSION__ROLL_JOINT:
				return ((InternalEList<?>)getRollJoint()).basicRemove(otherEnd, msgs);
			case UrdfPackage.TRANSMISSION__GAP_JOINT:
				return ((InternalEList<?>)getGapJoint()).basicRemove(otherEnd, msgs);
			case UrdfPackage.TRANSMISSION__PASSIVE_JOINT:
				return ((InternalEList<?>)getPassiveJoint()).basicRemove(otherEnd, msgs);
			case UrdfPackage.TRANSMISSION__USE_SIMULATED_GRIPPER_JOINT:
				return ((InternalEList<?>)getUseSimulatedGripperJoint()).basicRemove(otherEnd, msgs);
			case UrdfPackage.TRANSMISSION__ACTUATOR:
				return ((InternalEList<?>)getActuator()).basicRemove(otherEnd, msgs);
			case UrdfPackage.TRANSMISSION__JOINT:
				return ((InternalEList<?>)getJoint()).basicRemove(otherEnd, msgs);
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
			case UrdfPackage.TRANSMISSION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case UrdfPackage.TRANSMISSION__LEFT_ACTUATOR:
				return getLeftActuator();
			case UrdfPackage.TRANSMISSION__RIGHT_ACTUATOR:
				return getRightActuator();
			case UrdfPackage.TRANSMISSION__FLEX_JOINT:
				return getFlexJoint();
			case UrdfPackage.TRANSMISSION__ROLL_JOINT:
				return getRollJoint();
			case UrdfPackage.TRANSMISSION__GAP_JOINT:
				return getGapJoint();
			case UrdfPackage.TRANSMISSION__PASSIVE_JOINT:
				return getPassiveJoint();
			case UrdfPackage.TRANSMISSION__USE_SIMULATED_GRIPPER_JOINT:
				return getUseSimulatedGripperJoint();
			case UrdfPackage.TRANSMISSION__MECHANICAL_REDUCTION:
				return getMechanicalReduction();
			case UrdfPackage.TRANSMISSION__ACTUATOR:
				return getActuator();
			case UrdfPackage.TRANSMISSION__JOINT:
				return getJoint();
			case UrdfPackage.TRANSMISSION__NAME:
				return getName();
			case UrdfPackage.TRANSMISSION__TYPE:
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
			case UrdfPackage.TRANSMISSION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case UrdfPackage.TRANSMISSION__LEFT_ACTUATOR:
				getLeftActuator().clear();
				getLeftActuator().addAll((Collection<? extends ActuatorTransmission>)newValue);
				return;
			case UrdfPackage.TRANSMISSION__RIGHT_ACTUATOR:
				getRightActuator().clear();
				getRightActuator().addAll((Collection<? extends ActuatorTransmission>)newValue);
				return;
			case UrdfPackage.TRANSMISSION__FLEX_JOINT:
				getFlexJoint().clear();
				getFlexJoint().addAll((Collection<? extends ActuatorTransmission>)newValue);
				return;
			case UrdfPackage.TRANSMISSION__ROLL_JOINT:
				getRollJoint().clear();
				getRollJoint().addAll((Collection<? extends ActuatorTransmission>)newValue);
				return;
			case UrdfPackage.TRANSMISSION__GAP_JOINT:
				getGapJoint().clear();
				getGapJoint().addAll((Collection<? extends GapJointTransmission>)newValue);
				return;
			case UrdfPackage.TRANSMISSION__PASSIVE_JOINT:
				getPassiveJoint().clear();
				getPassiveJoint().addAll((Collection<? extends PassiveJointTransmission>)newValue);
				return;
			case UrdfPackage.TRANSMISSION__USE_SIMULATED_GRIPPER_JOINT:
				getUseSimulatedGripperJoint().clear();
				getUseSimulatedGripperJoint().addAll((Collection<? extends UseSimulatedGripperJointType>)newValue);
				return;
			case UrdfPackage.TRANSMISSION__MECHANICAL_REDUCTION:
				setMechanicalReduction((Double)newValue);
				return;
			case UrdfPackage.TRANSMISSION__ACTUATOR:
				getActuator().clear();
				getActuator().addAll((Collection<? extends Name>)newValue);
				return;
			case UrdfPackage.TRANSMISSION__JOINT:
				getJoint().clear();
				getJoint().addAll((Collection<? extends Name>)newValue);
				return;
			case UrdfPackage.TRANSMISSION__NAME:
				setName((String)newValue);
				return;
			case UrdfPackage.TRANSMISSION__TYPE:
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
			case UrdfPackage.TRANSMISSION__GROUP:
				getGroup().clear();
				return;
			case UrdfPackage.TRANSMISSION__LEFT_ACTUATOR:
				getLeftActuator().clear();
				return;
			case UrdfPackage.TRANSMISSION__RIGHT_ACTUATOR:
				getRightActuator().clear();
				return;
			case UrdfPackage.TRANSMISSION__FLEX_JOINT:
				getFlexJoint().clear();
				return;
			case UrdfPackage.TRANSMISSION__ROLL_JOINT:
				getRollJoint().clear();
				return;
			case UrdfPackage.TRANSMISSION__GAP_JOINT:
				getGapJoint().clear();
				return;
			case UrdfPackage.TRANSMISSION__PASSIVE_JOINT:
				getPassiveJoint().clear();
				return;
			case UrdfPackage.TRANSMISSION__USE_SIMULATED_GRIPPER_JOINT:
				getUseSimulatedGripperJoint().clear();
				return;
			case UrdfPackage.TRANSMISSION__MECHANICAL_REDUCTION:
				setMechanicalReduction(MECHANICAL_REDUCTION_EDEFAULT);
				return;
			case UrdfPackage.TRANSMISSION__ACTUATOR:
				getActuator().clear();
				return;
			case UrdfPackage.TRANSMISSION__JOINT:
				getJoint().clear();
				return;
			case UrdfPackage.TRANSMISSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UrdfPackage.TRANSMISSION__TYPE:
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
			case UrdfPackage.TRANSMISSION__GROUP:
				return group != null && !group.isEmpty();
			case UrdfPackage.TRANSMISSION__LEFT_ACTUATOR:
				return !getLeftActuator().isEmpty();
			case UrdfPackage.TRANSMISSION__RIGHT_ACTUATOR:
				return !getRightActuator().isEmpty();
			case UrdfPackage.TRANSMISSION__FLEX_JOINT:
				return !getFlexJoint().isEmpty();
			case UrdfPackage.TRANSMISSION__ROLL_JOINT:
				return !getRollJoint().isEmpty();
			case UrdfPackage.TRANSMISSION__GAP_JOINT:
				return !getGapJoint().isEmpty();
			case UrdfPackage.TRANSMISSION__PASSIVE_JOINT:
				return !getPassiveJoint().isEmpty();
			case UrdfPackage.TRANSMISSION__USE_SIMULATED_GRIPPER_JOINT:
				return !getUseSimulatedGripperJoint().isEmpty();
			case UrdfPackage.TRANSMISSION__MECHANICAL_REDUCTION:
				return getMechanicalReduction() != MECHANICAL_REDUCTION_EDEFAULT;
			case UrdfPackage.TRANSMISSION__ACTUATOR:
				return !getActuator().isEmpty();
			case UrdfPackage.TRANSMISSION__JOINT:
				return !getJoint().isEmpty();
			case UrdfPackage.TRANSMISSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UrdfPackage.TRANSMISSION__TYPE:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TransmissionImpl
