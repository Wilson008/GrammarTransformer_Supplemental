/**
 */
package QVTBase.impl;

import EMOF.EMOFPackage;

import EMOF.impl.EMOFPackageImpl;

import EssentialOCL.EssentialOCLPackage;

import EssentialOCL.impl.EssentialOCLPackageImpl;

import ImperativeOCL.ImperativeOCLPackage;

import ImperativeOCL.impl.ImperativeOCLPackageImpl;

import PrimitiveTypes.PrimitiveTypesPackage;

import PrimitiveTypes.impl.PrimitiveTypesPackageImpl;

import QVTBase.Domain;
import QVTBase.Function;
import QVTBase.FunctionParameter;
import QVTBase.Pattern;
import QVTBase.Predicate;
import QVTBase.QVTBaseFactory;
import QVTBase.QVTBasePackage;
import QVTBase.Rule;
import QVTBase.Transformation;
import QVTBase.TypedModel;

import QVTOperational.QVTOperationalPackage;

import QVTOperational.impl.QVTOperationalPackageImpl;

import QVTRelation.QVTRelationPackage;

import QVTRelation.impl.QVTRelationPackageImpl;

import QVTTemplate.QVTTemplatePackage;

import QVTTemplate.impl.QVTTemplatePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QVTBasePackageImpl extends EPackageImpl implements QVTBasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see QVTBase.QVTBasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QVTBasePackageImpl() {
		super(eNS_URI, QVTBaseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link QVTBasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QVTBasePackage init() {
		if (isInited) return (QVTBasePackage)EPackage.Registry.INSTANCE.getEPackage(QVTBasePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQVTBasePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QVTBasePackageImpl theQVTBasePackage = registeredQVTBasePackage instanceof QVTBasePackageImpl ? (QVTBasePackageImpl)registeredQVTBasePackage : new QVTBasePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(QVTOperationalPackage.eNS_URI);
		QVTOperationalPackageImpl theQVTOperationalPackage = (QVTOperationalPackageImpl)(registeredPackage instanceof QVTOperationalPackageImpl ? registeredPackage : QVTOperationalPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EMOFPackage.eNS_URI);
		EMOFPackageImpl theEMOFPackage = (EMOFPackageImpl)(registeredPackage instanceof EMOFPackageImpl ? registeredPackage : EMOFPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI);
		PrimitiveTypesPackageImpl thePrimitiveTypesPackage = (PrimitiveTypesPackageImpl)(registeredPackage instanceof PrimitiveTypesPackageImpl ? registeredPackage : PrimitiveTypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EssentialOCLPackage.eNS_URI);
		EssentialOCLPackageImpl theEssentialOCLPackage = (EssentialOCLPackageImpl)(registeredPackage instanceof EssentialOCLPackageImpl ? registeredPackage : EssentialOCLPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ImperativeOCLPackage.eNS_URI);
		ImperativeOCLPackageImpl theImperativeOCLPackage = (ImperativeOCLPackageImpl)(registeredPackage instanceof ImperativeOCLPackageImpl ? registeredPackage : ImperativeOCLPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(QVTRelationPackage.eNS_URI);
		QVTRelationPackageImpl theQVTRelationPackage = (QVTRelationPackageImpl)(registeredPackage instanceof QVTRelationPackageImpl ? registeredPackage : QVTRelationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(QVTTemplatePackage.eNS_URI);
		QVTTemplatePackageImpl theQVTTemplatePackage = (QVTTemplatePackageImpl)(registeredPackage instanceof QVTTemplatePackageImpl ? registeredPackage : QVTTemplatePackage.eINSTANCE);

		// Create package meta-data objects
		theQVTBasePackage.createPackageContents();
		theQVTOperationalPackage.createPackageContents();
		theEMOFPackage.createPackageContents();
		thePrimitiveTypesPackage.createPackageContents();
		theEssentialOCLPackage.createPackageContents();
		theImperativeOCLPackage.createPackageContents();
		theQVTRelationPackage.createPackageContents();
		theQVTTemplatePackage.createPackageContents();

		// Initialize created meta-data
		theQVTBasePackage.initializePackageContents();
		theQVTOperationalPackage.initializePackageContents();
		theEMOFPackage.initializePackageContents();
		thePrimitiveTypesPackage.initializePackageContents();
		theEssentialOCLPackage.initializePackageContents();
		theImperativeOCLPackage.initializePackageContents();
		theQVTRelationPackage.initializePackageContents();
		theQVTTemplatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQVTBasePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QVTBasePackage.eNS_URI, theQVTBasePackage);
		return theQVTBasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_IsCheckable() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomain_IsEnforceable() {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_Rule() {
		return (EReference)domainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_TypedModel() {
		return (EReference)domainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_QueryExpression() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionParameter() {
		return functionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern() {
		return patternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_BindsTo() {
		return (EReference)patternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Predicate() {
		return (EReference)patternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicate() {
		return predicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicate_ConditionExpression() {
		return (EReference)predicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicate_Pattern() {
		return (EReference)predicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Domain() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_IsAbstract() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Overrides() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Transformation() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Extends() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_ModelParameter() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_OwnedTag() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Rule() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedModel() {
		return typedModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedModel_DependsOn() {
		return (EReference)typedModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedModel_Transformation() {
		return (EReference)typedModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedModel_UsedPackage() {
		return (EReference)typedModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTBaseFactory getQVTBaseFactory() {
		return (QVTBaseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		domainEClass = createEClass(DOMAIN);
		createEAttribute(domainEClass, DOMAIN__IS_CHECKABLE);
		createEAttribute(domainEClass, DOMAIN__IS_ENFORCEABLE);
		createEReference(domainEClass, DOMAIN__RULE);
		createEReference(domainEClass, DOMAIN__TYPED_MODEL);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__QUERY_EXPRESSION);

		functionParameterEClass = createEClass(FUNCTION_PARAMETER);

		patternEClass = createEClass(PATTERN);
		createEReference(patternEClass, PATTERN__BINDS_TO);
		createEReference(patternEClass, PATTERN__PREDICATE);

		predicateEClass = createEClass(PREDICATE);
		createEReference(predicateEClass, PREDICATE__CONDITION_EXPRESSION);
		createEReference(predicateEClass, PREDICATE__PATTERN);

		ruleEClass = createEClass(RULE);
		createEReference(ruleEClass, RULE__DOMAIN);
		createEAttribute(ruleEClass, RULE__IS_ABSTRACT);
		createEReference(ruleEClass, RULE__OVERRIDES);
		createEReference(ruleEClass, RULE__TRANSFORMATION);

		transformationEClass = createEClass(TRANSFORMATION);
		createEReference(transformationEClass, TRANSFORMATION__EXTENDS);
		createEReference(transformationEClass, TRANSFORMATION__MODEL_PARAMETER);
		createEReference(transformationEClass, TRANSFORMATION__OWNED_TAG);
		createEReference(transformationEClass, TRANSFORMATION__RULE);

		typedModelEClass = createEClass(TYPED_MODEL);
		createEReference(typedModelEClass, TYPED_MODEL__DEPENDS_ON);
		createEReference(typedModelEClass, TYPED_MODEL__TRANSFORMATION);
		createEReference(typedModelEClass, TYPED_MODEL__USED_PACKAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EMOFPackage theEMOFPackage = (EMOFPackage)EPackage.Registry.INSTANCE.getEPackage(EMOFPackage.eNS_URI);
		PrimitiveTypesPackage thePrimitiveTypesPackage = (PrimitiveTypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI);
		EssentialOCLPackage theEssentialOCLPackage = (EssentialOCLPackage)EPackage.Registry.INSTANCE.getEPackage(EssentialOCLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		domainEClass.getESuperTypes().add(theEMOFPackage.getNamedElement());
		functionEClass.getESuperTypes().add(theEMOFPackage.getOperation());
		functionParameterEClass.getESuperTypes().add(theEssentialOCLPackage.getVariable());
		functionParameterEClass.getESuperTypes().add(theEMOFPackage.getParameter());
		patternEClass.getESuperTypes().add(theEMOFPackage.getElement());
		predicateEClass.getESuperTypes().add(theEMOFPackage.getElement());
		ruleEClass.getESuperTypes().add(theEMOFPackage.getNamedElement());
		transformationEClass.getESuperTypes().add(theEMOFPackage.getClass_());
		transformationEClass.getESuperTypes().add(theEMOFPackage.getPackage());
		typedModelEClass.getESuperTypes().add(theEMOFPackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainEClass, Domain.class, "Domain", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomain_IsCheckable(), thePrimitiveTypesPackage.getBoolean(), "isCheckable", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomain_IsEnforceable(), thePrimitiveTypesPackage.getBoolean(), "isEnforceable", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Rule(), this.getRule(), this.getRule_Domain(), "rule", null, 1, 1, Domain.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_TypedModel(), this.getTypedModel(), null, "typedModel", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_QueryExpression(), theEssentialOCLPackage.getOclExpression(), null, "queryExpression", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionParameterEClass, FunctionParameter.class, "FunctionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPattern_BindsTo(), theEssentialOCLPackage.getVariable(), null, "bindsTo", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPattern_Predicate(), this.getPredicate(), this.getPredicate_Pattern(), "predicate", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(predicateEClass, Predicate.class, "Predicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredicate_ConditionExpression(), theEssentialOCLPackage.getOclExpression(), null, "conditionExpression", null, 1, 1, Predicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicate_Pattern(), this.getPattern(), this.getPattern_Predicate(), "pattern", null, 1, 1, Predicate.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRule_Domain(), this.getDomain(), this.getDomain_Rule(), "domain", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_IsAbstract(), thePrimitiveTypesPackage.getBoolean(), "isAbstract", "false", 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Overrides(), this.getRule(), null, "overrides", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Transformation(), this.getTransformation(), this.getTransformation_Rule(), "transformation", null, 0, 1, Rule.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformation_Extends(), this.getTransformation(), null, "extends", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_ModelParameter(), this.getTypedModel(), this.getTypedModel_Transformation(), "modelParameter", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransformation_OwnedTag(), theEMOFPackage.getTag(), null, "ownedTag", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransformation_Rule(), this.getRule(), this.getRule_Transformation(), "rule", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(typedModelEClass, TypedModel.class, "TypedModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedModel_DependsOn(), this.getTypedModel(), null, "dependsOn", null, 0, -1, TypedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTypedModel_Transformation(), this.getTransformation(), this.getTransformation_ModelParameter(), "transformation", null, 1, 1, TypedModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypedModel_UsedPackage(), theEMOFPackage.getPackage(), null, "usedPackage", null, 1, -1, TypedModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmofAnnotations() {
		String source = "http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName";
		addAnnotation
		  (getDomain_TypedModel(),
		   source,
		   new String[] {
			   "body", "domain"
		   });
		addAnnotation
		  (getFunction_QueryExpression(),
		   source,
		   new String[] {
			   "body", "function"
		   });
		addAnnotation
		  (getPattern_BindsTo(),
		   source,
		   new String[] {
			   "body", "pattern"
		   });
		addAnnotation
		  (getPredicate_ConditionExpression(),
		   source,
		   new String[] {
			   "body", "predicate"
		   });
		addAnnotation
		  (getRule_Overrides(),
		   source,
		   new String[] {
			   "body", "overridden"
		   });
		addAnnotation
		  (getTransformation_Extends(),
		   source,
		   new String[] {
			   "body", "extendedBy"
		   });
		addAnnotation
		  (getTransformation_ModelParameter(),
		   source,
		   new String[] {
			   "body", "transformation"
		   });
		addAnnotation
		  (getTransformation_OwnedTag(),
		   source,
		   new String[] {
			   "body", "transformation"
		   });
		addAnnotation
		  (getTypedModel_DependsOn(),
		   source,
		   new String[] {
			   "body", "dependent"
		   });
		addAnnotation
		  (getTypedModel_UsedPackage(),
		   source,
		   new String[] {
			   "body", "typedModel"
		   });
	}

} //QVTBasePackageImpl
