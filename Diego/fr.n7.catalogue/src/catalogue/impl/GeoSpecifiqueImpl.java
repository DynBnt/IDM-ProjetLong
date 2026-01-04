/**
 */
package catalogue.impl;

import catalogue.CataloguePackage;
import catalogue.GeoSpecifique;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo Specifique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link catalogue.impl.GeoSpecifiqueImpl#getCleMetadonneeCible <em>Cle Metadonnee Cible</em>}</li>
 *   <li>{@link catalogue.impl.GeoSpecifiqueImpl#getValeurMetadonneeCible <em>Valeur Metadonnee Cible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeoSpecifiqueImpl extends GeometriqueImpl implements GeoSpecifique {
	/**
	 * The default value of the '{@link #getCleMetadonneeCible() <em>Cle Metadonnee Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCleMetadonneeCible()
	 * @generated
	 * @ordered
	 */
	protected static final String CLE_METADONNEE_CIBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCleMetadonneeCible() <em>Cle Metadonnee Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCleMetadonneeCible()
	 * @generated
	 * @ordered
	 */
	protected String cleMetadonneeCible = CLE_METADONNEE_CIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValeurMetadonneeCible() <em>Valeur Metadonnee Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeurMetadonneeCible()
	 * @generated
	 * @ordered
	 */
	protected static final String VALEUR_METADONNEE_CIBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValeurMetadonneeCible() <em>Valeur Metadonnee Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeurMetadonneeCible()
	 * @generated
	 * @ordered
	 */
	protected String valeurMetadonneeCible = VALEUR_METADONNEE_CIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeoSpecifiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CataloguePackage.Literals.GEO_SPECIFIQUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCleMetadonneeCible() {
		return cleMetadonneeCible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCleMetadonneeCible(String newCleMetadonneeCible) {
		String oldCleMetadonneeCible = cleMetadonneeCible;
		cleMetadonneeCible = newCleMetadonneeCible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.GEO_SPECIFIQUE__CLE_METADONNEE_CIBLE, oldCleMetadonneeCible, cleMetadonneeCible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValeurMetadonneeCible() {
		return valeurMetadonneeCible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValeurMetadonneeCible(String newValeurMetadonneeCible) {
		String oldValeurMetadonneeCible = valeurMetadonneeCible;
		valeurMetadonneeCible = newValeurMetadonneeCible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.GEO_SPECIFIQUE__VALEUR_METADONNEE_CIBLE, oldValeurMetadonneeCible, valeurMetadonneeCible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CataloguePackage.GEO_SPECIFIQUE__CLE_METADONNEE_CIBLE:
				return getCleMetadonneeCible();
			case CataloguePackage.GEO_SPECIFIQUE__VALEUR_METADONNEE_CIBLE:
				return getValeurMetadonneeCible();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CataloguePackage.GEO_SPECIFIQUE__CLE_METADONNEE_CIBLE:
				setCleMetadonneeCible((String)newValue);
				return;
			case CataloguePackage.GEO_SPECIFIQUE__VALEUR_METADONNEE_CIBLE:
				setValeurMetadonneeCible((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CataloguePackage.GEO_SPECIFIQUE__CLE_METADONNEE_CIBLE:
				setCleMetadonneeCible(CLE_METADONNEE_CIBLE_EDEFAULT);
				return;
			case CataloguePackage.GEO_SPECIFIQUE__VALEUR_METADONNEE_CIBLE:
				setValeurMetadonneeCible(VALEUR_METADONNEE_CIBLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CataloguePackage.GEO_SPECIFIQUE__CLE_METADONNEE_CIBLE:
				return CLE_METADONNEE_CIBLE_EDEFAULT == null ? cleMetadonneeCible != null : !CLE_METADONNEE_CIBLE_EDEFAULT.equals(cleMetadonneeCible);
			case CataloguePackage.GEO_SPECIFIQUE__VALEUR_METADONNEE_CIBLE:
				return VALEUR_METADONNEE_CIBLE_EDEFAULT == null ? valeurMetadonneeCible != null : !VALEUR_METADONNEE_CIBLE_EDEFAULT.equals(valeurMetadonneeCible);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cleMetadonneeCible: ");
		result.append(cleMetadonneeCible);
		result.append(", valeurMetadonneeCible: ");
		result.append(valeurMetadonneeCible);
		result.append(')');
		return result.toString();
	}

} //GeoSpecifiqueImpl
