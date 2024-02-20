/**
 */
package BIBTEX.provider;


import BIBTEX.BIBTEXFactory;
import BIBTEX.BIBTEXPackage;
import BIBTEX.Entry;

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
 * This is the item provider adapter for a {@link BIBTEX.Entry} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EntryItemProvider extends LocatedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryItemProvider(AdapterFactory adapterFactory) {
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

			addKeyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entry_key_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entry_key_feature", "_UI_Entry_type"),
				 BIBTEXPackage.Literals.ENTRY__KEY,
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
			childrenFeatures.add(BIBTEXPackage.Literals.ENTRY__FIELDS);
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
		String label = ((Entry)object).getLocation();
		return label == null || label.length() == 0 ?
			getString("_UI_Entry_type") :
			getString("_UI_Entry_type") + " " + label;
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

		switch (notification.getFeatureID(Entry.class)) {
			case BIBTEXPackage.ENTRY__KEY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BIBTEXPackage.ENTRY__FIELDS:
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
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createAuthors()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createAuthorUrls()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createTitle()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createJournal()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createBookTitle()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createInstitution()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createOrganization()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createDay()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createNumber()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createChapter()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createVolume()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createSeries()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createPages()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createPublisher()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createHowpublished()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createSchool()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createEditor()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createEdition()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createAddress()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createYear()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createMonth()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createNote()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createAbstractField()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createIsbn()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createIssn()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createUrl()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createDoi()));

		newChildDescriptors.add
			(createChildParameter
				(BIBTEXPackage.Literals.ENTRY__FIELDS,
				 BIBTEXFactory.eINSTANCE.createAnnote()));
	}

}
