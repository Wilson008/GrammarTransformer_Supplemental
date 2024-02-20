/**
 */
package spectra.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import spectra.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpectraFactoryImpl extends EFactoryImpl implements SpectraFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpectraFactory init() {
		try {
			SpectraFactory theSpectraFactory = (SpectraFactory)EPackage.Registry.INSTANCE.getEFactory(SpectraPackage.eNS_URI);
			if (theSpectraFactory != null) {
				return theSpectraFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpectraFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpectraFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SpectraPackage.MODEL: return createModel();
			case SpectraPackage.IMPORT: return createImport();
			case SpectraPackage.DECL: return createDecl();
			case SpectraPackage.WEIGHT_DEF: return createWeightDef();
			case SpectraPackage.VAR: return createVar();
			case SpectraPackage.TYPE_DEF: return createTypeDef();
			case SpectraPackage.VAR_DECL: return createVarDecl();
			case SpectraPackage.REFERRABLE: return createReferrable();
			case SpectraPackage.TYPE_CONSTANT: return createTypeConstant();
			case SpectraPackage.DEFINE: return createDefine();
			case SpectraPackage.DEFINE_DECL: return createDefineDecl();
			case SpectraPackage.DEFINE_ARRAY: return createDefineArray();
			case SpectraPackage.DEFINE_REG_EXP: return createDefineRegExp();
			case SpectraPackage.DEFINE_REG_EXP_DECL: return createDefineRegExpDecl();
			case SpectraPackage.PATTERN_PARAM_LIST: return createPatternParamList();
			case SpectraPackage.PATTERN_PARAM: return createPatternParam();
			case SpectraPackage.TYPED_PARAM_LIST: return createTypedParamList();
			case SpectraPackage.TYPED_PARAM: return createTypedParam();
			case SpectraPackage.COUNTER: return createCounter();
			case SpectraPackage.MONITOR: return createMonitor();
			case SpectraPackage.PATTERN: return createPattern();
			case SpectraPackage.PREDICATE: return createPredicate();
			case SpectraPackage.VAR_TYPE: return createVarType();
			case SpectraPackage.LTL_GAR: return createLTLGar();
			case SpectraPackage.LTL_ASM: return createLTLAsm();
			case SpectraPackage.EX_GAR: return createEXGar();
			case SpectraPackage.TEMPORAL_EXPRESSION: return createTemporalExpression();
			case SpectraPackage.PREDICATE_OR_PATTERN_REFERRABLE: return createPredicateOrPatternReferrable();
			case SpectraPackage.SUBRANGE: return createSubrange();
			case SpectraPackage.TRIGGER: return createTrigger();
			case SpectraPackage.REG_EXP: return createRegExp();
			case SpectraPackage.BOOLEAN_TERM: return createBooleanTerm();
			case SpectraPackage.VALUE_IN_RANGE: return createValueInRange();
			case SpectraPackage.DOMAIN_VAR_DECL: return createDomainVarDecl();
			case SpectraPackage.SIZE_DEFINE_DECL: return createSizeDefineDecl();
			case SpectraPackage.TEMPORAL_IN_EXPR: return createTemporalInExpr();
			case SpectraPackage.TEMPORAL_IMP_EXPR: return createTemporalImpExpr();
			case SpectraPackage.TEMPORAL_IFF_EXPR: return createTemporalIffExpr();
			case SpectraPackage.TEMPORAL_OR_EXPR: return createTemporalOrExpr();
			case SpectraPackage.TEMPORAL_AND_EXPR: return createTemporalAndExpr();
			case SpectraPackage.TEMPORAL_RELATIONAL_EXPR: return createTemporalRelationalExpr();
			case SpectraPackage.TEMPORAL_REMAINDER_EXPR: return createTemporalRemainderExpr();
			case SpectraPackage.TEMPORAL_ADDITIVE_EXPR: return createTemporalAdditiveExpr();
			case SpectraPackage.TEMPORAL_MULTIPLICATIVE_EXPR: return createTemporalMultiplicativeExpr();
			case SpectraPackage.TEMPORAL_BINARY_EXPR: return createTemporalBinaryExpr();
			case SpectraPackage.TEMPORAL_UNARY_EXPR: return createTemporalUnaryExpr();
			case SpectraPackage.TEMPORAL_PRIMARY_EXPR: return createTemporalPrimaryExpr();
			case SpectraPackage.CONSTANT: return createConstant();
			case SpectraPackage.BINARY_REG_EXP: return createBinaryRegExp();
			case SpectraPackage.UNARY_REG_EXP: return createUnaryRegExp();
			case SpectraPackage.COMP_REG_EXP: return createCompRegExp();
			case SpectraPackage.QUANTIFIER_EXPR: return createQuantifierExpr();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SpectraPackage.VAR_OWNER:
				return createVarOwnerFromString(eDataType, initialValue);
			case SpectraPackage.OVERFLOW_METHOD:
				return createOverflowMethodFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SpectraPackage.VAR_OWNER:
				return convertVarOwnerToString(eDataType, instanceValue);
			case SpectraPackage.OVERFLOW_METHOD:
				return convertOverflowMethodToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decl createDecl() {
		DeclImpl decl = new DeclImpl();
		return decl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeightDef createWeightDef() {
		WeightDefImpl weightDef = new WeightDefImpl();
		return weightDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Var createVar() {
		VarImpl var = new VarImpl();
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDef createTypeDef() {
		TypeDefImpl typeDef = new TypeDefImpl();
		return typeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarDecl createVarDecl() {
		VarDeclImpl varDecl = new VarDeclImpl();
		return varDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Referrable createReferrable() {
		ReferrableImpl referrable = new ReferrableImpl();
		return referrable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConstant createTypeConstant() {
		TypeConstantImpl typeConstant = new TypeConstantImpl();
		return typeConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Define createDefine() {
		DefineImpl define = new DefineImpl();
		return define;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineDecl createDefineDecl() {
		DefineDeclImpl defineDecl = new DefineDeclImpl();
		return defineDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineArray createDefineArray() {
		DefineArrayImpl defineArray = new DefineArrayImpl();
		return defineArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineRegExp createDefineRegExp() {
		DefineRegExpImpl defineRegExp = new DefineRegExpImpl();
		return defineRegExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineRegExpDecl createDefineRegExpDecl() {
		DefineRegExpDeclImpl defineRegExpDecl = new DefineRegExpDeclImpl();
		return defineRegExpDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternParamList createPatternParamList() {
		PatternParamListImpl patternParamList = new PatternParamListImpl();
		return patternParamList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternParam createPatternParam() {
		PatternParamImpl patternParam = new PatternParamImpl();
		return patternParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedParamList createTypedParamList() {
		TypedParamListImpl typedParamList = new TypedParamListImpl();
		return typedParamList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedParam createTypedParam() {
		TypedParamImpl typedParam = new TypedParamImpl();
		return typedParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Counter createCounter() {
		CounterImpl counter = new CounterImpl();
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitor createMonitor() {
		MonitorImpl monitor = new MonitorImpl();
		return monitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern createPattern() {
		PatternImpl pattern = new PatternImpl();
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate createPredicate() {
		PredicateImpl predicate = new PredicateImpl();
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarType createVarType() {
		VarTypeImpl varType = new VarTypeImpl();
		return varType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTLGar createLTLGar() {
		LTLGarImpl ltlGar = new LTLGarImpl();
		return ltlGar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LTLAsm createLTLAsm() {
		LTLAsmImpl ltlAsm = new LTLAsmImpl();
		return ltlAsm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EXGar createEXGar() {
		EXGarImpl exGar = new EXGarImpl();
		return exGar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalExpression createTemporalExpression() {
		TemporalExpressionImpl temporalExpression = new TemporalExpressionImpl();
		return temporalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateOrPatternReferrable createPredicateOrPatternReferrable() {
		PredicateOrPatternReferrableImpl predicateOrPatternReferrable = new PredicateOrPatternReferrableImpl();
		return predicateOrPatternReferrable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subrange createSubrange() {
		SubrangeImpl subrange = new SubrangeImpl();
		return subrange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegExp createRegExp() {
		RegExpImpl regExp = new RegExpImpl();
		return regExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanTerm createBooleanTerm() {
		BooleanTermImpl booleanTerm = new BooleanTermImpl();
		return booleanTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueInRange createValueInRange() {
		ValueInRangeImpl valueInRange = new ValueInRangeImpl();
		return valueInRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainVarDecl createDomainVarDecl() {
		DomainVarDeclImpl domainVarDecl = new DomainVarDeclImpl();
		return domainVarDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeDefineDecl createSizeDefineDecl() {
		SizeDefineDeclImpl sizeDefineDecl = new SizeDefineDeclImpl();
		return sizeDefineDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalInExpr createTemporalInExpr() {
		TemporalInExprImpl temporalInExpr = new TemporalInExprImpl();
		return temporalInExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalImpExpr createTemporalImpExpr() {
		TemporalImpExprImpl temporalImpExpr = new TemporalImpExprImpl();
		return temporalImpExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalIffExpr createTemporalIffExpr() {
		TemporalIffExprImpl temporalIffExpr = new TemporalIffExprImpl();
		return temporalIffExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalOrExpr createTemporalOrExpr() {
		TemporalOrExprImpl temporalOrExpr = new TemporalOrExprImpl();
		return temporalOrExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalAndExpr createTemporalAndExpr() {
		TemporalAndExprImpl temporalAndExpr = new TemporalAndExprImpl();
		return temporalAndExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalRelationalExpr createTemporalRelationalExpr() {
		TemporalRelationalExprImpl temporalRelationalExpr = new TemporalRelationalExprImpl();
		return temporalRelationalExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalRemainderExpr createTemporalRemainderExpr() {
		TemporalRemainderExprImpl temporalRemainderExpr = new TemporalRemainderExprImpl();
		return temporalRemainderExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalAdditiveExpr createTemporalAdditiveExpr() {
		TemporalAdditiveExprImpl temporalAdditiveExpr = new TemporalAdditiveExprImpl();
		return temporalAdditiveExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalMultiplicativeExpr createTemporalMultiplicativeExpr() {
		TemporalMultiplicativeExprImpl temporalMultiplicativeExpr = new TemporalMultiplicativeExprImpl();
		return temporalMultiplicativeExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalBinaryExpr createTemporalBinaryExpr() {
		TemporalBinaryExprImpl temporalBinaryExpr = new TemporalBinaryExprImpl();
		return temporalBinaryExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalUnaryExpr createTemporalUnaryExpr() {
		TemporalUnaryExprImpl temporalUnaryExpr = new TemporalUnaryExprImpl();
		return temporalUnaryExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalPrimaryExpr createTemporalPrimaryExpr() {
		TemporalPrimaryExprImpl temporalPrimaryExpr = new TemporalPrimaryExprImpl();
		return temporalPrimaryExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryRegExp createBinaryRegExp() {
		BinaryRegExpImpl binaryRegExp = new BinaryRegExpImpl();
		return binaryRegExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryRegExp createUnaryRegExp() {
		UnaryRegExpImpl unaryRegExp = new UnaryRegExpImpl();
		return unaryRegExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompRegExp createCompRegExp() {
		CompRegExpImpl compRegExp = new CompRegExpImpl();
		return compRegExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifierExpr createQuantifierExpr() {
		QuantifierExprImpl quantifierExpr = new QuantifierExprImpl();
		return quantifierExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarOwner createVarOwnerFromString(EDataType eDataType, String initialValue) {
		VarOwner result = VarOwner.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVarOwnerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverflowMethod createOverflowMethodFromString(EDataType eDataType, String initialValue) {
		OverflowMethod result = OverflowMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOverflowMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpectraPackage getSpectraPackage() {
		return (SpectraPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpectraPackage getPackage() {
		return SpectraPackage.eINSTANCE;
	}

} //SpectraFactoryImpl
