/**
 */
package spectra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Overflow Method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see spectra.SpectraPackage#getOverflowMethod()
 * @model
 * @generated
 */
public enum OverflowMethod implements Enumerator {
	/**
	 * The '<em><b>KEEP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEP_VALUE
	 * @generated
	 * @ordered
	 */
	KEEP(0, "KEEP", "keep"),

	/**
	 * The '<em><b>FALSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FALSE_VALUE
	 * @generated
	 * @ordered
	 */
	FALSE(1, "FALSE", "false"),

	/**
	 * The '<em><b>MODULO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODULO_VALUE
	 * @generated
	 * @ordered
	 */
	MODULO(2, "MODULO", "modulo");

	/**
	 * The '<em><b>KEEP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEEP
	 * @model literal="keep"
	 * @generated
	 * @ordered
	 */
	public static final int KEEP_VALUE = 0;

	/**
	 * The '<em><b>FALSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FALSE
	 * @model literal="false"
	 * @generated
	 * @ordered
	 */
	public static final int FALSE_VALUE = 1;

	/**
	 * The '<em><b>MODULO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODULO
	 * @model literal="modulo"
	 * @generated
	 * @ordered
	 */
	public static final int MODULO_VALUE = 2;

	/**
	 * An array of all the '<em><b>Overflow Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OverflowMethod[] VALUES_ARRAY =
		new OverflowMethod[] {
			KEEP,
			FALSE,
			MODULO,
		};

	/**
	 * A public read-only list of all the '<em><b>Overflow Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OverflowMethod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Overflow Method</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OverflowMethod get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OverflowMethod result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Overflow Method</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OverflowMethod getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OverflowMethod result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Overflow Method</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OverflowMethod get(int value) {
		switch (value) {
			case KEEP_VALUE: return KEEP;
			case FALSE_VALUE: return FALSE;
			case MODULO_VALUE: return MODULO;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OverflowMethod(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //OverflowMethod
