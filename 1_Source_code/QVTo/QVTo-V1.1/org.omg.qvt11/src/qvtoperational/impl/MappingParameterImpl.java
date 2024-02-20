/**
 */
package qvtoperational.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qvtoperational.ExpressionGO;
import qvtoperational.MappingParameter;
import qvtoperational.ModelParameter;
import qvtoperational.QvtoperationalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.MappingParameterImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link qvtoperational.impl.MappingParameterImpl#getReferredDomain <em>Referred Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingParameterImpl extends VarParameterImpl implements MappingParameter {
	/**
	 * The cached value of the '{@link #getExtent() <em>Extent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected ModelParameter extent;

	/**
	 * The cached value of the '{@link #getReferredDomain() <em>Referred Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredDomain()
	 * @generated
	 * @ordered
	 */
	protected ExpressionGO referredDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.MAPPING_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelParameter getExtent() {
		if (extent != null && extent.eIsProxy()) {
			InternalEObject oldExtent = (InternalEObject)extent;
			extent = (ModelParameter)eResolveProxy(oldExtent);
			if (extent != oldExtent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.MAPPING_PARAMETER__EXTENT, oldExtent, extent));
			}
		}
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelParameter basicGetExtent() {
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtent(ModelParameter newExtent) {
		ModelParameter oldExtent = extent;
		extent = newExtent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_PARAMETER__EXTENT, oldExtent, extent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionGO getReferredDomain() {
		if (referredDomain != null && referredDomain.eIsProxy()) {
			InternalEObject oldReferredDomain = (InternalEObject)referredDomain;
			referredDomain = (ExpressionGO)eResolveProxy(oldReferredDomain);
			if (referredDomain != oldReferredDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.MAPPING_PARAMETER__REFERRED_DOMAIN, oldReferredDomain, referredDomain));
			}
		}
		return referredDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionGO basicGetReferredDomain() {
		return referredDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferredDomain(ExpressionGO newReferredDomain) {
		ExpressionGO oldReferredDomain = referredDomain;
		referredDomain = newReferredDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.MAPPING_PARAMETER__REFERRED_DOMAIN, oldReferredDomain, referredDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QvtoperationalPackage.MAPPING_PARAMETER__EXTENT:
				if (resolve) return getExtent();
				return basicGetExtent();
			case QvtoperationalPackage.MAPPING_PARAMETER__REFERRED_DOMAIN:
				if (resolve) return getReferredDomain();
				return basicGetReferredDomain();
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
			case QvtoperationalPackage.MAPPING_PARAMETER__EXTENT:
				setExtent((ModelParameter)newValue);
				return;
			case QvtoperationalPackage.MAPPING_PARAMETER__REFERRED_DOMAIN:
				setReferredDomain((ExpressionGO)newValue);
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
			case QvtoperationalPackage.MAPPING_PARAMETER__EXTENT:
				setExtent((ModelParameter)null);
				return;
			case QvtoperationalPackage.MAPPING_PARAMETER__REFERRED_DOMAIN:
				setReferredDomain((ExpressionGO)null);
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
			case QvtoperationalPackage.MAPPING_PARAMETER__EXTENT:
				return extent != null;
			case QvtoperationalPackage.MAPPING_PARAMETER__REFERRED_DOMAIN:
				return referredDomain != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingParameterImpl
