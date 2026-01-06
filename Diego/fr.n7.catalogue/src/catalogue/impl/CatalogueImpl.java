/**
 */
package catalogue.impl;

import catalogue.Catalogue;
import catalogue.CataloguePackage;
import catalogue.Composant;
import catalogue.TypeMetadonnee;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalogue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link catalogue.impl.CatalogueImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link catalogue.impl.CatalogueImpl#getComposants <em>Composants</em>}</li>
 *   <li>{@link catalogue.impl.CatalogueImpl#getTypesMetadonnees <em>Types Metadonnees</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogueImpl extends MinimalEObjectImpl.Container implements Catalogue {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComposants() <em>Composants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposants()
	 * @generated
	 * @ordered
	 */
	protected EList<Composant> composants;

	/**
	 * The cached value of the '{@link #getTypesMetadonnees() <em>Types Metadonnees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypesMetadonnees()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMetadonnee> typesMetadonnees;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CataloguePackage.Literals.CATALOGUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.CATALOGUE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Composant> getComposants() {
		if (composants == null) {
			composants = new EObjectContainmentEList<Composant>(Composant.class, this, CataloguePackage.CATALOGUE__COMPOSANTS);
		}
		return composants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeMetadonnee> getTypesMetadonnees() {
		if (typesMetadonnees == null) {
			typesMetadonnees = new EObjectContainmentEList<TypeMetadonnee>(TypeMetadonnee.class, this, CataloguePackage.CATALOGUE__TYPES_METADONNEES);
		}
		return typesMetadonnees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CataloguePackage.CATALOGUE__COMPOSANTS:
				return ((InternalEList<?>)getComposants()).basicRemove(otherEnd, msgs);
			case CataloguePackage.CATALOGUE__TYPES_METADONNEES:
				return ((InternalEList<?>)getTypesMetadonnees()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CataloguePackage.CATALOGUE__NOM:
				return getNom();
			case CataloguePackage.CATALOGUE__COMPOSANTS:
				return getComposants();
			case CataloguePackage.CATALOGUE__TYPES_METADONNEES:
				return getTypesMetadonnees();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CataloguePackage.CATALOGUE__NOM:
				setNom((String)newValue);
				return;
			case CataloguePackage.CATALOGUE__COMPOSANTS:
				getComposants().clear();
				getComposants().addAll((Collection<? extends Composant>)newValue);
				return;
			case CataloguePackage.CATALOGUE__TYPES_METADONNEES:
				getTypesMetadonnees().clear();
				getTypesMetadonnees().addAll((Collection<? extends TypeMetadonnee>)newValue);
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
			case CataloguePackage.CATALOGUE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case CataloguePackage.CATALOGUE__COMPOSANTS:
				getComposants().clear();
				return;
			case CataloguePackage.CATALOGUE__TYPES_METADONNEES:
				getTypesMetadonnees().clear();
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
			case CataloguePackage.CATALOGUE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case CataloguePackage.CATALOGUE__COMPOSANTS:
				return composants != null && !composants.isEmpty();
			case CataloguePackage.CATALOGUE__TYPES_METADONNEES:
				return typesMetadonnees != null && !typesMetadonnees.isEmpty();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //CatalogueImpl
