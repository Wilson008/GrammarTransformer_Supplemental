/**
 */
package QVTOperational;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Full Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTOperational.MappingFullHeader#getMapping_header <em>Mapping header</em>}</li>
 *   <li>{@link QVTOperational.MappingFullHeader#getWhen <em>When</em>}</li>
 *   <li>{@link QVTOperational.MappingFullHeader#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @see QVTOperational.QVTOperationalPackage#getMappingFullHeader()
 * @model
 * @generated
 */
public interface MappingFullHeader extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapping header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping header</em>' containment reference.
	 * @see #setMapping_header(MappingHeader)
	 * @see QVTOperational.QVTOperationalPackage#getMappingFullHeader_Mapping_header()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MappingHeader getMapping_header();

	/**
	 * Sets the value of the '{@link QVTOperational.MappingFullHeader#getMapping_header <em>Mapping header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping header</em>' containment reference.
	 * @see #getMapping_header()
	 * @generated
	 */
	void setMapping_header(MappingHeader value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(ExpressionBlock)
	 * @see QVTOperational.QVTOperationalPackage#getMappingFullHeader_When()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionBlock getWhen();

	/**
	 * Sets the value of the '{@link QVTOperational.MappingFullHeader#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(ExpressionBlock value);

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(ExpressionBlock)
	 * @see QVTOperational.QVTOperationalPackage#getMappingFullHeader_Where()
	 * @model containment="true"
	 * @generated
	 */
	ExpressionBlock getWhere();

	/**
	 * Sets the value of the '{@link QVTOperational.MappingFullHeader#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(ExpressionBlock value);

} // MappingFullHeader
