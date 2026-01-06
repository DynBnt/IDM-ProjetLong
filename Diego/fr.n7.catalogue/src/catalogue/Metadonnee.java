/**
 */
package catalogue;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadonnee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link catalogue.Metadonnee#getValeur <em>Valeur</em>}</li>
 *   <li>{@link catalogue.Metadonnee#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see catalogue.CataloguePackage#getMetadonnee()
 * @model
 * @generated
 */
public interface Metadonnee extends EObject {
	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' attribute.
	 * @see #setValeur(String)
	 * @see catalogue.CataloguePackage#getMetadonnee_Valeur()
	 * @model
	 * @generated
	 */
	String getValeur();

	/**
	 * Sets the value of the '{@link catalogue.Metadonnee#getValeur <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' attribute.
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeMetadonnee)
	 * @see catalogue.CataloguePackage#getMetadonnee_Type()
	 * @model required="true"
	 * @generated
	 */
	TypeMetadonnee getType();

	/**
	 * Sets the value of the '{@link catalogue.Metadonnee#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeMetadonnee value);

} // Metadonnee
