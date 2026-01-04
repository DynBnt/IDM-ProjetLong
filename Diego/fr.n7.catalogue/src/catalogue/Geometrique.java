/**
 */
package catalogue;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geometrique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link catalogue.Geometrique#getDistanceMin <em>Distance Min</em>}</li>
 * </ul>
 *
 * @see catalogue.CataloguePackage#getGeometrique()
 * @model
 * @generated
 */
public interface Geometrique extends Contrainte {
	/**
	 * Returns the value of the '<em><b>Distance Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Min</em>' attribute.
	 * @see #setDistanceMin(double)
	 * @see catalogue.CataloguePackage#getGeometrique_DistanceMin()
	 * @model
	 * @generated
	 */
	double getDistanceMin();

	/**
	 * Sets the value of the '{@link catalogue.Geometrique#getDistanceMin <em>Distance Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Min</em>' attribute.
	 * @see #getDistanceMin()
	 * @generated
	 */
	void setDistanceMin(double value);

} // Geometrique
