/**
 */
package catalogue.impl;

import catalogue.CataloguePackage;
import catalogue.Composant;
import catalogue.Contrainte;
import catalogue.Empreinte;
import catalogue.Metadonnee;
import catalogue.Port;

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
 * An implementation of the model object '<em><b>Composant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link catalogue.impl.ComposantImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link catalogue.impl.ComposantImpl#getMetadonnees <em>Metadonnees</em>}</li>
 *   <li>{@link catalogue.impl.ComposantImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link catalogue.impl.ComposantImpl#getEmpreinte <em>Empreinte</em>}</li>
 *   <li>{@link catalogue.impl.ComposantImpl#getContraintes <em>Contraintes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComposantImpl extends MinimalEObjectImpl.Container implements Composant {
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
	 * The cached value of the '{@link #getMetadonnees() <em>Metadonnees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadonnees()
	 * @generated
	 * @ordered
	 */
	protected EList<Metadonnee> metadonnees;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The cached value of the '{@link #getEmpreinte() <em>Empreinte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmpreinte()
	 * @generated
	 * @ordered
	 */
	protected Empreinte empreinte;

	/**
	 * The cached value of the '{@link #getContraintes() <em>Contraintes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraintes()
	 * @generated
	 * @ordered
	 */
	protected EList<Contrainte> contraintes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CataloguePackage.Literals.COMPOSANT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.COMPOSANT__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Metadonnee> getMetadonnees() {
		if (metadonnees == null) {
			metadonnees = new EObjectContainmentEList<Metadonnee>(Metadonnee.class, this, CataloguePackage.COMPOSANT__METADONNEES);
		}
		return metadonnees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, CataloguePackage.COMPOSANT__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Empreinte getEmpreinte() {
		return empreinte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpreinte(Empreinte newEmpreinte, NotificationChain msgs) {
		Empreinte oldEmpreinte = empreinte;
		empreinte = newEmpreinte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CataloguePackage.COMPOSANT__EMPREINTE, oldEmpreinte, newEmpreinte);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmpreinte(Empreinte newEmpreinte) {
		if (newEmpreinte != empreinte) {
			NotificationChain msgs = null;
			if (empreinte != null)
				msgs = ((InternalEObject)empreinte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CataloguePackage.COMPOSANT__EMPREINTE, null, msgs);
			if (newEmpreinte != null)
				msgs = ((InternalEObject)newEmpreinte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CataloguePackage.COMPOSANT__EMPREINTE, null, msgs);
			msgs = basicSetEmpreinte(newEmpreinte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.COMPOSANT__EMPREINTE, newEmpreinte, newEmpreinte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Contrainte> getContraintes() {
		if (contraintes == null) {
			contraintes = new EObjectContainmentEList<Contrainte>(Contrainte.class, this, CataloguePackage.COMPOSANT__CONTRAINTES);
		}
		return contraintes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CataloguePackage.COMPOSANT__METADONNEES:
				return ((InternalEList<?>)getMetadonnees()).basicRemove(otherEnd, msgs);
			case CataloguePackage.COMPOSANT__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case CataloguePackage.COMPOSANT__EMPREINTE:
				return basicSetEmpreinte(null, msgs);
			case CataloguePackage.COMPOSANT__CONTRAINTES:
				return ((InternalEList<?>)getContraintes()).basicRemove(otherEnd, msgs);
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
			case CataloguePackage.COMPOSANT__NOM:
				return getNom();
			case CataloguePackage.COMPOSANT__METADONNEES:
				return getMetadonnees();
			case CataloguePackage.COMPOSANT__PORTS:
				return getPorts();
			case CataloguePackage.COMPOSANT__EMPREINTE:
				return getEmpreinte();
			case CataloguePackage.COMPOSANT__CONTRAINTES:
				return getContraintes();
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
			case CataloguePackage.COMPOSANT__NOM:
				setNom((String)newValue);
				return;
			case CataloguePackage.COMPOSANT__METADONNEES:
				getMetadonnees().clear();
				getMetadonnees().addAll((Collection<? extends Metadonnee>)newValue);
				return;
			case CataloguePackage.COMPOSANT__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case CataloguePackage.COMPOSANT__EMPREINTE:
				setEmpreinte((Empreinte)newValue);
				return;
			case CataloguePackage.COMPOSANT__CONTRAINTES:
				getContraintes().clear();
				getContraintes().addAll((Collection<? extends Contrainte>)newValue);
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
			case CataloguePackage.COMPOSANT__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case CataloguePackage.COMPOSANT__METADONNEES:
				getMetadonnees().clear();
				return;
			case CataloguePackage.COMPOSANT__PORTS:
				getPorts().clear();
				return;
			case CataloguePackage.COMPOSANT__EMPREINTE:
				setEmpreinte((Empreinte)null);
				return;
			case CataloguePackage.COMPOSANT__CONTRAINTES:
				getContraintes().clear();
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
			case CataloguePackage.COMPOSANT__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case CataloguePackage.COMPOSANT__METADONNEES:
				return metadonnees != null && !metadonnees.isEmpty();
			case CataloguePackage.COMPOSANT__PORTS:
				return ports != null && !ports.isEmpty();
			case CataloguePackage.COMPOSANT__EMPREINTE:
				return empreinte != null;
			case CataloguePackage.COMPOSANT__CONTRAINTES:
				return contraintes != null && !contraintes.isEmpty();
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

} //ComposantImpl
