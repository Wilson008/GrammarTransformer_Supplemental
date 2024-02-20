/**
 */
package spectra;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Var Owner</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see spectra.SpectraPackage#getVarOwner()
 * @model
 * @generated
 */
public enum VarOwner implements Enumerator {
	/**
	 * The '<em><b>SYS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYS_VALUE
	 * @generated
	 * @ordered
	 */
	SYS(0, "SYS", "output"),

	/**
	 * The '<em><b>ENV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENV_VALUE
	 * @generated
	 * @ordered
	 */
	ENV(1, "ENV", "input"),

	/**
	 * The '<em><b>AUX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUX_VALUE
	 * @generated
	 * @ordered
	 */
	AUX(2, "AUX", "auxvar");

	/**
	 * The '<em><b>SYS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYS
	 * @model literal="output"
	 * @generated
	 * @ordered
	 */
	public static final int SYS_VALUE = 0;

	/**
	 * The '<em><b>ENV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENV
	 * @model literal="input"
	 * @generated
	 * @ordered
	 */
	public static final int ENV_VALUE = 1;

	/**
	 * The '<em><b>AUX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUX
	 * @model literal="auxvar"
	 * @generated
	 * @ordered
	 */
	public static final int AUX_VALUE = 2;

	/**
	 * An array of all the '<em><b>Var Owner</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VarOwner[] VALUES_ARRAY =
		new VarOwner[] {
			SYS,
			ENV,
			AUX,
		};

	/**
	 * A public read-only list of all the '<em><b>Var Owner</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VarOwner> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Var Owner</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VarOwner get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VarOwner result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Var Owner</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VarOwner getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VarOwner result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Var Owner</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VarOwner get(int value) {
		switch (value) {
			case SYS_VALUE: return SYS;
			case ENV_VALUE: return ENV;
			case AUX_VALUE: return AUX;
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
	private VarOwner(int value, String name, String literal) {
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
	
} //VarOwner
