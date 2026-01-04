/**
 */
package catalogue.impl;

import catalogue.CataloguePackage;
import catalogue.Redondance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redondance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link catalogue.impl.RedondanceImpl#getMinCount <em>Min Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RedondanceImpl extends ContrainteImpl implements Redondance {
	/**
	 * The default value of the '{@link #getMinCount() <em>Min Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCount()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinCount() <em>Min Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCount()
	 * @generated
	 * @ordered
	 */
	protected int minCount = MIN_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedondanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CataloguePackage.Literals.REDONDANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinCount() {
		return minCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinCount(int newMinCount) {
		int oldMinCount = minCount;
		minCount = newMinCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.REDONDANCE__MIN_COUNT, oldMinCount, minCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CataloguePackage.REDONDANCE__MIN_COUNT:
				return getMinCount();
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
			case CataloguePackage.REDONDANCE__MIN_COUNT:
				setMinCount((Integer)newValue);
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
			case CataloguePackage.REDONDANCE__MIN_COUNT:
				setMinCount(MIN_COUNT_EDEFAULT);
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
			case CataloguePackage.REDONDANCE__MIN_COUNT:
				return minCount != MIN_COUNT_EDEFAULT;
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
		result.append(" (minCount: ");
		result.append(minCount);
		result.append(')');
		return result.toString();
	}

} //RedondanceImpl
