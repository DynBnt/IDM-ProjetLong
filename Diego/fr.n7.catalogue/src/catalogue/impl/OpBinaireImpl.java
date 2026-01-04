/**
 */
package catalogue.impl;

import catalogue.CataloguePackage;
import catalogue.Contrainte;
import catalogue.OpBinaire;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Op Binaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link catalogue.impl.OpBinaireImpl#getOperandes <em>Operandes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpBinaireImpl extends ContrainteImpl implements OpBinaire {
	/**
	 * The cached value of the '{@link #getOperandes() <em>Operandes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandes()
	 * @generated
	 * @ordered
	 */
	protected EList<Contrainte> operandes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpBinaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CataloguePackage.Literals.OP_BINAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Contrainte> getOperandes() {
		if (operandes == null) {
			operandes = new EObjectContainmentEList<Contrainte>(Contrainte.class, this, CataloguePackage.OP_BINAIRE__OPERANDES);
		}
		return operandes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CataloguePackage.OP_BINAIRE__OPERANDES:
				return ((InternalEList<?>)getOperandes()).basicRemove(otherEnd, msgs);
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
			case CataloguePackage.OP_BINAIRE__OPERANDES:
				return getOperandes();
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
			case CataloguePackage.OP_BINAIRE__OPERANDES:
				getOperandes().clear();
				getOperandes().addAll((Collection<? extends Contrainte>)newValue);
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
			case CataloguePackage.OP_BINAIRE__OPERANDES:
				getOperandes().clear();
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
			case CataloguePackage.OP_BINAIRE__OPERANDES:
				return operandes != null && !operandes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OpBinaireImpl
