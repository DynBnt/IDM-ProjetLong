/**
 */
package netlist.impl;

import netlist.Connexion;
import netlist.InstanceComposant;
import netlist.InstancePort;
import netlist.NetlistPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connexion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link netlist.impl.ConnexionImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link netlist.impl.ConnexionImpl#getDepart <em>Depart</em>}</li>
 *   <li>{@link netlist.impl.ConnexionImpl#getArrivee <em>Arrivee</em>}</li>
 *   <li>{@link netlist.impl.ConnexionImpl#getPortDepart <em>Port Depart</em>}</li>
 *   <li>{@link netlist.impl.ConnexionImpl#getPortArrivee <em>Port Arrivee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnexionImpl extends NetlistElementImpl implements Connexion {
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
	 * The cached value of the '{@link #getDepart() <em>Depart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepart()
	 * @generated
	 * @ordered
	 */
	protected InstanceComposant depart;

	/**
	 * The cached value of the '{@link #getArrivee() <em>Arrivee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivee()
	 * @generated
	 * @ordered
	 */
	protected InstanceComposant arrivee;

	/**
	 * The cached value of the '{@link #getPortDepart() <em>Port Depart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortDepart()
	 * @generated
	 * @ordered
	 */
	protected InstancePort portDepart;

	/**
	 * The cached value of the '{@link #getPortArrivee() <em>Port Arrivee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortArrivee()
	 * @generated
	 * @ordered
	 */
	protected InstancePort portArrivee;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnexionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetlistPackage.Literals.CONNEXION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetlistPackage.CONNEXION__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceComposant getDepart() {
		if (depart != null && depart.eIsProxy()) {
			InternalEObject oldDepart = (InternalEObject)depart;
			depart = (InstanceComposant)eResolveProxy(oldDepart);
			if (depart != oldDepart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetlistPackage.CONNEXION__DEPART, oldDepart, depart));
			}
		}
		return depart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceComposant basicGetDepart() {
		return depart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepart(InstanceComposant newDepart) {
		InstanceComposant oldDepart = depart;
		depart = newDepart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetlistPackage.CONNEXION__DEPART, oldDepart, depart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceComposant getArrivee() {
		if (arrivee != null && arrivee.eIsProxy()) {
			InternalEObject oldArrivee = (InternalEObject)arrivee;
			arrivee = (InstanceComposant)eResolveProxy(oldArrivee);
			if (arrivee != oldArrivee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetlistPackage.CONNEXION__ARRIVEE, oldArrivee, arrivee));
			}
		}
		return arrivee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceComposant basicGetArrivee() {
		return arrivee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArrivee(InstanceComposant newArrivee) {
		InstanceComposant oldArrivee = arrivee;
		arrivee = newArrivee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetlistPackage.CONNEXION__ARRIVEE, oldArrivee, arrivee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstancePort getPortDepart() {
		if (portDepart != null && portDepart.eIsProxy()) {
			InternalEObject oldPortDepart = (InternalEObject)portDepart;
			portDepart = (InstancePort)eResolveProxy(oldPortDepart);
			if (portDepart != oldPortDepart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetlistPackage.CONNEXION__PORT_DEPART, oldPortDepart, portDepart));
			}
		}
		return portDepart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancePort basicGetPortDepart() {
		return portDepart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortDepart(InstancePort newPortDepart) {
		InstancePort oldPortDepart = portDepart;
		portDepart = newPortDepart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetlistPackage.CONNEXION__PORT_DEPART, oldPortDepart, portDepart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstancePort getPortArrivee() {
		if (portArrivee != null && portArrivee.eIsProxy()) {
			InternalEObject oldPortArrivee = (InternalEObject)portArrivee;
			portArrivee = (InstancePort)eResolveProxy(oldPortArrivee);
			if (portArrivee != oldPortArrivee) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetlistPackage.CONNEXION__PORT_ARRIVEE, oldPortArrivee, portArrivee));
			}
		}
		return portArrivee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancePort basicGetPortArrivee() {
		return portArrivee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortArrivee(InstancePort newPortArrivee) {
		InstancePort oldPortArrivee = portArrivee;
		portArrivee = newPortArrivee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetlistPackage.CONNEXION__PORT_ARRIVEE, oldPortArrivee, portArrivee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetlistPackage.CONNEXION__NOM:
				return getNom();
			case NetlistPackage.CONNEXION__DEPART:
				if (resolve) return getDepart();
				return basicGetDepart();
			case NetlistPackage.CONNEXION__ARRIVEE:
				if (resolve) return getArrivee();
				return basicGetArrivee();
			case NetlistPackage.CONNEXION__PORT_DEPART:
				if (resolve) return getPortDepart();
				return basicGetPortDepart();
			case NetlistPackage.CONNEXION__PORT_ARRIVEE:
				if (resolve) return getPortArrivee();
				return basicGetPortArrivee();
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
			case NetlistPackage.CONNEXION__NOM:
				setNom((String)newValue);
				return;
			case NetlistPackage.CONNEXION__DEPART:
				setDepart((InstanceComposant)newValue);
				return;
			case NetlistPackage.CONNEXION__ARRIVEE:
				setArrivee((InstanceComposant)newValue);
				return;
			case NetlistPackage.CONNEXION__PORT_DEPART:
				setPortDepart((InstancePort)newValue);
				return;
			case NetlistPackage.CONNEXION__PORT_ARRIVEE:
				setPortArrivee((InstancePort)newValue);
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
			case NetlistPackage.CONNEXION__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case NetlistPackage.CONNEXION__DEPART:
				setDepart((InstanceComposant)null);
				return;
			case NetlistPackage.CONNEXION__ARRIVEE:
				setArrivee((InstanceComposant)null);
				return;
			case NetlistPackage.CONNEXION__PORT_DEPART:
				setPortDepart((InstancePort)null);
				return;
			case NetlistPackage.CONNEXION__PORT_ARRIVEE:
				setPortArrivee((InstancePort)null);
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
			case NetlistPackage.CONNEXION__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case NetlistPackage.CONNEXION__DEPART:
				return depart != null;
			case NetlistPackage.CONNEXION__ARRIVEE:
				return arrivee != null;
			case NetlistPackage.CONNEXION__PORT_DEPART:
				return portDepart != null;
			case NetlistPackage.CONNEXION__PORT_ARRIVEE:
				return portArrivee != null;
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

} //ConnexionImpl
