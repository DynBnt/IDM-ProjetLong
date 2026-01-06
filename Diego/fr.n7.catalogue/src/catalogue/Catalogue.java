/**
 */
package catalogue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link catalogue.Catalogue#getNom <em>Nom</em>}</li>
 *   <li>{@link catalogue.Catalogue#getComposants <em>Composants</em>}</li>
 *   <li>{@link catalogue.Catalogue#getTypesMetadonnees <em>Types Metadonnees</em>}</li>
 * </ul>
 *
 * @see catalogue.CataloguePackage#getCatalogue()
 * @model
 * @generated
 */
public interface Catalogue extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see catalogue.CataloguePackage#getCatalogue_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link catalogue.Catalogue#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Composants</b></em>' containment reference list.
	 * The list contents are of type {@link catalogue.Composant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composants</em>' containment reference list.
	 * @see catalogue.CataloguePackage#getCatalogue_Composants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Composant> getComposants();

	/**
	 * Returns the value of the '<em><b>Types Metadonnees</b></em>' containment reference list.
	 * The list contents are of type {@link catalogue.TypeMetadonnee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types Metadonnees</em>' containment reference list.
	 * @see catalogue.CataloguePackage#getCatalogue_TypesMetadonnees()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeMetadonnee> getTypesMetadonnees();

} // Catalogue
