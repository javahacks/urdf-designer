/**
 */
package org.ros.model.urdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gap Joint Transmission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.GapJointTransmission#getL0 <em>L0</em>}</li>
 *   <li>{@link org.ros.model.urdf.GapJointTransmission#getA <em>A</em>}</li>
 *   <li>{@link org.ros.model.urdf.GapJointTransmission#getB <em>B</em>}</li>
 *   <li>{@link org.ros.model.urdf.GapJointTransmission#getGearRatio <em>Gear Ratio</em>}</li>
 *   <li>{@link org.ros.model.urdf.GapJointTransmission#getH <em>H</em>}</li>
 *   <li>{@link org.ros.model.urdf.GapJointTransmission#getMechanicalReduction <em>Mechanical Reduction</em>}</li>
 *   <li>{@link org.ros.model.urdf.GapJointTransmission#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.urdf.GapJointTransmission#getPhi0 <em>Phi0</em>}</li>
 *   <li>{@link org.ros.model.urdf.GapJointTransmission#getR <em>R</em>}</li>
 *   <li>{@link org.ros.model.urdf.GapJointTransmission#getScrewReduction <em>Screw Reduction</em>}</li>
 *   <li>{@link org.ros.model.urdf.GapJointTransmission#getT0 <em>T0</em>}</li>
 *   <li>{@link org.ros.model.urdf.GapJointTransmission#getTheta0 <em>Theta0</em>}</li>
 * </ul>
 *
 * @see org.ros.model.urdf.UrdfPackage#getGapJointTransmission()
 * @model extendedMetaData="name='gap_joint_transmission' kind='empty'"
 * @generated
 */
public interface GapJointTransmission extends EObject {
	/**
	 * Returns the value of the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' attribute.
	 * @see #isSetA()
	 * @see #unsetA()
	 * @see #setA(double)
	 * @see org.ros.model.urdf.UrdfPackage#getGapJointTransmission_A()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='a'"
	 * @generated
	 */
	double getA();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getA <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' attribute.
	 * @see #isSetA()
	 * @see #unsetA()
	 * @see #getA()
	 * @generated
	 */
	void setA(double value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getA <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetA()
	 * @see #getA()
	 * @see #setA(double)
	 * @generated
	 */
	void unsetA();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.GapJointTransmission#getA <em>A</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>A</em>' attribute is set.
	 * @see #unsetA()
	 * @see #getA()
	 * @see #setA(double)
	 * @generated
	 */
	boolean isSetA();

	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' attribute.
	 * @see #isSetB()
	 * @see #unsetB()
	 * @see #setB(double)
	 * @see org.ros.model.urdf.UrdfPackage#getGapJointTransmission_B()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='b'"
	 * @generated
	 */
	double getB();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' attribute.
	 * @see #isSetB()
	 * @see #unsetB()
	 * @see #getB()
	 * @generated
	 */
	void setB(double value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetB()
	 * @see #getB()
	 * @see #setB(double)
	 * @generated
	 */
	void unsetB();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.GapJointTransmission#getB <em>B</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>B</em>' attribute is set.
	 * @see #unsetB()
	 * @see #getB()
	 * @see #setB(double)
	 * @generated
	 */
	boolean isSetB();

	/**
	 * Returns the value of the '<em><b>Gear Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gear Ratio</em>' attribute.
	 * @see #isSetGearRatio()
	 * @see #unsetGearRatio()
	 * @see #setGearRatio(double)
	 * @see org.ros.model.urdf.UrdfPackage#getGapJointTransmission_GearRatio()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='gear_ratio'"
	 * @generated
	 */
	double getGearRatio();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getGearRatio <em>Gear Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gear Ratio</em>' attribute.
	 * @see #isSetGearRatio()
	 * @see #unsetGearRatio()
	 * @see #getGearRatio()
	 * @generated
	 */
	void setGearRatio(double value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getGearRatio <em>Gear Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGearRatio()
	 * @see #getGearRatio()
	 * @see #setGearRatio(double)
	 * @generated
	 */
	void unsetGearRatio();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.GapJointTransmission#getGearRatio <em>Gear Ratio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gear Ratio</em>' attribute is set.
	 * @see #unsetGearRatio()
	 * @see #getGearRatio()
	 * @see #setGearRatio(double)
	 * @generated
	 */
	boolean isSetGearRatio();

	/**
	 * Returns the value of the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H</em>' attribute.
	 * @see #isSetH()
	 * @see #unsetH()
	 * @see #setH(double)
	 * @see org.ros.model.urdf.UrdfPackage#getGapJointTransmission_H()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='h'"
	 * @generated
	 */
	double getH();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getH <em>H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>H</em>' attribute.
	 * @see #isSetH()
	 * @see #unsetH()
	 * @see #getH()
	 * @generated
	 */
	void setH(double value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getH <em>H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetH()
	 * @see #getH()
	 * @see #setH(double)
	 * @generated
	 */
	void unsetH();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.GapJointTransmission#getH <em>H</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>H</em>' attribute is set.
	 * @see #unsetH()
	 * @see #getH()
	 * @see #setH(double)
	 * @generated
	 */
	boolean isSetH();

	/**
	 * Returns the value of the '<em><b>L0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>L0</em>' attribute.
	 * @see #isSetL0()
	 * @see #unsetL0()
	 * @see #setL0(double)
	 * @see org.ros.model.urdf.UrdfPackage#getGapJointTransmission_L0()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='L0'"
	 * @generated
	 */
	double getL0();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getL0 <em>L0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>L0</em>' attribute.
	 * @see #isSetL0()
	 * @see #unsetL0()
	 * @see #getL0()
	 * @generated
	 */
	void setL0(double value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getL0 <em>L0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetL0()
	 * @see #getL0()
	 * @see #setL0(double)
	 * @generated
	 */
	void unsetL0();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.GapJointTransmission#getL0 <em>L0</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>L0</em>' attribute is set.
	 * @see #unsetL0()
	 * @see #getL0()
	 * @see #setL0(double)
	 * @generated
	 */
	boolean isSetL0();

	/**
	 * Returns the value of the '<em><b>Mechanical Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanical Reduction</em>' attribute.
	 * @see #isSetMechanicalReduction()
	 * @see #unsetMechanicalReduction()
	 * @see #setMechanicalReduction(double)
	 * @see org.ros.model.urdf.UrdfPackage#getGapJointTransmission_MechanicalReduction()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='mechanical_reduction'"
	 * @generated
	 */
	double getMechanicalReduction();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getMechanicalReduction <em>Mechanical Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanical Reduction</em>' attribute.
	 * @see #isSetMechanicalReduction()
	 * @see #unsetMechanicalReduction()
	 * @see #getMechanicalReduction()
	 * @generated
	 */
	void setMechanicalReduction(double value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getMechanicalReduction <em>Mechanical Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMechanicalReduction()
	 * @see #getMechanicalReduction()
	 * @see #setMechanicalReduction(double)
	 * @generated
	 */
	void unsetMechanicalReduction();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.GapJointTransmission#getMechanicalReduction <em>Mechanical Reduction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mechanical Reduction</em>' attribute is set.
	 * @see #unsetMechanicalReduction()
	 * @see #getMechanicalReduction()
	 * @see #setMechanicalReduction(double)
	 * @generated
	 */
	boolean isSetMechanicalReduction();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ros.model.urdf.UrdfPackage#getGapJointTransmission_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Phi0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phi0</em>' attribute.
	 * @see #isSetPhi0()
	 * @see #unsetPhi0()
	 * @see #setPhi0(double)
	 * @see org.ros.model.urdf.UrdfPackage#getGapJointTransmission_Phi0()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='phi0'"
	 * @generated
	 */
	double getPhi0();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getPhi0 <em>Phi0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phi0</em>' attribute.
	 * @see #isSetPhi0()
	 * @see #unsetPhi0()
	 * @see #getPhi0()
	 * @generated
	 */
	void setPhi0(double value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getPhi0 <em>Phi0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhi0()
	 * @see #getPhi0()
	 * @see #setPhi0(double)
	 * @generated
	 */
	void unsetPhi0();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.GapJointTransmission#getPhi0 <em>Phi0</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phi0</em>' attribute is set.
	 * @see #unsetPhi0()
	 * @see #getPhi0()
	 * @see #setPhi0(double)
	 * @generated
	 */
	boolean isSetPhi0();

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #isSetR()
	 * @see #unsetR()
	 * @see #setR(double)
	 * @see org.ros.model.urdf.UrdfPackage#getGapJointTransmission_R()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='r'"
	 * @generated
	 */
	double getR();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #isSetR()
	 * @see #unsetR()
	 * @see #getR()
	 * @generated
	 */
	void setR(double value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetR()
	 * @see #getR()
	 * @see #setR(double)
	 * @generated
	 */
	void unsetR();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.GapJointTransmission#getR <em>R</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>R</em>' attribute is set.
	 * @see #unsetR()
	 * @see #getR()
	 * @see #setR(double)
	 * @generated
	 */
	boolean isSetR();

	/**
	 * Returns the value of the '<em><b>Screw Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screw Reduction</em>' attribute.
	 * @see #isSetScrewReduction()
	 * @see #unsetScrewReduction()
	 * @see #setScrewReduction(double)
	 * @see org.ros.model.urdf.UrdfPackage#getGapJointTransmission_ScrewReduction()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='screw_reduction'"
	 * @generated
	 */
	double getScrewReduction();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getScrewReduction <em>Screw Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screw Reduction</em>' attribute.
	 * @see #isSetScrewReduction()
	 * @see #unsetScrewReduction()
	 * @see #getScrewReduction()
	 * @generated
	 */
	void setScrewReduction(double value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getScrewReduction <em>Screw Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScrewReduction()
	 * @see #getScrewReduction()
	 * @see #setScrewReduction(double)
	 * @generated
	 */
	void unsetScrewReduction();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.GapJointTransmission#getScrewReduction <em>Screw Reduction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Screw Reduction</em>' attribute is set.
	 * @see #unsetScrewReduction()
	 * @see #getScrewReduction()
	 * @see #setScrewReduction(double)
	 * @generated
	 */
	boolean isSetScrewReduction();

	/**
	 * Returns the value of the '<em><b>T0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T0</em>' attribute.
	 * @see #isSetT0()
	 * @see #unsetT0()
	 * @see #setT0(double)
	 * @see org.ros.model.urdf.UrdfPackage#getGapJointTransmission_T0()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='t0'"
	 * @generated
	 */
	double getT0();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getT0 <em>T0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T0</em>' attribute.
	 * @see #isSetT0()
	 * @see #unsetT0()
	 * @see #getT0()
	 * @generated
	 */
	void setT0(double value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getT0 <em>T0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetT0()
	 * @see #getT0()
	 * @see #setT0(double)
	 * @generated
	 */
	void unsetT0();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.GapJointTransmission#getT0 <em>T0</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>T0</em>' attribute is set.
	 * @see #unsetT0()
	 * @see #getT0()
	 * @see #setT0(double)
	 * @generated
	 */
	boolean isSetT0();

	/**
	 * Returns the value of the '<em><b>Theta0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theta0</em>' attribute.
	 * @see #isSetTheta0()
	 * @see #unsetTheta0()
	 * @see #setTheta0(double)
	 * @see org.ros.model.urdf.UrdfPackage#getGapJointTransmission_Theta0()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='theta0'"
	 * @generated
	 */
	double getTheta0();

	/**
	 * Sets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getTheta0 <em>Theta0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theta0</em>' attribute.
	 * @see #isSetTheta0()
	 * @see #unsetTheta0()
	 * @see #getTheta0()
	 * @generated
	 */
	void setTheta0(double value);

	/**
	 * Unsets the value of the '{@link org.ros.model.urdf.GapJointTransmission#getTheta0 <em>Theta0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTheta0()
	 * @see #getTheta0()
	 * @see #setTheta0(double)
	 * @generated
	 */
	void unsetTheta0();

	/**
	 * Returns whether the value of the '{@link org.ros.model.urdf.GapJointTransmission#getTheta0 <em>Theta0</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Theta0</em>' attribute is set.
	 * @see #unsetTheta0()
	 * @see #getTheta0()
	 * @see #setTheta0(double)
	 * @generated
	 */
	boolean isSetTheta0();

} // GapJointTransmission
