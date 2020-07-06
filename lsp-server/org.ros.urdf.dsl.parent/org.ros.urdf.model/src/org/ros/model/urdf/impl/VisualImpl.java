/**
 */
package org.ros.model.urdf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ros.model.urdf.Geometry;
import org.ros.model.urdf.Material;
import org.ros.model.urdf.Pose;
import org.ros.model.urdf.UrdfPackage;
import org.ros.model.urdf.Visual;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.impl.VisualImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.VisualImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.VisualImpl#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualImpl extends MinimalEObjectImpl.Container implements Visual {
	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Pose origin;

	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected Geometry geometry;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected Material material;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UrdfPackage.Literals.VISUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pose getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrigin(Pose newOrigin, NotificationChain msgs) {
		Pose oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.VISUAL__ORIGIN, oldOrigin, newOrigin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(Pose newOrigin) {
		if (newOrigin != origin) {
			NotificationChain msgs = null;
			if (origin != null)
				msgs = ((InternalEObject)origin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.VISUAL__ORIGIN, null, msgs);
			if (newOrigin != null)
				msgs = ((InternalEObject)newOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.VISUAL__ORIGIN, null, msgs);
			msgs = basicSetOrigin(newOrigin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.VISUAL__ORIGIN, newOrigin, newOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry getGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometry(Geometry newGeometry, NotificationChain msgs) {
		Geometry oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.VISUAL__GEOMETRY, oldGeometry, newGeometry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometry(Geometry newGeometry) {
		if (newGeometry != geometry) {
			NotificationChain msgs = null;
			if (geometry != null)
				msgs = ((InternalEObject)geometry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.VISUAL__GEOMETRY, null, msgs);
			if (newGeometry != null)
				msgs = ((InternalEObject)newGeometry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.VISUAL__GEOMETRY, null, msgs);
			msgs = basicSetGeometry(newGeometry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.VISUAL__GEOMETRY, newGeometry, newGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Material getMaterial() {
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterial(Material newMaterial, NotificationChain msgs) {
		Material oldMaterial = material;
		material = newMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.VISUAL__MATERIAL, oldMaterial, newMaterial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterial(Material newMaterial) {
		if (newMaterial != material) {
			NotificationChain msgs = null;
			if (material != null)
				msgs = ((InternalEObject)material).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.VISUAL__MATERIAL, null, msgs);
			if (newMaterial != null)
				msgs = ((InternalEObject)newMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.VISUAL__MATERIAL, null, msgs);
			msgs = basicSetMaterial(newMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.VISUAL__MATERIAL, newMaterial, newMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UrdfPackage.VISUAL__ORIGIN:
				return basicSetOrigin(null, msgs);
			case UrdfPackage.VISUAL__GEOMETRY:
				return basicSetGeometry(null, msgs);
			case UrdfPackage.VISUAL__MATERIAL:
				return basicSetMaterial(null, msgs);
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
			case UrdfPackage.VISUAL__ORIGIN:
				return getOrigin();
			case UrdfPackage.VISUAL__GEOMETRY:
				return getGeometry();
			case UrdfPackage.VISUAL__MATERIAL:
				return getMaterial();
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
			case UrdfPackage.VISUAL__ORIGIN:
				setOrigin((Pose)newValue);
				return;
			case UrdfPackage.VISUAL__GEOMETRY:
				setGeometry((Geometry)newValue);
				return;
			case UrdfPackage.VISUAL__MATERIAL:
				setMaterial((Material)newValue);
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
			case UrdfPackage.VISUAL__ORIGIN:
				setOrigin((Pose)null);
				return;
			case UrdfPackage.VISUAL__GEOMETRY:
				setGeometry((Geometry)null);
				return;
			case UrdfPackage.VISUAL__MATERIAL:
				setMaterial((Material)null);
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
			case UrdfPackage.VISUAL__ORIGIN:
				return origin != null;
			case UrdfPackage.VISUAL__GEOMETRY:
				return geometry != null;
			case UrdfPackage.VISUAL__MATERIAL:
				return material != null;
		}
		return super.eIsSet(featureID);
	}

} //VisualImpl
