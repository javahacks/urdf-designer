/**
 */
package org.ros.model.urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator Transmission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.ActuatorTransmission#getMechanicalReduction <em>Mechanical Reduction</em>}</li>
 *   <li>{@link org.ros.model.urdf.ActuatorTransmission#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.ros.model.urdf.UrdfPackage#getActuatorTransmission()
 * @model extendedMetaData="name='actuator_transmission' kind='empty'"
 * @generated
 */
public interface ActuatorTransmission extends EObject {
	/**
	 * Returns the value of the '<em><b>Mechanical Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanical Reduction</em>' attribute.
	 * @see #isSetMechanicalReduction()
	 * @see #unsetMechanicalReduction()
	 * @see #setMechanicalReduction(double)
	 * @see org.ros.model.urdf.UrdfPackage#getActuatorTransmission_MechanicalReduction()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='mechanicalReduction'"
	 * @generated
	 */
	double getMechanicalReduction();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.ActuatorTransmission#getMechanicalReduction <em>Mechanical Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanical Reduction</em>' attribute.
	 * @see #isSetMechanicalReduction()
	 * @see #unsetMechanicalReduction()
	 * @see #getMechanicalReduction()
	 * @generated
	 */
	void setMechanicalReduction(double value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.ActuatorTransmission#getMechanicalReduction <em>Mechanical Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMechanicalReduction()
	 * @see #getMechanicalReduction()
	 * @see #setMechanicalReduction(double)
	 * @generated
	 */
	void unsetMechanicalReduction();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.ActuatorTransmission#getMechanicalReduction <em>Mechanical Reduction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mechanical Reduction</em>' attribute is set.
	 * @see #unsetMechanicalReduction()
	 * @see #getMechanicalReduction()
	 * @see #setMechanicalReduction(double)
	 * @generated
	 */
	boolean isSetMechanicalReduction();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ros.model.urdf.UrdfPackage#getActuatorTransmission_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.ActuatorTransmission#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ActuatorTransmission
