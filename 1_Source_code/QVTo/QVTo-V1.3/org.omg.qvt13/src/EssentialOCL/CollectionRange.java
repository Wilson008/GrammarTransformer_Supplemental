/**
 */
package EssentialOCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EssentialOCL.CollectionRange#getFirst <em>First</em>}</li>
 *   <li>{@link EssentialOCL.CollectionRange#getLast <em>Last</em>}</li>
 * </ul>
 *
 * @see EssentialOCL.EssentialOCLPackage#getCollectionRange()
 * @model
 * @generated
 */
public interface CollectionRange extends CollectionLiteralPart {
	/**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(OclExpression)
	 * @see EssentialOCL.EssentialOCLPackage#getCollectionRange_First()
	 * @model containment="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='firstOwner'"
	 * @generated
	 */
	OclExpression getFirst();

	/**
	 * Sets the value of the '{@link EssentialOCL.CollectionRange#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Last</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last</em>' containment reference.
	 * @see #setLast(OclExpression)
	 * @see EssentialOCL.EssentialOCLPackage#getCollectionRange_Last()
	 * @model containment="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='lastOwner'"
	 * @generated
	 */
	OclExpression getLast();

	/**
	 * Sets the value of the '{@link EssentialOCL.CollectionRange#getLast <em>Last</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last</em>' containment reference.
	 * @see #getLast()
	 * @generated
	 */
	void setLast(OclExpression value);

} // CollectionRange
