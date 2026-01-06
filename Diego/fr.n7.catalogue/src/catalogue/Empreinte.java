/**
 */
package catalogue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empreinte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link catalogue.Empreinte#getNom <em>Nom</em>}</li>
 *   <li>{@link catalogue.Empreinte#getLargeur <em>Largeur</em>}</li>
 *   <li>{@link catalogue.Empreinte#getHauteur <em>Hauteur</em>}</li>
 *   <li>{@link catalogue.Empreinte#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see catalogue.CataloguePackage#getEmpreinte()
 * @model
 * @generated
 */
public interface Empreinte extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see catalogue.CataloguePackage#getEmpreinte_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link catalogue.Empreinte#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Largeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur</em>' attribute.
	 * @see #setLargeur(double)
	 * @see catalogue.CataloguePackage#getEmpreinte_Largeur()
	 * @model
	 * @generated
	 */
	double getLargeur();

	/**
	 * Sets the value of the '{@link catalogue.Empreinte#getLargeur <em>Largeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur</em>' attribute.
	 * @see #getLargeur()
	 * @generated
	 */
	void setLargeur(double value);

	/**
	 * Returns the value of the '<em><b>Hauteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hauteur</em>' attribute.
	 * @see #setHauteur(double)
	 * @see catalogue.CataloguePackage#getEmpreinte_Hauteur()
	 * @model
	 * @generated
	 */
	double getHauteur();

	/**
	 * Sets the value of the '{@link catalogue.Empreinte#getHauteur <em>Hauteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur</em>' attribute.
	 * @see #getHauteur()
	 * @generated
	 */
	void setHauteur(double value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link catalogue.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see catalogue.CataloguePackage#getEmpreinte_Ports()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Port> getPorts();

} // Empreinte
