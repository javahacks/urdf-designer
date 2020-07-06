/**
 */
package org.ros.model.urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.Dynamics#getDamping <em>Damping</em>}</li>
 *   <li>{@link org.ros.model.urdf.Dynamics#getFriction <em>Friction</em>}</li>
 * </ul>
 *
 * @see org.ros.model.urdf.UrdfPackage#getDynamics()
 * @model extendedMetaData="name='dynamics' kind='empty'"
 * @generated
 */
public interface Dynamics extends EObject {
	/**
	 * Returns the value of the '<em><b>Damping</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damping</em>' attribute.
	 * @see #isSetDamping()
	 * @see #unsetDamping()
	 * @see #setDamping(double)
	 * @see org.ros.model.urdf.UrdfPackage#getDynamics_Damping()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='damping'"
	 * @generated
	 */
	double getDamping();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Dynamics#getDamping <em>Damping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damping</em>' attribute.
	 * @see #isSetDamping()
	 * @see #unsetDamping()
	 * @see #getDamping()
	 * @generated
	 */
	void setDamping(double value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.Dynamics#getDamping <em>Damping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDamping()
	 * @see #getDamping()
	 * @see #setDamping(double)
	 * @generated
	 */
	void unsetDamping();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.Dynamics#getDamping <em>Damping</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Damping</em>' attribute is set.
	 * @see #unsetDamping()
	 * @see #getDamping()
	 * @see #setDamping(double)
	 * @generated
	 */
	boolean isSetDamping();

	/**
	 * Returns the value of the '<em><b>Friction</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friction</em>' attribute.
	 * @see #isSetFriction()
	 * @see #unsetFriction()
	 * @see #setFriction(double)
	 * @see org.ros.model.urdf.UrdfPackage#getDynamics_Friction()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='friction'"
	 * @generated
	 */
	double getFriction();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Dynamics#getFriction <em>Friction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friction</em>' attribute.
	 * @see #isSetFriction()
	 * @see #unsetFriction()
	 * @see #getFriction()
	 * @generated
	 */
	void setFriction(double value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.Dynamics#getFriction <em>Friction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFriction()
	 * @see #getFriction()
	 * @see #setFriction(double)
	 * @generated
	 */
	void unsetFriction();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.Dynamics#getFriction <em>Friction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Friction</em>' attribute is set.
	 * @see #unsetFriction()
	 * @see #getFriction()
	 * @see #setFriction(double)
	 * @generated
	 */
	boolean isSetFriction();

} // Dynamics
