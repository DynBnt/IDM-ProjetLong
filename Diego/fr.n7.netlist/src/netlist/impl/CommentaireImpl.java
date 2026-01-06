/**
 */
package netlist.impl;

import netlist.Commentaire;
import netlist.NetlistElement;
import netlist.NetlistPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commentaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link netlist.impl.CommentaireImpl#getTexte <em>Texte</em>}</li>
 *   <li>{@link netlist.impl.CommentaireImpl#getSujet <em>Sujet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentaireImpl extends NetlistElementImpl implements Commentaire {
	/**
	 * The default value of the '{@link #getTexte() <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexte()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTexte() <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexte()
	 * @generated
	 * @ordered
	 */
	protected String texte = TEXTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSujet() <em>Sujet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSujet()
	 * @generated
	 * @ordered
	 */
	protected NetlistElement sujet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetlistPackage.Literals.COMMENTAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTexte() {
		return texte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTexte(String newTexte) {
		String oldTexte = texte;
		texte = newTexte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetlistPackage.COMMENTAIRE__TEXTE, oldTexte, texte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetlistElement getSujet() {
		if (sujet != null && sujet.eIsProxy()) {
			InternalEObject oldSujet = (InternalEObject)sujet;
			sujet = (NetlistElement)eResolveProxy(oldSujet);
			if (sujet != oldSujet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetlistPackage.COMMENTAIRE__SUJET, oldSujet, sujet));
			}
		}
		return sujet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetlistElement basicGetSujet() {
		return sujet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSujet(NetlistElement newSujet) {
		NetlistElement oldSujet = sujet;
		sujet = newSujet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetlistPackage.COMMENTAIRE__SUJET, oldSujet, sujet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetlistPackage.COMMENTAIRE__TEXTE:
				return getTexte();
			case NetlistPackage.COMMENTAIRE__SUJET:
				if (resolve) return getSujet();
				return basicGetSujet();
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
			case NetlistPackage.COMMENTAIRE__TEXTE:
				setTexte((String)newValue);
				return;
			case NetlistPackage.COMMENTAIRE__SUJET:
				setSujet((NetlistElement)newValue);
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
			case NetlistPackage.COMMENTAIRE__TEXTE:
				setTexte(TEXTE_EDEFAULT);
				return;
			case NetlistPackage.COMMENTAIRE__SUJET:
				setSujet((NetlistElement)null);
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
			case NetlistPackage.COMMENTAIRE__TEXTE:
				return TEXTE_EDEFAULT == null ? texte != null : !TEXTE_EDEFAULT.equals(texte);
			case NetlistPackage.COMMENTAIRE__SUJET:
				return sujet != null;
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
		result.append(" (texte: ");
		result.append(texte);
		result.append(')');
		return result.toString();
	}

} //CommentaireImpl
