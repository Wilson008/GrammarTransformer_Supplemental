/**
 */
package spectra.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spectra.DefineArray;
import spectra.SpectraPackage;
import spectra.TemporalExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Define Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.DefineArrayImpl#getSimpleExprs <em>Simple Exprs</em>}</li>
 *   <li>{@link spectra.impl.DefineArrayImpl#getInnerArrays <em>Inner Arrays</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefineArrayImpl extends MinimalEObjectImpl.Container implements DefineArray {
	/**
	 * The cached value of the '{@link #getSimpleExprs() <em>Simple Exprs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleExprs()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalExpression> simpleExprs;

	/**
	 * The cached value of the '{@link #getInnerArrays() <em>Inner Arrays</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerArrays()
	 * @generated
	 * @ordered
	 */
	protected EList<DefineArray> innerArrays;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefineArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.DEFINE_ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemporalExpression> getSimpleExprs() {
		if (simpleExprs == null) {
			simpleExprs = new EObjectContainmentEList<TemporalExpression>(TemporalExpression.class, this, SpectraPackage.DEFINE_ARRAY__SIMPLE_EXPRS);
		}
		return simpleExprs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefineArray> getInnerArrays() {
		if (innerArrays == null) {
			innerArrays = new EObjectContainmentEList<DefineArray>(DefineArray.class, this, SpectraPackage.DEFINE_ARRAY__INNER_ARRAYS);
		}
		return innerArrays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpectraPackage.DEFINE_ARRAY__SIMPLE_EXPRS:
				return ((InternalEList<?>)getSimpleExprs()).basicRemove(otherEnd, msgs);
			case SpectraPackage.DEFINE_ARRAY__INNER_ARRAYS:
				return ((InternalEList<?>)getInnerArrays()).basicRemove(otherEnd, msgs);
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
			case SpectraPackage.DEFINE_ARRAY__SIMPLE_EXPRS:
				return getSimpleExprs();
			case SpectraPackage.DEFINE_ARRAY__INNER_ARRAYS:
				return getInnerArrays();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpectraPackage.DEFINE_ARRAY__SIMPLE_EXPRS:
				getSimpleExprs().clear();
				getSimpleExprs().addAll((Collection<? extends TemporalExpression>)newValue);
				return;
			case SpectraPackage.DEFINE_ARRAY__INNER_ARRAYS:
				getInnerArrays().clear();
				getInnerArrays().addAll((Collection<? extends DefineArray>)newValue);
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
			case SpectraPackage.DEFINE_ARRAY__SIMPLE_EXPRS:
				getSimpleExprs().clear();
				return;
			case SpectraPackage.DEFINE_ARRAY__INNER_ARRAYS:
				getInnerArrays().clear();
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
			case SpectraPackage.DEFINE_ARRAY__SIMPLE_EXPRS:
				return simpleExprs != null && !simpleExprs.isEmpty();
			case SpectraPackage.DEFINE_ARRAY__INNER_ARRAYS:
				return innerArrays != null && !innerArrays.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DefineArrayImpl
