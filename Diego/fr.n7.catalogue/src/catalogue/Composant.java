/**
 */
package catalogue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link catalogue.Composant#getId <em>Id</em>}</li>
 *   <li>{@link catalogue.Composant#getName <em>Name</em>}</li>
 *   <li>{@link catalogue.Composant#getBrand <em>Brand</em>}</li>
 *   <li>{@link catalogue.Composant#getDatasheet <em>Datasheet</em>}</li>
 *   <li>{@link catalogue.Composant#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link catalogue.Composant#getFootprint <em>Footprint</em>}</li>
 *   <li>{@link catalogue.Composant#getPorts <em>Ports</em>}</li>
 *   <li>{@link catalogue.Composant#getContraintes <em>Contraintes</em>}</li>
 * </ul>
 *
 * @see catalogue.CataloguePackage#getComposant()
 * @model
 * @generated
 */
public interface Composant extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see catalogue.CataloguePackage#getComposant_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link catalogue.Composant#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see catalogue.CataloguePackage#getComposant_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link catalogue.Composant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brand</em>' attribute.
	 * @see #setBrand(String)
	 * @see catalogue.CataloguePackage#getComposant_Brand()
	 * @model
	 * @generated
	 */
	String getBrand();

	/**
	 * Sets the value of the '{@link catalogue.Composant#getBrand <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand</em>' attribute.
	 * @see #getBrand()
	 * @generated
	 */
	void setBrand(String value);

	/**
	 * Returns the value of the '<em><b>Datasheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datasheet</em>' attribute.
	 * @see #setDatasheet(String)
	 * @see catalogue.CataloguePackage#getComposant_Datasheet()
	 * @model
	 * @generated
	 */
	String getDatasheet();

	/**
	 * Sets the value of the '{@link catalogue.Composant#getDatasheet <em>Datasheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datasheet</em>' attribute.
	 * @see #getDatasheet()
	 * @generated
	 */
	void setDatasheet(String value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link catalogue.Metadata}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference list.
	 * @see catalogue.CataloguePackage#getComposant_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metadata> getMetadata();

	/**
	 * Returns the value of the '<em><b>Footprint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footprint</em>' containment reference.
	 * @see #setFootprint(Footprint)
	 * @see catalogue.CataloguePackage#getComposant_Footprint()
	 * @model containment="true"
	 * @generated
	 */
	Footprint getFootprint();

	/**
	 * Sets the value of the '{@link catalogue.Composant#getFootprint <em>Footprint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Footprint</em>' containment reference.
	 * @see #getFootprint()
	 * @generated
	 */
	void setFootprint(Footprint value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link catalogue.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see catalogue.CataloguePackage#getComposant_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Contraintes</b></em>' containment reference list.
	 * The list contents are of type {@link catalogue.Contrainte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contraintes</em>' containment reference list.
	 * @see catalogue.CataloguePackage#getComposant_Contraintes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contrainte> getContraintes();

} // Composant
