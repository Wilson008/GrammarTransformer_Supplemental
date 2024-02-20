/**
 */
package spectra;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subrange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.Subrange#getFrom <em>From</em>}</li>
 *   <li>{@link spectra.Subrange#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getSubrange()
 * @model
 * @generated
 */
public interface Subrange extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(SizeDefineDecl)
	 * @see spectra.SpectraPackage#getSubrange_From()
	 * @model containment="true"
	 * @generated
	 */
	SizeDefineDecl getFrom();

	/**
	 * Sets the value of the '{@link spectra.Subrange#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(SizeDefineDecl value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(SizeDefineDecl)
	 * @see spectra.SpectraPackage#getSubrange_To()
	 * @model containment="true"
	 * @generated
	 */
	SizeDefineDecl getTo();

	/**
	 * Sets the value of the '{@link spectra.Subrange#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(SizeDefineDecl value);

} // Subrange
