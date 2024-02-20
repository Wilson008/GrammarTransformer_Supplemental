/**
 */
package EssentialOCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EssentialOCL.CallExp#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see EssentialOCL.EssentialOCLPackage#getCallExp()
 * @model abstract="true"
 * @generated
 */
public interface CallExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(OclExpression)
	 * @see EssentialOCL.EssentialOCLPackage#getCallExp_Source()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='appliedElement'"
	 * @generated
	 */
	OclExpression getSource();

	/**
	 * Sets the value of the '{@link EssentialOCL.CallExp#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OclExpression value);

} // CallExp
