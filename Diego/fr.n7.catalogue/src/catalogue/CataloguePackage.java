/**
 */
package catalogue;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see catalogue.CatalogueFactory
 * @model kind="package"
 * @generated
 */
public interface CataloguePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "catalogue";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/catalogue";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "catalogue";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CataloguePackage eINSTANCE = catalogue.impl.CataloguePackageImpl.init();

	/**
	 * The meta object id for the '{@link catalogue.impl.CatalogueImpl <em>Catalogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.CatalogueImpl
	 * @see catalogue.impl.CataloguePackageImpl#getCatalogue()
	 * @generated
	 */
	int CATALOGUE = 0;

	/**
	 * The feature id for the '<em><b>Composants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__COMPOSANTS = 0;

	/**
	 * The number of structural features of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link catalogue.impl.ComposantImpl <em>Composant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.ComposantImpl
	 * @see catalogue.impl.CataloguePackageImpl#getComposant()
	 * @generated
	 */
	int COMPOSANT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__BRAND = 2;

	/**
	 * The feature id for the '<em><b>Datasheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__DATASHEET = 3;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__METADATA = 4;

	/**
	 * The feature id for the '<em><b>Footprint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__FOOTPRINT = 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__PORTS = 6;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__CONTRAINTES = 7;

	/**
	 * The number of structural features of the '<em>Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link catalogue.impl.MetadataImpl <em>Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.MetadataImpl
	 * @see catalogue.impl.CataloguePackageImpl#getMetadata()
	 * @generated
	 */
	int METADATA = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link catalogue.impl.FootprintImpl <em>Footprint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.FootprintImpl
	 * @see catalogue.impl.CataloguePackageImpl#getFootprint()
	 * @generated
	 */
	int FOOTPRINT = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTPRINT__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTPRINT__HEIGHT = 1;

	/**
	 * The number of structural features of the '<em>Footprint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTPRINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Footprint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTPRINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link catalogue.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.PortImpl
	 * @see catalogue.impl.CataloguePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__X = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__Y = 2;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link catalogue.impl.ContrainteImpl <em>Contrainte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.ContrainteImpl
	 * @see catalogue.impl.CataloguePackageImpl#getContrainte()
	 * @generated
	 */
	int CONTRAINTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Contrainte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Contrainte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link catalogue.impl.OpBinaireImpl <em>Op Binaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.OpBinaireImpl
	 * @see catalogue.impl.CataloguePackageImpl#getOpBinaire()
	 * @generated
	 */
	int OP_BINAIRE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_BINAIRE__NAME = CONTRAINTE__NAME;

	/**
	 * The feature id for the '<em><b>Operandes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_BINAIRE__OPERANDES = CONTRAINTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Op Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_BINAIRE_FEATURE_COUNT = CONTRAINTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Op Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_BINAIRE_OPERATION_COUNT = CONTRAINTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link catalogue.impl.EtImpl <em>Et</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.EtImpl
	 * @see catalogue.impl.CataloguePackageImpl#getEt()
	 * @generated
	 */
	int ET = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ET__NAME = OP_BINAIRE__NAME;

	/**
	 * The feature id for the '<em><b>Operandes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ET__OPERANDES = OP_BINAIRE__OPERANDES;

	/**
	 * The number of structural features of the '<em>Et</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ET_FEATURE_COUNT = OP_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Et</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ET_OPERATION_COUNT = OP_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link catalogue.impl.OuImpl <em>Ou</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.OuImpl
	 * @see catalogue.impl.CataloguePackageImpl#getOu()
	 * @generated
	 */
	int OU = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OU__NAME = OP_BINAIRE__NAME;

	/**
	 * The feature id for the '<em><b>Operandes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OU__OPERANDES = OP_BINAIRE__OPERANDES;

	/**
	 * The number of structural features of the '<em>Ou</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OU_FEATURE_COUNT = OP_BINAIRE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ou</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OU_OPERATION_COUNT = OP_BINAIRE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link catalogue.impl.NonImpl <em>Non</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.NonImpl
	 * @see catalogue.impl.CataloguePackageImpl#getNon()
	 * @generated
	 */
	int NON = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON__NAME = CONTRAINTE__NAME;

	/**
	 * The feature id for the '<em><b>Operande</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON__OPERANDE = CONTRAINTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FEATURE_COUNT = CONTRAINTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Non</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_OPERATION_COUNT = CONTRAINTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link catalogue.impl.RedondanceImpl <em>Redondance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.RedondanceImpl
	 * @see catalogue.impl.CataloguePackageImpl#getRedondance()
	 * @generated
	 */
	int REDONDANCE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDONDANCE__NAME = CONTRAINTE__NAME;

	/**
	 * The feature id for the '<em><b>Min Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDONDANCE__MIN_COUNT = CONTRAINTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Redondance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDONDANCE_FEATURE_COUNT = CONTRAINTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Redondance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDONDANCE_OPERATION_COUNT = CONTRAINTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link catalogue.impl.GeometriqueImpl <em>Geometrique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.GeometriqueImpl
	 * @see catalogue.impl.CataloguePackageImpl#getGeometrique()
	 * @generated
	 */
	int GEOMETRIQUE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIQUE__NAME = CONTRAINTE__NAME;

	/**
	 * The feature id for the '<em><b>Distance Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIQUE__DISTANCE_MIN = CONTRAINTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geometrique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIQUE_FEATURE_COUNT = CONTRAINTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Geometrique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRIQUE_OPERATION_COUNT = CONTRAINTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link catalogue.impl.GeoGeneraleImpl <em>Geo Generale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.GeoGeneraleImpl
	 * @see catalogue.impl.CataloguePackageImpl#getGeoGenerale()
	 * @generated
	 */
	int GEO_GENERALE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_GENERALE__NAME = GEOMETRIQUE__NAME;

	/**
	 * The feature id for the '<em><b>Distance Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_GENERALE__DISTANCE_MIN = GEOMETRIQUE__DISTANCE_MIN;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_GENERALE__TYPE = GEOMETRIQUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geo Generale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_GENERALE_FEATURE_COUNT = GEOMETRIQUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Geo Generale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_GENERALE_OPERATION_COUNT = GEOMETRIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link catalogue.impl.GeoSpecifiqueImpl <em>Geo Specifique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.GeoSpecifiqueImpl
	 * @see catalogue.impl.CataloguePackageImpl#getGeoSpecifique()
	 * @generated
	 */
	int GEO_SPECIFIQUE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_SPECIFIQUE__NAME = GEOMETRIQUE__NAME;

	/**
	 * The feature id for the '<em><b>Distance Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_SPECIFIQUE__DISTANCE_MIN = GEOMETRIQUE__DISTANCE_MIN;

	/**
	 * The feature id for the '<em><b>Cle Metadonnee Cible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_SPECIFIQUE__CLE_METADONNEE_CIBLE = GEOMETRIQUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valeur Metadonnee Cible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_SPECIFIQUE__VALEUR_METADONNEE_CIBLE = GEOMETRIQUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Geo Specifique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_SPECIFIQUE_FEATURE_COUNT = GEOMETRIQUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Geo Specifique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_SPECIFIQUE_OPERATION_COUNT = GEOMETRIQUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link catalogue.ZoneType <em>Zone Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.ZoneType
	 * @see catalogue.impl.CataloguePackageImpl#getZoneType()
	 * @generated
	 */
	int ZONE_TYPE = 14;


	/**
	 * Returns the meta object for class '{@link catalogue.Catalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogue</em>'.
	 * @see catalogue.Catalogue
	 * @generated
	 */
	EClass getCatalogue();

	/**
	 * Returns the meta object for the containment reference list '{@link catalogue.Catalogue#getComposants <em>Composants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composants</em>'.
	 * @see catalogue.Catalogue#getComposants()
	 * @see #getCatalogue()
	 * @generated
	 */
	EReference getCatalogue_Composants();

	/**
	 * Returns the meta object for class '{@link catalogue.Composant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composant</em>'.
	 * @see catalogue.Composant
	 * @generated
	 */
	EClass getComposant();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Composant#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see catalogue.Composant#getId()
	 * @see #getComposant()
	 * @generated
	 */
	EAttribute getComposant_Id();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Composant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see catalogue.Composant#getName()
	 * @see #getComposant()
	 * @generated
	 */
	EAttribute getComposant_Name();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Composant#getBrand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brand</em>'.
	 * @see catalogue.Composant#getBrand()
	 * @see #getComposant()
	 * @generated
	 */
	EAttribute getComposant_Brand();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Composant#getDatasheet <em>Datasheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datasheet</em>'.
	 * @see catalogue.Composant#getDatasheet()
	 * @see #getComposant()
	 * @generated
	 */
	EAttribute getComposant_Datasheet();

	/**
	 * Returns the meta object for the containment reference list '{@link catalogue.Composant#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see catalogue.Composant#getMetadata()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link catalogue.Composant#getFootprint <em>Footprint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footprint</em>'.
	 * @see catalogue.Composant#getFootprint()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Footprint();

	/**
	 * Returns the meta object for the containment reference list '{@link catalogue.Composant#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see catalogue.Composant#getPorts()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link catalogue.Composant#getContraintes <em>Contraintes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contraintes</em>'.
	 * @see catalogue.Composant#getContraintes()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Contraintes();

	/**
	 * Returns the meta object for class '{@link catalogue.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata</em>'.
	 * @see catalogue.Metadata
	 * @generated
	 */
	EClass getMetadata();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Metadata#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see catalogue.Metadata#getKey()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Key();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Metadata#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see catalogue.Metadata#getValue()
	 * @see #getMetadata()
	 * @generated
	 */
	EAttribute getMetadata_Value();

	/**
	 * Returns the meta object for class '{@link catalogue.Footprint <em>Footprint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Footprint</em>'.
	 * @see catalogue.Footprint
	 * @generated
	 */
	EClass getFootprint();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Footprint#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see catalogue.Footprint#getWidth()
	 * @see #getFootprint()
	 * @generated
	 */
	EAttribute getFootprint_Width();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Footprint#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see catalogue.Footprint#getHeight()
	 * @see #getFootprint()
	 * @generated
	 */
	EAttribute getFootprint_Height();

	/**
	 * Returns the meta object for class '{@link catalogue.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see catalogue.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see catalogue.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Port#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see catalogue.Port#getX()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_X();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Port#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see catalogue.Port#getY()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Y();

	/**
	 * Returns the meta object for class '{@link catalogue.Contrainte <em>Contrainte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrainte</em>'.
	 * @see catalogue.Contrainte
	 * @generated
	 */
	EClass getContrainte();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Contrainte#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see catalogue.Contrainte#getName()
	 * @see #getContrainte()
	 * @generated
	 */
	EAttribute getContrainte_Name();

	/**
	 * Returns the meta object for class '{@link catalogue.OpBinaire <em>Op Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Binaire</em>'.
	 * @see catalogue.OpBinaire
	 * @generated
	 */
	EClass getOpBinaire();

	/**
	 * Returns the meta object for the containment reference list '{@link catalogue.OpBinaire#getOperandes <em>Operandes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operandes</em>'.
	 * @see catalogue.OpBinaire#getOperandes()
	 * @see #getOpBinaire()
	 * @generated
	 */
	EReference getOpBinaire_Operandes();

	/**
	 * Returns the meta object for class '{@link catalogue.Et <em>Et</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Et</em>'.
	 * @see catalogue.Et
	 * @generated
	 */
	EClass getEt();

	/**
	 * Returns the meta object for class '{@link catalogue.Ou <em>Ou</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ou</em>'.
	 * @see catalogue.Ou
	 * @generated
	 */
	EClass getOu();

	/**
	 * Returns the meta object for class '{@link catalogue.Non <em>Non</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non</em>'.
	 * @see catalogue.Non
	 * @generated
	 */
	EClass getNon();

	/**
	 * Returns the meta object for the containment reference '{@link catalogue.Non#getOperande <em>Operande</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operande</em>'.
	 * @see catalogue.Non#getOperande()
	 * @see #getNon()
	 * @generated
	 */
	EReference getNon_Operande();

	/**
	 * Returns the meta object for class '{@link catalogue.Redondance <em>Redondance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redondance</em>'.
	 * @see catalogue.Redondance
	 * @generated
	 */
	EClass getRedondance();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Redondance#getMinCount <em>Min Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Count</em>'.
	 * @see catalogue.Redondance#getMinCount()
	 * @see #getRedondance()
	 * @generated
	 */
	EAttribute getRedondance_MinCount();

	/**
	 * Returns the meta object for class '{@link catalogue.Geometrique <em>Geometrique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometrique</em>'.
	 * @see catalogue.Geometrique
	 * @generated
	 */
	EClass getGeometrique();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Geometrique#getDistanceMin <em>Distance Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance Min</em>'.
	 * @see catalogue.Geometrique#getDistanceMin()
	 * @see #getGeometrique()
	 * @generated
	 */
	EAttribute getGeometrique_DistanceMin();

	/**
	 * Returns the meta object for class '{@link catalogue.GeoGenerale <em>Geo Generale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Generale</em>'.
	 * @see catalogue.GeoGenerale
	 * @generated
	 */
	EClass getGeoGenerale();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.GeoGenerale#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see catalogue.GeoGenerale#getType()
	 * @see #getGeoGenerale()
	 * @generated
	 */
	EAttribute getGeoGenerale_Type();

	/**
	 * Returns the meta object for class '{@link catalogue.GeoSpecifique <em>Geo Specifique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo Specifique</em>'.
	 * @see catalogue.GeoSpecifique
	 * @generated
	 */
	EClass getGeoSpecifique();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.GeoSpecifique#getCleMetadonneeCible <em>Cle Metadonnee Cible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cle Metadonnee Cible</em>'.
	 * @see catalogue.GeoSpecifique#getCleMetadonneeCible()
	 * @see #getGeoSpecifique()
	 * @generated
	 */
	EAttribute getGeoSpecifique_CleMetadonneeCible();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.GeoSpecifique#getValeurMetadonneeCible <em>Valeur Metadonnee Cible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur Metadonnee Cible</em>'.
	 * @see catalogue.GeoSpecifique#getValeurMetadonneeCible()
	 * @see #getGeoSpecifique()
	 * @generated
	 */
	EAttribute getGeoSpecifique_ValeurMetadonneeCible();

	/**
	 * Returns the meta object for enum '{@link catalogue.ZoneType <em>Zone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Zone Type</em>'.
	 * @see catalogue.ZoneType
	 * @generated
	 */
	EEnum getZoneType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CatalogueFactory getCatalogueFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link catalogue.impl.CatalogueImpl <em>Catalogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.CatalogueImpl
		 * @see catalogue.impl.CataloguePackageImpl#getCatalogue()
		 * @generated
		 */
		EClass CATALOGUE = eINSTANCE.getCatalogue();

		/**
		 * The meta object literal for the '<em><b>Composants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE__COMPOSANTS = eINSTANCE.getCatalogue_Composants();

		/**
		 * The meta object literal for the '{@link catalogue.impl.ComposantImpl <em>Composant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.ComposantImpl
		 * @see catalogue.impl.CataloguePackageImpl#getComposant()
		 * @generated
		 */
		EClass COMPOSANT = eINSTANCE.getComposant();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSANT__ID = eINSTANCE.getComposant_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSANT__NAME = eINSTANCE.getComposant_Name();

		/**
		 * The meta object literal for the '<em><b>Brand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSANT__BRAND = eINSTANCE.getComposant_Brand();

		/**
		 * The meta object literal for the '<em><b>Datasheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSANT__DATASHEET = eINSTANCE.getComposant_Datasheet();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__METADATA = eINSTANCE.getComposant_Metadata();

		/**
		 * The meta object literal for the '<em><b>Footprint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__FOOTPRINT = eINSTANCE.getComposant_Footprint();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__PORTS = eINSTANCE.getComposant_Ports();

		/**
		 * The meta object literal for the '<em><b>Contraintes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__CONTRAINTES = eINSTANCE.getComposant_Contraintes();

		/**
		 * The meta object literal for the '{@link catalogue.impl.MetadataImpl <em>Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.MetadataImpl
		 * @see catalogue.impl.CataloguePackageImpl#getMetadata()
		 * @generated
		 */
		EClass METADATA = eINSTANCE.getMetadata();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__KEY = eINSTANCE.getMetadata_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA__VALUE = eINSTANCE.getMetadata_Value();

		/**
		 * The meta object literal for the '{@link catalogue.impl.FootprintImpl <em>Footprint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.FootprintImpl
		 * @see catalogue.impl.CataloguePackageImpl#getFootprint()
		 * @generated
		 */
		EClass FOOTPRINT = eINSTANCE.getFootprint();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOTPRINT__WIDTH = eINSTANCE.getFootprint_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOTPRINT__HEIGHT = eINSTANCE.getFootprint_Height();

		/**
		 * The meta object literal for the '{@link catalogue.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.PortImpl
		 * @see catalogue.impl.CataloguePackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__X = eINSTANCE.getPort_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__Y = eINSTANCE.getPort_Y();

		/**
		 * The meta object literal for the '{@link catalogue.impl.ContrainteImpl <em>Contrainte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.ContrainteImpl
		 * @see catalogue.impl.CataloguePackageImpl#getContrainte()
		 * @generated
		 */
		EClass CONTRAINTE = eINSTANCE.getContrainte();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRAINTE__NAME = eINSTANCE.getContrainte_Name();

		/**
		 * The meta object literal for the '{@link catalogue.impl.OpBinaireImpl <em>Op Binaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.OpBinaireImpl
		 * @see catalogue.impl.CataloguePackageImpl#getOpBinaire()
		 * @generated
		 */
		EClass OP_BINAIRE = eINSTANCE.getOpBinaire();

		/**
		 * The meta object literal for the '<em><b>Operandes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP_BINAIRE__OPERANDES = eINSTANCE.getOpBinaire_Operandes();

		/**
		 * The meta object literal for the '{@link catalogue.impl.EtImpl <em>Et</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.EtImpl
		 * @see catalogue.impl.CataloguePackageImpl#getEt()
		 * @generated
		 */
		EClass ET = eINSTANCE.getEt();

		/**
		 * The meta object literal for the '{@link catalogue.impl.OuImpl <em>Ou</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.OuImpl
		 * @see catalogue.impl.CataloguePackageImpl#getOu()
		 * @generated
		 */
		EClass OU = eINSTANCE.getOu();

		/**
		 * The meta object literal for the '{@link catalogue.impl.NonImpl <em>Non</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.NonImpl
		 * @see catalogue.impl.CataloguePackageImpl#getNon()
		 * @generated
		 */
		EClass NON = eINSTANCE.getNon();

		/**
		 * The meta object literal for the '<em><b>Operande</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON__OPERANDE = eINSTANCE.getNon_Operande();

		/**
		 * The meta object literal for the '{@link catalogue.impl.RedondanceImpl <em>Redondance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.RedondanceImpl
		 * @see catalogue.impl.CataloguePackageImpl#getRedondance()
		 * @generated
		 */
		EClass REDONDANCE = eINSTANCE.getRedondance();

		/**
		 * The meta object literal for the '<em><b>Min Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDONDANCE__MIN_COUNT = eINSTANCE.getRedondance_MinCount();

		/**
		 * The meta object literal for the '{@link catalogue.impl.GeometriqueImpl <em>Geometrique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.GeometriqueImpl
		 * @see catalogue.impl.CataloguePackageImpl#getGeometrique()
		 * @generated
		 */
		EClass GEOMETRIQUE = eINSTANCE.getGeometrique();

		/**
		 * The meta object literal for the '<em><b>Distance Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRIQUE__DISTANCE_MIN = eINSTANCE.getGeometrique_DistanceMin();

		/**
		 * The meta object literal for the '{@link catalogue.impl.GeoGeneraleImpl <em>Geo Generale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.GeoGeneraleImpl
		 * @see catalogue.impl.CataloguePackageImpl#getGeoGenerale()
		 * @generated
		 */
		EClass GEO_GENERALE = eINSTANCE.getGeoGenerale();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_GENERALE__TYPE = eINSTANCE.getGeoGenerale_Type();

		/**
		 * The meta object literal for the '{@link catalogue.impl.GeoSpecifiqueImpl <em>Geo Specifique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.GeoSpecifiqueImpl
		 * @see catalogue.impl.CataloguePackageImpl#getGeoSpecifique()
		 * @generated
		 */
		EClass GEO_SPECIFIQUE = eINSTANCE.getGeoSpecifique();

		/**
		 * The meta object literal for the '<em><b>Cle Metadonnee Cible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_SPECIFIQUE__CLE_METADONNEE_CIBLE = eINSTANCE.getGeoSpecifique_CleMetadonneeCible();

		/**
		 * The meta object literal for the '<em><b>Valeur Metadonnee Cible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_SPECIFIQUE__VALEUR_METADONNEE_CIBLE = eINSTANCE.getGeoSpecifique_ValeurMetadonneeCible();

		/**
		 * The meta object literal for the '{@link catalogue.ZoneType <em>Zone Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.ZoneType
		 * @see catalogue.impl.CataloguePackageImpl#getZoneType()
		 * @generated
		 */
		EEnum ZONE_TYPE = eINSTANCE.getZoneType();

	}

} //CataloguePackage
