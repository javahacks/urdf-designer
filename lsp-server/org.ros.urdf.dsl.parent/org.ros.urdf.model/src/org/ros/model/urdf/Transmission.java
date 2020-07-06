/**
 */
package org.ros.model.urdf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.Transmission#getGroup <em>Group</em>}</li>
 *   <li>{@link org.ros.model.urdf.Transmission#getLeftActuator <em>Left Actuator</em>}</li>
 *   <li>{@link org.ros.model.urdf.Transmission#getRightActuator <em>Right Actuator</em>}</li>
 *   <li>{@link org.ros.model.urdf.Transmission#getFlexJoint <em>Flex Joint</em>}</li>
 *   <li>{@link org.ros.model.urdf.Transmission#getRollJoint <em>Roll Joint</em>}</li>
 *   <li>{@link org.ros.model.urdf.Transmission#getGapJoint <em>Gap Joint</em>}</li>
 *   <li>{@link org.ros.model.urdf.Transmission#getPassiveJoint <em>Passive Joint</em>}</li>
 *   <li>{@link org.ros.model.urdf.Transmission#getUseSimulatedGripperJoint <em>Use Simulated Gripper Joint</em>}</li>
 *   <li>{@link org.ros.model.urdf.Transmission#getMechanicalReduction <em>Mechanical Reduction</em>}</li>
 *   <li>{@link org.ros.model.urdf.Transmission#getActuator <em>Actuator</em>}</li>
 *   <li>{@link org.ros.model.urdf.Transmission#getJoint <em>Joint</em>}</li>
 *   <li>{@link org.ros.model.urdf.Transmission#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.urdf.Transmission#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.ros.model.urdf.UrdfPackage#getTransmission()
 * @model extendedMetaData="name='transmission' kind='elementOnly'"
 * @generated
 */
public interface Transmission extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.ros.model.urdf.UrdfPackage#getTransmission_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Left Actuator</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.urdf.ActuatorTransmission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Actuator</em>' containment reference list.
	 * @see org.ros.model.urdf.UrdfPackage#getTransmission_LeftActuator()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='leftActuator' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ActuatorTransmission> getLeftActuator();

	/**
	 * Returns the value of the '<em><b>Right Actuator</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.urdf.ActuatorTransmission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Actuator</em>' containment reference list.
	 * @see org.ros.model.urdf.UrdfPackage#getTransmission_RightActuator()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rightActuator' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ActuatorTransmission> getRightActuator();

	/**
	 * Returns the value of the '<em><b>Flex Joint</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.urdf.ActuatorTransmission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flex Joint</em>' containment reference list.
	 * @see org.ros.model.urdf.UrdfPackage#getTransmission_FlexJoint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='flexJoint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ActuatorTransmission> getFlexJoint();

	/**
	 * Returns the value of the '<em><b>Roll Joint</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.urdf.ActuatorTransmission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll Joint</em>' containment reference list.
	 * @see org.ros.model.urdf.UrdfPackage#getTransmission_RollJoint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rollJoint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ActuatorTransmission> getRollJoint();

	/**
	 * Returns the value of the '<em><b>Gap Joint</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.urdf.GapJointTransmission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gap Joint</em>' containment reference list.
	 * @see org.ros.model.urdf.UrdfPackage#getTransmission_GapJoint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='gap_joint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GapJointTransmission> getGapJoint();

	/**
	 * Returns the value of the '<em><b>Passive Joint</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.urdf.PassiveJointTransmission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passive Joint</em>' containment reference list.
	 * @see org.ros.model.urdf.UrdfPackage#getTransmission_PassiveJoint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='passive_joint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PassiveJointTransmission> getPassiveJoint();

	/**
	 * Returns the value of the '<em><b>Use Simulated Gripper Joint</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.urdf.UseSimulatedGripperJointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Simulated Gripper Joint</em>' containment reference list.
	 * @see org.ros.model.urdf.UrdfPackage#getTransmission_UseSimulatedGripperJoint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='use_simulated_gripper_joint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<UseSimulatedGripperJointType> getUseSimulatedGripperJoint();

	/**
	 * Returns the value of the '<em><b>Mechanical Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanical Reduction</em>' attribute.
	 * @see #setMechanicalReduction(double)
	 * @see org.ros.model.urdf.UrdfPackage#getTransmission_MechanicalReduction()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mechanicalReduction' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	double getMechanicalReduction();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Transmission#getMechanicalReduction <em>Mechanical Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanical Reduction</em>' attribute.
	 * @see #getMechanicalReduction()
	 * @generated
	 */
	void setMechanicalReduction(double value);

	/**
	 * Returns the value of the '<em><b>Actuator</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.urdf.Name}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator</em>' containment reference list.
	 * @see org.ros.model.urdf.UrdfPackage#getTransmission_Actuator()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='actuator' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Name> getActuator();

	/**
	 * Returns the value of the '<em><b>Joint</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.urdf.Name}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joint</em>' containment reference list.
	 * @see org.ros.model.urdf.UrdfPackage#getTransmission_Joint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='joint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Name> getJoint();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ros.model.urdf.UrdfPackage#getTransmission_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Transmission#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.ros.model.urdf.UrdfPackage#getTransmission_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Transmission#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Transmission
