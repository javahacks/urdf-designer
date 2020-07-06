/**
 */
package org.ros.model.urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.Joint#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.ros.model.urdf.Joint#getParent <em>Parent</em>}</li>
 *   <li>{@link org.ros.model.urdf.Joint#getChild <em>Child</em>}</li>
 *   <li>{@link org.ros.model.urdf.Joint#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.ros.model.urdf.Joint#getCalibration <em>Calibration</em>}</li>
 *   <li>{@link org.ros.model.urdf.Joint#getDynamics <em>Dynamics</em>}</li>
 *   <li>{@link org.ros.model.urdf.Joint#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.ros.model.urdf.Joint#getSafetyController <em>Safety Controller</em>}</li>
 *   <li>{@link org.ros.model.urdf.Joint#getMimic <em>Mimic</em>}</li>
 *   <li>{@link org.ros.model.urdf.Joint#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.urdf.Joint#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.ros.model.urdf.UrdfPackage#getJoint()
 * @model extendedMetaData="name='joint' kind='elementOnly'"
 * @generated
 */
public interface Joint extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(Pose)
	 * @see org.ros.model.urdf.UrdfPackage#getJoint_Origin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='origin' namespace='##targetNamespace'"
	 * @generated
	 */
	Pose getOrigin();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Joint#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Pose value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference.
	 * @see #setParent(Parent)
	 * @see org.ros.model.urdf.UrdfPackage#getJoint_Parent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parent' namespace='##targetNamespace'"
	 * @generated
	 */
	Parent getParent();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Joint#getParent <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' containment reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Parent value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(Child)
	 * @see org.ros.model.urdf.UrdfPackage#getJoint_Child()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='child' namespace='##targetNamespace'"
	 * @generated
	 */
	Child getChild();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Joint#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(Child value);

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' containment reference.
	 * @see #setAxis(Axis)
	 * @see org.ros.model.urdf.UrdfPackage#getJoint_Axis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='axis' namespace='##targetNamespace'"
	 * @generated
	 */
	Axis getAxis();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Joint#getAxis <em>Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' containment reference.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(Axis value);

	/**
	 * Returns the value of the '<em><b>Calibration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibration</em>' containment reference.
	 * @see #setCalibration(Calibration)
	 * @see org.ros.model.urdf.UrdfPackage#getJoint_Calibration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='calibration' namespace='##targetNamespace'"
	 * @generated
	 */
	Calibration getCalibration();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Joint#getCalibration <em>Calibration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibration</em>' containment reference.
	 * @see #getCalibration()
	 * @generated
	 */
	void setCalibration(Calibration value);

	/**
	 * Returns the value of the '<em><b>Dynamics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamics</em>' containment reference.
	 * @see #setDynamics(Dynamics)
	 * @see org.ros.model.urdf.UrdfPackage#getJoint_Dynamics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dynamics' namespace='##targetNamespace'"
	 * @generated
	 */
	Dynamics getDynamics();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Joint#getDynamics <em>Dynamics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamics</em>' containment reference.
	 * @see #getDynamics()
	 * @generated
	 */
	void setDynamics(Dynamics value);

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' containment reference.
	 * @see #setLimit(Limit)
	 * @see org.ros.model.urdf.UrdfPackage#getJoint_Limit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='limit' namespace='##targetNamespace'"
	 * @generated
	 */
	Limit getLimit();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Joint#getLimit <em>Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' containment reference.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(Limit value);

	/**
	 * Returns the value of the '<em><b>Safety Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety Controller</em>' containment reference.
	 * @see #setSafetyController(SafetyController)
	 * @see org.ros.model.urdf.UrdfPackage#getJoint_SafetyController()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='safety_controller' namespace='##targetNamespace'"
	 * @generated
	 */
	SafetyController getSafetyController();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Joint#getSafetyController <em>Safety Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safety Controller</em>' containment reference.
	 * @see #getSafetyController()
	 * @generated
	 */
	void setSafetyController(SafetyController value);

	/**
	 * Returns the value of the '<em><b>Mimic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mimic</em>' containment reference.
	 * @see #setMimic(Mimic)
	 * @see org.ros.model.urdf.UrdfPackage#getJoint_Mimic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mimic' namespace='##targetNamespace'"
	 * @generated
	 */
	Mimic getMimic();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Joint#getMimic <em>Mimic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mimic</em>' containment reference.
	 * @see #getMimic()
	 * @generated
	 */
	void setMimic(Mimic value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ros.model.urdf.UrdfPackage#getJoint_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Joint#getName <em>Name</em>}' attribute.
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
	 * @see org.ros.model.urdf.UrdfPackage#getJoint_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Joint#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Joint
