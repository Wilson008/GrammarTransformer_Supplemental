/**
 */
package QVTOperational.impl;

import QVTOperational.ImperativeCallExp;
import QVTOperational.QVTOperationalPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imperative Call Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.impl.ImperativeCallExpImpl#getIsVirtual <em>Is Virtual</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImperativeCallExpImpl extends ExpressionGOImpl implements ImperativeCallExp {
	/**
	 * The default value of the '{@link #getIsVirtual() <em>Is Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsVirtual()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_VIRTUAL_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIsVirtual() <em>Is Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsVirtual()
	 * @generated
	 * @ordered
	 */
	protected Boolean isVirtual = IS_VIRTUAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImperativeCallExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalPackage.Literals.IMPERATIVE_CALL_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsVirtual() {
		return isVirtual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVirtual(Boolean newIsVirtual) {
		Boolean oldIsVirtual = isVirtual;
		isVirtual = newIsVirtual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalPackage.IMPERATIVE_CALL_EXP__IS_VIRTUAL, oldIsVirtual, isVirtual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QVTOperationalPackage.IMPERATIVE_CALL_EXP__IS_VIRTUAL:
				return getIsVirtual();
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
			case QVTOperationalPackage.IMPERATIVE_CALL_EXP__IS_VIRTUAL:
				setIsVirtual((Boolean)newValue);
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
			case QVTOperationalPackage.IMPERATIVE_CALL_EXP__IS_VIRTUAL:
				setIsVirtual(IS_VIRTUAL_EDEFAULT);
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
			case QVTOperationalPackage.IMPERATIVE_CALL_EXP__IS_VIRTUAL:
				return IS_VIRTUAL_EDEFAULT == null ? isVirtual != null : !IS_VIRTUAL_EDEFAULT.equals(isVirtual);
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
		result.append(" (isVirtual: ");
		result.append(isVirtual);
		result.append(')');
		return result.toString();
	}

} //ImperativeCallExpImpl
