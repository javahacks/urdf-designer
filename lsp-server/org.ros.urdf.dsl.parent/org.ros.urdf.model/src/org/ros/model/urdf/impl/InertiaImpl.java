/**
 */
package org.ros.model.urdf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ros.model.urdf.Inertia;
import org.ros.model.urdf.UrdfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inertia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.impl.InertiaImpl#getIxx <em>Ixx</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.InertiaImpl#getIxy <em>Ixy</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.InertiaImpl#getIxz <em>Ixz</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.InertiaImpl#getIyy <em>Iyy</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.InertiaImpl#getIyz <em>Iyz</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.InertiaImpl#getIzz <em>Izz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InertiaImpl extends MinimalEObjectImpl.Container implements Inertia {
	/**
	 * The default value of the '{@link #getIxx() <em>Ixx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIxx()
	 * @generated
	 * @ordered
	 */
	protected static final double IXX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIxx() <em>Ixx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIxx()
	 * @generated
	 * @ordered
	 */
	protected double ixx = IXX_EDEFAULT;

	/**
	 * This is true if the Ixx attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ixxESet;

	/**
	 * The default value of the '{@link #getIxy() <em>Ixy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIxy()
	 * @generated
	 * @ordered
	 */
	protected static final double IXY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIxy() <em>Ixy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIxy()
	 * @generated
	 * @ordered
	 */
	protected double ixy = IXY_EDEFAULT;

	/**
	 * This is true if the Ixy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ixyESet;

	/**
	 * The default value of the '{@link #getIxz() <em>Ixz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIxz()
	 * @generated
	 * @ordered
	 */
	protected static final double IXZ_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIxz() <em>Ixz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIxz()
	 * @generated
	 * @ordered
	 */
	protected double ixz = IXZ_EDEFAULT;

	/**
	 * This is true if the Ixz attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ixzESet;

	/**
	 * The default value of the '{@link #getIyy() <em>Iyy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIyy()
	 * @generated
	 * @ordered
	 */
	protected static final double IYY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIyy() <em>Iyy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIyy()
	 * @generated
	 * @ordered
	 */
	protected double iyy = IYY_EDEFAULT;

	/**
	 * This is true if the Iyy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iyyESet;

	/**
	 * The default value of the '{@link #getIyz() <em>Iyz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIyz()
	 * @generated
	 * @ordered
	 */
	protected static final double IYZ_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIyz() <em>Iyz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIyz()
	 * @generated
	 * @ordered
	 */
	protected double iyz = IYZ_EDEFAULT;

	/**
	 * This is true if the Iyz attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iyzESet;

	/**
	 * The default value of the '{@link #getIzz() <em>Izz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIzz()
	 * @generated
	 * @ordered
	 */
	protected static final double IZZ_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIzz() <em>Izz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIzz()
	 * @generated
	 * @ordered
	 */
	protected double izz = IZZ_EDEFAULT;

	/**
	 * This is true if the Izz attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean izzESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InertiaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UrdfPackage.Literals.INERTIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIxx() {
		return ixx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIxx(double newIxx) {
		double oldIxx = ixx;
		ixx = newIxx;
		boolean oldIxxESet = ixxESet;
		ixxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.INERTIA__IXX, oldIxx, ixx, !oldIxxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIxx() {
		double oldIxx = ixx;
		boolean oldIxxESet = ixxESet;
		ixx = IXX_EDEFAULT;
		ixxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.INERTIA__IXX, oldIxx, IXX_EDEFAULT, oldIxxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIxx() {
		return ixxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIxy() {
		return ixy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIxy(double newIxy) {
		double oldIxy = ixy;
		ixy = newIxy;
		boolean oldIxyESet = ixyESet;
		ixyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.INERTIA__IXY, oldIxy, ixy, !oldIxyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIxy() {
		double oldIxy = ixy;
		boolean oldIxyESet = ixyESet;
		ixy = IXY_EDEFAULT;
		ixyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.INERTIA__IXY, oldIxy, IXY_EDEFAULT, oldIxyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIxy() {
		return ixyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIxz() {
		return ixz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIxz(double newIxz) {
		double oldIxz = ixz;
		ixz = newIxz;
		boolean oldIxzESet = ixzESet;
		ixzESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.INERTIA__IXZ, oldIxz, ixz, !oldIxzESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIxz() {
		double oldIxz = ixz;
		boolean oldIxzESet = ixzESet;
		ixz = IXZ_EDEFAULT;
		ixzESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.INERTIA__IXZ, oldIxz, IXZ_EDEFAULT, oldIxzESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIxz() {
		return ixzESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIyy() {
		return iyy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIyy(double newIyy) {
		double oldIyy = iyy;
		iyy = newIyy;
		boolean oldIyyESet = iyyESet;
		iyyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.INERTIA__IYY, oldIyy, iyy, !oldIyyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIyy() {
		double oldIyy = iyy;
		boolean oldIyyESet = iyyESet;
		iyy = IYY_EDEFAULT;
		iyyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.INERTIA__IYY, oldIyy, IYY_EDEFAULT, oldIyyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIyy() {
		return iyyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIyz() {
		return iyz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIyz(double newIyz) {
		double oldIyz = iyz;
		iyz = newIyz;
		boolean oldIyzESet = iyzESet;
		iyzESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.INERTIA__IYZ, oldIyz, iyz, !oldIyzESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIyz() {
		double oldIyz = iyz;
		boolean oldIyzESet = iyzESet;
		iyz = IYZ_EDEFAULT;
		iyzESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.INERTIA__IYZ, oldIyz, IYZ_EDEFAULT, oldIyzESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIyz() {
		return iyzESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIzz() {
		return izz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIzz(double newIzz) {
		double oldIzz = izz;
		izz = newIzz;
		boolean oldIzzESet = izzESet;
		izzESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.INERTIA__IZZ, oldIzz, izz, !oldIzzESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIzz() {
		double oldIzz = izz;
		boolean oldIzzESet = izzESet;
		izz = IZZ_EDEFAULT;
		izzESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.INERTIA__IZZ, oldIzz, IZZ_EDEFAULT, oldIzzESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIzz() {
		return izzESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UrdfPackage.INERTIA__IXX:
				return getIxx();
			case UrdfPackage.INERTIA__IXY:
				return getIxy();
			case UrdfPackage.INERTIA__IXZ:
				return getIxz();
			case UrdfPackage.INERTIA__IYY:
				return getIyy();
			case UrdfPackage.INERTIA__IYZ:
				return getIyz();
			case UrdfPackage.INERTIA__IZZ:
				return getIzz();
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
			case UrdfPackage.INERTIA__IXX:
				setIxx((Double)newValue);
				return;
			case UrdfPackage.INERTIA__IXY:
				setIxy((Double)newValue);
				return;
			case UrdfPackage.INERTIA__IXZ:
				setIxz((Double)newValue);
				return;
			case UrdfPackage.INERTIA__IYY:
				setIyy((Double)newValue);
				return;
			case UrdfPackage.INERTIA__IYZ:
				setIyz((Double)newValue);
				return;
			case UrdfPackage.INERTIA__IZZ:
				setIzz((Double)newValue);
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
			case UrdfPackage.INERTIA__IXX:
				unsetIxx();
				return;
			case UrdfPackage.INERTIA__IXY:
				unsetIxy();
				return;
			case UrdfPackage.INERTIA__IXZ:
				unsetIxz();
				return;
			case UrdfPackage.INERTIA__IYY:
				unsetIyy();
				return;
			case UrdfPackage.INERTIA__IYZ:
				unsetIyz();
				return;
			case UrdfPackage.INERTIA__IZZ:
				unsetIzz();
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
			case UrdfPackage.INERTIA__IXX:
				return isSetIxx();
			case UrdfPackage.INERTIA__IXY:
				return isSetIxy();
			case UrdfPackage.INERTIA__IXZ:
				return isSetIxz();
			case UrdfPackage.INERTIA__IYY:
				return isSetIyy();
			case UrdfPackage.INERTIA__IYZ:
				return isSetIyz();
			case UrdfPackage.INERTIA__IZZ:
				return isSetIzz();
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
		result.append(" (ixx: ");
		if (ixxESet) result.append(ixx); else result.append("<unset>");
		result.append(", ixy: ");
		if (ixyESet) result.append(ixy); else result.append("<unset>");
		result.append(", ixz: ");
		if (ixzESet) result.append(ixz); else result.append("<unset>");
		result.append(", iyy: ");
		if (iyyESet) result.append(iyy); else result.append("<unset>");
		result.append(", iyz: ");
		if (iyzESet) result.append(iyz); else result.append("<unset>");
		result.append(", izz: ");
		if (izzESet) result.append(izz); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //InertiaImpl
