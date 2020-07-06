/**
 */
package org.ros.model.urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.Box#getSize <em>Size</em>}</li>
 *   <li>{@link org.ros.model.urdf.Box#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @see org.ros.model.urdf.UrdfPackage#getBox()
 * @model extendedMetaData="name='box' kind='empty'"
 * @generated
 */
public interface Box extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"0 0 0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see org.ros.model.urdf.UrdfPackage#getBox_Size()
	 * @model default="0 0 0" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='size'"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Box#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/** 
	 * @model containment="true" transient="true"
	 */
	public Vector3 getDimension();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Box#getDimension <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' containment reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Vector3 value);
	
		
	
} // Box
