/**
 */
package org.ros.model.urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material Global</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.MaterialGlobal#getColor <em>Color</em>}</li>
 *   <li>{@link org.ros.model.urdf.MaterialGlobal#getTexture <em>Texture</em>}</li>
 *   <li>{@link org.ros.model.urdf.MaterialGlobal#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.ros.model.urdf.UrdfPackage#getMaterialGlobal()
 * @model extendedMetaData="name='material_global' kind='elementOnly'"
 * @generated
 */
public interface MaterialGlobal extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' containment reference.
	 * @see #setColor(Color)
	 * @see org.ros.model.urdf.UrdfPackage#getMaterialGlobal_Color()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.MaterialGlobal#getColor <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' containment reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Texture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture</em>' containment reference.
	 * @see #setTexture(Texture)
	 * @see org.ros.model.urdf.UrdfPackage#getMaterialGlobal_Texture()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='texture' namespace='##targetNamespace'"
	 * @generated
	 */
	Texture getTexture();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.MaterialGlobal#getTexture <em>Texture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture</em>' containment reference.
	 * @see #getTexture()
	 * @generated
	 */
	void setTexture(Texture value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ros.model.urdf.UrdfPackage#getMaterialGlobal_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.MaterialGlobal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MaterialGlobal
