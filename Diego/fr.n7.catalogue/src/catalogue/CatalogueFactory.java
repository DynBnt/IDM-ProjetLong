/**
 */
package catalogue;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see catalogue.CataloguePackage
 * @generated
 */
public interface CatalogueFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CatalogueFactory eINSTANCE = catalogue.impl.CatalogueFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalogue</em>'.
	 * @generated
	 */
	Catalogue createCatalogue();

	/**
	 * Returns a new object of class '<em>Composant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composant</em>'.
	 * @generated
	 */
	Composant createComposant();

	/**
	 * Returns a new object of class '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata</em>'.
	 * @generated
	 */
	Metadata createMetadata();

	/**
	 * Returns a new object of class '<em>Footprint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Footprint</em>'.
	 * @generated
	 */
	Footprint createFootprint();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Op Binaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Op Binaire</em>'.
	 * @generated
	 */
	OpBinaire createOpBinaire();

	/**
	 * Returns a new object of class '<em>Et</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Et</em>'.
	 * @generated
	 */
	Et createEt();

	/**
	 * Returns a new object of class '<em>Ou</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ou</em>'.
	 * @generated
	 */
	Ou createOu();

	/**
	 * Returns a new object of class '<em>Non</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non</em>'.
	 * @generated
	 */
	Non createNon();

	/**
	 * Returns a new object of class '<em>Redondance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redondance</em>'.
	 * @generated
	 */
	Redondance createRedondance();

	/**
	 * Returns a new object of class '<em>Geometrique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geometrique</em>'.
	 * @generated
	 */
	Geometrique createGeometrique();

	/**
	 * Returns a new object of class '<em>Geo Generale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geo Generale</em>'.
	 * @generated
	 */
	GeoGenerale createGeoGenerale();

	/**
	 * Returns a new object of class '<em>Geo Specifique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geo Specifique</em>'.
	 * @generated
	 */
	GeoSpecifique createGeoSpecifique();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CataloguePackage getCataloguePackage();

} //CatalogueFactory
