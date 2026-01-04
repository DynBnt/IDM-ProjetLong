/**
 */
package catalogue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Zone Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see catalogue.CataloguePackage#getZoneType()
 * @model
 * @generated
 */
public enum ZoneType implements Enumerator {
	/**
	 * The '<em><b>OTHER COMPONENTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_COMPONENTS_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_COMPONENTS(0, "OTHER_COMPONENTS", "OTHER_COMPONENTS"),

	/**
	 * The '<em><b>BOARD EDGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOARD_EDGE_VALUE
	 * @generated
	 * @ordered
	 */
	BOARD_EDGE(0, "BOARD_EDGE", "BOARD_EDGE");

	/**
	 * The '<em><b>OTHER COMPONENTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_COMPONENTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_COMPONENTS_VALUE = 0;

	/**
	 * The '<em><b>BOARD EDGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOARD_EDGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOARD_EDGE_VALUE = 0;

	/**
	 * An array of all the '<em><b>Zone Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ZoneType[] VALUES_ARRAY =
		new ZoneType[] {
			OTHER_COMPONENTS,
			BOARD_EDGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Zone Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ZoneType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Zone Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ZoneType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ZoneType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Zone Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ZoneType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ZoneType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Zone Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ZoneType get(int value) {
		switch (value) {
			case OTHER_COMPONENTS_VALUE: return OTHER_COMPONENTS;
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
	private ZoneType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //ZoneType
