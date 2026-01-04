/**
 */
package catalogue;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Generale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link catalogue.GeoGenerale#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see catalogue.CataloguePackage#getGeoGenerale()
 * @model
 * @generated
 */
public interface GeoGenerale extends Geometrique {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link catalogue.ZoneType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see catalogue.ZoneType
	 * @see #setType(ZoneType)
	 * @see catalogue.CataloguePackage#getGeoGenerale_Type()
	 * @model
	 * @generated
	 */
	ZoneType getType();

	/**
	 * Sets the value of the '{@link catalogue.GeoGenerale#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see catalogue.ZoneType
	 * @see #getType()
	 * @generated
	 */
	void setType(ZoneType value);

} // GeoGenerale
