/**
 */
package catalogue.impl;

import catalogue.CataloguePackage;
import catalogue.Geometrique;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometrique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link catalogue.impl.GeometriqueImpl#getDistanceMin <em>Distance Min</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeometriqueImpl extends ContrainteImpl implements Geometrique {
	/**
	 * The default value of the '{@link #getDistanceMin() <em>Distance Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceMin()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_MIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistanceMin() <em>Distance Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceMin()
	 * @generated
	 * @ordered
	 */
	protected double distanceMin = DISTANCE_MIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CataloguePackage.Literals.GEOMETRIQUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDistanceMin() {
		return distanceMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistanceMin(double newDistanceMin) {
		double oldDistanceMin = distanceMin;
		distanceMin = newDistanceMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CataloguePackage.GEOMETRIQUE__DISTANCE_MIN, oldDistanceMin, distanceMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CataloguePackage.GEOMETRIQUE__DISTANCE_MIN:
				return getDistanceMin();
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
			case CataloguePackage.GEOMETRIQUE__DISTANCE_MIN:
				setDistanceMin((Double)newValue);
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
			case CataloguePackage.GEOMETRIQUE__DISTANCE_MIN:
				setDistanceMin(DISTANCE_MIN_EDEFAULT);
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
			case CataloguePackage.GEOMETRIQUE__DISTANCE_MIN:
				return distanceMin != DISTANCE_MIN_EDEFAULT;
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
		result.append(" (distanceMin: ");
		result.append(distanceMin);
		result.append(')');
		return result.toString();
	}

} //GeometriqueImpl
