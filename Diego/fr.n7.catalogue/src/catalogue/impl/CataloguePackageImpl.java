/**
 */
package catalogue.impl;

import catalogue.Catalogue;
import catalogue.CatalogueFactory;
import catalogue.CataloguePackage;
import catalogue.Composant;
import catalogue.Contrainte;
import catalogue.Empreinte;
import catalogue.Et;
import catalogue.GeoGenerale;
import catalogue.GeoSpecifique;
import catalogue.Geometrique;
import catalogue.Metadonnee;
import catalogue.Non;
import catalogue.OpBinaire;
import catalogue.Ou;
import catalogue.Port;
import catalogue.Redondance;
import catalogue.TypeMetadonnee;
import catalogue.ZoneType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CataloguePackageImpl extends EPackageImpl implements CataloguePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeMetadonneeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadonneeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass empreinteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contrainteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opBinaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ouEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redondanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometriqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geoGeneraleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geoSpecifiqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum zoneTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see catalogue.CataloguePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CataloguePackageImpl() {
		super(eNS_URI, CatalogueFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CataloguePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CataloguePackage init() {
		if (isInited) return (CataloguePackage)EPackage.Registry.INSTANCE.getEPackage(CataloguePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCataloguePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CataloguePackageImpl theCataloguePackage = registeredCataloguePackage instanceof CataloguePackageImpl ? (CataloguePackageImpl)registeredCataloguePackage : new CataloguePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCataloguePackage.createPackageContents();

		// Initialize created meta-data
		theCataloguePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCataloguePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CataloguePackage.eNS_URI, theCataloguePackage);
		return theCataloguePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatalogue() {
		return catalogueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCatalogue_Nom() {
		return (EAttribute)catalogueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogue_Composants() {
		return (EReference)catalogueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatalogue_TypesMetadonnees() {
		return (EReference)catalogueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComposant() {
		return composantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComposant_Nom() {
		return (EAttribute)composantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComposant_Metadonnees() {
		return (EReference)composantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComposant_Ports() {
		return (EReference)composantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComposant_Empreinte() {
		return (EReference)composantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComposant_Contraintes() {
		return (EReference)composantEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeMetadonnee() {
		return typeMetadonneeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypeMetadonnee_Nom() {
		return (EAttribute)typeMetadonneeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetadonnee() {
		return metadonneeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadonnee_Valeur() {
		return (EAttribute)metadonneeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadonnee_Type() {
		return (EReference)metadonneeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Nom() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_X() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Y() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmpreinte() {
		return empreinteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmpreinte_Nom() {
		return (EAttribute)empreinteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmpreinte_Largeur() {
		return (EAttribute)empreinteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmpreinte_Hauteur() {
		return (EAttribute)empreinteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmpreinte_Ports() {
		return (EReference)empreinteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContrainte() {
		return contrainteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpBinaire() {
		return opBinaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOpBinaire_Operandes() {
		return (EReference)opBinaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEt() {
		return etEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOu() {
		return ouEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNon() {
		return nonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNon_Operande() {
		return (EReference)nonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRedondance() {
		return redondanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRedondance_MinCount() {
		return (EAttribute)redondanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeometrique() {
		return geometriqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeometrique_DistanceMin() {
		return (EAttribute)geometriqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeoGenerale() {
		return geoGeneraleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoGenerale_Type() {
		return (EAttribute)geoGeneraleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeoSpecifique() {
		return geoSpecifiqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoSpecifique_CleMetadonneeCible() {
		return (EAttribute)geoSpecifiqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoSpecifique_ValeurMetadonneeCible() {
		return (EAttribute)geoSpecifiqueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getZoneType() {
		return zoneTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatalogueFactory getCatalogueFactory() {
		return (CatalogueFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		catalogueEClass = createEClass(CATALOGUE);
		createEAttribute(catalogueEClass, CATALOGUE__NOM);
		createEReference(catalogueEClass, CATALOGUE__COMPOSANTS);
		createEReference(catalogueEClass, CATALOGUE__TYPES_METADONNEES);

		composantEClass = createEClass(COMPOSANT);
		createEAttribute(composantEClass, COMPOSANT__NOM);
		createEReference(composantEClass, COMPOSANT__METADONNEES);
		createEReference(composantEClass, COMPOSANT__PORTS);
		createEReference(composantEClass, COMPOSANT__EMPREINTE);
		createEReference(composantEClass, COMPOSANT__CONTRAINTES);

		typeMetadonneeEClass = createEClass(TYPE_METADONNEE);
		createEAttribute(typeMetadonneeEClass, TYPE_METADONNEE__NOM);

		metadonneeEClass = createEClass(METADONNEE);
		createEAttribute(metadonneeEClass, METADONNEE__VALEUR);
		createEReference(metadonneeEClass, METADONNEE__TYPE);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__NOM);
		createEAttribute(portEClass, PORT__X);
		createEAttribute(portEClass, PORT__Y);

		empreinteEClass = createEClass(EMPREINTE);
		createEAttribute(empreinteEClass, EMPREINTE__NOM);
		createEAttribute(empreinteEClass, EMPREINTE__LARGEUR);
		createEAttribute(empreinteEClass, EMPREINTE__HAUTEUR);
		createEReference(empreinteEClass, EMPREINTE__PORTS);

		contrainteEClass = createEClass(CONTRAINTE);

		opBinaireEClass = createEClass(OP_BINAIRE);
		createEReference(opBinaireEClass, OP_BINAIRE__OPERANDES);

		etEClass = createEClass(ET);

		ouEClass = createEClass(OU);

		nonEClass = createEClass(NON);
		createEReference(nonEClass, NON__OPERANDE);

		redondanceEClass = createEClass(REDONDANCE);
		createEAttribute(redondanceEClass, REDONDANCE__MIN_COUNT);

		geometriqueEClass = createEClass(GEOMETRIQUE);
		createEAttribute(geometriqueEClass, GEOMETRIQUE__DISTANCE_MIN);

		geoGeneraleEClass = createEClass(GEO_GENERALE);
		createEAttribute(geoGeneraleEClass, GEO_GENERALE__TYPE);

		geoSpecifiqueEClass = createEClass(GEO_SPECIFIQUE);
		createEAttribute(geoSpecifiqueEClass, GEO_SPECIFIQUE__CLE_METADONNEE_CIBLE);
		createEAttribute(geoSpecifiqueEClass, GEO_SPECIFIQUE__VALEUR_METADONNEE_CIBLE);

		// Create enums
		zoneTypeEEnum = createEEnum(ZONE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		opBinaireEClass.getESuperTypes().add(this.getContrainte());
		etEClass.getESuperTypes().add(this.getOpBinaire());
		ouEClass.getESuperTypes().add(this.getOpBinaire());
		nonEClass.getESuperTypes().add(this.getContrainte());
		redondanceEClass.getESuperTypes().add(this.getContrainte());
		geometriqueEClass.getESuperTypes().add(this.getContrainte());
		geoGeneraleEClass.getESuperTypes().add(this.getGeometrique());
		geoSpecifiqueEClass.getESuperTypes().add(this.getGeometrique());

		// Initialize classes, features, and operations; add parameters
		initEClass(catalogueEClass, Catalogue.class, "Catalogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCatalogue_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Catalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogue_Composants(), this.getComposant(), null, "composants", null, 0, -1, Catalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCatalogue_TypesMetadonnees(), this.getTypeMetadonnee(), null, "typesMetadonnees", null, 0, -1, Catalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(composantEClass, Composant.class, "Composant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComposant_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposant_Metadonnees(), this.getMetadonnee(), null, "metadonnees", null, 0, -1, Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposant_Ports(), this.getPort(), null, "ports", null, 1, -1, Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposant_Empreinte(), this.getEmpreinte(), null, "empreinte", null, 0, 1, Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComposant_Contraintes(), this.getContrainte(), null, "contraintes", null, 0, -1, Composant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeMetadonneeEClass, TypeMetadonnee.class, "TypeMetadonnee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeMetadonnee_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, TypeMetadonnee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadonneeEClass, Metadonnee.class, "Metadonnee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetadonnee_Valeur(), ecorePackage.getEString(), "valeur", null, 0, 1, Metadonnee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadonnee_Type(), this.getTypeMetadonnee(), null, "type", null, 1, 1, Metadonnee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_X(), ecorePackage.getEDouble(), "x", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Y(), ecorePackage.getEDouble(), "y", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(empreinteEClass, Empreinte.class, "Empreinte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmpreinte_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Empreinte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpreinte_Largeur(), ecorePackage.getEDouble(), "largeur", null, 0, 1, Empreinte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmpreinte_Hauteur(), ecorePackage.getEDouble(), "hauteur", null, 0, 1, Empreinte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmpreinte_Ports(), this.getPort(), null, "ports", null, 1, -1, Empreinte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contrainteEClass, Contrainte.class, "Contrainte", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opBinaireEClass, OpBinaire.class, "OpBinaire", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpBinaire_Operandes(), this.getContrainte(), null, "operandes", null, 2, 2, OpBinaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(etEClass, Et.class, "Et", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ouEClass, Ou.class, "Ou", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nonEClass, Non.class, "Non", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNon_Operande(), this.getContrainte(), null, "operande", null, 1, 1, Non.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(redondanceEClass, Redondance.class, "Redondance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRedondance_MinCount(), ecorePackage.getEInt(), "minCount", null, 0, 1, Redondance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geometriqueEClass, Geometrique.class, "Geometrique", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeometrique_DistanceMin(), ecorePackage.getEDouble(), "distanceMin", null, 0, 1, Geometrique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geoGeneraleEClass, GeoGenerale.class, "GeoGenerale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeoGenerale_Type(), this.getZoneType(), "type", null, 0, 1, GeoGenerale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geoSpecifiqueEClass, GeoSpecifique.class, "GeoSpecifique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeoSpecifique_CleMetadonneeCible(), ecorePackage.getEString(), "cleMetadonneeCible", null, 0, 1, GeoSpecifique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoSpecifique_ValeurMetadonneeCible(), ecorePackage.getEString(), "valeurMetadonneeCible", null, 0, 1, GeoSpecifique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(zoneTypeEEnum, ZoneType.class, "ZoneType");
		addEEnumLiteral(zoneTypeEEnum, ZoneType.OTHER_COMPONENTS);
		addEEnumLiteral(zoneTypeEEnum, ZoneType.BOARD_EDGE);

		// Create resource
		createResource(eNS_URI);
	}

} //CataloguePackageImpl
