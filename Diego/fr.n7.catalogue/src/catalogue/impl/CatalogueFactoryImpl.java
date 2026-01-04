/**
 */
package catalogue.impl;

import catalogue.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CatalogueFactoryImpl extends EFactoryImpl implements CatalogueFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CatalogueFactory init() {
		try {
			CatalogueFactory theCatalogueFactory = (CatalogueFactory)EPackage.Registry.INSTANCE.getEFactory(CataloguePackage.eNS_URI);
			if (theCatalogueFactory != null) {
				return theCatalogueFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CatalogueFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogueFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CataloguePackage.CATALOGUE: return createCatalogue();
			case CataloguePackage.COMPOSANT: return createComposant();
			case CataloguePackage.METADATA: return createMetadata();
			case CataloguePackage.FOOTPRINT: return createFootprint();
			case CataloguePackage.PORT: return createPort();
			case CataloguePackage.OP_BINAIRE: return createOpBinaire();
			case CataloguePackage.ET: return createEt();
			case CataloguePackage.OU: return createOu();
			case CataloguePackage.NON: return createNon();
			case CataloguePackage.REDONDANCE: return createRedondance();
			case CataloguePackage.GEOMETRIQUE: return createGeometrique();
			case CataloguePackage.GEO_GENERALE: return createGeoGenerale();
			case CataloguePackage.GEO_SPECIFIQUE: return createGeoSpecifique();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CataloguePackage.ZONE_TYPE:
				return createZoneTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CataloguePackage.ZONE_TYPE:
				return convertZoneTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catalogue createCatalogue() {
		CatalogueImpl catalogue = new CatalogueImpl();
		return catalogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composant createComposant() {
		ComposantImpl composant = new ComposantImpl();
		return composant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Footprint createFootprint() {
		FootprintImpl footprint = new FootprintImpl();
		return footprint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpBinaire createOpBinaire() {
		OpBinaireImpl opBinaire = new OpBinaireImpl();
		return opBinaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Et createEt() {
		EtImpl et = new EtImpl();
		return et;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ou createOu() {
		OuImpl ou = new OuImpl();
		return ou;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Non createNon() {
		NonImpl non = new NonImpl();
		return non;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Redondance createRedondance() {
		RedondanceImpl redondance = new RedondanceImpl();
		return redondance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geometrique createGeometrique() {
		GeometriqueImpl geometrique = new GeometriqueImpl();
		return geometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoGenerale createGeoGenerale() {
		GeoGeneraleImpl geoGenerale = new GeoGeneraleImpl();
		return geoGenerale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoSpecifique createGeoSpecifique() {
		GeoSpecifiqueImpl geoSpecifique = new GeoSpecifiqueImpl();
		return geoSpecifique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneType createZoneTypeFromString(EDataType eDataType, String initialValue) {
		ZoneType result = ZoneType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZoneTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CataloguePackage getCataloguePackage() {
		return (CataloguePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CataloguePackage getPackage() {
		return CataloguePackage.eINSTANCE;
	}

} //CatalogueFactoryImpl
