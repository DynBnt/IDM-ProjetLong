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
	String eNS_URI = "http://fr.n7.catalogue";

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
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Composants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__COMPOSANTS = 1;

	/**
	 * The feature id for the '<em><b>Types Metadonnees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE__TYPES_METADONNEES = 2;

	/**
	 * The number of structural features of the '<em>Catalogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Metadonnees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__METADONNEES = 1;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__PORTS = 2;

	/**
	 * The feature id for the '<em><b>Empreinte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__EMPREINTE = 3;

	/**
	 * The feature id for the '<em><b>Contraintes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT__CONTRAINTES = 4;

	/**
	 * The number of structural features of the '<em>Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link catalogue.impl.TypeMetadonneeImpl <em>Type Metadonnee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.TypeMetadonneeImpl
	 * @see catalogue.impl.CataloguePackageImpl#getTypeMetadonnee()
	 * @generated
	 */
	int TYPE_METADONNEE = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_METADONNEE__NOM = 0;

	/**
	 * The number of structural features of the '<em>Type Metadonnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_METADONNEE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Type Metadonnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_METADONNEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link catalogue.impl.MetadonneeImpl <em>Metadonnee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.MetadonneeImpl
	 * @see catalogue.impl.CataloguePackageImpl#getMetadonnee()
	 * @generated
	 */
	int METADONNEE = 3;

	/**
	 * The feature id for the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADONNEE__VALEUR = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADONNEE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Metadonnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADONNEE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metadonnee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADONNEE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NOM = 0;

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
	 * The meta object id for the '{@link catalogue.impl.EmpreinteImpl <em>Empreinte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.EmpreinteImpl
	 * @see catalogue.impl.CataloguePackageImpl#getEmpreinte()
	 * @generated
	 */
	int EMPREINTE = 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPREINTE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Largeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPREINTE__LARGEUR = 1;

	/**
	 * The feature id for the '<em><b>Hauteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPREINTE__HAUTEUR = 2;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPREINTE__PORTS = 3;

	/**
	 * The number of structural features of the '<em>Empreinte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPREINTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Empreinte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPREINTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link catalogue.impl.ContrainteImpl <em>Contrainte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see catalogue.impl.ContrainteImpl
	 * @see catalogue.impl.CataloguePackageImpl#getContrainte()
	 * @generated
	 */
	int CONTRAINTE = 6;

	/**
	 * The number of structural features of the '<em>Contrainte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAINTE_FEATURE_COUNT = 0;

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
	int OP_BINAIRE = 7;

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
	int ET = 8;

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
	int OU = 9;

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
	int NON = 10;

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
	int REDONDANCE = 11;

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
	int GEOMETRIQUE = 12;

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
	int GEO_GENERALE = 13;

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
	int GEO_SPECIFIQUE = 14;

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
	int ZONE_TYPE = 15;


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
	 * Returns the meta object for the attribute '{@link catalogue.Catalogue#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see catalogue.Catalogue#getNom()
	 * @see #getCatalogue()
	 * @generated
	 */
	EAttribute getCatalogue_Nom();

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
	 * Returns the meta object for the containment reference list '{@link catalogue.Catalogue#getTypesMetadonnees <em>Types Metadonnees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types Metadonnees</em>'.
	 * @see catalogue.Catalogue#getTypesMetadonnees()
	 * @see #getCatalogue()
	 * @generated
	 */
	EReference getCatalogue_TypesMetadonnees();

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
	 * Returns the meta object for the attribute '{@link catalogue.Composant#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see catalogue.Composant#getNom()
	 * @see #getComposant()
	 * @generated
	 */
	EAttribute getComposant_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link catalogue.Composant#getMetadonnees <em>Metadonnees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadonnees</em>'.
	 * @see catalogue.Composant#getMetadonnees()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Metadonnees();

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
	 * Returns the meta object for the containment reference '{@link catalogue.Composant#getEmpreinte <em>Empreinte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Empreinte</em>'.
	 * @see catalogue.Composant#getEmpreinte()
	 * @see #getComposant()
	 * @generated
	 */
	EReference getComposant_Empreinte();

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
	 * Returns the meta object for class '{@link catalogue.TypeMetadonnee <em>Type Metadonnee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Metadonnee</em>'.
	 * @see catalogue.TypeMetadonnee
	 * @generated
	 */
	EClass getTypeMetadonnee();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.TypeMetadonnee#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see catalogue.TypeMetadonnee#getNom()
	 * @see #getTypeMetadonnee()
	 * @generated
	 */
	EAttribute getTypeMetadonnee_Nom();

	/**
	 * Returns the meta object for class '{@link catalogue.Metadonnee <em>Metadonnee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadonnee</em>'.
	 * @see catalogue.Metadonnee
	 * @generated
	 */
	EClass getMetadonnee();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Metadonnee#getValeur <em>Valeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur</em>'.
	 * @see catalogue.Metadonnee#getValeur()
	 * @see #getMetadonnee()
	 * @generated
	 */
	EAttribute getMetadonnee_Valeur();

	/**
	 * Returns the meta object for the reference '{@link catalogue.Metadonnee#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see catalogue.Metadonnee#getType()
	 * @see #getMetadonnee()
	 * @generated
	 */
	EReference getMetadonnee_Type();

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
	 * Returns the meta object for the attribute '{@link catalogue.Port#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see catalogue.Port#getNom()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Nom();

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
	 * Returns the meta object for class '{@link catalogue.Empreinte <em>Empreinte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empreinte</em>'.
	 * @see catalogue.Empreinte
	 * @generated
	 */
	EClass getEmpreinte();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Empreinte#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see catalogue.Empreinte#getNom()
	 * @see #getEmpreinte()
	 * @generated
	 */
	EAttribute getEmpreinte_Nom();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Empreinte#getLargeur <em>Largeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Largeur</em>'.
	 * @see catalogue.Empreinte#getLargeur()
	 * @see #getEmpreinte()
	 * @generated
	 */
	EAttribute getEmpreinte_Largeur();

	/**
	 * Returns the meta object for the attribute '{@link catalogue.Empreinte#getHauteur <em>Hauteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hauteur</em>'.
	 * @see catalogue.Empreinte#getHauteur()
	 * @see #getEmpreinte()
	 * @generated
	 */
	EAttribute getEmpreinte_Hauteur();

	/**
	 * Returns the meta object for the containment reference list '{@link catalogue.Empreinte#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see catalogue.Empreinte#getPorts()
	 * @see #getEmpreinte()
	 * @generated
	 */
	EReference getEmpreinte_Ports();

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
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOGUE__NOM = eINSTANCE.getCatalogue_Nom();

		/**
		 * The meta object literal for the '<em><b>Composants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE__COMPOSANTS = eINSTANCE.getCatalogue_Composants();

		/**
		 * The meta object literal for the '<em><b>Types Metadonnees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE__TYPES_METADONNEES = eINSTANCE.getCatalogue_TypesMetadonnees();

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
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSANT__NOM = eINSTANCE.getComposant_Nom();

		/**
		 * The meta object literal for the '<em><b>Metadonnees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__METADONNEES = eINSTANCE.getComposant_Metadonnees();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__PORTS = eINSTANCE.getComposant_Ports();

		/**
		 * The meta object literal for the '<em><b>Empreinte</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__EMPREINTE = eINSTANCE.getComposant_Empreinte();

		/**
		 * The meta object literal for the '<em><b>Contraintes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSANT__CONTRAINTES = eINSTANCE.getComposant_Contraintes();

		/**
		 * The meta object literal for the '{@link catalogue.impl.TypeMetadonneeImpl <em>Type Metadonnee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.TypeMetadonneeImpl
		 * @see catalogue.impl.CataloguePackageImpl#getTypeMetadonnee()
		 * @generated
		 */
		EClass TYPE_METADONNEE = eINSTANCE.getTypeMetadonnee();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_METADONNEE__NOM = eINSTANCE.getTypeMetadonnee_Nom();

		/**
		 * The meta object literal for the '{@link catalogue.impl.MetadonneeImpl <em>Metadonnee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.MetadonneeImpl
		 * @see catalogue.impl.CataloguePackageImpl#getMetadonnee()
		 * @generated
		 */
		EClass METADONNEE = eINSTANCE.getMetadonnee();

		/**
		 * The meta object literal for the '<em><b>Valeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADONNEE__VALEUR = eINSTANCE.getMetadonnee_Valeur();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADONNEE__TYPE = eINSTANCE.getMetadonnee_Type();

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
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NOM = eINSTANCE.getPort_Nom();

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
		 * The meta object literal for the '{@link catalogue.impl.EmpreinteImpl <em>Empreinte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see catalogue.impl.EmpreinteImpl
		 * @see catalogue.impl.CataloguePackageImpl#getEmpreinte()
		 * @generated
		 */
		EClass EMPREINTE = eINSTANCE.getEmpreinte();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPREINTE__NOM = eINSTANCE.getEmpreinte_Nom();

		/**
		 * The meta object literal for the '<em><b>Largeur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPREINTE__LARGEUR = eINSTANCE.getEmpreinte_Largeur();

		/**
		 * The meta object literal for the '<em><b>Hauteur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPREINTE__HAUTEUR = eINSTANCE.getEmpreinte_Hauteur();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPREINTE__PORTS = eINSTANCE.getEmpreinte_Ports();

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
