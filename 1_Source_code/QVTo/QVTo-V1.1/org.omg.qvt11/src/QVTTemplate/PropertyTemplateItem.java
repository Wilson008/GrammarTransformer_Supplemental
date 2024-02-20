/**
 */
package QVTTemplate;

import EMOF.Element;
import EMOF.Property;

import EssentialOCL.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Template Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QVTTemplate.PropertyTemplateItem#getIsOpposite <em>Is Opposite</em>}</li>
 *   <li>{@link QVTTemplate.PropertyTemplateItem#getObjContainer <em>Obj Container</em>}</li>
 *   <li>{@link QVTTemplate.PropertyTemplateItem#getReferredProperty <em>Referred Property</em>}</li>
 *   <li>{@link QVTTemplate.PropertyTemplateItem#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see QVTTemplate.QVTTemplatePackage#getPropertyTemplateItem()
 * @model
 * @generated
 */
public interface PropertyTemplateItem extends Element {
	/**
	 * Returns the value of the '<em><b>Is Opposite</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Opposite</em>' attribute.
	 * @see #setIsOpposite(Boolean)
	 * @see QVTTemplate.QVTTemplatePackage#getPropertyTemplateItem_IsOpposite()
	 * @model default="false" dataType="PrimitiveTypes.Boolean"
	 * @generated
	 */
	Boolean getIsOpposite();

	/**
	 * Sets the value of the '{@link QVTTemplate.PropertyTemplateItem#getIsOpposite <em>Is Opposite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Opposite</em>' attribute.
	 * @see #getIsOpposite()
	 * @generated
	 */
	void setIsOpposite(Boolean value);

	/**
	 * Returns the value of the '<em><b>Obj Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QVTTemplate.ObjectTemplateExp#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obj Container</em>' container reference.
	 * @see #setObjContainer(ObjectTemplateExp)
	 * @see QVTTemplate.QVTTemplatePackage#getPropertyTemplateItem_ObjContainer()
	 * @see QVTTemplate.ObjectTemplateExp#getPart
	 * @model opposite="part" resolveProxies="false" required="true"
	 * @generated
	 */
	ObjectTemplateExp getObjContainer();

	/**
	 * Sets the value of the '{@link QVTTemplate.PropertyTemplateItem#getObjContainer <em>Obj Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Container</em>' container reference.
	 * @see #getObjContainer()
	 * @generated
	 */
	void setObjContainer(ObjectTemplateExp value);

	/**
	 * Returns the value of the '<em><b>Referred Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Property</em>' reference.
	 * @see #setReferredProperty(Property)
	 * @see QVTTemplate.QVTTemplatePackage#getPropertyTemplateItem_ReferredProperty()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='propertyItem'"
	 * @generated
	 */
	Property getReferredProperty();

	/**
	 * Sets the value of the '{@link QVTTemplate.PropertyTemplateItem#getReferredProperty <em>Referred Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Property</em>' reference.
	 * @see #getReferredProperty()
	 * @generated
	 */
	void setReferredProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(OclExpression)
	 * @see QVTTemplate.QVTTemplatePackage#getPropertyTemplateItem_Value()
	 * @model containment="true" required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='propertyItem'"
	 * @generated
	 */
	OclExpression getValue();

	/**
	 * Sets the value of the '{@link QVTTemplate.PropertyTemplateItem#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(OclExpression value);

} // PropertyTemplateItem
