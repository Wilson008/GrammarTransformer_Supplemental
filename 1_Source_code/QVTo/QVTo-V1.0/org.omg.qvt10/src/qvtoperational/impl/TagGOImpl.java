/**
 */
package qvtoperational.impl;

import emof.EmofPackage;
import emof.MultiplicityElement;
import emof.Operation;
import emof.Parameter;
import emof.Type;
import emof.TypedElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import qvtoperational.ExpressionGO;
import qvtoperational.ImperativeOperation;
import qvtoperational.OperationBody;
import qvtoperational.QvtoperationalPackage;
import qvtoperational.ScopedIdentifier;
import qvtoperational.TagGO;
import qvtoperational.VarParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag GO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qvtoperational.impl.TagGOImpl#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link qvtoperational.impl.TagGOImpl#getIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link qvtoperational.impl.TagGOImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link qvtoperational.impl.TagGOImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link qvtoperational.impl.TagGOImpl#getType <em>Type</em>}</li>
 *   <li>{@link qvtoperational.impl.TagGOImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link qvtoperational.impl.TagGOImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link qvtoperational.impl.TagGOImpl#getRaisedException <em>Raised Exception</em>}</li>
 *   <li>{@link qvtoperational.impl.TagGOImpl#getContext <em>Context</em>}</li>
 *   <li>{@link qvtoperational.impl.TagGOImpl#getResult <em>Result</em>}</li>
 *   <li>{@link qvtoperational.impl.TagGOImpl#getOverridden <em>Overridden</em>}</li>
 *   <li>{@link qvtoperational.impl.TagGOImpl#getBody <em>Body</em>}</li>
 *   <li>{@link qvtoperational.impl.TagGOImpl#getTagid <em>Tagid</em>}</li>
 *   <li>{@link qvtoperational.impl.TagGOImpl#getScoped_identifier <em>Scoped identifier</em>}</li>
 *   <li>{@link qvtoperational.impl.TagGOImpl#getTagvalue <em>Tagvalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagGOImpl extends ModuleImpl implements TagGO {
	/**
	 * The default value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ORDERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected Boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_UNIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected Boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected Integer lower = LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPPER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected Integer upper = UPPER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> ownedParameter;

	/**
	 * The cached value of the '{@link #getRaisedException() <em>Raised Exception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaisedException()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> raisedException;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected VarParameter context;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EList<VarParameter> result;

	/**
	 * The cached value of the '{@link #getOverridden() <em>Overridden</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverridden()
	 * @generated
	 * @ordered
	 */
	protected ImperativeOperation overridden;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected OperationBody body;

	/**
	 * The default value of the '{@link #getTagid() <em>Tagid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagid()
	 * @generated
	 * @ordered
	 */
	protected static final String TAGID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTagid() <em>Tagid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagid()
	 * @generated
	 * @ordered
	 */
	protected String tagid = TAGID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScoped_identifier() <em>Scoped identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScoped_identifier()
	 * @generated
	 * @ordered
	 */
	protected ScopedIdentifier scoped_identifier;

	/**
	 * The cached value of the '{@link #getTagvalue() <em>Tagvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagvalue()
	 * @generated
	 * @ordered
	 */
	protected ExpressionGO tagvalue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagGOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalPackage.Literals.TAG_GO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(Boolean newIsOrdered) {
		Boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TAG_GO__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(Boolean newIsUnique) {
		Boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TAG_GO__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(Integer newLower) {
		Integer oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TAG_GO__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(Integer newUpper) {
		Integer oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TAG_GO__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.TAG_GO__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TAG_GO__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public emof.Class getClass_() {
		if (eContainerFeatureID() != QvtoperationalPackage.TAG_GO__CLASS) return null;
		return (emof.Class)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(emof.Class newClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClass, QvtoperationalPackage.TAG_GO__CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(emof.Class newClass) {
		if (newClass != eInternalContainer() || (eContainerFeatureID() != QvtoperationalPackage.TAG_GO__CLASS && newClass != null)) {
			if (EcoreUtil.isAncestor(this, newClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EmofPackage.CLASS__OWNED_OPERATION, emof.Class.class, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TAG_GO__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, QvtoperationalPackage.TAG_GO__OWNED_PARAMETER, EmofPackage.PARAMETER__OPERATION);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getRaisedException() {
		if (raisedException == null) {
			raisedException = new EObjectResolvingEList<Type>(Type.class, this, QvtoperationalPackage.TAG_GO__RAISED_EXCEPTION);
		}
		return raisedException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarParameter getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(VarParameter newContext, NotificationChain msgs) {
		VarParameter oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TAG_GO__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(VarParameter newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.TAG_GO__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.TAG_GO__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TAG_GO__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VarParameter> getResult() {
		if (result == null) {
			result = new EObjectContainmentWithInverseEList<VarParameter>(VarParameter.class, this, QvtoperationalPackage.TAG_GO__RESULT, QvtoperationalPackage.VAR_PARAMETER__RES_OWNER);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeOperation getOverridden() {
		if (overridden != null && overridden.eIsProxy()) {
			InternalEObject oldOverridden = (InternalEObject)overridden;
			overridden = (ImperativeOperation)eResolveProxy(oldOverridden);
			if (overridden != oldOverridden) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QvtoperationalPackage.TAG_GO__OVERRIDDEN, oldOverridden, overridden));
			}
		}
		return overridden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeOperation basicGetOverridden() {
		return overridden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverridden(ImperativeOperation newOverridden) {
		ImperativeOperation oldOverridden = overridden;
		overridden = newOverridden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TAG_GO__OVERRIDDEN, oldOverridden, overridden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationBody getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(OperationBody newBody, NotificationChain msgs) {
		OperationBody oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TAG_GO__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(OperationBody newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, QvtoperationalPackage.OPERATION_BODY__OPERATION, OperationBody.class, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, QvtoperationalPackage.OPERATION_BODY__OPERATION, OperationBody.class, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TAG_GO__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTagid() {
		return tagid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTagid(String newTagid) {
		String oldTagid = tagid;
		tagid = newTagid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TAG_GO__TAGID, oldTagid, tagid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopedIdentifier getScoped_identifier() {
		return scoped_identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScoped_identifier(ScopedIdentifier newScoped_identifier, NotificationChain msgs) {
		ScopedIdentifier oldScoped_identifier = scoped_identifier;
		scoped_identifier = newScoped_identifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TAG_GO__SCOPED_IDENTIFIER, oldScoped_identifier, newScoped_identifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScoped_identifier(ScopedIdentifier newScoped_identifier) {
		if (newScoped_identifier != scoped_identifier) {
			NotificationChain msgs = null;
			if (scoped_identifier != null)
				msgs = ((InternalEObject)scoped_identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.TAG_GO__SCOPED_IDENTIFIER, null, msgs);
			if (newScoped_identifier != null)
				msgs = ((InternalEObject)newScoped_identifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.TAG_GO__SCOPED_IDENTIFIER, null, msgs);
			msgs = basicSetScoped_identifier(newScoped_identifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TAG_GO__SCOPED_IDENTIFIER, newScoped_identifier, newScoped_identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionGO getTagvalue() {
		return tagvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTagvalue(ExpressionGO newTagvalue, NotificationChain msgs) {
		ExpressionGO oldTagvalue = tagvalue;
		tagvalue = newTagvalue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TAG_GO__TAGVALUE, oldTagvalue, newTagvalue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTagvalue(ExpressionGO newTagvalue) {
		if (newTagvalue != tagvalue) {
			NotificationChain msgs = null;
			if (tagvalue != null)
				msgs = ((InternalEObject)tagvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.TAG_GO__TAGVALUE, null, msgs);
			if (newTagvalue != null)
				msgs = ((InternalEObject)newTagvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.TAG_GO__TAGVALUE, null, msgs);
			msgs = basicSetTagvalue(newTagvalue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalPackage.TAG_GO__TAGVALUE, newTagvalue, newTagvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.TAG_GO__CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClass((emof.Class)otherEnd, msgs);
			case QvtoperationalPackage.TAG_GO__OWNED_PARAMETER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedParameter()).basicAdd(otherEnd, msgs);
			case QvtoperationalPackage.TAG_GO__RESULT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResult()).basicAdd(otherEnd, msgs);
			case QvtoperationalPackage.TAG_GO__BODY:
				if (body != null)
					msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QvtoperationalPackage.TAG_GO__BODY, null, msgs);
				return basicSetBody((OperationBody)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QvtoperationalPackage.TAG_GO__CLASS:
				return basicSetClass(null, msgs);
			case QvtoperationalPackage.TAG_GO__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.TAG_GO__CONTEXT:
				return basicSetContext(null, msgs);
			case QvtoperationalPackage.TAG_GO__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
			case QvtoperationalPackage.TAG_GO__BODY:
				return basicSetBody(null, msgs);
			case QvtoperationalPackage.TAG_GO__SCOPED_IDENTIFIER:
				return basicSetScoped_identifier(null, msgs);
			case QvtoperationalPackage.TAG_GO__TAGVALUE:
				return basicSetTagvalue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case QvtoperationalPackage.TAG_GO__CLASS:
				return eInternalContainer().eInverseRemove(this, EmofPackage.CLASS__OWNED_OPERATION, emof.Class.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QvtoperationalPackage.TAG_GO__IS_ORDERED:
				return getIsOrdered();
			case QvtoperationalPackage.TAG_GO__IS_UNIQUE:
				return getIsUnique();
			case QvtoperationalPackage.TAG_GO__LOWER:
				return getLower();
			case QvtoperationalPackage.TAG_GO__UPPER:
				return getUpper();
			case QvtoperationalPackage.TAG_GO__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case QvtoperationalPackage.TAG_GO__CLASS:
				return getClass_();
			case QvtoperationalPackage.TAG_GO__OWNED_PARAMETER:
				return getOwnedParameter();
			case QvtoperationalPackage.TAG_GO__RAISED_EXCEPTION:
				return getRaisedException();
			case QvtoperationalPackage.TAG_GO__CONTEXT:
				return getContext();
			case QvtoperationalPackage.TAG_GO__RESULT:
				return getResult();
			case QvtoperationalPackage.TAG_GO__OVERRIDDEN:
				if (resolve) return getOverridden();
				return basicGetOverridden();
			case QvtoperationalPackage.TAG_GO__BODY:
				return getBody();
			case QvtoperationalPackage.TAG_GO__TAGID:
				return getTagid();
			case QvtoperationalPackage.TAG_GO__SCOPED_IDENTIFIER:
				return getScoped_identifier();
			case QvtoperationalPackage.TAG_GO__TAGVALUE:
				return getTagvalue();
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
			case QvtoperationalPackage.TAG_GO__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case QvtoperationalPackage.TAG_GO__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case QvtoperationalPackage.TAG_GO__LOWER:
				setLower((Integer)newValue);
				return;
			case QvtoperationalPackage.TAG_GO__UPPER:
				setUpper((Integer)newValue);
				return;
			case QvtoperationalPackage.TAG_GO__TYPE:
				setType((Type)newValue);
				return;
			case QvtoperationalPackage.TAG_GO__CLASS:
				setClass((emof.Class)newValue);
				return;
			case QvtoperationalPackage.TAG_GO__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case QvtoperationalPackage.TAG_GO__RAISED_EXCEPTION:
				getRaisedException().clear();
				getRaisedException().addAll((Collection<? extends Type>)newValue);
				return;
			case QvtoperationalPackage.TAG_GO__CONTEXT:
				setContext((VarParameter)newValue);
				return;
			case QvtoperationalPackage.TAG_GO__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends VarParameter>)newValue);
				return;
			case QvtoperationalPackage.TAG_GO__OVERRIDDEN:
				setOverridden((ImperativeOperation)newValue);
				return;
			case QvtoperationalPackage.TAG_GO__BODY:
				setBody((OperationBody)newValue);
				return;
			case QvtoperationalPackage.TAG_GO__TAGID:
				setTagid((String)newValue);
				return;
			case QvtoperationalPackage.TAG_GO__SCOPED_IDENTIFIER:
				setScoped_identifier((ScopedIdentifier)newValue);
				return;
			case QvtoperationalPackage.TAG_GO__TAGVALUE:
				setTagvalue((ExpressionGO)newValue);
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
			case QvtoperationalPackage.TAG_GO__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case QvtoperationalPackage.TAG_GO__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case QvtoperationalPackage.TAG_GO__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case QvtoperationalPackage.TAG_GO__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case QvtoperationalPackage.TAG_GO__TYPE:
				setType((Type)null);
				return;
			case QvtoperationalPackage.TAG_GO__CLASS:
				setClass((emof.Class)null);
				return;
			case QvtoperationalPackage.TAG_GO__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case QvtoperationalPackage.TAG_GO__RAISED_EXCEPTION:
				getRaisedException().clear();
				return;
			case QvtoperationalPackage.TAG_GO__CONTEXT:
				setContext((VarParameter)null);
				return;
			case QvtoperationalPackage.TAG_GO__RESULT:
				getResult().clear();
				return;
			case QvtoperationalPackage.TAG_GO__OVERRIDDEN:
				setOverridden((ImperativeOperation)null);
				return;
			case QvtoperationalPackage.TAG_GO__BODY:
				setBody((OperationBody)null);
				return;
			case QvtoperationalPackage.TAG_GO__TAGID:
				setTagid(TAGID_EDEFAULT);
				return;
			case QvtoperationalPackage.TAG_GO__SCOPED_IDENTIFIER:
				setScoped_identifier((ScopedIdentifier)null);
				return;
			case QvtoperationalPackage.TAG_GO__TAGVALUE:
				setTagvalue((ExpressionGO)null);
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
			case QvtoperationalPackage.TAG_GO__IS_ORDERED:
				return IS_ORDERED_EDEFAULT == null ? isOrdered != null : !IS_ORDERED_EDEFAULT.equals(isOrdered);
			case QvtoperationalPackage.TAG_GO__IS_UNIQUE:
				return IS_UNIQUE_EDEFAULT == null ? isUnique != null : !IS_UNIQUE_EDEFAULT.equals(isUnique);
			case QvtoperationalPackage.TAG_GO__LOWER:
				return LOWER_EDEFAULT == null ? lower != null : !LOWER_EDEFAULT.equals(lower);
			case QvtoperationalPackage.TAG_GO__UPPER:
				return UPPER_EDEFAULT == null ? upper != null : !UPPER_EDEFAULT.equals(upper);
			case QvtoperationalPackage.TAG_GO__TYPE:
				return type != null;
			case QvtoperationalPackage.TAG_GO__CLASS:
				return getClass_() != null;
			case QvtoperationalPackage.TAG_GO__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case QvtoperationalPackage.TAG_GO__RAISED_EXCEPTION:
				return raisedException != null && !raisedException.isEmpty();
			case QvtoperationalPackage.TAG_GO__CONTEXT:
				return context != null;
			case QvtoperationalPackage.TAG_GO__RESULT:
				return result != null && !result.isEmpty();
			case QvtoperationalPackage.TAG_GO__OVERRIDDEN:
				return overridden != null;
			case QvtoperationalPackage.TAG_GO__BODY:
				return body != null;
			case QvtoperationalPackage.TAG_GO__TAGID:
				return TAGID_EDEFAULT == null ? tagid != null : !TAGID_EDEFAULT.equals(tagid);
			case QvtoperationalPackage.TAG_GO__SCOPED_IDENTIFIER:
				return scoped_identifier != null;
			case QvtoperationalPackage.TAG_GO__TAGVALUE:
				return tagvalue != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case QvtoperationalPackage.TAG_GO__IS_ORDERED: return EmofPackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case QvtoperationalPackage.TAG_GO__IS_UNIQUE: return EmofPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case QvtoperationalPackage.TAG_GO__LOWER: return EmofPackage.MULTIPLICITY_ELEMENT__LOWER;
				case QvtoperationalPackage.TAG_GO__UPPER: return EmofPackage.MULTIPLICITY_ELEMENT__UPPER;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case QvtoperationalPackage.TAG_GO__TYPE: return EmofPackage.TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == Operation.class) {
			switch (derivedFeatureID) {
				case QvtoperationalPackage.TAG_GO__CLASS: return EmofPackage.OPERATION__CLASS;
				case QvtoperationalPackage.TAG_GO__OWNED_PARAMETER: return EmofPackage.OPERATION__OWNED_PARAMETER;
				case QvtoperationalPackage.TAG_GO__RAISED_EXCEPTION: return EmofPackage.OPERATION__RAISED_EXCEPTION;
				default: return -1;
			}
		}
		if (baseClass == ImperativeOperation.class) {
			switch (derivedFeatureID) {
				case QvtoperationalPackage.TAG_GO__CONTEXT: return QvtoperationalPackage.IMPERATIVE_OPERATION__CONTEXT;
				case QvtoperationalPackage.TAG_GO__RESULT: return QvtoperationalPackage.IMPERATIVE_OPERATION__RESULT;
				case QvtoperationalPackage.TAG_GO__OVERRIDDEN: return QvtoperationalPackage.IMPERATIVE_OPERATION__OVERRIDDEN;
				case QvtoperationalPackage.TAG_GO__BODY: return QvtoperationalPackage.IMPERATIVE_OPERATION__BODY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case EmofPackage.MULTIPLICITY_ELEMENT__IS_ORDERED: return QvtoperationalPackage.TAG_GO__IS_ORDERED;
				case EmofPackage.MULTIPLICITY_ELEMENT__IS_UNIQUE: return QvtoperationalPackage.TAG_GO__IS_UNIQUE;
				case EmofPackage.MULTIPLICITY_ELEMENT__LOWER: return QvtoperationalPackage.TAG_GO__LOWER;
				case EmofPackage.MULTIPLICITY_ELEMENT__UPPER: return QvtoperationalPackage.TAG_GO__UPPER;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case EmofPackage.TYPED_ELEMENT__TYPE: return QvtoperationalPackage.TAG_GO__TYPE;
				default: return -1;
			}
		}
		if (baseClass == Operation.class) {
			switch (baseFeatureID) {
				case EmofPackage.OPERATION__CLASS: return QvtoperationalPackage.TAG_GO__CLASS;
				case EmofPackage.OPERATION__OWNED_PARAMETER: return QvtoperationalPackage.TAG_GO__OWNED_PARAMETER;
				case EmofPackage.OPERATION__RAISED_EXCEPTION: return QvtoperationalPackage.TAG_GO__RAISED_EXCEPTION;
				default: return -1;
			}
		}
		if (baseClass == ImperativeOperation.class) {
			switch (baseFeatureID) {
				case QvtoperationalPackage.IMPERATIVE_OPERATION__CONTEXT: return QvtoperationalPackage.TAG_GO__CONTEXT;
				case QvtoperationalPackage.IMPERATIVE_OPERATION__RESULT: return QvtoperationalPackage.TAG_GO__RESULT;
				case QvtoperationalPackage.IMPERATIVE_OPERATION__OVERRIDDEN: return QvtoperationalPackage.TAG_GO__OVERRIDDEN;
				case QvtoperationalPackage.IMPERATIVE_OPERATION__BODY: return QvtoperationalPackage.TAG_GO__BODY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (isOrdered: ");
		result.append(isOrdered);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", lower: ");
		result.append(lower);
		result.append(", upper: ");
		result.append(upper);
		result.append(", tagid: ");
		result.append(tagid);
		result.append(')');
		return result.toString();
	}

} //TagGOImpl
