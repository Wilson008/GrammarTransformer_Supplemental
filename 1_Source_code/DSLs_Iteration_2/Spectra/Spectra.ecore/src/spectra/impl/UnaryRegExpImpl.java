/**
 */
package spectra.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import spectra.DefineDecl;
import spectra.SpectraPackage;
import spectra.UnaryRegExp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Reg Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link spectra.impl.UnaryRegExpImpl#isKleened <em>Kleened</em>}</li>
 *   <li>{@link spectra.impl.UnaryRegExpImpl#isQuestionMark <em>Question Mark</em>}</li>
 *   <li>{@link spectra.impl.UnaryRegExpImpl#isPlus <em>Plus</em>}</li>
 *   <li>{@link spectra.impl.UnaryRegExpImpl#isHaveExactRepetition <em>Have Exact Repetition</em>}</li>
 *   <li>{@link spectra.impl.UnaryRegExpImpl#getExactRepetition <em>Exact Repetition</em>}</li>
 *   <li>{@link spectra.impl.UnaryRegExpImpl#isHaveAtLeast <em>Have At Least</em>}</li>
 *   <li>{@link spectra.impl.UnaryRegExpImpl#getAtLeast <em>At Least</em>}</li>
 *   <li>{@link spectra.impl.UnaryRegExpImpl#isHaveRange <em>Have Range</em>}</li>
 *   <li>{@link spectra.impl.UnaryRegExpImpl#getFrom <em>From</em>}</li>
 *   <li>{@link spectra.impl.UnaryRegExpImpl#getFromDefine <em>From Define</em>}</li>
 *   <li>{@link spectra.impl.UnaryRegExpImpl#getTo <em>To</em>}</li>
 *   <li>{@link spectra.impl.UnaryRegExpImpl#getToDefine <em>To Define</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryRegExpImpl extends RegExpImpl implements UnaryRegExp {
	/**
	 * The default value of the '{@link #isKleened() <em>Kleened</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKleened()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KLEENED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKleened() <em>Kleened</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKleened()
	 * @generated
	 * @ordered
	 */
	protected boolean kleened = KLEENED_EDEFAULT;

	/**
	 * The default value of the '{@link #isQuestionMark() <em>Question Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQuestionMark()
	 * @generated
	 * @ordered
	 */
	protected static final boolean QUESTION_MARK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isQuestionMark() <em>Question Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isQuestionMark()
	 * @generated
	 * @ordered
	 */
	protected boolean questionMark = QUESTION_MARK_EDEFAULT;

	/**
	 * The default value of the '{@link #isPlus() <em>Plus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PLUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPlus() <em>Plus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlus()
	 * @generated
	 * @ordered
	 */
	protected boolean plus = PLUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isHaveExactRepetition() <em>Have Exact Repetition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHaveExactRepetition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAVE_EXACT_REPETITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHaveExactRepetition() <em>Have Exact Repetition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHaveExactRepetition()
	 * @generated
	 * @ordered
	 */
	protected boolean haveExactRepetition = HAVE_EXACT_REPETITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExactRepetition() <em>Exact Repetition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExactRepetition()
	 * @generated
	 * @ordered
	 */
	protected static final int EXACT_REPETITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExactRepetition() <em>Exact Repetition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExactRepetition()
	 * @generated
	 * @ordered
	 */
	protected int exactRepetition = EXACT_REPETITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isHaveAtLeast() <em>Have At Least</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHaveAtLeast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAVE_AT_LEAST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHaveAtLeast() <em>Have At Least</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHaveAtLeast()
	 * @generated
	 * @ordered
	 */
	protected boolean haveAtLeast = HAVE_AT_LEAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getAtLeast() <em>At Least</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtLeast()
	 * @generated
	 * @ordered
	 */
	protected static final int AT_LEAST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAtLeast() <em>At Least</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtLeast()
	 * @generated
	 * @ordered
	 */
	protected int atLeast = AT_LEAST_EDEFAULT;

	/**
	 * The default value of the '{@link #isHaveRange() <em>Have Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHaveRange()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAVE_RANGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHaveRange() <em>Have Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHaveRange()
	 * @generated
	 * @ordered
	 */
	protected boolean haveRange = HAVE_RANGE_EDEFAULT;

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
	 * The cached value of the '{@link #getFromDefine() <em>From Define</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDefine()
	 * @generated
	 * @ordered
	 */
	protected DefineDecl fromDefine;

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
	 * The cached value of the '{@link #getToDefine() <em>To Define</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDefine()
	 * @generated
	 * @ordered
	 */
	protected DefineDecl toDefine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryRegExpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpectraPackage.Literals.UNARY_REG_EXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isKleened() {
		return kleened;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKleened(boolean newKleened) {
		boolean oldKleened = kleened;
		kleened = newKleened;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.UNARY_REG_EXP__KLEENED, oldKleened, kleened));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isQuestionMark() {
		return questionMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionMark(boolean newQuestionMark) {
		boolean oldQuestionMark = questionMark;
		questionMark = newQuestionMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.UNARY_REG_EXP__QUESTION_MARK, oldQuestionMark, questionMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPlus() {
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlus(boolean newPlus) {
		boolean oldPlus = plus;
		plus = newPlus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.UNARY_REG_EXP__PLUS, oldPlus, plus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHaveExactRepetition() {
		return haveExactRepetition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaveExactRepetition(boolean newHaveExactRepetition) {
		boolean oldHaveExactRepetition = haveExactRepetition;
		haveExactRepetition = newHaveExactRepetition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.UNARY_REG_EXP__HAVE_EXACT_REPETITION, oldHaveExactRepetition, haveExactRepetition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExactRepetition() {
		return exactRepetition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExactRepetition(int newExactRepetition) {
		int oldExactRepetition = exactRepetition;
		exactRepetition = newExactRepetition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.UNARY_REG_EXP__EXACT_REPETITION, oldExactRepetition, exactRepetition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHaveAtLeast() {
		return haveAtLeast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaveAtLeast(boolean newHaveAtLeast) {
		boolean oldHaveAtLeast = haveAtLeast;
		haveAtLeast = newHaveAtLeast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.UNARY_REG_EXP__HAVE_AT_LEAST, oldHaveAtLeast, haveAtLeast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAtLeast() {
		return atLeast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtLeast(int newAtLeast) {
		int oldAtLeast = atLeast;
		atLeast = newAtLeast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.UNARY_REG_EXP__AT_LEAST, oldAtLeast, atLeast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHaveRange() {
		return haveRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaveRange(boolean newHaveRange) {
		boolean oldHaveRange = haveRange;
		haveRange = newHaveRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.UNARY_REG_EXP__HAVE_RANGE, oldHaveRange, haveRange));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.UNARY_REG_EXP__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineDecl getFromDefine() {
		if (fromDefine != null && fromDefine.eIsProxy()) {
			InternalEObject oldFromDefine = (InternalEObject)fromDefine;
			fromDefine = (DefineDecl)eResolveProxy(oldFromDefine);
			if (fromDefine != oldFromDefine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpectraPackage.UNARY_REG_EXP__FROM_DEFINE, oldFromDefine, fromDefine));
			}
		}
		return fromDefine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineDecl basicGetFromDefine() {
		return fromDefine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromDefine(DefineDecl newFromDefine) {
		DefineDecl oldFromDefine = fromDefine;
		fromDefine = newFromDefine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.UNARY_REG_EXP__FROM_DEFINE, oldFromDefine, fromDefine));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.UNARY_REG_EXP__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineDecl getToDefine() {
		if (toDefine != null && toDefine.eIsProxy()) {
			InternalEObject oldToDefine = (InternalEObject)toDefine;
			toDefine = (DefineDecl)eResolveProxy(oldToDefine);
			if (toDefine != oldToDefine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpectraPackage.UNARY_REG_EXP__TO_DEFINE, oldToDefine, toDefine));
			}
		}
		return toDefine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineDecl basicGetToDefine() {
		return toDefine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDefine(DefineDecl newToDefine) {
		DefineDecl oldToDefine = toDefine;
		toDefine = newToDefine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpectraPackage.UNARY_REG_EXP__TO_DEFINE, oldToDefine, toDefine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpectraPackage.UNARY_REG_EXP__KLEENED:
				return isKleened();
			case SpectraPackage.UNARY_REG_EXP__QUESTION_MARK:
				return isQuestionMark();
			case SpectraPackage.UNARY_REG_EXP__PLUS:
				return isPlus();
			case SpectraPackage.UNARY_REG_EXP__HAVE_EXACT_REPETITION:
				return isHaveExactRepetition();
			case SpectraPackage.UNARY_REG_EXP__EXACT_REPETITION:
				return getExactRepetition();
			case SpectraPackage.UNARY_REG_EXP__HAVE_AT_LEAST:
				return isHaveAtLeast();
			case SpectraPackage.UNARY_REG_EXP__AT_LEAST:
				return getAtLeast();
			case SpectraPackage.UNARY_REG_EXP__HAVE_RANGE:
				return isHaveRange();
			case SpectraPackage.UNARY_REG_EXP__FROM:
				return getFrom();
			case SpectraPackage.UNARY_REG_EXP__FROM_DEFINE:
				if (resolve) return getFromDefine();
				return basicGetFromDefine();
			case SpectraPackage.UNARY_REG_EXP__TO:
				return getTo();
			case SpectraPackage.UNARY_REG_EXP__TO_DEFINE:
				if (resolve) return getToDefine();
				return basicGetToDefine();
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
			case SpectraPackage.UNARY_REG_EXP__KLEENED:
				setKleened((Boolean)newValue);
				return;
			case SpectraPackage.UNARY_REG_EXP__QUESTION_MARK:
				setQuestionMark((Boolean)newValue);
				return;
			case SpectraPackage.UNARY_REG_EXP__PLUS:
				setPlus((Boolean)newValue);
				return;
			case SpectraPackage.UNARY_REG_EXP__HAVE_EXACT_REPETITION:
				setHaveExactRepetition((Boolean)newValue);
				return;
			case SpectraPackage.UNARY_REG_EXP__EXACT_REPETITION:
				setExactRepetition((Integer)newValue);
				return;
			case SpectraPackage.UNARY_REG_EXP__HAVE_AT_LEAST:
				setHaveAtLeast((Boolean)newValue);
				return;
			case SpectraPackage.UNARY_REG_EXP__AT_LEAST:
				setAtLeast((Integer)newValue);
				return;
			case SpectraPackage.UNARY_REG_EXP__HAVE_RANGE:
				setHaveRange((Boolean)newValue);
				return;
			case SpectraPackage.UNARY_REG_EXP__FROM:
				setFrom((Integer)newValue);
				return;
			case SpectraPackage.UNARY_REG_EXP__FROM_DEFINE:
				setFromDefine((DefineDecl)newValue);
				return;
			case SpectraPackage.UNARY_REG_EXP__TO:
				setTo((Integer)newValue);
				return;
			case SpectraPackage.UNARY_REG_EXP__TO_DEFINE:
				setToDefine((DefineDecl)newValue);
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
			case SpectraPackage.UNARY_REG_EXP__KLEENED:
				setKleened(KLEENED_EDEFAULT);
				return;
			case SpectraPackage.UNARY_REG_EXP__QUESTION_MARK:
				setQuestionMark(QUESTION_MARK_EDEFAULT);
				return;
			case SpectraPackage.UNARY_REG_EXP__PLUS:
				setPlus(PLUS_EDEFAULT);
				return;
			case SpectraPackage.UNARY_REG_EXP__HAVE_EXACT_REPETITION:
				setHaveExactRepetition(HAVE_EXACT_REPETITION_EDEFAULT);
				return;
			case SpectraPackage.UNARY_REG_EXP__EXACT_REPETITION:
				setExactRepetition(EXACT_REPETITION_EDEFAULT);
				return;
			case SpectraPackage.UNARY_REG_EXP__HAVE_AT_LEAST:
				setHaveAtLeast(HAVE_AT_LEAST_EDEFAULT);
				return;
			case SpectraPackage.UNARY_REG_EXP__AT_LEAST:
				setAtLeast(AT_LEAST_EDEFAULT);
				return;
			case SpectraPackage.UNARY_REG_EXP__HAVE_RANGE:
				setHaveRange(HAVE_RANGE_EDEFAULT);
				return;
			case SpectraPackage.UNARY_REG_EXP__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case SpectraPackage.UNARY_REG_EXP__FROM_DEFINE:
				setFromDefine((DefineDecl)null);
				return;
			case SpectraPackage.UNARY_REG_EXP__TO:
				setTo(TO_EDEFAULT);
				return;
			case SpectraPackage.UNARY_REG_EXP__TO_DEFINE:
				setToDefine((DefineDecl)null);
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
			case SpectraPackage.UNARY_REG_EXP__KLEENED:
				return kleened != KLEENED_EDEFAULT;
			case SpectraPackage.UNARY_REG_EXP__QUESTION_MARK:
				return questionMark != QUESTION_MARK_EDEFAULT;
			case SpectraPackage.UNARY_REG_EXP__PLUS:
				return plus != PLUS_EDEFAULT;
			case SpectraPackage.UNARY_REG_EXP__HAVE_EXACT_REPETITION:
				return haveExactRepetition != HAVE_EXACT_REPETITION_EDEFAULT;
			case SpectraPackage.UNARY_REG_EXP__EXACT_REPETITION:
				return exactRepetition != EXACT_REPETITION_EDEFAULT;
			case SpectraPackage.UNARY_REG_EXP__HAVE_AT_LEAST:
				return haveAtLeast != HAVE_AT_LEAST_EDEFAULT;
			case SpectraPackage.UNARY_REG_EXP__AT_LEAST:
				return atLeast != AT_LEAST_EDEFAULT;
			case SpectraPackage.UNARY_REG_EXP__HAVE_RANGE:
				return haveRange != HAVE_RANGE_EDEFAULT;
			case SpectraPackage.UNARY_REG_EXP__FROM:
				return from != FROM_EDEFAULT;
			case SpectraPackage.UNARY_REG_EXP__FROM_DEFINE:
				return fromDefine != null;
			case SpectraPackage.UNARY_REG_EXP__TO:
				return to != TO_EDEFAULT;
			case SpectraPackage.UNARY_REG_EXP__TO_DEFINE:
				return toDefine != null;
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
		result.append(" (kleened: ");
		result.append(kleened);
		result.append(", questionMark: ");
		result.append(questionMark);
		result.append(", plus: ");
		result.append(plus);
		result.append(", haveExactRepetition: ");
		result.append(haveExactRepetition);
		result.append(", exactRepetition: ");
		result.append(exactRepetition);
		result.append(", haveAtLeast: ");
		result.append(haveAtLeast);
		result.append(", atLeast: ");
		result.append(atLeast);
		result.append(", haveRange: ");
		result.append(haveRange);
		result.append(", from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(')');
		return result.toString();
	}

} //UnaryRegExpImpl