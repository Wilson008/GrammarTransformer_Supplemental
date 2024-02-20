/**
 */
package EMOF.impl;

import EMOF.Comment;
import EMOF.DataType;
import EMOF.EMOFFactory;
import EMOF.EMOFPackage;
import EMOF.Enumeration;
import EMOF.EnumerationLiteral;
import EMOF.Extent;
import EMOF.Factory;
import EMOF.Operation;
import EMOF.Parameter;
import EMOF.PrimitiveType;
import EMOF.Property;
import EMOF.ReflectiveCollection;
import EMOF.ReflectiveSequence;
import EMOF.Tag;
import EMOF.URIExtent;

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
public class EMOFFactoryImpl extends EFactoryImpl implements EMOFFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EMOFFactory init() {
		try {
			EMOFFactory theEMOFFactory = (EMOFFactory)EPackage.Registry.INSTANCE.getEFactory(EMOFPackage.eNS_URI);
			if (theEMOFFactory != null) {
				return theEMOFFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EMOFFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOFFactoryImpl() {
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
			case EMOFPackage.CLASS: return createClass();
			case EMOFPackage.COMMENT: return createComment();
			case EMOFPackage.DATA_TYPE: return createDataType();
			case EMOFPackage.ENUMERATION: return createEnumeration();
			case EMOFPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
			case EMOFPackage.EXTENT: return createExtent();
			case EMOFPackage.FACTORY: return createFactory();
			case EMOFPackage.OBJECT: return createObject();
			case EMOFPackage.OPERATION: return createOperation();
			case EMOFPackage.PACKAGE: return createPackage();
			case EMOFPackage.PARAMETER: return createParameter();
			case EMOFPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case EMOFPackage.PROPERTY: return createProperty();
			case EMOFPackage.REFLECTIVE_COLLECTION: return createReflectiveCollection();
			case EMOFPackage.REFLECTIVE_SEQUENCE: return createReflectiveSequence();
			case EMOFPackage.TAG: return createTag();
			case EMOFPackage.URI_EXTENT: return createURIExtent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOF.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extent createExtent() {
		ExtentImpl extent = new ExtentImpl();
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Factory createFactory() {
		FactoryImpl factory = new FactoryImpl();
		return factory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOF.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOF.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflectiveCollection createReflectiveCollection() {
		ReflectiveCollectionImpl reflectiveCollection = new ReflectiveCollectionImpl();
		return reflectiveCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflectiveSequence createReflectiveSequence() {
		ReflectiveSequenceImpl reflectiveSequence = new ReflectiveSequenceImpl();
		return reflectiveSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URIExtent createURIExtent() {
		URIExtentImpl uriExtent = new URIExtentImpl();
		return uriExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMOFPackage getEMOFPackage() {
		return (EMOFPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EMOFPackage getPackage() {
		return EMOFPackage.eINSTANCE;
	}

} //EMOFFactoryImpl
