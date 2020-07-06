/**
 */
package org.ros.model.urdf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ros.model.urdf.Color;
import org.ros.model.urdf.UrdfPackage;
import org.ros.model.urdf.Vector4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.impl.ColorImpl#getRgba <em>Rgba</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.ColorImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColorImpl extends MinimalEObjectImpl.Container implements Color {
	/**
	 * The default value of the '{@link #getRgba() <em>Rgba</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRgba()
	 * @generated
	 * @ordered
	 */
	protected static final String RGBA_EDEFAULT = "0 0 0 0";

	/**
	 * The cached value of the '{@link #getRgba() <em>Rgba</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRgba()
	 * @generated
	 * @ordered
	 */
	protected String rgba = RGBA_EDEFAULT;

	/**
	 * This is true if the Rgba attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rgbaESet;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Vector4 color;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UrdfPackage.Literals.COLOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRgba() {
		return rgba;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRgba(String newRgba) {
		String oldRgba = rgba;
		rgba = newRgba;
		boolean oldRgbaESet = rgbaESet;
		rgbaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.COLOR__RGBA, oldRgba, rgba, !oldRgbaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRgba() {
		String oldRgba = rgba;
		boolean oldRgbaESet = rgbaESet;
		rgba = RGBA_EDEFAULT;
		rgbaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.COLOR__RGBA, oldRgba, RGBA_EDEFAULT, oldRgbaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRgba() {
		return rgbaESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector4 getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColor(Vector4 newColor, NotificationChain msgs) {
		Vector4 oldColor = color;
		color = newColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.COLOR__COLOR, oldColor, newColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Vector4 newColor) {
		if (newColor != color) {
			NotificationChain msgs = null;
			if (color != null)
				msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.COLOR__COLOR, null, msgs);
			if (newColor != null)
				msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.COLOR__COLOR, null, msgs);
			msgs = basicSetColor(newColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.COLOR__COLOR, newColor, newColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UrdfPackage.COLOR__COLOR:
				return basicSetColor(null, msgs);
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
			case UrdfPackage.COLOR__RGBA:
				return getRgba();
			case UrdfPackage.COLOR__COLOR:
				return getColor();
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
			case UrdfPackage.COLOR__RGBA:
				setRgba((String)newValue);
				return;
			case UrdfPackage.COLOR__COLOR:
				setColor((Vector4)newValue);
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
			case UrdfPackage.COLOR__RGBA:
				unsetRgba();
				return;
			case UrdfPackage.COLOR__COLOR:
				setColor((Vector4)null);
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
			case UrdfPackage.COLOR__RGBA:
				return isSetRgba();
			case UrdfPackage.COLOR__COLOR:
				return color != null;
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
		result.append(" (rgba: ");
		if (rgbaESet) result.append(rgba); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ColorImpl
