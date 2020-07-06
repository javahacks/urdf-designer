/**
 */
package org.ros.model.urdf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ros.model.urdf.Axis;
import org.ros.model.urdf.UrdfPackage;
import org.ros.model.urdf.Vector3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.impl.AxisImpl#getXyz <em>Xyz</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.AxisImpl#getXyzVector <em>Xyz Vector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AxisImpl extends MinimalEObjectImpl.Container implements Axis {
	/**
	 * The default value of the '{@link #getXyz() <em>Xyz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXyz()
	 * @generated
	 * @ordered
	 */
	protected static final String XYZ_EDEFAULT = "1 0 0";

	/**
	 * The cached value of the '{@link #getXyz() <em>Xyz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXyz()
	 * @generated
	 * @ordered
	 */
	protected String xyz = XYZ_EDEFAULT;

	/**
	 * This is true if the Xyz attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean xyzESet;

	/**
	 * The cached value of the '{@link #getXyzVector() <em>Xyz Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXyzVector()
	 * @generated
	 * @ordered
	 */
	protected Vector3 xyzVector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UrdfPackage.Literals.AXIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXyz() {
		return xyz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXyz(String newXyz) {
		String oldXyz = xyz;
		xyz = newXyz;
		boolean oldXyzESet = xyzESet;
		xyzESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.AXIS__XYZ, oldXyz, xyz, !oldXyzESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetXyz() {
		String oldXyz = xyz;
		boolean oldXyzESet = xyzESet;
		xyz = XYZ_EDEFAULT;
		xyzESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.AXIS__XYZ, oldXyz, XYZ_EDEFAULT, oldXyzESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetXyz() {
		return xyzESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3 getXyzVector() {
		return xyzVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXyzVector(Vector3 newXyzVector, NotificationChain msgs) {
		Vector3 oldXyzVector = xyzVector;
		xyzVector = newXyzVector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.AXIS__XYZ_VECTOR, oldXyzVector, newXyzVector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXyzVector(Vector3 newXyzVector) {
		if (newXyzVector != xyzVector) {
			NotificationChain msgs = null;
			if (xyzVector != null)
				msgs = ((InternalEObject)xyzVector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.AXIS__XYZ_VECTOR, null, msgs);
			if (newXyzVector != null)
				msgs = ((InternalEObject)newXyzVector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.AXIS__XYZ_VECTOR, null, msgs);
			msgs = basicSetXyzVector(newXyzVector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.AXIS__XYZ_VECTOR, newXyzVector, newXyzVector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UrdfPackage.AXIS__XYZ_VECTOR:
				return basicSetXyzVector(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UrdfPackage.AXIS__XYZ:
				return getXyz();
			case UrdfPackage.AXIS__XYZ_VECTOR:
				return getXyzVector();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UrdfPackage.AXIS__XYZ:
				setXyz((String)newValue);
				return;
			case UrdfPackage.AXIS__XYZ_VECTOR:
				setXyzVector((Vector3)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UrdfPackage.AXIS__XYZ:
				unsetXyz();
				return;
			case UrdfPackage.AXIS__XYZ_VECTOR:
				setXyzVector((Vector3)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UrdfPackage.AXIS__XYZ:
				return isSetXyz();
			case UrdfPackage.AXIS__XYZ_VECTOR:
				return xyzVector != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (xyz: ");
		if (xyzESet) result.append(xyz); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AxisImpl
