/**
 */
package catalogue;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link catalogue.Non#getOperande <em>Operande</em>}</li>
 * </ul>
 *
 * @see catalogue.CataloguePackage#getNon()
 * @model
 * @generated
 */
public interface Non extends Contrainte {
	/**
	 * Returns the value of the '<em><b>Operande</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operande</em>' containment reference.
	 * @see #setOperande(Contrainte)
	 * @see catalogue.CataloguePackage#getNon_Operande()
	 * @model containment="true"
	 * @generated
	 */
	Contrainte getOperande();

	/**
	 * Sets the value of the '{@link catalogue.Non#getOperande <em>Operande</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operande</em>' containment reference.
	 * @see #getOperande()
	 * @generated
	 */
	void setOperande(Contrainte value);

} // Non
