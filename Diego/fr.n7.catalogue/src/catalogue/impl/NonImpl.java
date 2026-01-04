/**
 */
package catalogue.impl;

import catalogue.CataloguePackage;
import catalogue.Contrainte;
import catalogue.Non;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link catalogue.impl.NonImpl#getOperande <em>Operande</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonImpl extends ContrainteImpl implements Non {
	/**
	 * The cached value of the '{@link #getOperande() <em>Operande</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperande()
	 * @generated
	 * @ordered
	 */
	protected Contrainte operande;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CataloguePackage.Literals.NON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contrainte getOperande() {
		return operande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperande(Contrainte newOperande, NotificationChain msgs) {
		Contrainte oldOperande = operande;
		operande = newOperande;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CataloguePackage.NON__OPERANDE, oldOperande, newOperande);
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
	public void setOperande(Contrainte newOperande) {
		if (newOperande != operande) {
			NotificationChain msgs = null;
			if (operande != null)
				msgs = ((InternalEObject)operande).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CataloguePackage.NON__OPERANDE, null, msgs);
			if (newOperande != null)
				msgs = ((InternalEObject)newOperande).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CataloguePackage.NON__OPERANDE, null, msgs);
			msgs = basicSetOperande(newOperande, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.NON__OPERANDE, newOperande, newOperande));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CataloguePackage.NON__OPERANDE:
				return basicSetOperande(null, msgs);
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
			case CataloguePackage.NON__OPERANDE:
				return getOperande();
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
			case CataloguePackage.NON__OPERANDE:
				setOperande((Contrainte)newValue);
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
			case CataloguePackage.NON__OPERANDE:
				setOperande((Contrainte)null);
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
			case CataloguePackage.NON__OPERANDE:
				return operande != null;
		}
		return super.eIsSet(featureID);
	}

} //NonImpl
