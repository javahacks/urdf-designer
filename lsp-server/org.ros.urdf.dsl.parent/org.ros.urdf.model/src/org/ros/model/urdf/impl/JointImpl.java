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
import org.ros.model.urdf.Calibration;
import org.ros.model.urdf.Child;
import org.ros.model.urdf.Dynamics;
import org.ros.model.urdf.Joint;
import org.ros.model.urdf.Limit;
import org.ros.model.urdf.Mimic;
import org.ros.model.urdf.Parent;
import org.ros.model.urdf.Pose;
import org.ros.model.urdf.SafetyController;
import org.ros.model.urdf.UrdfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.impl.JointImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.JointImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.JointImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.JointImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.JointImpl#getCalibration <em>Calibration</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.JointImpl#getDynamics <em>Dynamics</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.JointImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.JointImpl#getSafetyController <em>Safety Controller</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.JointImpl#getMimic <em>Mimic</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.JointImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.JointImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JointImpl extends MinimalEObjectImpl.Container implements Joint {
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
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Parent parent;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected Child child;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected Axis axis;

	/**
	 * The cached value of the '{@link #getCalibration() <em>Calibration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibration()
	 * @generated
	 * @ordered
	 */
	protected Calibration calibration;

	/**
	 * The cached value of the '{@link #getDynamics() <em>Dynamics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamics()
	 * @generated
	 * @ordered
	 */
	protected Dynamics dynamics;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected Limit limit;

	/**
	 * The cached value of the '{@link #getSafetyController() <em>Safety Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyController()
	 * @generated
	 * @ordered
	 */
	protected SafetyController safetyController;

	/**
	 * The cached value of the '{@link #getMimic() <em>Mimic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimic()
	 * @generated
	 * @ordered
	 */
	protected Mimic mimic;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UrdfPackage.Literals.JOINT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.JOINT__ORIGIN, oldOrigin, newOrigin);
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
				msgs = ((InternalEObject)origin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.JOINT__ORIGIN, null, msgs);
			if (newOrigin != null)
				msgs = ((InternalEObject)newOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.JOINT__ORIGIN, null, msgs);
			msgs = basicSetOrigin(newOrigin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.JOINT__ORIGIN, newOrigin, newOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parent getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Parent newParent, NotificationChain msgs) {
		Parent oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.JOINT__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Parent newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.JOINT__PARENT, null, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.JOINT__PARENT, null, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.JOINT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Child getChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChild(Child newChild, NotificationChain msgs) {
		Child oldChild = child;
		child = newChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.JOINT__CHILD, oldChild, newChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(Child newChild) {
		if (newChild != child) {
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.JOINT__CHILD, null, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.JOINT__CHILD, null, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.JOINT__CHILD, newChild, newChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis getAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxis(Axis newAxis, NotificationChain msgs) {
		Axis oldAxis = axis;
		axis = newAxis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.JOINT__AXIS, oldAxis, newAxis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(Axis newAxis) {
		if (newAxis != axis) {
			NotificationChain msgs = null;
			if (axis != null)
				msgs = ((InternalEObject)axis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.JOINT__AXIS, null, msgs);
			if (newAxis != null)
				msgs = ((InternalEObject)newAxis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.JOINT__AXIS, null, msgs);
			msgs = basicSetAxis(newAxis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.JOINT__AXIS, newAxis, newAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calibration getCalibration() {
		return calibration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalibration(Calibration newCalibration, NotificationChain msgs) {
		Calibration oldCalibration = calibration;
		calibration = newCalibration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.JOINT__CALIBRATION, oldCalibration, newCalibration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalibration(Calibration newCalibration) {
		if (newCalibration != calibration) {
			NotificationChain msgs = null;
			if (calibration != null)
				msgs = ((InternalEObject)calibration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.JOINT__CALIBRATION, null, msgs);
			if (newCalibration != null)
				msgs = ((InternalEObject)newCalibration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.JOINT__CALIBRATION, null, msgs);
			msgs = basicSetCalibration(newCalibration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.JOINT__CALIBRATION, newCalibration, newCalibration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dynamics getDynamics() {
		return dynamics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamics(Dynamics newDynamics, NotificationChain msgs) {
		Dynamics oldDynamics = dynamics;
		dynamics = newDynamics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.JOINT__DYNAMICS, oldDynamics, newDynamics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamics(Dynamics newDynamics) {
		if (newDynamics != dynamics) {
			NotificationChain msgs = null;
			if (dynamics != null)
				msgs = ((InternalEObject)dynamics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.JOINT__DYNAMICS, null, msgs);
			if (newDynamics != null)
				msgs = ((InternalEObject)newDynamics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.JOINT__DYNAMICS, null, msgs);
			msgs = basicSetDynamics(newDynamics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.JOINT__DYNAMICS, newDynamics, newDynamics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Limit getLimit() {
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimit(Limit newLimit, NotificationChain msgs) {
		Limit oldLimit = limit;
		limit = newLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.JOINT__LIMIT, oldLimit, newLimit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimit(Limit newLimit) {
		if (newLimit != limit) {
			NotificationChain msgs = null;
			if (limit != null)
				msgs = ((InternalEObject)limit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.JOINT__LIMIT, null, msgs);
			if (newLimit != null)
				msgs = ((InternalEObject)newLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.JOINT__LIMIT, null, msgs);
			msgs = basicSetLimit(newLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.JOINT__LIMIT, newLimit, newLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyController getSafetyController() {
		return safetyController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSafetyController(SafetyController newSafetyController, NotificationChain msgs) {
		SafetyController oldSafetyController = safetyController;
		safetyController = newSafetyController;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.JOINT__SAFETY_CONTROLLER, oldSafetyController, newSafetyController);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafetyController(SafetyController newSafetyController) {
		if (newSafetyController != safetyController) {
			NotificationChain msgs = null;
			if (safetyController != null)
				msgs = ((InternalEObject)safetyController).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.JOINT__SAFETY_CONTROLLER, null, msgs);
			if (newSafetyController != null)
				msgs = ((InternalEObject)newSafetyController).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.JOINT__SAFETY_CONTROLLER, null, msgs);
			msgs = basicSetSafetyController(newSafetyController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.JOINT__SAFETY_CONTROLLER, newSafetyController, newSafetyController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mimic getMimic() {
		return mimic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMimic(Mimic newMimic, NotificationChain msgs) {
		Mimic oldMimic = mimic;
		mimic = newMimic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.JOINT__MIMIC, oldMimic, newMimic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimic(Mimic newMimic) {
		if (newMimic != mimic) {
			NotificationChain msgs = null;
			if (mimic != null)
				msgs = ((InternalEObject)mimic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.JOINT__MIMIC, null, msgs);
			if (newMimic != null)
				msgs = ((InternalEObject)newMimic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.JOINT__MIMIC, null, msgs);
			msgs = basicSetMimic(newMimic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.JOINT__MIMIC, newMimic, newMimic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.JOINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.JOINT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UrdfPackage.JOINT__ORIGIN:
				return basicSetOrigin(null, msgs);
			case UrdfPackage.JOINT__PARENT:
				return basicSetParent(null, msgs);
			case UrdfPackage.JOINT__CHILD:
				return basicSetChild(null, msgs);
			case UrdfPackage.JOINT__AXIS:
				return basicSetAxis(null, msgs);
			case UrdfPackage.JOINT__CALIBRATION:
				return basicSetCalibration(null, msgs);
			case UrdfPackage.JOINT__DYNAMICS:
				return basicSetDynamics(null, msgs);
			case UrdfPackage.JOINT__LIMIT:
				return basicSetLimit(null, msgs);
			case UrdfPackage.JOINT__SAFETY_CONTROLLER:
				return basicSetSafetyController(null, msgs);
			case UrdfPackage.JOINT__MIMIC:
				return basicSetMimic(null, msgs);
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
			case UrdfPackage.JOINT__ORIGIN:
				return getOrigin();
			case UrdfPackage.JOINT__PARENT:
				return getParent();
			case UrdfPackage.JOINT__CHILD:
				return getChild();
			case UrdfPackage.JOINT__AXIS:
				return getAxis();
			case UrdfPackage.JOINT__CALIBRATION:
				return getCalibration();
			case UrdfPackage.JOINT__DYNAMICS:
				return getDynamics();
			case UrdfPackage.JOINT__LIMIT:
				return getLimit();
			case UrdfPackage.JOINT__SAFETY_CONTROLLER:
				return getSafetyController();
			case UrdfPackage.JOINT__MIMIC:
				return getMimic();
			case UrdfPackage.JOINT__NAME:
				return getName();
			case UrdfPackage.JOINT__TYPE:
				return getType();
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
			case UrdfPackage.JOINT__ORIGIN:
				setOrigin((Pose)newValue);
				return;
			case UrdfPackage.JOINT__PARENT:
				setParent((Parent)newValue);
				return;
			case UrdfPackage.JOINT__CHILD:
				setChild((Child)newValue);
				return;
			case UrdfPackage.JOINT__AXIS:
				setAxis((Axis)newValue);
				return;
			case UrdfPackage.JOINT__CALIBRATION:
				setCalibration((Calibration)newValue);
				return;
			case UrdfPackage.JOINT__DYNAMICS:
				setDynamics((Dynamics)newValue);
				return;
			case UrdfPackage.JOINT__LIMIT:
				setLimit((Limit)newValue);
				return;
			case UrdfPackage.JOINT__SAFETY_CONTROLLER:
				setSafetyController((SafetyController)newValue);
				return;
			case UrdfPackage.JOINT__MIMIC:
				setMimic((Mimic)newValue);
				return;
			case UrdfPackage.JOINT__NAME:
				setName((String)newValue);
				return;
			case UrdfPackage.JOINT__TYPE:
				setType((String)newValue);
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
			case UrdfPackage.JOINT__ORIGIN:
				setOrigin((Pose)null);
				return;
			case UrdfPackage.JOINT__PARENT:
				setParent((Parent)null);
				return;
			case UrdfPackage.JOINT__CHILD:
				setChild((Child)null);
				return;
			case UrdfPackage.JOINT__AXIS:
				setAxis((Axis)null);
				return;
			case UrdfPackage.JOINT__CALIBRATION:
				setCalibration((Calibration)null);
				return;
			case UrdfPackage.JOINT__DYNAMICS:
				setDynamics((Dynamics)null);
				return;
			case UrdfPackage.JOINT__LIMIT:
				setLimit((Limit)null);
				return;
			case UrdfPackage.JOINT__SAFETY_CONTROLLER:
				setSafetyController((SafetyController)null);
				return;
			case UrdfPackage.JOINT__MIMIC:
				setMimic((Mimic)null);
				return;
			case UrdfPackage.JOINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UrdfPackage.JOINT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case UrdfPackage.JOINT__ORIGIN:
				return origin != null;
			case UrdfPackage.JOINT__PARENT:
				return parent != null;
			case UrdfPackage.JOINT__CHILD:
				return child != null;
			case UrdfPackage.JOINT__AXIS:
				return axis != null;
			case UrdfPackage.JOINT__CALIBRATION:
				return calibration != null;
			case UrdfPackage.JOINT__DYNAMICS:
				return dynamics != null;
			case UrdfPackage.JOINT__LIMIT:
				return limit != null;
			case UrdfPackage.JOINT__SAFETY_CONTROLLER:
				return safetyController != null;
			case UrdfPackage.JOINT__MIMIC:
				return mimic != null;
			case UrdfPackage.JOINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UrdfPackage.JOINT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //JointImpl
