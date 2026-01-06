/**
 */
package catalogue.util;

import catalogue.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see catalogue.CataloguePackage
 * @generated
 */
public class CatalogueSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CataloguePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogueSwitch() {
		if (modelPackage == null) {
			modelPackage = CataloguePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CataloguePackage.CATALOGUE: {
				Catalogue catalogue = (Catalogue)theEObject;
				T result = caseCatalogue(catalogue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CataloguePackage.COMPOSANT: {
				Composant composant = (Composant)theEObject;
				T result = caseComposant(composant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CataloguePackage.TYPE_METADONNEE: {
				TypeMetadonnee typeMetadonnee = (TypeMetadonnee)theEObject;
				T result = caseTypeMetadonnee(typeMetadonnee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CataloguePackage.METADONNEE: {
				Metadonnee metadonnee = (Metadonnee)theEObject;
				T result = caseMetadonnee(metadonnee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CataloguePackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CataloguePackage.EMPREINTE: {
				Empreinte empreinte = (Empreinte)theEObject;
				T result = caseEmpreinte(empreinte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CataloguePackage.CONTRAINTE: {
				Contrainte contrainte = (Contrainte)theEObject;
				T result = caseContrainte(contrainte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CataloguePackage.OP_BINAIRE: {
				OpBinaire opBinaire = (OpBinaire)theEObject;
				T result = caseOpBinaire(opBinaire);
				if (result == null) result = caseContrainte(opBinaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CataloguePackage.ET: {
				Et et = (Et)theEObject;
				T result = caseEt(et);
				if (result == null) result = caseOpBinaire(et);
				if (result == null) result = caseContrainte(et);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CataloguePackage.OU: {
				Ou ou = (Ou)theEObject;
				T result = caseOu(ou);
				if (result == null) result = caseOpBinaire(ou);
				if (result == null) result = caseContrainte(ou);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CataloguePackage.NON: {
				Non non = (Non)theEObject;
				T result = caseNon(non);
				if (result == null) result = caseContrainte(non);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CataloguePackage.REDONDANCE: {
				Redondance redondance = (Redondance)theEObject;
				T result = caseRedondance(redondance);
				if (result == null) result = caseContrainte(redondance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CataloguePackage.GEOMETRIQUE: {
				Geometrique geometrique = (Geometrique)theEObject;
				T result = caseGeometrique(geometrique);
				if (result == null) result = caseContrainte(geometrique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CataloguePackage.GEO_GENERALE: {
				GeoGenerale geoGenerale = (GeoGenerale)theEObject;
				T result = caseGeoGenerale(geoGenerale);
				if (result == null) result = caseGeometrique(geoGenerale);
				if (result == null) result = caseContrainte(geoGenerale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CataloguePackage.GEO_SPECIFIQUE: {
				GeoSpecifique geoSpecifique = (GeoSpecifique)theEObject;
				T result = caseGeoSpecifique(geoSpecifique);
				if (result == null) result = caseGeometrique(geoSpecifique);
				if (result == null) result = caseContrainte(geoSpecifique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalogue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalogue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalogue(Catalogue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposant(Composant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Metadonnee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Metadonnee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeMetadonnee(TypeMetadonnee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadonnee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadonnee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadonnee(Metadonnee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empreinte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empreinte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmpreinte(Empreinte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contrainte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contrainte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContrainte(Contrainte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Op Binaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Op Binaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpBinaire(OpBinaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Et</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Et</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEt(Et object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ou</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ou</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOu(Ou object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNon(Non object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redondance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redondance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedondance(Redondance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometrique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometrique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometrique(Geometrique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geo Generale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geo Generale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeoGenerale(GeoGenerale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geo Specifique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geo Specifique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeoSpecifique(GeoSpecifique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CatalogueSwitch
