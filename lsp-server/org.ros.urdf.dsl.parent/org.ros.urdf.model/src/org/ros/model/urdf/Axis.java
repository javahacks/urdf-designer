/**
 */
package org.ros.model.urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.Axis#getXyz <em>Xyz</em>}</li>
 *   <li>{@link org.ros.model.urdf.Axis#getXyzVector <em>Xyz Vector</em>}</li>
 * </ul>
 *
 * @see org.ros.model.urdf.UrdfPackage#getAxis()
 * @model extendedMetaData="name='axis' kind='empty'"
 * @generated
 */
public interface Axis extends EObject {
	/**
	 * Returns the value of the '<em><b>Xyz</b></em>' attribute.
	 * The default value is <code>"1 0 0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xyz</em>' attribute.
	 * @see #isSetXyz()
	 * @see #unsetXyz()
	 * @see #setXyz(String)
	 * @see org.ros.model.urdf.UrdfPackage#getAxis_Xyz()
	 * @model default="1 0 0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='xyz'"
	 * @generated
	 */
	String getXyz();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Axis#getXyz <em>Xyz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xyz</em>' attribute.
	 * @see #isSetXyz()
	 * @see #unsetXyz()
	 * @see #getXyz()
	 * @generated
	 */
	void setXyz(String value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.Axis#getXyz <em>Xyz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXyz()
	 * @see #getXyz()
	 * @see #setXyz(String)
	 * @generated
	 */
	void unsetXyz();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.Axis#getXyz <em>Xyz</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Xyz</em>' attribute is set.
	 * @see #unsetXyz()
	 * @see #getXyz()
	 * @see #setXyz(String)
	 * @generated
	 */
	boolean isSetXyz();
	
	/** 
	 * @model containment="true" transient="true"
	 */	
	public Vector3 getXyzVector();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Axis#getXyzVector <em>Xyz Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xyz Vector</em>' containment reference.
	 * @see #getXyzVector()
	 * @generated
	 */
	void setXyzVector(Vector3 value);

} // Axis
