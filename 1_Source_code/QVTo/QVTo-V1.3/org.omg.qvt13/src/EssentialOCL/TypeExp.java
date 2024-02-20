/**
 */
package EssentialOCL;

import EMOF.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EssentialOCL.TypeExp#getReferredType <em>Referred Type</em>}</li>
 * </ul>
 *
 * @see EssentialOCL.EssentialOCLPackage#getTypeExp()
 * @model
 * @generated
 */
public interface TypeExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Referred Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Type</em>' reference.
	 * @see #setReferredType(Type)
	 * @see EssentialOCL.EssentialOCLPackage#getTypeExp_ReferredType()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typeExp'"
	 * @generated
	 */
	Type getReferredType();

	/**
	 * Sets the value of the '{@link EssentialOCL.TypeExp#getReferredType <em>Referred Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Type</em>' reference.
	 * @see #getReferredType()
	 * @generated
	 */
	void setReferredType(Type value);

} // TypeExp
