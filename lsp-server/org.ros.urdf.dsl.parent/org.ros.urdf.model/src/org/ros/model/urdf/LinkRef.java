package org.ros.model.urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * 
 * @model abstract="true"
 *
 */
public interface LinkRef extends EObject {

	
	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(String)
	 * @see org.ros.model.urdf.UrdfPackage#getLinkRef_Link()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='link'"
	 * @generated
	 */
	String getLink();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.LinkRef#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(String value);
	
	
	/**
	 * @model  transient="true"
	 */
	public Link getLinkRef();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.LinkRef#getLinkRef <em>Link Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Ref</em>' reference.
	 * @see #getLinkRef()
	 * @generated
	 */
	void setLinkRef(Link value);
	
}
