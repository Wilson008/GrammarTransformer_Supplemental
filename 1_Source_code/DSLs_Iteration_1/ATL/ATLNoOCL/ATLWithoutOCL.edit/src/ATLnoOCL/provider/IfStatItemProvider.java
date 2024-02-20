/**
 */
package ATLnoOCL.provider;


import ATLnoOCL.ATLnoOCLFactory;
import ATLnoOCL.ATLnoOCLPackage;
import ATLnoOCL.IfStat;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ATLnoOCL.IfStat} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfStatItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ATLnoOCLPackage.Literals.IF_STAT__CONDITION);
			childrenFeatures.add(ATLnoOCLPackage.Literals.IF_STAT__THEN_STATEMENTS);
			childrenFeatures.add(ATLnoOCLPackage.Literals.IF_STAT__ELSE_STATEMENTS);
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
	 * This returns IfStat.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfStat"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IfStat)object).getLocation();
		return label == null || label.length() == 0 ?
			getString("_UI_IfStat_type") :
			getString("_UI_IfStat_type") + " " + label;
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

		switch (notification.getFeatureID(IfStat.class)) {
			case ATLnoOCLPackage.IF_STAT__CONDITION:
			case ATLnoOCLPackage.IF_STAT__THEN_STATEMENTS:
			case ATLnoOCLPackage.IF_STAT__ELSE_STATEMENTS:
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
				(ATLnoOCLPackage.Literals.IF_STAT__CONDITION,
				 ATLnoOCLFactory.eINSTANCE.createOCLDummy()));

		newChildDescriptors.add
			(createChildParameter
				(ATLnoOCLPackage.Literals.IF_STAT__THEN_STATEMENTS,
				 ATLnoOCLFactory.eINSTANCE.createExpressionStat()));

		newChildDescriptors.add
			(createChildParameter
				(ATLnoOCLPackage.Literals.IF_STAT__THEN_STATEMENTS,
				 ATLnoOCLFactory.eINSTANCE.createBindingStat()));

		newChildDescriptors.add
			(createChildParameter
				(ATLnoOCLPackage.Literals.IF_STAT__THEN_STATEMENTS,
				 ATLnoOCLFactory.eINSTANCE.createIfStat()));

		newChildDescriptors.add
			(createChildParameter
				(ATLnoOCLPackage.Literals.IF_STAT__THEN_STATEMENTS,
				 ATLnoOCLFactory.eINSTANCE.createForStat()));

		newChildDescriptors.add
			(createChildParameter
				(ATLnoOCLPackage.Literals.IF_STAT__ELSE_STATEMENTS,
				 ATLnoOCLFactory.eINSTANCE.createExpressionStat()));

		newChildDescriptors.add
			(createChildParameter
				(ATLnoOCLPackage.Literals.IF_STAT__ELSE_STATEMENTS,
				 ATLnoOCLFactory.eINSTANCE.createBindingStat()));

		newChildDescriptors.add
			(createChildParameter
				(ATLnoOCLPackage.Literals.IF_STAT__ELSE_STATEMENTS,
				 ATLnoOCLFactory.eINSTANCE.createIfStat()));

		newChildDescriptors.add
			(createChildParameter
				(ATLnoOCLPackage.Literals.IF_STAT__ELSE_STATEMENTS,
				 ATLnoOCLFactory.eINSTANCE.createForStat()));
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
			childFeature == ATLnoOCLPackage.Literals.IF_STAT__THEN_STATEMENTS ||
			childFeature == ATLnoOCLPackage.Literals.IF_STAT__ELSE_STATEMENTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
