/**
 */
package catalogue;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redondance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link catalogue.Redondance#getMinCount <em>Min Count</em>}</li>
 * </ul>
 *
 * @see catalogue.CataloguePackage#getRedondance()
 * @model
 * @generated
 */
public interface Redondance extends Contrainte {
	/**
	 * Returns the value of the '<em><b>Min Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Count</em>' attribute.
	 * @see #setMinCount(int)
	 * @see catalogue.CataloguePackage#getRedondance_MinCount()
	 * @model
	 * @generated
	 */
	int getMinCount();

	/**
	 * Sets the value of the '{@link catalogue.Redondance#getMinCount <em>Min Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Count</em>' attribute.
	 * @see #getMinCount()
	 * @generated
	 */
	void setMinCount(int value);

} // Redondance
