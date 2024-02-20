/**
 */
package spectra;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Define Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.DefineDecl#getSimpleExpr <em>Simple Expr</em>}</li>
 *   <li>{@link spectra.DefineDecl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link spectra.DefineDecl#getInnerArray <em>Inner Array</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getDefineDecl()
 * @model
 * @generated
 */
public interface DefineDecl extends Referrable {
	/**
	 * Returns the value of the '<em><b>Simple Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Expr</em>' containment reference.
	 * @see #setSimpleExpr(TemporalExpression)
	 * @see spectra.SpectraPackage#getDefineDecl_SimpleExpr()
	 * @model containment="true"
	 * @generated
	 */
	TemporalExpression getSimpleExpr();

	/**
	 * Sets the value of the '{@link spectra.DefineDecl#getSimpleExpr <em>Simple Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Expr</em>' containment reference.
	 * @see #getSimpleExpr()
	 * @generated
	 */
	void setSimpleExpr(TemporalExpression value);

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
	 * The list contents are of type {@link spectra.SizeDefineDecl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference list.
	 * @see spectra.SpectraPackage#getDefineDecl_Dimensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SizeDefineDecl> getDimensions();

	/**
	 * Returns the value of the '<em><b>Inner Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Array</em>' containment reference.
	 * @see #setInnerArray(DefineArray)
	 * @see spectra.SpectraPackage#getDefineDecl_InnerArray()
	 * @model containment="true"
	 * @generated
	 */
	DefineArray getInnerArray();

	/**
	 * Sets the value of the '{@link spectra.DefineDecl#getInnerArray <em>Inner Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Array</em>' containment reference.
	 * @see #getInnerArray()
	 * @generated
	 */
	void setInnerArray(DefineArray value);

} // DefineDecl
