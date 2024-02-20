/**
 */
package QVTBase;

import EMOF.Element;

import EssentialOCL.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTBase.Pattern#getBindsTo <em>Binds To</em>}</li>
 *   <li>{@link QVTBase.Pattern#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @see QVTBase.QVTBasePackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends Element {
	/**
	 * Returns the value of the '<em><b>Binds To</b></em>' reference list.
	 * The list contents are of type {@link EssentialOCL.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binds To</em>' reference list.
	 * @see QVTBase.QVTBasePackage#getPattern_BindsTo()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='pattern'"
	 * @generated
	 */
	EList<Variable> getBindsTo();

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference list.
	 * The list contents are of type {@link QVTBase.Predicate}.
	 * It is bidirectional and its opposite is '{@link QVTBase.Predicate#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' containment reference list.
	 * @see QVTBase.QVTBasePackage#getPattern_Predicate()
	 * @see QVTBase.Predicate#getPattern
	 * @model opposite="pattern" containment="true" ordered="false"
	 * @generated
	 */
	EList<Predicate> getPredicate();

} // Pattern
