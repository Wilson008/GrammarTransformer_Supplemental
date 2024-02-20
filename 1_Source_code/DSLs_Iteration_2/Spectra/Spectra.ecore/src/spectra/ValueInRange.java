/**
 */
package spectra;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value In Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spectra.ValueInRange#getConst <em>Const</em>}</li>
 *   <li>{@link spectra.ValueInRange#getInt <em>Int</em>}</li>
 *   <li>{@link spectra.ValueInRange#getFrom <em>From</em>}</li>
 *   <li>{@link spectra.ValueInRange#isMulti <em>Multi</em>}</li>
 *   <li>{@link spectra.ValueInRange#getTo <em>To</em>}</li>
 *   <li>{@link spectra.ValueInRange#getBooleanValue <em>Boolean Value</em>}</li>
 * </ul>
 *
 * @see spectra.SpectraPackage#getValueInRange()
 * @model
 * @generated
 */
public interface ValueInRange extends EObject {
	/**
	 * Returns the value of the '<em><b>Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const</em>' reference.
	 * @see #setConst(TypeConstant)
	 * @see spectra.SpectraPackage#getValueInRange_Const()
	 * @model
	 * @generated
	 */
	TypeConstant getConst();

	/**
	 * Sets the value of the '{@link spectra.ValueInRange#getConst <em>Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const</em>' reference.
	 * @see #getConst()
	 * @generated
	 */
	void setConst(TypeConstant value);

	/**
	 * Returns the value of the '<em><b>Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int</em>' attribute.
	 * @see #setInt(int)
	 * @see spectra.SpectraPackage#getValueInRange_Int()
	 * @model
	 * @generated
	 */
	int getInt();

	/**
	 * Sets the value of the '{@link spectra.ValueInRange#getInt <em>Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int</em>' attribute.
	 * @see #getInt()
	 * @generated
	 */
	void setInt(int value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(int)
	 * @see spectra.SpectraPackage#getValueInRange_From()
	 * @model
	 * @generated
	 */
	int getFrom();

	/**
	 * Sets the value of the '{@link spectra.ValueInRange#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(int value);

	/**
	 * Returns the value of the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi</em>' attribute.
	 * @see #setMulti(boolean)
	 * @see spectra.SpectraPackage#getValueInRange_Multi()
	 * @model
	 * @generated
	 */
	boolean isMulti();

	/**
	 * Sets the value of the '{@link spectra.ValueInRange#isMulti <em>Multi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi</em>' attribute.
	 * @see #isMulti()
	 * @generated
	 */
	void setMulti(boolean value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(int)
	 * @see spectra.SpectraPackage#getValueInRange_To()
	 * @model
	 * @generated
	 */
	int getTo();

	/**
	 * Sets the value of the '{@link spectra.ValueInRange#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(int value);

	/**
	 * Returns the value of the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Value</em>' attribute.
	 * @see #setBooleanValue(String)
	 * @see spectra.SpectraPackage#getValueInRange_BooleanValue()
	 * @model
	 * @generated
	 */
	String getBooleanValue();

	/**
	 * Sets the value of the '{@link spectra.ValueInRange#getBooleanValue <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Value</em>' attribute.
	 * @see #getBooleanValue()
	 * @generated
	 */
	void setBooleanValue(String value);

} // ValueInRange
