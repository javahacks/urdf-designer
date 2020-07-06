/**
 */
package org.ros.model.urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.Visual#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.ros.model.urdf.Visual#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.ros.model.urdf.Visual#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @see org.ros.model.urdf.UrdfPackage#getVisual()
 * @model extendedMetaData="name='visual' kind='elementOnly'"
 * @generated
 */
public interface Visual extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(Pose)
	 * @see org.ros.model.urdf.UrdfPackage#getVisual_Origin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='origin' namespace='##targetNamespace'"
	 * @generated
	 */
	Pose getOrigin();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Visual#getOrigin <em>Origin</em>}' containment reference.
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
	 * @see org.ros.model.urdf.UrdfPackage#getVisual_Geometry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	Geometry getGeometry();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Visual#getGeometry <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' containment reference.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(Geometry value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' containment reference.
	 * @see #setMaterial(Material)
	 * @see org.ros.model.urdf.UrdfPackage#getVisual_Material()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	Material getMaterial();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Visual#getMaterial <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' containment reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(Material value);

} // Visual
