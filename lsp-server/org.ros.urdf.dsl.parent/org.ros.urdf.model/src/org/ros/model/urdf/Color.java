/**
 */
package org.ros.model.urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.Color#getRgba <em>Rgba</em>}</li>
 *   <li>{@link org.ros.model.urdf.Color#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see org.ros.model.urdf.UrdfPackage#getColor()
 * @model extendedMetaData="name='color' kind='empty'"
 * @generated
 */
public interface Color extends EObject {
	/**
	 * Returns the value of the '<em><b>Rgba</b></em>' attribute.
	 * The default value is <code>"0 0 0 0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rgba</em>' attribute.
	 * @see #isSetRgba()
	 * @see #unsetRgba()
	 * @see #setRgba(String)
	 * @see org.ros.model.urdf.UrdfPackage#getColor_Rgba()
	 * @model default="0 0 0 0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rgba'"
	 * @generated
	 */
	String getRgba();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Color#getRgba <em>Rgba</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rgba</em>' attribute.
	 * @see #isSetRgba()
	 * @see #unsetRgba()
	 * @see #getRgba()
	 * @generated
	 */
	void setRgba(String value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.Color#getRgba <em>Rgba</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRgba()
	 * @see #getRgba()
	 * @see #setRgba(String)
	 * @generated
	 */
	void unsetRgba();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.Color#getRgba <em>Rgba</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rgba</em>' attribute is set.
	 * @see #unsetRgba()
	 * @see #getRgba()
	 * @see #setRgba(String)
	 * @generated
	 */
	boolean isSetRgba();

	/** 
	 * @model containment="true" transient="true"
	 */	
	public Vector4 getColor();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Color#getColor <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' containment reference.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Vector4 value);
	
} // Color
