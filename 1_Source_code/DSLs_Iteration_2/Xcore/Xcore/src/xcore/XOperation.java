/**
 */
package xcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XBlockExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xcore.XOperation#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link xcore.XOperation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link xcore.XOperation#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link xcore.XOperation#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see xcore.XcorePackage#getXOperation()
 * @model
 * @generated
 */
public interface XOperation extends XMember {
	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link xcore.XTypeParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' containment reference list.
	 * @see xcore.XcorePackage#getXOperation_TypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<XTypeParameter> getTypeParameters();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link xcore.XParameter}.
	 * It is bidirectional and its opposite is '{@link xcore.XParameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see xcore.XcorePackage#getXOperation_Parameters()
	 * @see xcore.XParameter#getOperation
	 * @model opposite="operation" containment="true"
	 * @generated
	 */
	EList<XParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link xcore.XGenericType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptions</em>' containment reference list.
	 * @see xcore.XcorePackage#getXOperation_Exceptions()
	 * @model containment="true" unsettable="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<XGenericType> getExceptions();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(XBlockExpression)
	 * @see xcore.XcorePackage#getXOperation_Body()
	 * @model containment="true"
	 * @generated
	 */
	XBlockExpression getBody();

	/**
	 * Sets the value of the '{@link xcore.XOperation#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(XBlockExpression value);

} // XOperation
