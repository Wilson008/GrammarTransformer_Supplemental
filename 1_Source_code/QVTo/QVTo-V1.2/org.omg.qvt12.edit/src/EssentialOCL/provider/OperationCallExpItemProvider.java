/**
 */
package EssentialOCL.provider;


import EssentialOCL.EssentialOCLFactory;
import EssentialOCL.EssentialOCLPackage;
import EssentialOCL.OperationCallExp;

import ImperativeOCL.ImperativeOCLFactory;

import QVTOperational.QVTOperationalFactory;

import QVTRelation.QVTRelationFactory;

import QVTTemplate.QVTTemplateFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link EssentialOCL.OperationCallExp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationCallExpItemProvider extends FeatureCallExpItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCallExpItemProvider(AdapterFactory adapterFactory) {
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

			addReferredOperationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Referred Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferredOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OperationCallExp_referredOperation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OperationCallExp_referredOperation_feature", "_UI_OperationCallExp_type"),
				 EssentialOCLPackage.Literals.OPERATION_CALL_EXP__REFERRED_OPERATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT);
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
	 * This returns OperationCallExp.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OperationCallExp"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OperationCallExp)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_OperationCallExp_type") :
			getString("_UI_OperationCallExp_type") + " " + label;
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

		switch (notification.getFeatureID(OperationCallExp.class)) {
			case EssentialOCLPackage.OPERATION_CALL_EXP__ARGUMENT:
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
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 EssentialOCLFactory.eINSTANCE.createBooleanLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 EssentialOCLFactory.eINSTANCE.createCollectionLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 EssentialOCLFactory.eINSTANCE.createEnumLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 EssentialOCLFactory.eINSTANCE.createIfExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 EssentialOCLFactory.eINSTANCE.createIntegerLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 EssentialOCLFactory.eINSTANCE.createInvalidLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 EssentialOCLFactory.eINSTANCE.createIterateExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 EssentialOCLFactory.eINSTANCE.createIteratorExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 EssentialOCLFactory.eINSTANCE.createLetExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 EssentialOCLFactory.eINSTANCE.createNavigationCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 EssentialOCLFactory.eINSTANCE.createNullLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 EssentialOCLFactory.eINSTANCE.createOperationCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 EssentialOCLFactory.eINSTANCE.createPropertyCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 EssentialOCLFactory.eINSTANCE.createRealLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 EssentialOCLFactory.eINSTANCE.createStringLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 EssentialOCLFactory.eINSTANCE.createTupleLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 EssentialOCLFactory.eINSTANCE.createTypeExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 EssentialOCLFactory.eINSTANCE.createUnlimitedNaturalExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 EssentialOCLFactory.eINSTANCE.createVariableExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 QVTOperationalFactory.eINSTANCE.createImperativeCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 QVTOperationalFactory.eINSTANCE.createMappingCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 QVTOperationalFactory.eINSTANCE.createObjectExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 QVTOperationalFactory.eINSTANCE.createResolveExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 QVTOperationalFactory.eINSTANCE.createResolveInExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createAltExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createAssertExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createAssignExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createBlockExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createBreakExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createCatchExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createComputeExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createContinueExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createDictLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createForExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createImperativeIterateExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createInstantiationExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createListLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createLogExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createRaiseExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createReturnExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createSwitchExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createTryExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createUnlinkExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createVariableInitExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 ImperativeOCLFactory.eINSTANCE.createWhileExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 QVTRelationFactory.eINSTANCE.createOppositePropertyCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 QVTRelationFactory.eINSTANCE.createRelationCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 QVTTemplateFactory.eINSTANCE.createCollectionTemplateExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT,
				 QVTTemplateFactory.eINSTANCE.createObjectTemplateExp()));
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
			childFeature == EssentialOCLPackage.Literals.CALL_EXP__SOURCE ||
			childFeature == EssentialOCLPackage.Literals.OPERATION_CALL_EXP__ARGUMENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
