/**
 */
package EssentialOCL.provider;


import EssentialOCL.CallExp;
import EssentialOCL.EssentialOCLFactory;
import EssentialOCL.EssentialOCLPackage;

import ImperativeOCL.ImperativeOCLFactory;

import QVTOperational.QVTOperationalFactory;

import QVTRelation.QVTRelationFactory;

import QVTTemplate.QVTTemplateFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link EssentialOCL.CallExp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CallExpItemProvider extends OclExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallExpItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(EssentialOCLPackage.Literals.CALL_EXP__SOURCE);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CallExp)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CallExp_type") :
			getString("_UI_CallExp_type") + " " + label;
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

		switch (notification.getFeatureID(CallExp.class)) {
			case EssentialOCLPackage.CALL_EXP__SOURCE:
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
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 EssentialOCLFactory.eINSTANCE.createBooleanLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 EssentialOCLFactory.eINSTANCE.createCollectionLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 EssentialOCLFactory.eINSTANCE.createEnumLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 EssentialOCLFactory.eINSTANCE.createIfExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 EssentialOCLFactory.eINSTANCE.createIntegerLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 EssentialOCLFactory.eINSTANCE.createInvalidLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 EssentialOCLFactory.eINSTANCE.createIterateExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 EssentialOCLFactory.eINSTANCE.createIteratorExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 EssentialOCLFactory.eINSTANCE.createLetExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 EssentialOCLFactory.eINSTANCE.createNavigationCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 EssentialOCLFactory.eINSTANCE.createNullLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 EssentialOCLFactory.eINSTANCE.createOperationCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 EssentialOCLFactory.eINSTANCE.createPropertyCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 EssentialOCLFactory.eINSTANCE.createRealLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 EssentialOCLFactory.eINSTANCE.createStringLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 EssentialOCLFactory.eINSTANCE.createTupleLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 EssentialOCLFactory.eINSTANCE.createTypeExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 EssentialOCLFactory.eINSTANCE.createUnlimitedNaturalExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 EssentialOCLFactory.eINSTANCE.createVariableExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 QVTOperationalFactory.eINSTANCE.createImperativeCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 QVTOperationalFactory.eINSTANCE.createMappingCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 QVTOperationalFactory.eINSTANCE.createObjectExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 QVTOperationalFactory.eINSTANCE.createResolveExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 QVTOperationalFactory.eINSTANCE.createResolveInExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createAltExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createAssertExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createAssignExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createBlockExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createBreakExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createCatchExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createComputeExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createContinueExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createDictLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createForExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createImperativeIterateExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createInstantiationExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createListLiteralExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createLogExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createRaiseExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createReturnExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createSwitchExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createTryExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createUnlinkExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createVariableInitExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 ImperativeOCLFactory.eINSTANCE.createWhileExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 QVTRelationFactory.eINSTANCE.createOppositePropertyCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 QVTRelationFactory.eINSTANCE.createRelationCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 QVTTemplateFactory.eINSTANCE.createCollectionTemplateExp()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialOCLPackage.Literals.CALL_EXP__SOURCE,
				 QVTTemplateFactory.eINSTANCE.createObjectTemplateExp()));
	}

}
