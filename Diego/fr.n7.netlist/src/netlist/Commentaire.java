/**
 */
package netlist;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commentaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link netlist.Commentaire#getTexte <em>Texte</em>}</li>
 *   <li>{@link netlist.Commentaire#getSujet <em>Sujet</em>}</li>
 * </ul>
 *
 * @see netlist.NetlistPackage#getCommentaire()
 * @model
 * @generated
 */
public interface Commentaire extends NetlistElement {
	/**
	 * Returns the value of the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texte</em>' attribute.
	 * @see #setTexte(String)
	 * @see netlist.NetlistPackage#getCommentaire_Texte()
	 * @model
	 * @generated
	 */
	String getTexte();

	/**
	 * Sets the value of the '{@link netlist.Commentaire#getTexte <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texte</em>' attribute.
	 * @see #getTexte()
	 * @generated
	 */
	void setTexte(String value);

	/**
	 * Returns the value of the '<em><b>Sujet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sujet</em>' reference.
	 * @see #setSujet(NetlistElement)
	 * @see netlist.NetlistPackage#getCommentaire_Sujet()
	 * @model
	 * @generated
	 */
	NetlistElement getSujet();

	/**
	 * Sets the value of the '{@link netlist.Commentaire#getSujet <em>Sujet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sujet</em>' reference.
	 * @see #getSujet()
	 * @generated
	 */
	void setSujet(NetlistElement value);

} // Commentaire
