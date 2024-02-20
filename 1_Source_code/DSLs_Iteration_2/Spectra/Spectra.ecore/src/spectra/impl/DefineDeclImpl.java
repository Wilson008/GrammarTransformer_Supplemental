/**
 */
package spectra.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import spectra.DefineArray;
import spectra.DefineDecl;
import spectra.SizeDefineDecl;
import spectra.SpectraPackage;
import spectra.TemporalExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Define Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.DefineDeclImpl#getSimpleExpr <em>Simple Expr</em>}</li>
 *   <li>{@link spectra.impl.DefineDeclImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link spectra.impl.DefineDeclImpl#getInnerArray <em>Inner Array</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefineDeclImpl extends ReferrableImpl implements DefineDecl {
	/**
	 * The cached value of the '{@link #getSimpleExpr() <em>Simple Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleExpr()
	 * @generated
	 * @ordered
	 */
	protected TemporalExpression simpleExpr;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList<SizeDefineDecl> dimensions;

	/**
	 * The cached value of the '{@link #getInnerArray() <em>Inner Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerArray()
	 * @generated
	 * @ordered
	 */
	protected DefineArray innerArray;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefineDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.DEFINE_DECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalExpression getSimpleExpr() {
		return simpleExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleExpr(TemporalExpression newSimpleExpr, NotificationChain msgs) {
		TemporalExpression oldSimpleExpr = simpleExpr;
		simpleExpr = newSimpleExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.DEFINE_DECL__SIMPLE_EXPR, oldSimpleExpr, newSimpleExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleExpr(TemporalExpression newSimpleExpr) {
		if (newSimpleExpr != simpleExpr) {
			NotificationChain msgs = null;
			if (simpleExpr != null)
				msgs = ((InternalEObject)simpleExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.DEFINE_DECL__SIMPLE_EXPR, null, msgs);
			if (newSimpleExpr != null)
				msgs = ((InternalEObject)newSimpleExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.DEFINE_DECL__SIMPLE_EXPR, null, msgs);
			msgs = basicSetSimpleExpr(newSimpleExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.DEFINE_DECL__SIMPLE_EXPR, newSimpleExpr, newSimpleExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SizeDefineDecl> getDimensions() {
		if (dimensions == null) {
			dimensions = new EObjectContainmentEList<SizeDefineDecl>(SizeDefineDecl.class, this, SpectraPackage.DEFINE_DECL__DIMENSIONS);
		}
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineArray getInnerArray() {
		return innerArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerArray(DefineArray newInnerArray, NotificationChain msgs) {
		DefineArray oldInnerArray = innerArray;
		innerArray = newInnerArray;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpectraPackage.DEFINE_DECL__INNER_ARRAY, oldInnerArray, newInnerArray);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerArray(DefineArray newInnerArray) {
		if (newInnerArray != innerArray) {
			NotificationChain msgs = null;
			if (innerArray != null)
				msgs = ((InternalEObject)innerArray).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.DEFINE_DECL__INNER_ARRAY, null, msgs);
			if (newInnerArray != null)
				msgs = ((InternalEObject)newInnerArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpectraPackage.DEFINE_DECL__INNER_ARRAY, null, msgs);
			msgs = basicSetInnerArray(newInnerArray, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.DEFINE_DECL__INNER_ARRAY, newInnerArray, newInnerArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpectraPackage.DEFINE_DECL__SIMPLE_EXPR:
				return basicSetSimpleExpr(null, msgs);
			case SpectraPackage.DEFINE_DECL__DIMENSIONS:
				return ((InternalEList<?>)getDimensions()).basicRemove(otherEnd, msgs);
			case SpectraPackage.DEFINE_DECL__INNER_ARRAY:
				return basicSetInnerArray(null, msgs);
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
			case SpectraPackage.DEFINE_DECL__SIMPLE_EXPR:
				return getSimpleExpr();
			case SpectraPackage.DEFINE_DECL__DIMENSIONS:
				return getDimensions();
			case SpectraPackage.DEFINE_DECL__INNER_ARRAY:
				return getInnerArray();
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
			case SpectraPackage.DEFINE_DECL__SIMPLE_EXPR:
				setSimpleExpr((TemporalExpression)newValue);
				return;
			case SpectraPackage.DEFINE_DECL__DIMENSIONS:
				getDimensions().clear();
				getDimensions().addAll((Collection<? extends SizeDefineDecl>)newValue);
				return;
			case SpectraPackage.DEFINE_DECL__INNER_ARRAY:
				setInnerArray((DefineArray)newValue);
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
			case SpectraPackage.DEFINE_DECL__SIMPLE_EXPR:
				setSimpleExpr((TemporalExpression)null);
				return;
			case SpectraPackage.DEFINE_DECL__DIMENSIONS:
				getDimensions().clear();
				return;
			case SpectraPackage.DEFINE_DECL__INNER_ARRAY:
				setInnerArray((DefineArray)null);
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
			case SpectraPackage.DEFINE_DECL__SIMPLE_EXPR:
				return simpleExpr != null;
			case SpectraPackage.DEFINE_DECL__DIMENSIONS:
				return dimensions != null && !dimensions.isEmpty();
			case SpectraPackage.DEFINE_DECL__INNER_ARRAY:
				return innerArray != null;
		}
		return super.eIsSet(featureID);
	}

} //DefineDeclImpl