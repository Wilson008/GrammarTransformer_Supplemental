/**
 */
package EssentialOCL;

import EMOF.Operation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EssentialOCL.OperationCallExp#getArgument <em>Argument</em>}</li>
 *   <li>{@link EssentialOCL.OperationCallExp#getReferredOperation <em>Referred Operation</em>}</li>
 * </ul>
 *
 * @see EssentialOCL.EssentialOCLPackage#getOperationCallExp()
 * @model
 * @generated
 */
public interface OperationCallExp extends FeatureCallExp {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link EssentialOCL.OclExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see EssentialOCL.EssentialOCLPackage#getOperationCallExp_Argument()
	 * @model containment="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='parentCall'"
	 * @generated
	 */
	EList<OclExpression> getArgument();

	/**
	 * Returns the value of the '<em><b>Referred Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Operation</em>' reference.
	 * @see #setReferredOperation(Operation)
	 * @see EssentialOCL.EssentialOCLPackage#getOperationCallExp_ReferredOperation()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='referringExp'"
	 * @generated
	 */
	Operation getReferredOperation();

	/**
	 * Sets the value of the '{@link EssentialOCL.OperationCallExp#getReferredOperation <em>Referred Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Operation</em>' reference.
	 * @see #getReferredOperation()
	 * @generated
	 */
	void setReferredOperation(Operation value);

} // OperationCallExp
