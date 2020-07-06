/**
 */
package org.ros.model.urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.SafetyController#getSoftLowerLimit <em>Soft Lower Limit</em>}</li>
 *   <li>{@link org.ros.model.urdf.SafetyController#getSoftUpperLimit <em>Soft Upper Limit</em>}</li>
 *   <li>{@link org.ros.model.urdf.SafetyController#getKPosition <em>KPosition</em>}</li>
 *   <li>{@link org.ros.model.urdf.SafetyController#getKVelocity <em>KVelocity</em>}</li>
 * </ul>
 *
 * @see org.ros.model.urdf.UrdfPackage#getSafetyController()
 * @model extendedMetaData="name='safety_controller' kind='empty'"
 * @generated
 */
public interface SafetyController extends EObject {
	/**
	 * Returns the value of the '<em><b>KPosition</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KPosition</em>' attribute.
	 * @see #isSetKPosition()
	 * @see #unsetKPosition()
	 * @see #setKPosition(double)
	 * @see org.ros.model.urdf.UrdfPackage#getSafetyController_KPosition()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='k_position'"
	 * @generated
	 */
	double getKPosition();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.SafetyController#getKPosition <em>KPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KPosition</em>' attribute.
	 * @see #isSetKPosition()
	 * @see #unsetKPosition()
	 * @see #getKPosition()
	 * @generated
	 */
	void setKPosition(double value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.SafetyController#getKPosition <em>KPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKPosition()
	 * @see #getKPosition()
	 * @see #setKPosition(double)
	 * @generated
	 */
	void unsetKPosition();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.SafetyController#getKPosition <em>KPosition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>KPosition</em>' attribute is set.
	 * @see #unsetKPosition()
	 * @see #getKPosition()
	 * @see #setKPosition(double)
	 * @generated
	 */
	boolean isSetKPosition();

	/**
	 * Returns the value of the '<em><b>KVelocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KVelocity</em>' attribute.
	 * @see #isSetKVelocity()
	 * @see #unsetKVelocity()
	 * @see #setKVelocity(double)
	 * @see org.ros.model.urdf.UrdfPackage#getSafetyController_KVelocity()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='k_velocity'"
	 * @generated
	 */
	double getKVelocity();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.SafetyController#getKVelocity <em>KVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KVelocity</em>' attribute.
	 * @see #isSetKVelocity()
	 * @see #unsetKVelocity()
	 * @see #getKVelocity()
	 * @generated
	 */
	void setKVelocity(double value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.SafetyController#getKVelocity <em>KVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKVelocity()
	 * @see #getKVelocity()
	 * @see #setKVelocity(double)
	 * @generated
	 */
	void unsetKVelocity();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.SafetyController#getKVelocity <em>KVelocity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>KVelocity</em>' attribute is set.
	 * @see #unsetKVelocity()
	 * @see #getKVelocity()
	 * @see #setKVelocity(double)
	 * @generated
	 */
	boolean isSetKVelocity();

	/**
	 * Returns the value of the '<em><b>Soft Lower Limit</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Lower Limit</em>' attribute.
	 * @see #isSetSoftLowerLimit()
	 * @see #unsetSoftLowerLimit()
	 * @see #setSoftLowerLimit(double)
	 * @see org.ros.model.urdf.UrdfPackage#getSafetyController_SoftLowerLimit()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='soft_lower_limit'"
	 * @generated
	 */
	double getSoftLowerLimit();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.SafetyController#getSoftLowerLimit <em>Soft Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soft Lower Limit</em>' attribute.
	 * @see #isSetSoftLowerLimit()
	 * @see #unsetSoftLowerLimit()
	 * @see #getSoftLowerLimit()
	 * @generated
	 */
	void setSoftLowerLimit(double value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.SafetyController#getSoftLowerLimit <em>Soft Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSoftLowerLimit()
	 * @see #getSoftLowerLimit()
	 * @see #setSoftLowerLimit(double)
	 * @generated
	 */
	void unsetSoftLowerLimit();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.SafetyController#getSoftLowerLimit <em>Soft Lower Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Soft Lower Limit</em>' attribute is set.
	 * @see #unsetSoftLowerLimit()
	 * @see #getSoftLowerLimit()
	 * @see #setSoftLowerLimit(double)
	 * @generated
	 */
	boolean isSetSoftLowerLimit();

	/**
	 * Returns the value of the '<em><b>Soft Upper Limit</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Upper Limit</em>' attribute.
	 * @see #isSetSoftUpperLimit()
	 * @see #unsetSoftUpperLimit()
	 * @see #setSoftUpperLimit(double)
	 * @see org.ros.model.urdf.UrdfPackage#getSafetyController_SoftUpperLimit()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='soft_upper_limit'"
	 * @generated
	 */
	double getSoftUpperLimit();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.SafetyController#getSoftUpperLimit <em>Soft Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soft Upper Limit</em>' attribute.
	 * @see #isSetSoftUpperLimit()
	 * @see #unsetSoftUpperLimit()
	 * @see #getSoftUpperLimit()
	 * @generated
	 */
	void setSoftUpperLimit(double value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.SafetyController#getSoftUpperLimit <em>Soft Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSoftUpperLimit()
	 * @see #getSoftUpperLimit()
	 * @see #setSoftUpperLimit(double)
	 * @generated
	 */
	void unsetSoftUpperLimit();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.SafetyController#getSoftUpperLimit <em>Soft Upper Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Soft Upper Limit</em>' attribute is set.
	 * @see #unsetSoftUpperLimit()
	 * @see #getSoftUpperLimit()
	 * @see #setSoftUpperLimit(double)
	 * @generated
	 */
	boolean isSetSoftUpperLimit();

} // SafetyController
