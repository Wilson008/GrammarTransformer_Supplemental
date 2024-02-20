/*
 * generated by Xtext 2.25.0
 */
package org.prettyprinter.sml.serializer;

import com.google.inject.Inject;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.prettyprinter.sml.services.SMLGrammarAccess;
import org.scenariotools.sml.Alternative;
import org.scenariotools.sml.Case;
import org.scenariotools.sml.ChannelOptions;
import org.scenariotools.sml.ClockFragment;
import org.scenariotools.sml.Collaboration;
import org.scenariotools.sml.Condition;
import org.scenariotools.sml.ConditionExpression;
import org.scenariotools.sml.ConstraintBlock;
import org.scenariotools.sml.DummyExprClass;
import org.scenariotools.sml.EnumRanges;
import org.scenariotools.sml.EventParameterRanges;
import org.scenariotools.sml.FeatureAccessBindingExpression;
import org.scenariotools.sml.IntegerRanges;
import org.scenariotools.sml.Interaction;
import org.scenariotools.sml.InterruptCondition;
import org.scenariotools.sml.Loop;
import org.scenariotools.sml.Message;
import org.scenariotools.sml.MessageChannel;
import org.scenariotools.sml.ModalMessage;
import org.scenariotools.sml.ObjectQueryBindingExpression;
import org.scenariotools.sml.ObjectQueryValue;
import org.scenariotools.sml.Parallel;
import org.scenariotools.sml.ParameterBinding;
import org.scenariotools.sml.ParameterExpression;
import org.scenariotools.sml.RangesForParameter;
import org.scenariotools.sml.Role;
import org.scenariotools.sml.RoleBindingConstraint;
import org.scenariotools.sml.Scenario;
import org.scenariotools.sml.SmlPackage;
import org.scenariotools.sml.Specification;
import org.scenariotools.sml.StringRanges;
import org.scenariotools.sml.TimedInterruptCondition;
import org.scenariotools.sml.TimedViolationCondition;
import org.scenariotools.sml.TimedWaitCondition;
import org.scenariotools.sml.ValueParameterExpression;
import org.scenariotools.sml.VariableBindingParameterExpression;
import org.scenariotools.sml.VariableFragment;
import org.scenariotools.sml.ViolationCondition;
import org.scenariotools.sml.WaitCondition;
import org.scenariotools.sml.WildcardParameterExpression;

@SuppressWarnings("all")
public class SMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SMLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EcorePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EcorePackage.EANNOTATION:
				sequence_EAnnotation(context, (EAnnotation) semanticObject); 
				return; 
			case EcorePackage.EATTRIBUTE:
				sequence_EAttribute(context, (EAttribute) semanticObject); 
				return; 
			case EcorePackage.ECLASS:
				sequence_EClass(context, (EClass) semanticObject); 
				return; 
			case EcorePackage.EDATA_TYPE:
				sequence_EDataType_Impl(context, (EDataType) semanticObject); 
				return; 
			case EcorePackage.EENUM:
				sequence_EEnum(context, (EEnum) semanticObject); 
				return; 
			case EcorePackage.EENUM_LITERAL:
				sequence_EEnumLiteral(context, (EEnumLiteral) semanticObject); 
				return; 
			case EcorePackage.EGENERIC_TYPE:
				sequence_EGenericType(context, (EGenericType) semanticObject); 
				return; 
			case EcorePackage.EOBJECT:
				sequence_EObject(context, (EObject) semanticObject); 
				return; 
			case EcorePackage.EOPERATION:
				sequence_EOperation(context, (EOperation) semanticObject); 
				return; 
			case EcorePackage.EPACKAGE:
				sequence_EPackage(context, (EPackage) semanticObject); 
				return; 
			case EcorePackage.EPARAMETER:
				sequence_EParameter(context, (EParameter) semanticObject); 
				return; 
			case EcorePackage.EREFERENCE:
				sequence_EReference(context, (EReference) semanticObject); 
				return; 
			case EcorePackage.ESTRING_TO_STRING_MAP_ENTRY:
				sequence_EStringToStringMapEntry(context, (Map.Entry) semanticObject); 
				return; 
			case EcorePackage.ETYPE_PARAMETER:
				sequence_ETypeParameter(context, (ETypeParameter) semanticObject); 
				return; 
			}
		else if (epackage == SmlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SmlPackage.ALTERNATIVE:
				sequence_Alternative(context, (Alternative) semanticObject); 
				return; 
			case SmlPackage.CASE:
				sequence_Case(context, (Case) semanticObject); 
				return; 
			case SmlPackage.CHANNEL_OPTIONS:
				sequence_ChannelOptions(context, (ChannelOptions) semanticObject); 
				return; 
			case SmlPackage.CLOCK_FRAGMENT:
				sequence_ClockFragment(context, (ClockFragment) semanticObject); 
				return; 
			case SmlPackage.COLLABORATION:
				sequence_Collaboration(context, (Collaboration) semanticObject); 
				return; 
			case SmlPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case SmlPackage.CONDITION_EXPRESSION:
				sequence_ConditionExpression(context, (ConditionExpression) semanticObject); 
				return; 
			case SmlPackage.CONSTRAINT_BLOCK:
				sequence_ConstraintBlock(context, (ConstraintBlock) semanticObject); 
				return; 
			case SmlPackage.DUMMY_EXPR_CLASS:
				sequence_DummyExprClass_Impl(context, (DummyExprClass) semanticObject); 
				return; 
			case SmlPackage.ENUM_RANGES:
				sequence_EnumRanges(context, (EnumRanges) semanticObject); 
				return; 
			case SmlPackage.EVENT_PARAMETER_RANGES:
				sequence_EventParameterRanges(context, (EventParameterRanges) semanticObject); 
				return; 
			case SmlPackage.FEATURE_ACCESS_BINDING_EXPRESSION:
				sequence_FeatureAccessBindingExpression(context, (FeatureAccessBindingExpression) semanticObject); 
				return; 
			case SmlPackage.INTEGER_RANGES:
				sequence_IntegerRanges(context, (IntegerRanges) semanticObject); 
				return; 
			case SmlPackage.INTERACTION:
				sequence_Interaction(context, (Interaction) semanticObject); 
				return; 
			case SmlPackage.INTERRUPT_CONDITION:
				sequence_InterruptCondition(context, (InterruptCondition) semanticObject); 
				return; 
			case SmlPackage.LOOP:
				sequence_Loop(context, (Loop) semanticObject); 
				return; 
			case SmlPackage.MESSAGE:
				sequence_Message_Impl(context, (Message) semanticObject); 
				return; 
			case SmlPackage.MESSAGE_CHANNEL:
				sequence_MessageChannel(context, (MessageChannel) semanticObject); 
				return; 
			case SmlPackage.MODAL_MESSAGE:
				sequence_ModalMessage(context, (ModalMessage) semanticObject); 
				return; 
			case SmlPackage.OBJECT_QUERY_BINDING_EXPRESSION:
				sequence_ObjectQueryBindingExpression(context, (ObjectQueryBindingExpression) semanticObject); 
				return; 
			case SmlPackage.OBJECT_QUERY_VALUE:
				sequence_ObjectQueryValue(context, (ObjectQueryValue) semanticObject); 
				return; 
			case SmlPackage.PARALLEL:
				sequence_Parallel(context, (Parallel) semanticObject); 
				return; 
			case SmlPackage.PARAMETER_BINDING:
				sequence_ParameterBinding(context, (ParameterBinding) semanticObject); 
				return; 
			case SmlPackage.PARAMETER_EXPRESSION:
				sequence_ParameterExpression_Impl(context, (ParameterExpression) semanticObject); 
				return; 
			case SmlPackage.RANGES_FOR_PARAMETER:
				sequence_RangesForParameter(context, (RangesForParameter) semanticObject); 
				return; 
			case SmlPackage.ROLE:
				sequence_Role(context, (Role) semanticObject); 
				return; 
			case SmlPackage.ROLE_BINDING_CONSTRAINT:
				sequence_RoleBindingConstraint(context, (RoleBindingConstraint) semanticObject); 
				return; 
			case SmlPackage.SCENARIO:
				sequence_Scenario(context, (Scenario) semanticObject); 
				return; 
			case SmlPackage.SPECIFICATION:
				sequence_Specification(context, (Specification) semanticObject); 
				return; 
			case SmlPackage.STRING_RANGES:
				sequence_StringRanges(context, (StringRanges) semanticObject); 
				return; 
			case SmlPackage.TIMED_INTERRUPT_CONDITION:
				sequence_TimedInterruptCondition(context, (TimedInterruptCondition) semanticObject); 
				return; 
			case SmlPackage.TIMED_VIOLATION_CONDITION:
				sequence_TimedViolationCondition(context, (TimedViolationCondition) semanticObject); 
				return; 
			case SmlPackage.TIMED_WAIT_CONDITION:
				sequence_TimedWaitCondition(context, (TimedWaitCondition) semanticObject); 
				return; 
			case SmlPackage.VALUE_PARAMETER_EXPRESSION:
				sequence_ValueParameterExpression(context, (ValueParameterExpression) semanticObject); 
				return; 
			case SmlPackage.VARIABLE_BINDING_PARAMETER_EXPRESSION:
				sequence_VariableBindingParameterExpression(context, (VariableBindingParameterExpression) semanticObject); 
				return; 
			case SmlPackage.VARIABLE_FRAGMENT:
				sequence_VariableFragment(context, (VariableFragment) semanticObject); 
				return; 
			case SmlPackage.VIOLATION_CONDITION:
				sequence_ViolationCondition(context, (ViolationCondition) semanticObject); 
				return; 
			case SmlPackage.WAIT_CONDITION:
				sequence_WaitCondition(context, (WaitCondition) semanticObject); 
				return; 
			case SmlPackage.WILDCARD_PARAMETER_EXPRESSION:
				sequence_WildcardParameterExpression(context, (WildcardParameterExpression) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     InteractionFragment returns Alternative
	 *     Alternative returns Alternative
	 *
	 * Constraint:
	 *     (cases+=Case cases+=Case*)?
	 */
	protected void sequence_Alternative(ISerializationContext context, Alternative semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Case returns Case
	 *
	 * Constraint:
	 *     (caseInteraction=Interaction? caseCondition=Condition?)
	 */
	protected void sequence_Case(ISerializationContext context, Case semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ChannelOptions returns ChannelOptions
	 *
	 * Constraint:
	 *     (allMessagesRequireLinks?='allMessagesRequireLinks'? (messageChannels+=MessageChannel messageChannels+=MessageChannel*)?)
	 */
	protected void sequence_ChannelOptions(ISerializationContext context, ChannelOptions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InteractionFragment returns ClockFragment
	 *     ClockFragment returns ClockFragment
	 *
	 * Constraint:
	 *     expression=[DummyExprClass|EString]?
	 */
	protected void sequence_ClockFragment(ISerializationContext context, ClockFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Collaboration returns Collaboration
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (domains+=[EPackage|EString] domains+=[EPackage|EString]*)? 
	 *         (contexts+=[EPackage|EString] contexts+=[EPackage|EString]*)? 
	 *         (imports+=DummyExprClass imports+=DummyExprClass*)? 
	 *         (roles+=Role roles+=Role*)? 
	 *         (scenarios+=Scenario scenarios+=Scenario*)?
	 *     )
	 */
	protected void sequence_Collaboration(ISerializationContext context, Collaboration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConditionExpression returns ConditionExpression
	 *
	 * Constraint:
	 *     expression=DummyExprClass?
	 */
	protected void sequence_ConditionExpression(ISerializationContext context, ConditionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InteractionFragment returns Condition
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     conditionExpression=ConditionExpression?
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConstraintBlock returns ConstraintBlock
	 *
	 * Constraint:
	 *     (
	 *         (consider+=Message consider+=Message*)? 
	 *         (ignore+=Message ignore+=Message*)? 
	 *         (interrupt+=Message interrupt+=Message*)? 
	 *         (forbidden+=Message forbidden+=Message*)?
	 *     )
	 */
	protected void sequence_ConstraintBlock(ISerializationContext context, ConstraintBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DummyExprClass returns DummyExprClass
	 *     DummyExprClass_Impl returns DummyExprClass
	 *
	 * Constraint:
	 *     {DummyExprClass}
	 */
	protected void sequence_DummyExprClass_Impl(ISerializationContext context, DummyExprClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EAnnotation returns EAnnotation
	 *
	 * Constraint:
	 *     (
	 *         source=EString? 
	 *         (references+=[EObject|EString] references+=[EObject|EString]*)? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (details+=EStringToStringMapEntry details+=EStringToStringMapEntry*)? 
	 *         (contents+=EObject contents+=EObject*)?
	 *     )
	 */
	protected void sequence_EAnnotation(ISerializationContext context, EAnnotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ETypedElement returns EAttribute
	 *     EStructuralFeature returns EAttribute
	 *     EAttribute returns EAttribute
	 *
	 * Constraint:
	 *     (
	 *         volatile?='volatile'? 
	 *         transient?='transient'? 
	 *         unsettable?='unsettable'? 
	 *         derived?='derived'? 
	 *         iD?='iD'? 
	 *         name=EString 
	 *         ordered=EBoolean? 
	 *         unique=EBoolean? 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         changeable=EBoolean? 
	 *         defaultValueLiteral=EString? 
	 *         eType=[EClassifier|EString]? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         eGenericType=EGenericType?
	 *     )
	 */
	protected void sequence_EAttribute(ISerializationContext context, EAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EClassifier returns EClass
	 *     EClass returns EClass
	 *
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         interface?='interface'? 
	 *         name=EString 
	 *         instanceClassName=EString? 
	 *         instanceTypeName=EString? 
	 *         (eSuperTypes+=[EClass|EString] eSuperTypes+=[EClass|EString]*)? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (eTypeParameters+=ETypeParameter eTypeParameters+=ETypeParameter*)? 
	 *         (eOperations+=EOperation eOperations+=EOperation*)? 
	 *         (eStructuralFeatures+=EStructuralFeature eStructuralFeatures+=EStructuralFeature*)? 
	 *         (eGenericSuperTypes+=EGenericType eGenericSuperTypes+=EGenericType*)?
	 *     )
	 */
	protected void sequence_EClass(ISerializationContext context, EClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EClassifier returns EDataType
	 *     EDataType_Impl returns EDataType
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         instanceClassName=EString? 
	 *         instanceTypeName=EString? 
	 *         serializable=EBoolean? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (eTypeParameters+=ETypeParameter eTypeParameters+=ETypeParameter*)?
	 *     )
	 */
	protected void sequence_EDataType_Impl(ISerializationContext context, EDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EEnumLiteral returns EEnumLiteral
	 *
	 * Constraint:
	 *     (name=EString value=EInt? literal=EString? (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)?)
	 */
	protected void sequence_EEnumLiteral(ISerializationContext context, EEnumLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EClassifier returns EEnum
	 *     EEnum returns EEnum
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         instanceClassName=EString? 
	 *         instanceTypeName=EString? 
	 *         serializable=EBoolean? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (eTypeParameters+=ETypeParameter eTypeParameters+=ETypeParameter*)? 
	 *         (eLiterals+=EEnumLiteral eLiterals+=EEnumLiteral*)?
	 *     )
	 */
	protected void sequence_EEnum(ISerializationContext context, EEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EGenericType returns EGenericType
	 *
	 * Constraint:
	 *     (
	 *         eTypeParameter=[ETypeParameter|EString]? 
	 *         eClassifier=[EClassifier|EString]? 
	 *         eUpperBound=EGenericType? 
	 *         (eTypeArguments+=EGenericType eTypeArguments+=EGenericType*)? 
	 *         eLowerBound=EGenericType?
	 *     )
	 */
	protected void sequence_EGenericType(ISerializationContext context, EGenericType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EObject returns EObject
	 *
	 * Constraint:
	 *     {EObject}
	 */
	protected void sequence_EObject(ISerializationContext context, EObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ETypedElement returns EOperation
	 *     EOperation returns EOperation
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ordered=EBoolean? 
	 *         unique=EBoolean? 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         eType=[EClassifier|EString]? 
	 *         (eExceptions+=[EClassifier|EString] eExceptions+=[EClassifier|EString]*)? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         eGenericType=EGenericType? 
	 *         (eTypeParameters+=ETypeParameter eTypeParameters+=ETypeParameter*)? 
	 *         (eParameters+=EParameter eParameters+=EParameter*)? 
	 *         (eGenericExceptions+=EGenericType eGenericExceptions+=EGenericType*)?
	 *     )
	 */
	protected void sequence_EOperation(ISerializationContext context, EOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EPackage returns EPackage
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         nsURI=EString? 
	 *         nsPrefix=EString? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         (eClassifiers+=EClassifier eClassifiers+=EClassifier*)? 
	 *         (eSubpackages+=EPackage eSubpackages+=EPackage*)?
	 *     )
	 */
	protected void sequence_EPackage(ISerializationContext context, EPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ETypedElement returns EParameter
	 *     EParameter returns EParameter
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         ordered=EBoolean? 
	 *         unique=EBoolean? 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         eType=[EClassifier|EString]? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         eGenericType=EGenericType?
	 *     )
	 */
	protected void sequence_EParameter(ISerializationContext context, EParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ETypedElement returns EReference
	 *     EStructuralFeature returns EReference
	 *     EReference returns EReference
	 *
	 * Constraint:
	 *     (
	 *         volatile?='volatile'? 
	 *         transient?='transient'? 
	 *         unsettable?='unsettable'? 
	 *         derived?='derived'? 
	 *         containment?='containment'? 
	 *         name=EString 
	 *         ordered=EBoolean? 
	 *         unique=EBoolean? 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         changeable=EBoolean? 
	 *         defaultValueLiteral=EString? 
	 *         resolveProxies=EBoolean? 
	 *         eType=[EClassifier|EString]? 
	 *         eOpposite=[EReference|EString]? 
	 *         (eKeys+=[EAttribute|EString] eKeys+=[EAttribute|EString]*)? 
	 *         (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? 
	 *         eGenericType=EGenericType?
	 *     )
	 */
	protected void sequence_EReference(ISerializationContext context, EReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EStringToStringMapEntry returns EStringToStringMapEntry
	 *
	 * Constraint:
	 *     (key=EString? value=EString?)
	 */
	protected void sequence_EStringToStringMapEntry(ISerializationContext context, Map.Entry semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ETypeParameter returns ETypeParameter
	 *
	 * Constraint:
	 *     (name=EString (eAnnotations+=EAnnotation eAnnotations+=EAnnotation*)? (eBounds+=EGenericType eBounds+=EGenericType*)?)
	 */
	protected void sequence_ETypeParameter(ISerializationContext context, ETypeParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRanges returns EnumRanges
	 *     EnumRanges returns EnumRanges
	 *
	 * Constraint:
	 *     (values+=[EEnumLiteral|EString] values+=[EEnumLiteral|EString]*)?
	 */
	protected void sequence_EnumRanges(ISerializationContext context, EnumRanges semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EventParameterRanges returns EventParameterRanges
	 *
	 * Constraint:
	 *     (event=[ETypedElement|EString]? (rangesForParameter+=RangesForParameter rangesForParameter+=RangesForParameter*)?)
	 */
	protected void sequence_EventParameterRanges(ISerializationContext context, EventParameterRanges semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BindingExpression returns FeatureAccessBindingExpression
	 *     FeatureAccessBindingExpression returns FeatureAccessBindingExpression
	 *
	 * Constraint:
	 *     featureaccess=DummyExprClass?
	 */
	protected void sequence_FeatureAccessBindingExpression(ISerializationContext context, FeatureAccessBindingExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRanges returns IntegerRanges
	 *     IntegerRanges returns IntegerRanges
	 *
	 * Constraint:
	 *     (min=EInt? max=EInt? (values+=EInt values+=EInt*)?)
	 */
	protected void sequence_IntegerRanges(ISerializationContext context, IntegerRanges semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DummyExprClass returns Interaction
	 *     InteractionFragment returns Interaction
	 *     Interaction returns Interaction
	 *
	 * Constraint:
	 *     ((fragments+=InteractionFragment fragments+=InteractionFragment*)? constraints=ConstraintBlock?)
	 */
	protected void sequence_Interaction(ISerializationContext context, Interaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InteractionFragment returns InterruptCondition
	 *     InterruptCondition returns InterruptCondition
	 *
	 * Constraint:
	 *     conditionExpression=ConditionExpression?
	 */
	protected void sequence_InterruptCondition(ISerializationContext context, InterruptCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InteractionFragment returns Loop
	 *     Loop returns Loop
	 *
	 * Constraint:
	 *     (bodyInteraction=Interaction? loopCondition=Condition?)
	 */
	protected void sequence_Loop(ISerializationContext context, Loop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessageChannel returns MessageChannel
	 *
	 * Constraint:
	 *     (event=[ETypedElement|EString]? channelFeature=[EStructuralFeature|EString]?)
	 */
	protected void sequence_MessageChannel(ISerializationContext context, MessageChannel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Message returns Message
	 *     Message_Impl returns Message
	 *
	 * Constraint:
	 *     (
	 *         collectionModification=DummyDatatype? 
	 *         receiver=[Role|EString]? 
	 *         sender=[Role|EString]? 
	 *         modelElement=[ETypedElement|EString]? 
	 *         (parameters+=ParameterBinding parameters+=ParameterBinding*)?
	 *     )
	 */
	protected void sequence_Message_Impl(ISerializationContext context, Message semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InteractionFragment returns ModalMessage
	 *     Message returns ModalMessage
	 *     ModalMessage returns ModalMessage
	 *
	 * Constraint:
	 *     (
	 *         strict?='strict'? 
	 *         monitored?='monitored'? 
	 *         collectionModification=DummyDatatype? 
	 *         expectationKind=ExpectationKind? 
	 *         receiver=[Role|EString]? 
	 *         sender=[Role|EString]? 
	 *         modelElement=[ETypedElement|EString]? 
	 *         (parameters+=ParameterBinding parameters+=ParameterBinding*)?
	 *     )
	 */
	protected void sequence_ModalMessage(ISerializationContext context, ModalMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BindingExpression returns ObjectQueryBindingExpression
	 *     ObjectQueryBindingExpression returns ObjectQueryBindingExpression
	 *
	 * Constraint:
	 *     (queryClass=[EClass|EString]? (queryValues+=ObjectQueryValue queryValues+=ObjectQueryValue*)?)
	 */
	protected void sequence_ObjectQueryBindingExpression(ISerializationContext context, ObjectQueryBindingExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ObjectQueryValue returns ObjectQueryValue
	 *
	 * Constraint:
	 *     (feature=[EStructuralFeature|EString]? expression=DummyExprClass?)
	 */
	protected void sequence_ObjectQueryValue(ISerializationContext context, ObjectQueryValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InteractionFragment returns Parallel
	 *     Parallel returns Parallel
	 *
	 * Constraint:
	 *     (parallelInteraction+=Interaction parallelInteraction+=Interaction*)?
	 */
	protected void sequence_Parallel(ISerializationContext context, Parallel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterBinding returns ParameterBinding
	 *
	 * Constraint:
	 *     bindingExpression=BindingExpression?
	 */
	protected void sequence_ParameterBinding(ISerializationContext context, ParameterBinding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BindingExpression returns ParameterExpression
	 *     ParameterExpression_Impl returns ParameterExpression
	 *
	 * Constraint:
	 *     {ParameterExpression}
	 */
	protected void sequence_ParameterExpression_Impl(ISerializationContext context, ParameterExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RangesForParameter returns RangesForParameter
	 *
	 * Constraint:
	 *     (parameter=[ETypedElement|EString]? ranges=AbstractRanges?)
	 */
	protected void sequence_RangesForParameter(ISerializationContext context, RangesForParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RoleBindingConstraint returns RoleBindingConstraint
	 *
	 * Constraint:
	 *     (role=[Role|EString]? bindingExpression=BindingExpression?)
	 */
	protected void sequence_RoleBindingConstraint(ISerializationContext context, RoleBindingConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Role returns Role
	 *
	 * Constraint:
	 *     (static?='static'? multiRole?='multiRole'? name=EString type=[EClassifier|EString]?)
	 */
	protected void sequence_Role(ISerializationContext context, Role semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Scenario returns Scenario
	 *
	 * Constraint:
	 *     (
	 *         singular?='singular'? 
	 *         optimizeCost?='optimizeCost' 
	 *         name=EString 
	 *         kind=ScenarioKind? 
	 *         cost=EDouble 
	 *         (contexts+=[EClass|EString] contexts+=[EClass|EString]*)? 
	 *         (roleBindings+=RoleBindingConstraint roleBindings+=RoleBindingConstraint*)? 
	 *         ownedInteraction=Interaction?
	 *     )
	 */
	protected void sequence_Scenario(ISerializationContext context, Scenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Specification returns Specification
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (domains+=[EPackage|EString] domains+=[EPackage|EString]*)? 
	 *         (contexts+=[EPackage|EString] contexts+=[EPackage|EString]*)? 
	 *         (controllableEClasses+=[EClass|EString] controllableEClasses+=[EClass|EString]*)? 
	 *         (nonSpontaneousOperations+=[ETypedElement|EString] nonSpontaneousOperations+=[ETypedElement|EString]*)? 
	 *         (includedCollaborations+=[Collaboration|EString] includedCollaborations+=[Collaboration|EString]*)? 
	 *         (imports+=DummyExprClass imports+=DummyExprClass*)? 
	 *         (containedCollaborations+=Collaboration containedCollaborations+=Collaboration*)? 
	 *         (eventParameterRanges+=EventParameterRanges eventParameterRanges+=EventParameterRanges*)? 
	 *         channelOptions=ChannelOptions?
	 *     )
	 */
	protected void sequence_Specification(ISerializationContext context, Specification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractRanges returns StringRanges
	 *     StringRanges returns StringRanges
	 *
	 * Constraint:
	 *     (values+=EString values+=EString*)?
	 */
	protected void sequence_StringRanges(ISerializationContext context, StringRanges semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InteractionFragment returns TimedInterruptCondition
	 *     TimedInterruptCondition returns TimedInterruptCondition
	 *
	 * Constraint:
	 *     timedConditionExpression=DummyExprClass?
	 */
	protected void sequence_TimedInterruptCondition(ISerializationContext context, TimedInterruptCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InteractionFragment returns TimedViolationCondition
	 *     TimedViolationCondition returns TimedViolationCondition
	 *
	 * Constraint:
	 *     timedConditionExpression=DummyExprClass?
	 */
	protected void sequence_TimedViolationCondition(ISerializationContext context, TimedViolationCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InteractionFragment returns TimedWaitCondition
	 *     TimedWaitCondition returns TimedWaitCondition
	 *
	 * Constraint:
	 *     (requested?='requested'? strict?='strict'? timedConditionExpression=DummyExprClass?)
	 */
	protected void sequence_TimedWaitCondition(ISerializationContext context, TimedWaitCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BindingExpression returns ValueParameterExpression
	 *     ValueParameterExpression returns ValueParameterExpression
	 *
	 * Constraint:
	 *     value=DummyExprClass?
	 */
	protected void sequence_ValueParameterExpression(ISerializationContext context, ValueParameterExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BindingExpression returns VariableBindingParameterExpression
	 *     VariableBindingParameterExpression returns VariableBindingParameterExpression
	 *
	 * Constraint:
	 *     variable=DummyExprClass?
	 */
	protected void sequence_VariableBindingParameterExpression(ISerializationContext context, VariableBindingParameterExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InteractionFragment returns VariableFragment
	 *     VariableFragment returns VariableFragment
	 *
	 * Constraint:
	 *     expression=DummyExprClass?
	 */
	protected void sequence_VariableFragment(ISerializationContext context, VariableFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InteractionFragment returns ViolationCondition
	 *     ViolationCondition returns ViolationCondition
	 *
	 * Constraint:
	 *     conditionExpression=ConditionExpression?
	 */
	protected void sequence_ViolationCondition(ISerializationContext context, ViolationCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InteractionFragment returns WaitCondition
	 *     WaitCondition returns WaitCondition
	 *
	 * Constraint:
	 *     (strict?='strict'? requested?='requested'? conditionExpression=ConditionExpression?)
	 */
	protected void sequence_WaitCondition(ISerializationContext context, WaitCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BindingExpression returns WildcardParameterExpression
	 *     WildcardParameterExpression returns WildcardParameterExpression
	 *
	 * Constraint:
	 *     {WildcardParameterExpression}
	 */
	protected void sequence_WildcardParameterExpression(ISerializationContext context, WildcardParameterExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
