/**
 */
package xcore;

import org.eclipse.xtext.xbase.XBlockExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xcore.XStructuralFeature#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link xcore.XStructuralFeature#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link xcore.XStructuralFeature#isTransient <em>Transient</em>}</li>
 *   <li>{@link xcore.XStructuralFeature#isUnsettable <em>Unsettable</em>}</li>
 *   <li>{@link xcore.XStructuralFeature#isDerived <em>Derived</em>}</li>
 *   <li>{@link xcore.XStructuralFeature#getGetBody <em>Get Body</em>}</li>
 *   <li>{@link xcore.XStructuralFeature#getSetBody <em>Set Body</em>}</li>
 *   <li>{@link xcore.XStructuralFeature#getIsSetBody <em>Is Set Body</em>}</li>
 *   <li>{@link xcore.XStructuralFeature#getUnsetBody <em>Unset Body</em>}</li>
 * </ul>
 *
 * @see xcore.XcorePackage#getXStructuralFeature()
 * @model abstract="true"
 * @generated
 */
public interface XStructuralFeature extends XMember {
	/**
	 * Returns the value of the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readonly</em>' attribute.
	 * @see #setReadonly(boolean)
	 * @see xcore.XcorePackage#getXStructuralFeature_Readonly()
	 * @model
	 * @generated
	 */
	boolean isReadonly();

	/**
	 * Sets the value of the '{@link xcore.XStructuralFeature#isReadonly <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readonly</em>' attribute.
	 * @see #isReadonly()
	 * @generated
	 */
	void setReadonly(boolean value);

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see #setVolatile(boolean)
	 * @see xcore.XcorePackage#getXStructuralFeature_Volatile()
	 * @model
	 * @generated
	 */
	boolean isVolatile();

	/**
	 * Sets the value of the '{@link xcore.XStructuralFeature#isVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see #isVolatile()
	 * @generated
	 */
	void setVolatile(boolean value);

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(boolean)
	 * @see xcore.XcorePackage#getXStructuralFeature_Transient()
	 * @model
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link xcore.XStructuralFeature#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

	/**
	 * Returns the value of the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsettable</em>' attribute.
	 * @see #setUnsettable(boolean)
	 * @see xcore.XcorePackage#getXStructuralFeature_Unsettable()
	 * @model
	 * @generated
	 */
	boolean isUnsettable();

	/**
	 * Sets the value of the '{@link xcore.XStructuralFeature#isUnsettable <em>Unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsettable</em>' attribute.
	 * @see #isUnsettable()
	 * @generated
	 */
	void setUnsettable(boolean value);

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived</em>' attribute.
	 * @see #setDerived(boolean)
	 * @see xcore.XcorePackage#getXStructuralFeature_Derived()
	 * @model
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link xcore.XStructuralFeature#isDerived <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Get Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Body</em>' containment reference.
	 * @see #setGetBody(XBlockExpression)
	 * @see xcore.XcorePackage#getXStructuralFeature_GetBody()
	 * @model containment="true"
	 * @generated
	 */
	XBlockExpression getGetBody();

	/**
	 * Sets the value of the '{@link xcore.XStructuralFeature#getGetBody <em>Get Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Body</em>' containment reference.
	 * @see #getGetBody()
	 * @generated
	 */
	void setGetBody(XBlockExpression value);

	/**
	 * Returns the value of the '<em><b>Set Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Body</em>' containment reference.
	 * @see #setSetBody(XBlockExpression)
	 * @see xcore.XcorePackage#getXStructuralFeature_SetBody()
	 * @model containment="true"
	 * @generated
	 */
	XBlockExpression getSetBody();

	/**
	 * Sets the value of the '{@link xcore.XStructuralFeature#getSetBody <em>Set Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Body</em>' containment reference.
	 * @see #getSetBody()
	 * @generated
	 */
	void setSetBody(XBlockExpression value);

	/**
	 * Returns the value of the '<em><b>Is Set Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Set Body</em>' containment reference.
	 * @see #setIsSetBody(XBlockExpression)
	 * @see xcore.XcorePackage#getXStructuralFeature_IsSetBody()
	 * @model containment="true"
	 * @generated
	 */
	XBlockExpression getIsSetBody();

	/**
	 * Sets the value of the '{@link xcore.XStructuralFeature#getIsSetBody <em>Is Set Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Set Body</em>' containment reference.
	 * @see #getIsSetBody()
	 * @generated
	 */
	void setIsSetBody(XBlockExpression value);

	/**
	 * Returns the value of the '<em><b>Unset Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unset Body</em>' containment reference.
	 * @see #setUnsetBody(XBlockExpression)
	 * @see xcore.XcorePackage#getXStructuralFeature_UnsetBody()
	 * @model containment="true"
	 * @generated
	 */
	XBlockExpression getUnsetBody();

	/**
	 * Sets the value of the '{@link xcore.XStructuralFeature#getUnsetBody <em>Unset Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unset Body</em>' containment reference.
	 * @see #getUnsetBody()
	 * @generated
	 */
	void setUnsetBody(XBlockExpression value);

} // XStructuralFeature
