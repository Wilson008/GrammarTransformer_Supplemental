/**
 */
package spectra.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import spectra.SpectraPackage;
import spectra.TypeConstant;
import spectra.ValueInRange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value In Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.ValueInRangeImpl#getConst <em>Const</em>}</li>
 *   <li>{@link spectra.impl.ValueInRangeImpl#getInt <em>Int</em>}</li>
 *   <li>{@link spectra.impl.ValueInRangeImpl#getFrom <em>From</em>}</li>
 *   <li>{@link spectra.impl.ValueInRangeImpl#isMulti <em>Multi</em>}</li>
 *   <li>{@link spectra.impl.ValueInRangeImpl#getTo <em>To</em>}</li>
 *   <li>{@link spectra.impl.ValueInRangeImpl#getBooleanValue <em>Boolean Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueInRangeImpl extends MinimalEObjectImpl.Container implements ValueInRange {
	/**
	 * The cached value of the '{@link #getConst() <em>Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConst()
	 * @generated
	 * @ordered
	 */
	protected TypeConstant const_;

	/**
	 * The default value of the '{@link #getInt() <em>Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt()
	 * @generated
	 * @ordered
	 */
	protected static final int INT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInt() <em>Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt()
	 * @generated
	 * @ordered
	 */
	protected int int_ = INT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final int FROM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected int from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #isMulti() <em>Multi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMulti()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMulti() <em>Multi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMulti()
	 * @generated
	 * @ordered
	 */
	protected boolean multi = MULTI_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final int TO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected int to = TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOLEAN_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected String booleanValue = BOOLEAN_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueInRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.VALUE_IN_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConstant getConst() {
		if (const_ != null && const_.eIsProxy()) {
			InternalEObject oldConst = (InternalEObject)const_;
			const_ = (TypeConstant)eResolveProxy(oldConst);
			if (const_ != oldConst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpectraPackage.VALUE_IN_RANGE__CONST, oldConst, const_));
			}
		}
		return const_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConstant basicGetConst() {
		return const_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConst(TypeConstant newConst) {
		TypeConstant oldConst = const_;
		const_ = newConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.VALUE_IN_RANGE__CONST, oldConst, const_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInt() {
		return int_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInt(int newInt) {
		int oldInt = int_;
		int_ = newInt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.VALUE_IN_RANGE__INT, oldInt, int_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(int newFrom) {
		int oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.VALUE_IN_RANGE__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMulti() {
		return multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMulti(boolean newMulti) {
		boolean oldMulti = multi;
		multi = newMulti;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.VALUE_IN_RANGE__MULTI, oldMulti, multi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(int newTo) {
		int oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.VALUE_IN_RANGE__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBooleanValue() {
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanValue(String newBooleanValue) {
		String oldBooleanValue = booleanValue;
		booleanValue = newBooleanValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.VALUE_IN_RANGE__BOOLEAN_VALUE, oldBooleanValue, booleanValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpectraPackage.VALUE_IN_RANGE__CONST:
				if (resolve) return getConst();
				return basicGetConst();
			case SpectraPackage.VALUE_IN_RANGE__INT:
				return getInt();
			case SpectraPackage.VALUE_IN_RANGE__FROM:
				return getFrom();
			case SpectraPackage.VALUE_IN_RANGE__MULTI:
				return isMulti();
			case SpectraPackage.VALUE_IN_RANGE__TO:
				return getTo();
			case SpectraPackage.VALUE_IN_RANGE__BOOLEAN_VALUE:
				return getBooleanValue();
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
			case SpectraPackage.VALUE_IN_RANGE__CONST:
				setConst((TypeConstant)newValue);
				return;
			case SpectraPackage.VALUE_IN_RANGE__INT:
				setInt((Integer)newValue);
				return;
			case SpectraPackage.VALUE_IN_RANGE__FROM:
				setFrom((Integer)newValue);
				return;
			case SpectraPackage.VALUE_IN_RANGE__MULTI:
				setMulti((Boolean)newValue);
				return;
			case SpectraPackage.VALUE_IN_RANGE__TO:
				setTo((Integer)newValue);
				return;
			case SpectraPackage.VALUE_IN_RANGE__BOOLEAN_VALUE:
				setBooleanValue((String)newValue);
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
			case SpectraPackage.VALUE_IN_RANGE__CONST:
				setConst((TypeConstant)null);
				return;
			case SpectraPackage.VALUE_IN_RANGE__INT:
				setInt(INT_EDEFAULT);
				return;
			case SpectraPackage.VALUE_IN_RANGE__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case SpectraPackage.VALUE_IN_RANGE__MULTI:
				setMulti(MULTI_EDEFAULT);
				return;
			case SpectraPackage.VALUE_IN_RANGE__TO:
				setTo(TO_EDEFAULT);
				return;
			case SpectraPackage.VALUE_IN_RANGE__BOOLEAN_VALUE:
				setBooleanValue(BOOLEAN_VALUE_EDEFAULT);
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
			case SpectraPackage.VALUE_IN_RANGE__CONST:
				return const_ != null;
			case SpectraPackage.VALUE_IN_RANGE__INT:
				return int_ != INT_EDEFAULT;
			case SpectraPackage.VALUE_IN_RANGE__FROM:
				return from != FROM_EDEFAULT;
			case SpectraPackage.VALUE_IN_RANGE__MULTI:
				return multi != MULTI_EDEFAULT;
			case SpectraPackage.VALUE_IN_RANGE__TO:
				return to != TO_EDEFAULT;
			case SpectraPackage.VALUE_IN_RANGE__BOOLEAN_VALUE:
				return BOOLEAN_VALUE_EDEFAULT == null ? booleanValue != null : !BOOLEAN_VALUE_EDEFAULT.equals(booleanValue);
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
		result.append(" (int: ");
		result.append(int_);
		result.append(", from: ");
		result.append(from);
		result.append(", multi: ");
		result.append(multi);
		result.append(", to: ");
		result.append(to);
		result.append(", booleanValue: ");
		result.append(booleanValue);
		result.append(')');
		return result.toString();
	}

} //ValueInRangeImpl
