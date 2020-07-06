/**
 */
package org.ros.model.urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.Collision#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.ros.model.urdf.Collision#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.ros.model.urdf.Collision#getVerbose <em>Verbose</em>}</li>
 *   <li>{@link org.ros.model.urdf.Collision#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.ros.model.urdf.UrdfPackage#getCollision()
 * @model extendedMetaData="name='collision' kind='elementOnly'"
 * @generated
 */
public interface Collision extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(Pose)
	 * @see org.ros.model.urdf.UrdfPackage#getCollision_Origin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='origin' namespace='##targetNamespace'"
	 * @generated
	 */
	Pose getOrigin();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Collision#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Pose value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' containment reference.
	 * @see #setGeometry(Geometry)
	 * @see org.ros.model.urdf.UrdfPackage#getCollision_Geometry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	Geometry getGeometry();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Collision#getGeometry <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' containment reference.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(Geometry value);

	/**
	 * Returns the value of the '<em><b>Verbose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verbose</em>' containment reference.
	 * @see #setVerbose(Verbose)
	 * @see org.ros.model.urdf.UrdfPackage#getCollision_Verbose()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='verbose' namespace='##targetNamespace'"
	 * @generated
	 */
	Verbose getVerbose();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Collision#getVerbose <em>Verbose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verbose</em>' containment reference.
	 * @see #getVerbose()
	 * @generated
	 */
	void setVerbose(Verbose value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ros.model.urdf.UrdfPackage#getCollision_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Collision#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Collision
