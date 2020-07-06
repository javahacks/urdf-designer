/**
 */
package org.ros.model.urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.Mesh#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.ros.model.urdf.Mesh#getScale <em>Scale</em>}</li>
 *   <li>{@link org.ros.model.urdf.Mesh#getScaleVector <em>Scale Vector</em>}</li>
 * </ul>
 *
 * @see org.ros.model.urdf.UrdfPackage#getMesh()
 * @model extendedMetaData="name='mesh' kind='empty'"
 * @generated
 */
public interface Mesh extends EObject {
	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see org.ros.model.urdf.UrdfPackage#getMesh_Filename()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='filename'"
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Mesh#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The default value is <code>"1 1 1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see #setScale(String)
	 * @see org.ros.model.urdf.UrdfPackage#getMesh_Scale()
	 * @model default="1 1 1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='scale'"
	 * @generated
	 */
	String getScale();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Mesh#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see #getScale()
	 * @generated
	 */
	void setScale(String value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.Mesh#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScale()
	 * @see #getScale()
	 * @see #setScale(String)
	 * @generated
	 */
	void unsetScale();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.Mesh#getScale <em>Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scale</em>' attribute is set.
	 * @see #unsetScale()
	 * @see #getScale()
	 * @see #setScale(String)
	 * @generated
	 */
	boolean isSetScale();
	
	/** 
	 * @model containment="true" transient="true"
	 */	
	public Vector3 getScaleVector();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Mesh#getScaleVector <em>Scale Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Vector</em>' containment reference.
	 * @see #getScaleVector()
	 * @generated
	 */
	void setScaleVector(Vector3 value);
	

} // Mesh
