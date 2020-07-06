/**
 */
package org.ros.model.urdf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.Link#getInertial <em>Inertial</em>}</li>
 *   <li>{@link org.ros.model.urdf.Link#getVisual <em>Visual</em>}</li>
 *   <li>{@link org.ros.model.urdf.Link#getCollision <em>Collision</em>}</li>
 *   <li>{@link org.ros.model.urdf.Link#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.urdf.Link#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.ros.model.urdf.UrdfPackage#getLink()
 * @model extendedMetaData="name='link' kind='elementOnly'"
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Inertial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inertial</em>' containment reference.
	 * @see #setInertial(Inertial)
	 * @see org.ros.model.urdf.UrdfPackage#getLink_Inertial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inertial' namespace='##targetNamespace'"
	 * @generated
	 */
	Inertial getInertial();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Link#getInertial <em>Inertial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inertial</em>' containment reference.
	 * @see #getInertial()
	 * @generated
	 */
	void setInertial(Inertial value);

	/**
	 * Returns the value of the '<em><b>Visual</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.urdf.Visual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual</em>' containment reference list.
	 * @see org.ros.model.urdf.UrdfPackage#getLink_Visual()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='visual' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Visual> getVisual();

	/**
	 * Returns the value of the '<em><b>Collision</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.urdf.Collision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collision</em>' containment reference list.
	 * @see org.ros.model.urdf.UrdfPackage#getLink_Collision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='collision' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Collision> getCollision();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ros.model.urdf.UrdfPackage#getLink_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Link#getName <em>Name</em>}' attribute.
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
	 * @see org.ros.model.urdf.UrdfPackage#getLink_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Link#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Link
