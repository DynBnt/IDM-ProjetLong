/**
 */
package catalogue;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Specifique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link catalogue.GeoSpecifique#getCleMetadonneeCible <em>Cle Metadonnee Cible</em>}</li>
 *   <li>{@link catalogue.GeoSpecifique#getValeurMetadonneeCible <em>Valeur Metadonnee Cible</em>}</li>
 * </ul>
 *
 * @see catalogue.CataloguePackage#getGeoSpecifique()
 * @model
 * @generated
 */
public interface GeoSpecifique extends Geometrique {
	/**
	 * Returns the value of the '<em><b>Cle Metadonnee Cible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cle Metadonnee Cible</em>' attribute.
	 * @see #setCleMetadonneeCible(String)
	 * @see catalogue.CataloguePackage#getGeoSpecifique_CleMetadonneeCible()
	 * @model
	 * @generated
	 */
	String getCleMetadonneeCible();

	/**
	 * Sets the value of the '{@link catalogue.GeoSpecifique#getCleMetadonneeCible <em>Cle Metadonnee Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cle Metadonnee Cible</em>' attribute.
	 * @see #getCleMetadonneeCible()
	 * @generated
	 */
	void setCleMetadonneeCible(String value);

	/**
	 * Returns the value of the '<em><b>Valeur Metadonnee Cible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur Metadonnee Cible</em>' attribute.
	 * @see #setValeurMetadonneeCible(String)
	 * @see catalogue.CataloguePackage#getGeoSpecifique_ValeurMetadonneeCible()
	 * @model
	 * @generated
	 */
	String getValeurMetadonneeCible();

	/**
	 * Sets the value of the '{@link catalogue.GeoSpecifique#getValeurMetadonneeCible <em>Valeur Metadonnee Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur Metadonnee Cible</em>' attribute.
	 * @see #getValeurMetadonneeCible()
	 * @generated
	 */
	void setValeurMetadonneeCible(String value);

} // GeoSpecifique
