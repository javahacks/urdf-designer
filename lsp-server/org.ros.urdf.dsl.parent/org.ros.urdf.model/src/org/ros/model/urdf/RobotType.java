/**
 */
package org.ros.model.urdf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.RobotType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.ros.model.urdf.RobotType#getJoint <em>Joint</em>}</li>
 *   <li>{@link org.ros.model.urdf.RobotType#getLink <em>Link</em>}</li>
 *   <li>{@link org.ros.model.urdf.RobotType#getMaterial <em>Material</em>}</li>
 *   <li>{@link org.ros.model.urdf.RobotType#getTransmission <em>Transmission</em>}</li>
 *   <li>{@link org.ros.model.urdf.RobotType#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.urdf.RobotType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.ros.model.urdf.UrdfPackage#getRobotType()
 * @model extendedMetaData="name='robot' kind='elementOnly'"
 * @generated
 */
public interface RobotType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.ros.model.urdf.UrdfPackage#getRobotType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Joint</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.urdf.Joint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joint</em>' containment reference list.
	 * @see org.ros.model.urdf.UrdfPackage#getRobotType_Joint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='joint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Joint> getJoint();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.urdf.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see org.ros.model.urdf.UrdfPackage#getRobotType_Link()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.urdf.MaterialGlobal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' containment reference list.
	 * @see org.ros.model.urdf.UrdfPackage#getRobotType_Material()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MaterialGlobal> getMaterial();

	/**
	 * Returns the value of the '<em><b>Transmission</b></em>' containment reference list.
	 * The list contents are of type {@link org.ros.model.urdf.Transmission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission</em>' containment reference list.
	 * @see org.ros.model.urdf.UrdfPackage#getRobotType_Transmission()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transmission' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Transmission> getTransmission();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ros.model.urdf.UrdfPackage#getRobotType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.RobotType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(String)
	 * @see org.ros.model.urdf.UrdfPackage#getRobotType_Version()
	 * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.RobotType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.RobotType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.RobotType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	boolean isSetVersion();

} // RobotType
