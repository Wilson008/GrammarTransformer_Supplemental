/**
 */
package QVTRelation;

import EMOF.EMOFPackage;

import EssentialOCL.EssentialOCLPackage;

import QVTBase.QVTBasePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see QVTRelation.QVTRelationFactory
 * @model kind="package"
 * @generated
 */
public interface QVTRelationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "QVTRelation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/QVT/20140401/QVTRelation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qvtrelation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QVTRelationPackage eINSTANCE = QVTRelation.impl.QVTRelationPackageImpl.init();

	/**
	 * The meta object id for the '{@link QVTRelation.impl.DomainPatternImpl <em>Domain Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTRelation.impl.DomainPatternImpl
	 * @see QVTRelation.impl.QVTRelationPackageImpl#getDomainPattern()
	 * @generated
	 */
	int DOMAIN_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN__OWNED_COMMENT = QVTBasePackage.PATTERN__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Binds To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN__BINDS_TO = QVTBasePackage.PATTERN__BINDS_TO;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN__PREDICATE = QVTBasePackage.PATTERN__PREDICATE;

	/**
	 * The feature id for the '<em><b>Relation Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN__RELATION_DOMAIN = QVTBasePackage.PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Template Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN__TEMPLATE_EXPRESSION = QVTBasePackage.PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN_FEATURE_COUNT = QVTBasePackage.PATTERN_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN___CONTAINER = QVTBasePackage.PATTERN___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN___EQUALS__OBJECT = QVTBasePackage.PATTERN___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN___GET__PROPERTY = QVTBasePackage.PATTERN___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN___GET_META_CLASS = QVTBasePackage.PATTERN___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN___IS_SET__PROPERTY = QVTBasePackage.PATTERN___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN___SET__PROPERTY_OBJECT = QVTBasePackage.PATTERN___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN___UNSET__PROPERTY = QVTBasePackage.PATTERN___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Domain Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_PATTERN_OPERATION_COUNT = QVTBasePackage.PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QVTRelation.impl.KeyImpl <em>Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTRelation.impl.KeyImpl
	 * @see QVTRelation.impl.QVTRelationPackageImpl#getKey()
	 * @generated
	 */
	int KEY = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__OWNED_COMMENT = EMOFPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Identifies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__IDENTIFIES = EMOFPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opposite Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__OPPOSITE_PART = EMOFPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__PART = EMOFPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__TRANSFORMATION = EMOFPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_FEATURE_COUNT = EMOFPackage.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY___CONTAINER = EMOFPackage.ELEMENT___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY___EQUALS__OBJECT = EMOFPackage.ELEMENT___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY___GET__PROPERTY = EMOFPackage.ELEMENT___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY___GET_META_CLASS = EMOFPackage.ELEMENT___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY___IS_SET__PROPERTY = EMOFPackage.ELEMENT___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY___SET__PROPERTY_OBJECT = EMOFPackage.ELEMENT___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY___UNSET__PROPERTY = EMOFPackage.ELEMENT___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_OPERATION_COUNT = EMOFPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QVTRelation.impl.OppositePropertyCallExpImpl <em>Opposite Property Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTRelation.impl.OppositePropertyCallExpImpl
	 * @see QVTRelation.impl.QVTRelationPackageImpl#getOppositePropertyCallExp()
	 * @generated
	 */
	int OPPOSITE_PROPERTY_CALL_EXP = 2;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_PROPERTY_CALL_EXP__OWNED_COMMENT = EssentialOCLPackage.PROPERTY_CALL_EXP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_PROPERTY_CALL_EXP__NAME = EssentialOCLPackage.PROPERTY_CALL_EXP__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_PROPERTY_CALL_EXP__TYPE = EssentialOCLPackage.PROPERTY_CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_PROPERTY_CALL_EXP__SOURCE = EssentialOCLPackage.PROPERTY_CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Referred Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_PROPERTY_CALL_EXP__REFERRED_PROPERTY = EssentialOCLPackage.PROPERTY_CALL_EXP__REFERRED_PROPERTY;

	/**
	 * The number of structural features of the '<em>Opposite Property Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_PROPERTY_CALL_EXP_FEATURE_COUNT = EssentialOCLPackage.PROPERTY_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_PROPERTY_CALL_EXP___CONTAINER = EssentialOCLPackage.PROPERTY_CALL_EXP___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_PROPERTY_CALL_EXP___EQUALS__OBJECT = EssentialOCLPackage.PROPERTY_CALL_EXP___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_PROPERTY_CALL_EXP___GET__PROPERTY = EssentialOCLPackage.PROPERTY_CALL_EXP___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_PROPERTY_CALL_EXP___GET_META_CLASS = EssentialOCLPackage.PROPERTY_CALL_EXP___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_PROPERTY_CALL_EXP___IS_SET__PROPERTY = EssentialOCLPackage.PROPERTY_CALL_EXP___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_PROPERTY_CALL_EXP___SET__PROPERTY_OBJECT = EssentialOCLPackage.PROPERTY_CALL_EXP___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_PROPERTY_CALL_EXP___UNSET__PROPERTY = EssentialOCLPackage.PROPERTY_CALL_EXP___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Opposite Property Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPPOSITE_PROPERTY_CALL_EXP_OPERATION_COUNT = EssentialOCLPackage.PROPERTY_CALL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QVTRelation.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTRelation.impl.RelationImpl
	 * @see QVTRelation.impl.QVTRelationPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 3;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OWNED_COMMENT = QVTBasePackage.RULE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = QVTBasePackage.RULE__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__DOMAIN = QVTBasePackage.RULE__DOMAIN;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OVERRIDES = QVTBasePackage.RULE__OVERRIDES;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TRANSFORMATION = QVTBasePackage.RULE__TRANSFORMATION;

	/**
	 * The feature id for the '<em><b>Is Top Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__IS_TOP_LEVEL = QVTBasePackage.RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operational Impl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OPERATIONAL_IMPL = QVTBasePackage.RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__VARIABLE = QVTBasePackage.RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__WHEN = QVTBasePackage.RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__WHERE = QVTBasePackage.RULE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = QVTBasePackage.RULE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___CONTAINER = QVTBasePackage.RULE___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___EQUALS__OBJECT = QVTBasePackage.RULE___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GET__PROPERTY = QVTBasePackage.RULE___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GET_META_CLASS = QVTBasePackage.RULE___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___IS_SET__PROPERTY = QVTBasePackage.RULE___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___SET__PROPERTY_OBJECT = QVTBasePackage.RULE___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___UNSET__PROPERTY = QVTBasePackage.RULE___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = QVTBasePackage.RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QVTRelation.impl.RelationCallExpImpl <em>Relation Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTRelation.impl.RelationCallExpImpl
	 * @see QVTRelation.impl.QVTRelationPackageImpl#getRelationCallExp()
	 * @generated
	 */
	int RELATION_CALL_EXP = 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CALL_EXP__OWNED_COMMENT = EssentialOCLPackage.OCL_EXPRESSION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CALL_EXP__NAME = EssentialOCLPackage.OCL_EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CALL_EXP__TYPE = EssentialOCLPackage.OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CALL_EXP__ARGUMENT = EssentialOCLPackage.OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referred Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CALL_EXP__REFERRED_RELATION = EssentialOCLPackage.OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CALL_EXP_FEATURE_COUNT = EssentialOCLPackage.OCL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CALL_EXP___CONTAINER = EssentialOCLPackage.OCL_EXPRESSION___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CALL_EXP___EQUALS__OBJECT = EssentialOCLPackage.OCL_EXPRESSION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CALL_EXP___GET__PROPERTY = EssentialOCLPackage.OCL_EXPRESSION___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CALL_EXP___GET_META_CLASS = EssentialOCLPackage.OCL_EXPRESSION___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CALL_EXP___IS_SET__PROPERTY = EssentialOCLPackage.OCL_EXPRESSION___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CALL_EXP___SET__PROPERTY_OBJECT = EssentialOCLPackage.OCL_EXPRESSION___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CALL_EXP___UNSET__PROPERTY = EssentialOCLPackage.OCL_EXPRESSION___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Relation Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_CALL_EXP_OPERATION_COUNT = EssentialOCLPackage.OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QVTRelation.impl.RelationDomainImpl <em>Relation Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTRelation.impl.RelationDomainImpl
	 * @see QVTRelation.impl.QVTRelationPackageImpl#getRelationDomain()
	 * @generated
	 */
	int RELATION_DOMAIN = 5;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN__OWNED_COMMENT = QVTBasePackage.DOMAIN__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN__NAME = QVTBasePackage.DOMAIN__NAME;

	/**
	 * The feature id for the '<em><b>Is Checkable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN__IS_CHECKABLE = QVTBasePackage.DOMAIN__IS_CHECKABLE;

	/**
	 * The feature id for the '<em><b>Is Enforceable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN__IS_ENFORCEABLE = QVTBasePackage.DOMAIN__IS_ENFORCEABLE;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN__RULE = QVTBasePackage.DOMAIN__RULE;

	/**
	 * The feature id for the '<em><b>Typed Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN__TYPED_MODEL = QVTBasePackage.DOMAIN__TYPED_MODEL;

	/**
	 * The feature id for the '<em><b>Default Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN__DEFAULT_ASSIGNMENT = QVTBasePackage.DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN__PATTERN = QVTBasePackage.DOMAIN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN__ROOT_VARIABLE = QVTBasePackage.DOMAIN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relation Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN_FEATURE_COUNT = QVTBasePackage.DOMAIN_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN___CONTAINER = QVTBasePackage.DOMAIN___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN___EQUALS__OBJECT = QVTBasePackage.DOMAIN___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN___GET__PROPERTY = QVTBasePackage.DOMAIN___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN___GET_META_CLASS = QVTBasePackage.DOMAIN___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN___IS_SET__PROPERTY = QVTBasePackage.DOMAIN___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN___SET__PROPERTY_OBJECT = QVTBasePackage.DOMAIN___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN___UNSET__PROPERTY = QVTBasePackage.DOMAIN___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Relation Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN_OPERATION_COUNT = QVTBasePackage.DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QVTRelation.impl.RelationDomainAssignmentImpl <em>Relation Domain Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTRelation.impl.RelationDomainAssignmentImpl
	 * @see QVTRelation.impl.QVTRelationPackageImpl#getRelationDomainAssignment()
	 * @generated
	 */
	int RELATION_DOMAIN_ASSIGNMENT = 6;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN_ASSIGNMENT__OWNED_COMMENT = EMOFPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN_ASSIGNMENT__OWNER = EMOFPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP = EMOFPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN_ASSIGNMENT__VARIABLE = EMOFPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relation Domain Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN_ASSIGNMENT_FEATURE_COUNT = EMOFPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN_ASSIGNMENT___CONTAINER = EMOFPackage.ELEMENT___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN_ASSIGNMENT___EQUALS__OBJECT = EMOFPackage.ELEMENT___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN_ASSIGNMENT___GET__PROPERTY = EMOFPackage.ELEMENT___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN_ASSIGNMENT___GET_META_CLASS = EMOFPackage.ELEMENT___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN_ASSIGNMENT___IS_SET__PROPERTY = EMOFPackage.ELEMENT___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN_ASSIGNMENT___SET__PROPERTY_OBJECT = EMOFPackage.ELEMENT___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN_ASSIGNMENT___UNSET__PROPERTY = EMOFPackage.ELEMENT___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Relation Domain Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOMAIN_ASSIGNMENT_OPERATION_COUNT = EMOFPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QVTRelation.impl.RelationImplementationImpl <em>Relation Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTRelation.impl.RelationImplementationImpl
	 * @see QVTRelation.impl.QVTRelationPackageImpl#getRelationImplementation()
	 * @generated
	 */
	int RELATION_IMPLEMENTATION = 7;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_IMPLEMENTATION__OWNED_COMMENT = EMOFPackage.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_IMPLEMENTATION__IMPL = EMOFPackage.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Direction Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_IMPLEMENTATION__IN_DIRECTION_OF = EMOFPackage.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_IMPLEMENTATION__RELATION = EMOFPackage.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relation Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_IMPLEMENTATION_FEATURE_COUNT = EMOFPackage.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_IMPLEMENTATION___CONTAINER = EMOFPackage.ELEMENT___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_IMPLEMENTATION___EQUALS__OBJECT = EMOFPackage.ELEMENT___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_IMPLEMENTATION___GET__PROPERTY = EMOFPackage.ELEMENT___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_IMPLEMENTATION___GET_META_CLASS = EMOFPackage.ELEMENT___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_IMPLEMENTATION___IS_SET__PROPERTY = EMOFPackage.ELEMENT___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_IMPLEMENTATION___SET__PROPERTY_OBJECT = EMOFPackage.ELEMENT___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_IMPLEMENTATION___UNSET__PROPERTY = EMOFPackage.ELEMENT___UNSET__PROPERTY;

	/**
	 * The number of operations of the '<em>Relation Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_IMPLEMENTATION_OPERATION_COUNT = EMOFPackage.ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QVTRelation.impl.RelationalTransformationImpl <em>Relational Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QVTRelation.impl.RelationalTransformationImpl
	 * @see QVTRelation.impl.QVTRelationPackageImpl#getRelationalTransformation()
	 * @generated
	 */
	int RELATIONAL_TRANSFORMATION = 8;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__OWNED_COMMENT = QVTBasePackage.TRANSFORMATION__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__NAME = QVTBasePackage.TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__PACKAGE = QVTBasePackage.TRANSFORMATION__PACKAGE;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__IS_ABSTRACT = QVTBasePackage.TRANSFORMATION__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__OWNED_ATTRIBUTE = QVTBasePackage.TRANSFORMATION__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__OWNED_OPERATION = QVTBasePackage.TRANSFORMATION__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__SUPER_CLASS = QVTBasePackage.TRANSFORMATION__SUPER_CLASS;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__NESTED_PACKAGE = QVTBasePackage.TRANSFORMATION__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__NESTING_PACKAGE = QVTBasePackage.TRANSFORMATION__NESTING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__OWNED_TYPE = QVTBasePackage.TRANSFORMATION__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__URI = QVTBasePackage.TRANSFORMATION__URI;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__EXTENDS = QVTBasePackage.TRANSFORMATION__EXTENDS;

	/**
	 * The feature id for the '<em><b>Model Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__MODEL_PARAMETER = QVTBasePackage.TRANSFORMATION__MODEL_PARAMETER;

	/**
	 * The feature id for the '<em><b>Owned Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__OWNED_TAG = QVTBasePackage.TRANSFORMATION__OWNED_TAG;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__RULE = QVTBasePackage.TRANSFORMATION__RULE;

	/**
	 * The feature id for the '<em><b>Owned Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION__OWNED_KEY = QVTBasePackage.TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relational Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION_FEATURE_COUNT = QVTBasePackage.TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION___CONTAINER = QVTBasePackage.TRANSFORMATION___CONTAINER;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION___EQUALS__OBJECT = QVTBasePackage.TRANSFORMATION___EQUALS__OBJECT;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION___GET__PROPERTY = QVTBasePackage.TRANSFORMATION___GET__PROPERTY;

	/**
	 * The operation id for the '<em>Get Meta Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION___GET_META_CLASS = QVTBasePackage.TRANSFORMATION___GET_META_CLASS;

	/**
	 * The operation id for the '<em>Is Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION___IS_SET__PROPERTY = QVTBasePackage.TRANSFORMATION___IS_SET__PROPERTY;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION___SET__PROPERTY_OBJECT = QVTBasePackage.TRANSFORMATION___SET__PROPERTY_OBJECT;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION___UNSET__PROPERTY = QVTBasePackage.TRANSFORMATION___UNSET__PROPERTY;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION___IS_INSTANCE__OBJECT = QVTBasePackage.TRANSFORMATION___IS_INSTANCE__OBJECT;

	/**
	 * The number of operations of the '<em>Relational Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TRANSFORMATION_OPERATION_COUNT = QVTBasePackage.TRANSFORMATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link QVTRelation.DomainPattern <em>Domain Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Pattern</em>'.
	 * @see QVTRelation.DomainPattern
	 * @generated
	 */
	EClass getDomainPattern();

	/**
	 * Returns the meta object for the container reference '{@link QVTRelation.DomainPattern#getRelationDomain <em>Relation Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Relation Domain</em>'.
	 * @see QVTRelation.DomainPattern#getRelationDomain()
	 * @see #getDomainPattern()
	 * @generated
	 */
	EReference getDomainPattern_RelationDomain();

	/**
	 * Returns the meta object for the containment reference '{@link QVTRelation.DomainPattern#getTemplateExpression <em>Template Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template Expression</em>'.
	 * @see QVTRelation.DomainPattern#getTemplateExpression()
	 * @see #getDomainPattern()
	 * @generated
	 */
	EReference getDomainPattern_TemplateExpression();

	/**
	 * Returns the meta object for class '{@link QVTRelation.Key <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key</em>'.
	 * @see QVTRelation.Key
	 * @generated
	 */
	EClass getKey();

	/**
	 * Returns the meta object for the reference '{@link QVTRelation.Key#getIdentifies <em>Identifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identifies</em>'.
	 * @see QVTRelation.Key#getIdentifies()
	 * @see #getKey()
	 * @generated
	 */
	EReference getKey_Identifies();

	/**
	 * Returns the meta object for the reference list '{@link QVTRelation.Key#getOppositePart <em>Opposite Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Opposite Part</em>'.
	 * @see QVTRelation.Key#getOppositePart()
	 * @see #getKey()
	 * @generated
	 */
	EReference getKey_OppositePart();

	/**
	 * Returns the meta object for the reference list '{@link QVTRelation.Key#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Part</em>'.
	 * @see QVTRelation.Key#getPart()
	 * @see #getKey()
	 * @generated
	 */
	EReference getKey_Part();

	/**
	 * Returns the meta object for the container reference '{@link QVTRelation.Key#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transformation</em>'.
	 * @see QVTRelation.Key#getTransformation()
	 * @see #getKey()
	 * @generated
	 */
	EReference getKey_Transformation();

	/**
	 * Returns the meta object for class '{@link QVTRelation.OppositePropertyCallExp <em>Opposite Property Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opposite Property Call Exp</em>'.
	 * @see QVTRelation.OppositePropertyCallExp
	 * @generated
	 */
	EClass getOppositePropertyCallExp();

	/**
	 * Returns the meta object for class '{@link QVTRelation.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see QVTRelation.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link QVTRelation.Relation#getIsTopLevel <em>Is Top Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Top Level</em>'.
	 * @see QVTRelation.Relation#getIsTopLevel()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_IsTopLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTRelation.Relation#getOperationalImpl <em>Operational Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operational Impl</em>'.
	 * @see QVTRelation.Relation#getOperationalImpl()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_OperationalImpl();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTRelation.Relation#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see QVTRelation.Relation#getVariable()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link QVTRelation.Relation#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When</em>'.
	 * @see QVTRelation.Relation#getWhen()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_When();

	/**
	 * Returns the meta object for the containment reference '{@link QVTRelation.Relation#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see QVTRelation.Relation#getWhere()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Where();

	/**
	 * Returns the meta object for class '{@link QVTRelation.RelationCallExp <em>Relation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Call Exp</em>'.
	 * @see QVTRelation.RelationCallExp
	 * @generated
	 */
	EClass getRelationCallExp();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTRelation.RelationCallExp#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see QVTRelation.RelationCallExp#getArgument()
	 * @see #getRelationCallExp()
	 * @generated
	 */
	EReference getRelationCallExp_Argument();

	/**
	 * Returns the meta object for the reference '{@link QVTRelation.RelationCallExp#getReferredRelation <em>Referred Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Relation</em>'.
	 * @see QVTRelation.RelationCallExp#getReferredRelation()
	 * @see #getRelationCallExp()
	 * @generated
	 */
	EReference getRelationCallExp_ReferredRelation();

	/**
	 * Returns the meta object for class '{@link QVTRelation.RelationDomain <em>Relation Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Domain</em>'.
	 * @see QVTRelation.RelationDomain
	 * @generated
	 */
	EClass getRelationDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTRelation.RelationDomain#getDefaultAssignment <em>Default Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Default Assignment</em>'.
	 * @see QVTRelation.RelationDomain#getDefaultAssignment()
	 * @see #getRelationDomain()
	 * @generated
	 */
	EReference getRelationDomain_DefaultAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link QVTRelation.RelationDomain#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see QVTRelation.RelationDomain#getPattern()
	 * @see #getRelationDomain()
	 * @generated
	 */
	EReference getRelationDomain_Pattern();

	/**
	 * Returns the meta object for the reference '{@link QVTRelation.RelationDomain#getRootVariable <em>Root Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Variable</em>'.
	 * @see QVTRelation.RelationDomain#getRootVariable()
	 * @see #getRelationDomain()
	 * @generated
	 */
	EReference getRelationDomain_RootVariable();

	/**
	 * Returns the meta object for class '{@link QVTRelation.RelationDomainAssignment <em>Relation Domain Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Domain Assignment</em>'.
	 * @see QVTRelation.RelationDomainAssignment
	 * @generated
	 */
	EClass getRelationDomainAssignment();

	/**
	 * Returns the meta object for the container reference '{@link QVTRelation.RelationDomainAssignment#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see QVTRelation.RelationDomainAssignment#getOwner()
	 * @see #getRelationDomainAssignment()
	 * @generated
	 */
	EReference getRelationDomainAssignment_Owner();

	/**
	 * Returns the meta object for the containment reference '{@link QVTRelation.RelationDomainAssignment#getValueExp <em>Value Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Exp</em>'.
	 * @see QVTRelation.RelationDomainAssignment#getValueExp()
	 * @see #getRelationDomainAssignment()
	 * @generated
	 */
	EReference getRelationDomainAssignment_ValueExp();

	/**
	 * Returns the meta object for the reference '{@link QVTRelation.RelationDomainAssignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see QVTRelation.RelationDomainAssignment#getVariable()
	 * @see #getRelationDomainAssignment()
	 * @generated
	 */
	EReference getRelationDomainAssignment_Variable();

	/**
	 * Returns the meta object for class '{@link QVTRelation.RelationImplementation <em>Relation Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Implementation</em>'.
	 * @see QVTRelation.RelationImplementation
	 * @generated
	 */
	EClass getRelationImplementation();

	/**
	 * Returns the meta object for the reference '{@link QVTRelation.RelationImplementation#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Impl</em>'.
	 * @see QVTRelation.RelationImplementation#getImpl()
	 * @see #getRelationImplementation()
	 * @generated
	 */
	EReference getRelationImplementation_Impl();

	/**
	 * Returns the meta object for the reference '{@link QVTRelation.RelationImplementation#getInDirectionOf <em>In Direction Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Direction Of</em>'.
	 * @see QVTRelation.RelationImplementation#getInDirectionOf()
	 * @see #getRelationImplementation()
	 * @generated
	 */
	EReference getRelationImplementation_InDirectionOf();

	/**
	 * Returns the meta object for the container reference '{@link QVTRelation.RelationImplementation#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Relation</em>'.
	 * @see QVTRelation.RelationImplementation#getRelation()
	 * @see #getRelationImplementation()
	 * @generated
	 */
	EReference getRelationImplementation_Relation();

	/**
	 * Returns the meta object for class '{@link QVTRelation.RelationalTransformation <em>Relational Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Transformation</em>'.
	 * @see QVTRelation.RelationalTransformation
	 * @generated
	 */
	EClass getRelationalTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link QVTRelation.RelationalTransformation#getOwnedKey <em>Owned Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Key</em>'.
	 * @see QVTRelation.RelationalTransformation#getOwnedKey()
	 * @see #getRelationalTransformation()
	 * @generated
	 */
	EReference getRelationalTransformation_OwnedKey();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QVTRelationFactory getQVTRelationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link QVTRelation.impl.DomainPatternImpl <em>Domain Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTRelation.impl.DomainPatternImpl
		 * @see QVTRelation.impl.QVTRelationPackageImpl#getDomainPattern()
		 * @generated
		 */
		EClass DOMAIN_PATTERN = eINSTANCE.getDomainPattern();

		/**
		 * The meta object literal for the '<em><b>Relation Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_PATTERN__RELATION_DOMAIN = eINSTANCE.getDomainPattern_RelationDomain();

		/**
		 * The meta object literal for the '<em><b>Template Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_PATTERN__TEMPLATE_EXPRESSION = eINSTANCE.getDomainPattern_TemplateExpression();

		/**
		 * The meta object literal for the '{@link QVTRelation.impl.KeyImpl <em>Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTRelation.impl.KeyImpl
		 * @see QVTRelation.impl.QVTRelationPackageImpl#getKey()
		 * @generated
		 */
		EClass KEY = eINSTANCE.getKey();

		/**
		 * The meta object literal for the '<em><b>Identifies</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY__IDENTIFIES = eINSTANCE.getKey_Identifies();

		/**
		 * The meta object literal for the '<em><b>Opposite Part</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY__OPPOSITE_PART = eINSTANCE.getKey_OppositePart();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY__PART = eINSTANCE.getKey_Part();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY__TRANSFORMATION = eINSTANCE.getKey_Transformation();

		/**
		 * The meta object literal for the '{@link QVTRelation.impl.OppositePropertyCallExpImpl <em>Opposite Property Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTRelation.impl.OppositePropertyCallExpImpl
		 * @see QVTRelation.impl.QVTRelationPackageImpl#getOppositePropertyCallExp()
		 * @generated
		 */
		EClass OPPOSITE_PROPERTY_CALL_EXP = eINSTANCE.getOppositePropertyCallExp();

		/**
		 * The meta object literal for the '{@link QVTRelation.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTRelation.impl.RelationImpl
		 * @see QVTRelation.impl.QVTRelationPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Is Top Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__IS_TOP_LEVEL = eINSTANCE.getRelation_IsTopLevel();

		/**
		 * The meta object literal for the '<em><b>Operational Impl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__OPERATIONAL_IMPL = eINSTANCE.getRelation_OperationalImpl();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__VARIABLE = eINSTANCE.getRelation_Variable();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__WHEN = eINSTANCE.getRelation_When();

		/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__WHERE = eINSTANCE.getRelation_Where();

		/**
		 * The meta object literal for the '{@link QVTRelation.impl.RelationCallExpImpl <em>Relation Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTRelation.impl.RelationCallExpImpl
		 * @see QVTRelation.impl.QVTRelationPackageImpl#getRelationCallExp()
		 * @generated
		 */
		EClass RELATION_CALL_EXP = eINSTANCE.getRelationCallExp();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CALL_EXP__ARGUMENT = eINSTANCE.getRelationCallExp_Argument();

		/**
		 * The meta object literal for the '<em><b>Referred Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_CALL_EXP__REFERRED_RELATION = eINSTANCE.getRelationCallExp_ReferredRelation();

		/**
		 * The meta object literal for the '{@link QVTRelation.impl.RelationDomainImpl <em>Relation Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTRelation.impl.RelationDomainImpl
		 * @see QVTRelation.impl.QVTRelationPackageImpl#getRelationDomain()
		 * @generated
		 */
		EClass RELATION_DOMAIN = eINSTANCE.getRelationDomain();

		/**
		 * The meta object literal for the '<em><b>Default Assignment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_DOMAIN__DEFAULT_ASSIGNMENT = eINSTANCE.getRelationDomain_DefaultAssignment();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_DOMAIN__PATTERN = eINSTANCE.getRelationDomain_Pattern();

		/**
		 * The meta object literal for the '<em><b>Root Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_DOMAIN__ROOT_VARIABLE = eINSTANCE.getRelationDomain_RootVariable();

		/**
		 * The meta object literal for the '{@link QVTRelation.impl.RelationDomainAssignmentImpl <em>Relation Domain Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTRelation.impl.RelationDomainAssignmentImpl
		 * @see QVTRelation.impl.QVTRelationPackageImpl#getRelationDomainAssignment()
		 * @generated
		 */
		EClass RELATION_DOMAIN_ASSIGNMENT = eINSTANCE.getRelationDomainAssignment();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_DOMAIN_ASSIGNMENT__OWNER = eINSTANCE.getRelationDomainAssignment_Owner();

		/**
		 * The meta object literal for the '<em><b>Value Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_DOMAIN_ASSIGNMENT__VALUE_EXP = eINSTANCE.getRelationDomainAssignment_ValueExp();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_DOMAIN_ASSIGNMENT__VARIABLE = eINSTANCE.getRelationDomainAssignment_Variable();

		/**
		 * The meta object literal for the '{@link QVTRelation.impl.RelationImplementationImpl <em>Relation Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTRelation.impl.RelationImplementationImpl
		 * @see QVTRelation.impl.QVTRelationPackageImpl#getRelationImplementation()
		 * @generated
		 */
		EClass RELATION_IMPLEMENTATION = eINSTANCE.getRelationImplementation();

		/**
		 * The meta object literal for the '<em><b>Impl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_IMPLEMENTATION__IMPL = eINSTANCE.getRelationImplementation_Impl();

		/**
		 * The meta object literal for the '<em><b>In Direction Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_IMPLEMENTATION__IN_DIRECTION_OF = eINSTANCE.getRelationImplementation_InDirectionOf();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_IMPLEMENTATION__RELATION = eINSTANCE.getRelationImplementation_Relation();

		/**
		 * The meta object literal for the '{@link QVTRelation.impl.RelationalTransformationImpl <em>Relational Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QVTRelation.impl.RelationalTransformationImpl
		 * @see QVTRelation.impl.QVTRelationPackageImpl#getRelationalTransformation()
		 * @generated
		 */
		EClass RELATIONAL_TRANSFORMATION = eINSTANCE.getRelationalTransformation();

		/**
		 * The meta object literal for the '<em><b>Owned Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_TRANSFORMATION__OWNED_KEY = eINSTANCE.getRelationalTransformation_OwnedKey();

	}

} //QVTRelationPackage
