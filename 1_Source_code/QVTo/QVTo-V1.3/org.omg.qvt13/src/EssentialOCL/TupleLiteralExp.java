/**
 */
package EssentialOCL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EssentialOCL.TupleLiteralExp#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @see EssentialOCL.EssentialOCLPackage#getTupleLiteralExp()
 * @model
 * @generated
 */
public interface TupleLiteralExp extends LiteralExp {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link EssentialOCL.TupleLiteralPart}.
	 * It is bidirectional and its opposite is '{@link EssentialOCL.TupleLiteralPart#getTupleLiteralExp <em>Tuple Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see EssentialOCL.EssentialOCLPackage#getTupleLiteralExp_Part()
	 * @see EssentialOCL.TupleLiteralPart#getTupleLiteralExp
	 * @model opposite="tupleLiteralExp" containment="true" ordered="false"
	 * @generated
	 */
	EList<TupleLiteralPart> getPart();

} // TupleLiteralExp
