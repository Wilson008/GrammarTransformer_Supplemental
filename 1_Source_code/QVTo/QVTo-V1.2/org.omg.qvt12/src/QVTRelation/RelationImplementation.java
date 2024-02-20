/**
 */
package QVTRelation;

import EMOF.Element;
import EMOF.Operation;

import QVTBase.TypedModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTRelation.RelationImplementation#getImpl <em>Impl</em>}</li>
 *   <li>{@link QVTRelation.RelationImplementation#getInDirectionOf <em>In Direction Of</em>}</li>
 *   <li>{@link QVTRelation.RelationImplementation#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @see QVTRelation.QVTRelationPackage#getRelationImplementation()
 * @model
 * @generated
 */
public interface RelationImplementation extends Element {
	/**
	 * Returns the value of the '<em><b>Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl</em>' reference.
	 * @see #setImpl(Operation)
	 * @see QVTRelation.QVTRelationPackage#getRelationImplementation_Impl()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='relationImplementation'"
	 * @generated
	 */
	Operation getImpl();

	/**
	 * Sets the value of the '{@link QVTRelation.RelationImplementation#getImpl <em>Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl</em>' reference.
	 * @see #getImpl()
	 * @generated
	 */
	void setImpl(Operation value);

	/**
	 * Returns the value of the '<em><b>In Direction Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Direction Of</em>' reference.
	 * @see #setInDirectionOf(TypedModel)
	 * @see QVTRelation.QVTRelationPackage#getRelationImplementation_InDirectionOf()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='relationImplementation'"
	 * @generated
	 */
	TypedModel getInDirectionOf();

	/**
	 * Sets the value of the '{@link QVTRelation.RelationImplementation#getInDirectionOf <em>In Direction Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Direction Of</em>' reference.
	 * @see #getInDirectionOf()
	 * @generated
	 */
	void setInDirectionOf(TypedModel value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QVTRelation.Relation#getOperationalImpl <em>Operational Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' container reference.
	 * @see #setRelation(Relation)
	 * @see QVTRelation.QVTRelationPackage#getRelationImplementation_Relation()
	 * @see QVTRelation.Relation#getOperationalImpl
	 * @model opposite="operationalImpl" resolveProxies="false" required="true"
	 * @generated
	 */
	Relation getRelation();

	/**
	 * Sets the value of the '{@link QVTRelation.RelationImplementation#getRelation <em>Relation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' container reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Relation value);

} // RelationImplementation
