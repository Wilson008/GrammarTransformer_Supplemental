/**
 */
package EssentialOCL.provider;


import EMOF.EMOFFactory;

import EMOF.provider.TypedElementItemProvider;

import EssentialOCL.EssentialOCLFactory;
import EssentialOCL.EssentialOCLPackage;
import EssentialOCL.ExpressionInOcl;

import ImperativeOCL.ImperativeOCLFactory;

import QVTBase.QVTBaseFactory;

import QVTOperational.QVTOperationalFactory;

import QVTOperational.provider.QVTOperationalEditPlugin;

import QVTRelation.QVTRelationFactory;

import QVTTemplate.QVTTemplateFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link EssentialOCL.ExpressionInOcl} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionInOclItemProvider extends TypedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionInOclItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION);
			childrenFeatures.add(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__CONTEXT_VARIABLE);
			childrenFeatures.add(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__GENERATED_TYPE);
			childrenFeatures.add(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__PARAMETER_VARIABLE);
			childrenFeatures.add(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__RESULT_VARIABLE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ExpressionInOcl.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExpressionInOcl"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ExpressionInOcl)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ExpressionInOcl_type") :
			getString("_UI_ExpressionInOcl_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ExpressionInOcl.class)) {
			case EssentialOCLPackage.EXPRESSION_IN_OCL__BODY_EXPRESSION:
			case EssentialOCLPackage.EXPRESSION_IN_OCL__CONTEXT_VARIABLE:
			case EssentialOCLPackage.EXPRESSION_IN_OCL__GENERATED_TYPE:
			case EssentialOCLPackage.EXPRESSION_IN_OCL__PARAMETER_VARIABLE:
			case EssentialOCLPackage.EXPRESSION_IN_OCL__RESULT_VARIABLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createBooleanLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createCollectionLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createEnumLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createIfExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createIntegerLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createInvalidLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createIterateExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createIteratorExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createLetExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createNavigationCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createNullLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createOperationCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createPropertyCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createRealLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createStringLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createTupleLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createTypeExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createUnlimitedNaturalExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 EssentialOCLFactory.eINSTANCE.createVariableExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 QVTOperationalFactory.eINSTANCE.createImperativeCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 QVTOperationalFactory.eINSTANCE.createMappingCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 QVTOperationalFactory.eINSTANCE.createObjectExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 QVTOperationalFactory.eINSTANCE.createResolveExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 QVTOperationalFactory.eINSTANCE.createResolveInExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createAltExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createAssertExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createAssignExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createBlockExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createBreakExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createCatchExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createComputeExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createContinueExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createDictLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createForExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createImperativeIterateExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createInstantiationExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createListLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createLogExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createRaiseExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createReturnExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createSwitchExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createTryExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createUnlinkExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createVariableInitExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 ImperativeOCLFactory.eINSTANCE.createWhileExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 QVTRelationFactory.eINSTANCE.createOppositePropertyCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 QVTRelationFactory.eINSTANCE.createRelationCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 QVTTemplateFactory.eINSTANCE.createCollectionTemplateExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__BODY_EXPRESSION,
				 QVTTemplateFactory.eINSTANCE.createObjectTemplateExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__CONTEXT_VARIABLE,
				 EssentialOCLFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__CONTEXT_VARIABLE,
				 QVTOperationalFactory.eINSTANCE.createVarParameter()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__CONTEXT_VARIABLE,
				 QVTOperationalFactory.eINSTANCE.createMappingParameter()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__CONTEXT_VARIABLE,
				 QVTOperationalFactory.eINSTANCE.createModelParameter()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__CONTEXT_VARIABLE,
				 QVTBaseFactory.eINSTANCE.createFunctionParameter()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__GENERATED_TYPE,
				 EssentialOCLFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__GENERATED_TYPE,
				 EssentialOCLFactory.eINSTANCE.createCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__GENERATED_TYPE,
				 EssentialOCLFactory.eINSTANCE.createBagType()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__GENERATED_TYPE,
				 EssentialOCLFactory.eINSTANCE.createInvalidType()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__GENERATED_TYPE,
				 EssentialOCLFactory.eINSTANCE.createOrderedSetType()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__GENERATED_TYPE,
				 EssentialOCLFactory.eINSTANCE.createSequenceType()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__GENERATED_TYPE,
				 EssentialOCLFactory.eINSTANCE.createSetType()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__GENERATED_TYPE,
				 EssentialOCLFactory.eINSTANCE.createTemplateParameterType()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__GENERATED_TYPE,
				 EssentialOCLFactory.eINSTANCE.createTupleType()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__GENERATED_TYPE,
				 EssentialOCLFactory.eINSTANCE.createVoidType()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__GENERATED_TYPE,
				 EMOFFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__GENERATED_TYPE,
				 EMOFFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__GENERATED_TYPE,
				 EMOFFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__GENERATED_TYPE,
				 EMOFFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__GENERATED_TYPE,
				 ImperativeOCLFactory.eINSTANCE.createDictionaryType()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__GENERATED_TYPE,
				 ImperativeOCLFactory.eINSTANCE.createListType()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__GENERATED_TYPE,
				 ImperativeOCLFactory.eINSTANCE.createTypedef()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__GENERATED_TYPE,
				 QVTRelationFactory.eINSTANCE.createRelationalTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__GENERATED_TYPE,
				 QVTBaseFactory.eINSTANCE.createTransformation()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__PARAMETER_VARIABLE,
				 EssentialOCLFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__PARAMETER_VARIABLE,
				 QVTOperationalFactory.eINSTANCE.createVarParameter()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__PARAMETER_VARIABLE,
				 QVTOperationalFactory.eINSTANCE.createMappingParameter()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__PARAMETER_VARIABLE,
				 QVTOperationalFactory.eINSTANCE.createModelParameter()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__PARAMETER_VARIABLE,
				 QVTBaseFactory.eINSTANCE.createFunctionParameter()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__RESULT_VARIABLE,
				 EssentialOCLFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__RESULT_VARIABLE,
				 QVTOperationalFactory.eINSTANCE.createVarParameter()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__RESULT_VARIABLE,
				 QVTOperationalFactory.eINSTANCE.createMappingParameter()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__RESULT_VARIABLE,
				 QVTOperationalFactory.eINSTANCE.createModelParameter()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__RESULT_VARIABLE,
				 QVTBaseFactory.eINSTANCE.createFunctionParameter()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__CONTEXT_VARIABLE ||
			childFeature == EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__PARAMETER_VARIABLE ||
			childFeature == EssentialOCLPackage.Literals.EXPRESSION_IN_OCL__RESULT_VARIABLE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return QVTOperationalEditPlugin.INSTANCE;
	}

}
