/**
 */
package org.ros.model.urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mimic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.Mimic#getJoint <em>Joint</em>}</li>
 *   <li>{@link org.ros.model.urdf.Mimic#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link org.ros.model.urdf.Mimic#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see org.ros.model.urdf.UrdfPackage#getMimic()
 * @model extendedMetaData="name='mimic' kind='empty'"
 * @generated
 */
public interface Mimic extends EObject {
	/**
	 * Returns the value of the '<em><b>Joint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joint</em>' attribute.
	 * @see #setJoint(String)
	 * @see org.ros.model.urdf.UrdfPackage#getMimic_Joint()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='joint'"
	 * @generated
	 */
	String getJoint();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Mimic#getJoint <em>Joint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Joint</em>' attribute.
	 * @see #getJoint()
	 * @generated
	 */
	void setJoint(String value);

	/**
	 * Returns the value of the '<em><b>Multiplier</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplier</em>' attribute.
	 * @see #isSetMultiplier()
	 * @see #unsetMultiplier()
	 * @see #setMultiplier(double)
	 * @see org.ros.model.urdf.UrdfPackage#getMimic_Multiplier()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='multiplier'"
	 * @generated
	 */
	double getMultiplier();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Mimic#getMultiplier <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplier</em>' attribute.
	 * @see #isSetMultiplier()
	 * @see #unsetMultiplier()
	 * @see #getMultiplier()
	 * @generated
	 */
	void setMultiplier(double value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.Mimic#getMultiplier <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultiplier()
	 * @see #getMultiplier()
	 * @see #setMultiplier(double)
	 * @generated
	 */
	void unsetMultiplier();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.Mimic#getMultiplier <em>Multiplier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiplier</em>' attribute is set.
	 * @see #unsetMultiplier()
	 * @see #getMultiplier()
	 * @see #setMultiplier(double)
	 * @generated
	 */
	boolean isSetMultiplier();

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #setOffset(double)
	 * @see org.ros.model.urdf.UrdfPackage#getMimic_Offset()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='offset'"
	 * @generated
	 */
	double getOffset();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Mimic#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(double value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.Mimic#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOffset()
	 * @see #getOffset()
	 * @see #setOffset(double)
	 * @generated
	 */
	void unsetOffset();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.Mimic#getOffset <em>Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Offset</em>' attribute is set.
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @see #setOffset(double)
	 * @generated
	 */
	boolean isSetOffset();

} // Mimic
