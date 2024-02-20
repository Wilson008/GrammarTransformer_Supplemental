/**
 */
package EMOF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EMOF.Enumeration#getOwnedLiteral <em>Owned Literal</em>}</li>
 * </ul>
 *
 * @see EMOF.EMOFPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends DataType {
	/**
	 * Returns the value of the '<em><b>Owned Literal</b></em>' containment reference list.
	 * The list contents are of type {@link EMOF.EnumerationLiteral}.
	 * It is bidirectional and its opposite is '{@link EMOF.EnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Literal</em>' containment reference list.
	 * @see EMOF.EMOFPackage#getEnumeration_OwnedLiteral()
	 * @see EMOF.EnumerationLiteral#getEnumeration
	 * @model opposite="enumeration" containment="true"
	 * @generated
	 */
	EList<EnumerationLiteral> getOwnedLiteral();

} // Enumeration
