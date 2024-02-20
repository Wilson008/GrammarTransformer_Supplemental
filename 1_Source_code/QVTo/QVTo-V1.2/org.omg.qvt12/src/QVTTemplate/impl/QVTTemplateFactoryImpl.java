/**
 */
package QVTTemplate.impl;

import QVTTemplate.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QVTTemplateFactoryImpl extends EFactoryImpl implements QVTTemplateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QVTTemplateFactory init() {
		try {
			QVTTemplateFactory theQVTTemplateFactory = (QVTTemplateFactory)EPackage.Registry.INSTANCE.getEFactory(QVTTemplatePackage.eNS_URI);
			if (theQVTTemplateFactory != null) {
				return theQVTTemplateFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QVTTemplateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTTemplateFactoryImpl() {
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
			case QVTTemplatePackage.COLLECTION_TEMPLATE_EXP: return createCollectionTemplateExp();
			case QVTTemplatePackage.OBJECT_TEMPLATE_EXP: return createObjectTemplateExp();
			case QVTTemplatePackage.PROPERTY_TEMPLATE_ITEM: return createPropertyTemplateItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionTemplateExp createCollectionTemplateExp() {
		CollectionTemplateExpImpl collectionTemplateExp = new CollectionTemplateExpImpl();
		return collectionTemplateExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTemplateExp createObjectTemplateExp() {
		ObjectTemplateExpImpl objectTemplateExp = new ObjectTemplateExpImpl();
		return objectTemplateExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTemplateItem createPropertyTemplateItem() {
		PropertyTemplateItemImpl propertyTemplateItem = new PropertyTemplateItemImpl();
		return propertyTemplateItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTTemplatePackage getQVTTemplatePackage() {
		return (QVTTemplatePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QVTTemplatePackage getPackage() {
		return QVTTemplatePackage.eINSTANCE;
	}

} //QVTTemplateFactoryImpl
