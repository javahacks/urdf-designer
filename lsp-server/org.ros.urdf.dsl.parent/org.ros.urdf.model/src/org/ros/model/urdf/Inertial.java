/**
 */
package org.ros.model.urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inertial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.Inertial#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.ros.model.urdf.Inertial#getMass <em>Mass</em>}</li>
 *   <li>{@link org.ros.model.urdf.Inertial#getInertia <em>Inertia</em>}</li>
 * </ul>
 *
 * @see org.ros.model.urdf.UrdfPackage#getInertial()
 * @model extendedMetaData="name='inertial' kind='elementOnly'"
 * @generated
 */
public interface Inertial extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(Pose)
	 * @see org.ros.model.urdf.UrdfPackage#getInertial_Origin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='origin' namespace='##targetNamespace'"
	 * @generated
	 */
	Pose getOrigin();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Inertial#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Pose value);

	/**
	 * Returns the value of the '<em><b>Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass</em>' containment reference.
	 * @see #setMass(Mass)
	 * @see org.ros.model.urdf.UrdfPackage#getInertial_Mass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mass' namespace='##targetNamespace'"
	 * @generated
	 */
	Mass getMass();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Inertial#getMass <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' containment reference.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(Mass value);

	/**
	 * Returns the value of the '<em><b>Inertia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inertia</em>' containment reference.
	 * @see #setInertia(Inertia)
	 * @see org.ros.model.urdf.UrdfPackage#getInertial_Inertia()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inertia' namespace='##targetNamespace'"
	 * @generated
	 */
	Inertia getInertia();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Inertial#getInertia <em>Inertia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inertia</em>' containment reference.
	 * @see #getInertia()
	 * @generated
	 */
	void setInertia(Inertia value);

} // Inertial
