/**
 */
package org.ros.model.urdf.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ros.model.urdf.Mesh;
import org.ros.model.urdf.UrdfPackage;
import org.ros.model.urdf.Vector3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mesh</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.impl.MeshImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.MeshImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.MeshImpl#getScaleVector <em>Scale Vector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeshImpl extends MinimalEObjectImpl.Container implements Mesh {
	/**
	 * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected String filename = FILENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_EDEFAULT = "1 1 1";

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected String scale = SCALE_EDEFAULT;

	/**
	 * This is true if the Scale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scaleESet;

	/**
	 * The cached value of the '{@link #getScaleVector() <em>Scale Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleVector()
	 * @generated
	 * @ordered
	 */
	protected Vector3 scaleVector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeshImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UrdfPackage.Literals.MESH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilename(String newFilename) {
		String oldFilename = filename;
		filename = newFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.MESH__FILENAME, oldFilename, filename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(String newScale) {
		String oldScale = scale;
		scale = newScale;
		boolean oldScaleESet = scaleESet;
		scaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.MESH__SCALE, oldScale, scale, !oldScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScale() {
		String oldScale = scale;
		boolean oldScaleESet = scaleESet;
		scale = SCALE_EDEFAULT;
		scaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UrdfPackage.MESH__SCALE, oldScale, SCALE_EDEFAULT, oldScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScale() {
		return scaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3 getScaleVector() {
		return scaleVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScaleVector(Vector3 newScaleVector, NotificationChain msgs) {
		Vector3 oldScaleVector = scaleVector;
		scaleVector = newScaleVector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.MESH__SCALE_VECTOR, oldScaleVector, newScaleVector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleVector(Vector3 newScaleVector) {
		if (newScaleVector != scaleVector) {
			NotificationChain msgs = null;
			if (scaleVector != null)
				msgs = ((InternalEObject)scaleVector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.MESH__SCALE_VECTOR, null, msgs);
			if (newScaleVector != null)
				msgs = ((InternalEObject)newScaleVector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.MESH__SCALE_VECTOR, null, msgs);
			msgs = basicSetScaleVector(newScaleVector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.MESH__SCALE_VECTOR, newScaleVector, newScaleVector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UrdfPackage.MESH__SCALE_VECTOR:
				return basicSetScaleVector(null, msgs);
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
			case UrdfPackage.MESH__FILENAME:
				return getFilename();
			case UrdfPackage.MESH__SCALE:
				return getScale();
			case UrdfPackage.MESH__SCALE_VECTOR:
				return getScaleVector();
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
			case UrdfPackage.MESH__FILENAME:
				setFilename((String)newValue);
				return;
			case UrdfPackage.MESH__SCALE:
				setScale((String)newValue);
				return;
			case UrdfPackage.MESH__SCALE_VECTOR:
				setScaleVector((Vector3)newValue);
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
			case UrdfPackage.MESH__FILENAME:
				setFilename(FILENAME_EDEFAULT);
				return;
			case UrdfPackage.MESH__SCALE:
				unsetScale();
				return;
			case UrdfPackage.MESH__SCALE_VECTOR:
				setScaleVector((Vector3)null);
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
			case UrdfPackage.MESH__FILENAME:
				return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
			case UrdfPackage.MESH__SCALE:
				return isSetScale();
			case UrdfPackage.MESH__SCALE_VECTOR:
				return scaleVector != null;
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
		result.append(" (filename: ");
		result.append(filename);
		result.append(", scale: ");
		if (scaleESet) result.append(scale); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MeshImpl
