/**
 */
package catalogue.impl;

import catalogue.CataloguePackage;
import catalogue.Composant;
import catalogue.Contrainte;
import catalogue.Footprint;
import catalogue.Metadata;
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
 *   <li>{@link catalogue.impl.ComposantImpl#getId <em>Id</em>}</li>
 *   <li>{@link catalogue.impl.ComposantImpl#getName <em>Name</em>}</li>
 *   <li>{@link catalogue.impl.ComposantImpl#getBrand <em>Brand</em>}</li>
 *   <li>{@link catalogue.impl.ComposantImpl#getDatasheet <em>Datasheet</em>}</li>
 *   <li>{@link catalogue.impl.ComposantImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link catalogue.impl.ComposantImpl#getFootprint <em>Footprint</em>}</li>
 *   <li>{@link catalogue.impl.ComposantImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link catalogue.impl.ComposantImpl#getContraintes <em>Contraintes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComposantImpl extends MinimalEObjectImpl.Container implements Composant {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBrand() <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrand()
	 * @generated
	 * @ordered
	 */
	protected static final String BRAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrand() <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrand()
	 * @generated
	 * @ordered
	 */
	protected String brand = BRAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatasheet() <em>Datasheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasheet()
	 * @generated
	 * @ordered
	 */
	protected static final String DATASHEET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatasheet() <em>Datasheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasheet()
	 * @generated
	 * @ordered
	 */
	protected String datasheet = DATASHEET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<Metadata> metadata;

	/**
	 * The cached value of the '{@link #getFootprint() <em>Footprint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFootprint()
	 * @generated
	 * @ordered
	 */
	protected Footprint footprint;

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
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.COMPOSANT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.COMPOSANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBrand() {
		return brand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrand(String newBrand) {
		String oldBrand = brand;
		brand = newBrand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.COMPOSANT__BRAND, oldBrand, brand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatasheet() {
		return datasheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatasheet(String newDatasheet) {
		String oldDatasheet = datasheet;
		datasheet = newDatasheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.COMPOSANT__DATASHEET, oldDatasheet, datasheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Metadata> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<Metadata>(Metadata.class, this, CataloguePackage.COMPOSANT__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Footprint getFootprint() {
		return footprint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFootprint(Footprint newFootprint, NotificationChain msgs) {
		Footprint oldFootprint = footprint;
		footprint = newFootprint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CataloguePackage.COMPOSANT__FOOTPRINT, oldFootprint, newFootprint);
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
	public void setFootprint(Footprint newFootprint) {
		if (newFootprint != footprint) {
			NotificationChain msgs = null;
			if (footprint != null)
				msgs = ((InternalEObject)footprint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CataloguePackage.COMPOSANT__FOOTPRINT, null, msgs);
			if (newFootprint != null)
				msgs = ((InternalEObject)newFootprint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CataloguePackage.COMPOSANT__FOOTPRINT, null, msgs);
			msgs = basicSetFootprint(newFootprint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.COMPOSANT__FOOTPRINT, newFootprint, newFootprint));
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
			case CataloguePackage.COMPOSANT__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
			case CataloguePackage.COMPOSANT__FOOTPRINT:
				return basicSetFootprint(null, msgs);
			case CataloguePackage.COMPOSANT__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
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
			case CataloguePackage.COMPOSANT__ID:
				return getId();
			case CataloguePackage.COMPOSANT__NAME:
				return getName();
			case CataloguePackage.COMPOSANT__BRAND:
				return getBrand();
			case CataloguePackage.COMPOSANT__DATASHEET:
				return getDatasheet();
			case CataloguePackage.COMPOSANT__METADATA:
				return getMetadata();
			case CataloguePackage.COMPOSANT__FOOTPRINT:
				return getFootprint();
			case CataloguePackage.COMPOSANT__PORTS:
				return getPorts();
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
			case CataloguePackage.COMPOSANT__ID:
				setId((String)newValue);
				return;
			case CataloguePackage.COMPOSANT__NAME:
				setName((String)newValue);
				return;
			case CataloguePackage.COMPOSANT__BRAND:
				setBrand((String)newValue);
				return;
			case CataloguePackage.COMPOSANT__DATASHEET:
				setDatasheet((String)newValue);
				return;
			case CataloguePackage.COMPOSANT__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends Metadata>)newValue);
				return;
			case CataloguePackage.COMPOSANT__FOOTPRINT:
				setFootprint((Footprint)newValue);
				return;
			case CataloguePackage.COMPOSANT__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
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
			case CataloguePackage.COMPOSANT__ID:
				setId(ID_EDEFAULT);
				return;
			case CataloguePackage.COMPOSANT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CataloguePackage.COMPOSANT__BRAND:
				setBrand(BRAND_EDEFAULT);
				return;
			case CataloguePackage.COMPOSANT__DATASHEET:
				setDatasheet(DATASHEET_EDEFAULT);
				return;
			case CataloguePackage.COMPOSANT__METADATA:
				getMetadata().clear();
				return;
			case CataloguePackage.COMPOSANT__FOOTPRINT:
				setFootprint((Footprint)null);
				return;
			case CataloguePackage.COMPOSANT__PORTS:
				getPorts().clear();
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
			case CataloguePackage.COMPOSANT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CataloguePackage.COMPOSANT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CataloguePackage.COMPOSANT__BRAND:
				return BRAND_EDEFAULT == null ? brand != null : !BRAND_EDEFAULT.equals(brand);
			case CataloguePackage.COMPOSANT__DATASHEET:
				return DATASHEET_EDEFAULT == null ? datasheet != null : !DATASHEET_EDEFAULT.equals(datasheet);
			case CataloguePackage.COMPOSANT__METADATA:
				return metadata != null && !metadata.isEmpty();
			case CataloguePackage.COMPOSANT__FOOTPRINT:
				return footprint != null;
			case CataloguePackage.COMPOSANT__PORTS:
				return ports != null && !ports.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", brand: ");
		result.append(brand);
		result.append(", datasheet: ");
		result.append(datasheet);
		result.append(')');
		return result.toString();
	}

} //ComposantImpl
