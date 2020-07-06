/**
 */
package org.ros.model.urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Texture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.Texture#getFilename <em>Filename</em>}</li>
 * </ul>
 *
 * @see org.ros.model.urdf.UrdfPackage#getTexture()
 * @model extendedMetaData="name='texture' kind='empty'"
 * @generated
 */
public interface Texture extends EObject {
	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see org.ros.model.urdf.UrdfPackage#getTexture_Filename()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='filename'"
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Texture#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

} // Texture
