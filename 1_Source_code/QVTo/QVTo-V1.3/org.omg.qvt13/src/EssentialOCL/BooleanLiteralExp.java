/**
 */
package EssentialOCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EssentialOCL.BooleanLiteralExp#getBooleanSymbol <em>Boolean Symbol</em>}</li>
 * </ul>
 *
 * @see EssentialOCL.EssentialOCLPackage#getBooleanLiteralExp()
 * @model
 * @generated
 */
public interface BooleanLiteralExp extends PrimitiveLiteralExp {
	/**
	 * Returns the value of the '<em><b>Boolean Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Symbol</em>' attribute.
	 * @see #setBooleanSymbol(Boolean)
	 * @see EssentialOCL.EssentialOCLPackage#getBooleanLiteralExp_BooleanSymbol()
	 * @model dataType="PrimitiveTypes.Boolean"
	 * @generated
	 */
	Boolean getBooleanSymbol();

	/**
	 * Sets the value of the '{@link EssentialOCL.BooleanLiteralExp#getBooleanSymbol <em>Boolean Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Symbol</em>' attribute.
	 * @see #getBooleanSymbol()
	 * @generated
	 */
	void setBooleanSymbol(Boolean value);

} // BooleanLiteralExp
