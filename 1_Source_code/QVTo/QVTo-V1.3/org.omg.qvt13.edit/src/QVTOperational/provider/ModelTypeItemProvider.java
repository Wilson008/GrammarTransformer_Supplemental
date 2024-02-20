/**
 */
package QVTOperational.provider;


import QVTOperational.ModelType;
import QVTOperational.QVTOperationalFactory;
import QVTOperational.QVTOperationalPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link QVTOperational.ModelType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelTypeItemProvider extends ModuleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTypeItemProvider(AdapterFactory adapterFactory) {
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

			addConformanceKindPropertyDescriptor(object);
			addMetamodelPropertyDescriptor(object);
			addCompliance_kindPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Conformance Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConformanceKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelType_conformanceKind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelType_conformanceKind_feature", "_UI_ModelType_type"),
				 QVTOperationalPackage.Literals.MODEL_TYPE__CONFORMANCE_KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Metamodel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetamodelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelType_metamodel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelType_metamodel_feature", "_UI_ModelType_type"),
				 QVTOperationalPackage.Literals.MODEL_TYPE__METAMODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Compliance kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompliance_kindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelType_compliance_kind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelType_compliance_kind_feature", "_UI_ModelType_type"),
				 QVTOperationalPackage.Literals.MODEL_TYPE__COMPLIANCE_KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(QVTOperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION);
			childrenFeatures.add(QVTOperationalPackage.Literals.MODEL_TYPE__PACKAGEREF_LIST);
			childrenFeatures.add(QVTOperationalPackage.Literals.MODEL_TYPE__MODELTYPE_WHERE);
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
	 * This returns ModelType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModelType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ModelType_type") :
			getString("_UI_ModelType_type") + " " + label;
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

		switch (notification.getFeatureID(ModelType.class)) {
			case QVTOperationalPackage.MODEL_TYPE__CONFORMANCE_KIND:
			case QVTOperationalPackage.MODEL_TYPE__COMPLIANCE_KIND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case QVTOperationalPackage.MODEL_TYPE__ADDITIONAL_CONDITION:
			case QVTOperationalPackage.MODEL_TYPE__PACKAGEREF_LIST:
			case QVTOperationalPackage.MODEL_TYPE__MODELTYPE_WHERE:
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
				(QVTOperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION,
				 QVTOperationalFactory.eINSTANCE.createExpressionGO()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION,
				 QVTOperationalFactory.eINSTANCE.createImperativeCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION,
				 QVTOperationalFactory.eINSTANCE.createMappingCallExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION,
				 QVTOperationalFactory.eINSTANCE.createVarParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION,
				 QVTOperationalFactory.eINSTANCE.createMappingParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION,
				 QVTOperationalFactory.eINSTANCE.createModelParameter()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION,
				 QVTOperationalFactory.eINSTANCE.createObjectExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION,
				 QVTOperationalFactory.eINSTANCE.createResolveExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION,
				 QVTOperationalFactory.eINSTANCE.createResolveInExp()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MODEL_TYPE__PACKAGEREF_LIST,
				 QVTOperationalFactory.eINSTANCE.createPackageRefGO()));

		newChildDescriptors.add
			(createChildParameter
				(QVTOperationalPackage.Literals.MODEL_TYPE__MODELTYPE_WHERE,
				 QVTOperationalFactory.eINSTANCE.createExpressionBlock()));
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
			childFeature == QVTOperationalPackage.Literals.MODULE__OWNED_VARIABLE ||
			childFeature == QVTOperationalPackage.Literals.MODEL_TYPE__ADDITIONAL_CONDITION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
