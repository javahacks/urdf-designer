package org.ros.model.urdf;

import org.eclipse.emf.ecore.EObject;

/** 
 * @model
 */
public interface Vector3 extends EObject {

	/** 
	 * @model
	 */
	public double getA();
	
	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Vector3#getA <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' attribute.
	 * @see #getA()
	 * @generated
	 */
	void setA(double value);

	/** 
	 * @model
	 */
	public double getB();
		
	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Vector3#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' attribute.
	 * @see #getB()
	 * @generated
	 */
	void setB(double value);

	/** 
	 * @model
	 */
	public double getC();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.Vector3#getC <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C</em>' attribute.
	 * @see #getC()
	 * @generated
	 */
	void setC(double value);
	
	
}
