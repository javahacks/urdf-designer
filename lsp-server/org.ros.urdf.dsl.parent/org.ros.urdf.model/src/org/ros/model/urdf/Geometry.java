/**
 */
package org.ros.model.urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.Geometry#getBox <em>Box</em>}</li>
 *   <li>{@link org.ros.model.urdf.Geometry#getCylinder <em>Cylinder</em>}</li>
 *   <li>{@link org.ros.model.urdf.Geometry#getSphere <em>Sphere</em>}</li>
 *   <li>{@link org.ros.model.urdf.Geometry#getMesh <em>Mesh</em>}</li>
 * </ul>
 *
 * @see org.ros.model.urdf.UrdfPackage#getGeometry()
 * @model extendedMetaData="name='geometry' kind='elementOnly'"
 * @generated
 */
public interface Geometry extends EObject {
	/**
	 * Returns the value of the '<em><b>Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box</em>' containment reference.
	 * @see #setBox(Box)
	 * @see org.ros.model.urdf.UrdfPackage#getGeometry_Box()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='box' namespace='##targetNamespace'"
	 * @generated
	 */
	Box getBox();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Geometry#getBox <em>Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box</em>' containment reference.
	 * @see #getBox()
	 * @generated
	 */
	void setBox(Box value);

	/**
	 * Returns the value of the '<em><b>Cylinder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cylinder</em>' containment reference.
	 * @see #setCylinder(Cylinder)
	 * @see org.ros.model.urdf.UrdfPackage#getGeometry_Cylinder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cylinder' namespace='##targetNamespace'"
	 * @generated
	 */
	Cylinder getCylinder();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Geometry#getCylinder <em>Cylinder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cylinder</em>' containment reference.
	 * @see #getCylinder()
	 * @generated
	 */
	void setCylinder(Cylinder value);

	/**
	 * Returns the value of the '<em><b>Sphere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sphere</em>' containment reference.
	 * @see #setSphere(Sphere)
	 * @see org.ros.model.urdf.UrdfPackage#getGeometry_Sphere()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sphere' namespace='##targetNamespace'"
	 * @generated
	 */
	Sphere getSphere();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Geometry#getSphere <em>Sphere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sphere</em>' containment reference.
	 * @see #getSphere()
	 * @generated
	 */
	void setSphere(Sphere value);

	/**
	 * Returns the value of the '<em><b>Mesh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesh</em>' containment reference.
	 * @see #setMesh(Mesh)
	 * @see org.ros.model.urdf.UrdfPackage#getGeometry_Mesh()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mesh' namespace='##targetNamespace'"
	 * @generated
	 */
	Mesh getMesh();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Geometry#getMesh <em>Mesh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesh</em>' containment reference.
	 * @see #getMesh()
	 * @generated
	 */
	void setMesh(Mesh value);

} // Geometry
