/**
 */
package EssentialOCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link EssentialOCL.CollectionItem#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see EssentialOCL.EssentialOCLPackage#getCollectionItem()
 * @model
 * @generated
 */
public interface CollectionItem extends CollectionLiteralPart {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(OclExpression)
	 * @see EssentialOCL.EssentialOCLPackage#getCollectionItem_Item()
	 * @model containment="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='collectionItem'"
	 * @generated
	 */
	OclExpression getItem();

	/**
	 * Sets the value of the '{@link EssentialOCL.CollectionItem#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(OclExpression value);

} // CollectionItem
