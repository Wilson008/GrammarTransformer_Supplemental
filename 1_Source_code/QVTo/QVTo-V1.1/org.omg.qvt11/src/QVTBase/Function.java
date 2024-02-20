/**
 */
package QVTBase;

import EMOF.Operation;

import EssentialOCL.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTBase.Function#getQueryExpression <em>Query Expression</em>}</li>
 * </ul>
 *
 * @see QVTBase.QVTBasePackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Operation {
	/**
	 * Returns the value of the '<em><b>Query Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Expression</em>' containment reference.
	 * @see #setQueryExpression(OclExpression)
	 * @see QVTBase.QVTBasePackage#getFunction_QueryExpression()
	 * @model containment="true"
	 * @generated
	 */
	OclExpression getQueryExpression();

	/**
	 * Sets the value of the '{@link QVTBase.Function#getQueryExpression <em>Query Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Expression</em>' containment reference.
	 * @see #getQueryExpression()
	 * @generated
	 */
	void setQueryExpression(OclExpression value);

} // Function
