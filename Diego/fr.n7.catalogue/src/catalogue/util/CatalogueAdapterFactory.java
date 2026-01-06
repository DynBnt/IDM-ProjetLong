/**
 */
package catalogue.util;

import catalogue.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see catalogue.CataloguePackage
 * @generated
 */
public class CatalogueAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CataloguePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogueAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CataloguePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogueSwitch<Adapter> modelSwitch =
		new CatalogueSwitch<Adapter>() {
			@Override
			public Adapter caseCatalogue(Catalogue object) {
				return createCatalogueAdapter();
			}
			@Override
			public Adapter caseComposant(Composant object) {
				return createComposantAdapter();
			}
			@Override
			public Adapter caseTypeMetadonnee(TypeMetadonnee object) {
				return createTypeMetadonneeAdapter();
			}
			@Override
			public Adapter caseMetadonnee(Metadonnee object) {
				return createMetadonneeAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseEmpreinte(Empreinte object) {
				return createEmpreinteAdapter();
			}
			@Override
			public Adapter caseContrainte(Contrainte object) {
				return createContrainteAdapter();
			}
			@Override
			public Adapter caseOpBinaire(OpBinaire object) {
				return createOpBinaireAdapter();
			}
			@Override
			public Adapter caseEt(Et object) {
				return createEtAdapter();
			}
			@Override
			public Adapter caseOu(Ou object) {
				return createOuAdapter();
			}
			@Override
			public Adapter caseNon(Non object) {
				return createNonAdapter();
			}
			@Override
			public Adapter caseRedondance(Redondance object) {
				return createRedondanceAdapter();
			}
			@Override
			public Adapter caseGeometrique(Geometrique object) {
				return createGeometriqueAdapter();
			}
			@Override
			public Adapter caseGeoGenerale(GeoGenerale object) {
				return createGeoGeneraleAdapter();
			}
			@Override
			public Adapter caseGeoSpecifique(GeoSpecifique object) {
				return createGeoSpecifiqueAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link catalogue.Catalogue <em>Catalogue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see catalogue.Catalogue
	 * @generated
	 */
	public Adapter createCatalogueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link catalogue.Composant <em>Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see catalogue.Composant
	 * @generated
	 */
	public Adapter createComposantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link catalogue.TypeMetadonnee <em>Type Metadonnee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see catalogue.TypeMetadonnee
	 * @generated
	 */
	public Adapter createTypeMetadonneeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link catalogue.Metadonnee <em>Metadonnee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see catalogue.Metadonnee
	 * @generated
	 */
	public Adapter createMetadonneeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link catalogue.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see catalogue.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link catalogue.Empreinte <em>Empreinte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see catalogue.Empreinte
	 * @generated
	 */
	public Adapter createEmpreinteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link catalogue.Contrainte <em>Contrainte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see catalogue.Contrainte
	 * @generated
	 */
	public Adapter createContrainteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link catalogue.OpBinaire <em>Op Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see catalogue.OpBinaire
	 * @generated
	 */
	public Adapter createOpBinaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link catalogue.Et <em>Et</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see catalogue.Et
	 * @generated
	 */
	public Adapter createEtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link catalogue.Ou <em>Ou</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see catalogue.Ou
	 * @generated
	 */
	public Adapter createOuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link catalogue.Non <em>Non</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see catalogue.Non
	 * @generated
	 */
	public Adapter createNonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link catalogue.Redondance <em>Redondance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see catalogue.Redondance
	 * @generated
	 */
	public Adapter createRedondanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link catalogue.Geometrique <em>Geometrique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see catalogue.Geometrique
	 * @generated
	 */
	public Adapter createGeometriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link catalogue.GeoGenerale <em>Geo Generale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see catalogue.GeoGenerale
	 * @generated
	 */
	public Adapter createGeoGeneraleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link catalogue.GeoSpecifique <em>Geo Specifique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see catalogue.GeoSpecifique
	 * @generated
	 */
	public Adapter createGeoSpecifiqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CatalogueAdapterFactory
