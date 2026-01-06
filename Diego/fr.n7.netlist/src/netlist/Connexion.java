/**
 */
package netlist;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connexion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link netlist.Connexion#getNom <em>Nom</em>}</li>
 *   <li>{@link netlist.Connexion#getDepart <em>Depart</em>}</li>
 *   <li>{@link netlist.Connexion#getArrivee <em>Arrivee</em>}</li>
 *   <li>{@link netlist.Connexion#getPortDepart <em>Port Depart</em>}</li>
 *   <li>{@link netlist.Connexion#getPortArrivee <em>Port Arrivee</em>}</li>
 * </ul>
 *
 * @see netlist.NetlistPackage#getConnexion()
 * @model
 * @generated
 */
public interface Connexion extends NetlistElement {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see netlist.NetlistPackage#getConnexion_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link netlist.Connexion#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Depart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depart</em>' reference.
	 * @see #setDepart(InstanceComposant)
	 * @see netlist.NetlistPackage#getConnexion_Depart()
	 * @model
	 * @generated
	 */
	InstanceComposant getDepart();

	/**
	 * Sets the value of the '{@link netlist.Connexion#getDepart <em>Depart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depart</em>' reference.
	 * @see #getDepart()
	 * @generated
	 */
	void setDepart(InstanceComposant value);

	/**
	 * Returns the value of the '<em><b>Arrivee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrivee</em>' reference.
	 * @see #setArrivee(InstanceComposant)
	 * @see netlist.NetlistPackage#getConnexion_Arrivee()
	 * @model
	 * @generated
	 */
	InstanceComposant getArrivee();

	/**
	 * Sets the value of the '{@link netlist.Connexion#getArrivee <em>Arrivee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrivee</em>' reference.
	 * @see #getArrivee()
	 * @generated
	 */
	void setArrivee(InstanceComposant value);

	/**
	 * Returns the value of the '<em><b>Port Depart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Depart</em>' reference.
	 * @see #setPortDepart(InstancePort)
	 * @see netlist.NetlistPackage#getConnexion_PortDepart()
	 * @model
	 * @generated
	 */
	InstancePort getPortDepart();

	/**
	 * Sets the value of the '{@link netlist.Connexion#getPortDepart <em>Port Depart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Depart</em>' reference.
	 * @see #getPortDepart()
	 * @generated
	 */
	void setPortDepart(InstancePort value);

	/**
	 * Returns the value of the '<em><b>Port Arrivee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Arrivee</em>' reference.
	 * @see #setPortArrivee(InstancePort)
	 * @see netlist.NetlistPackage#getConnexion_PortArrivee()
	 * @model
	 * @generated
	 */
	InstancePort getPortArrivee();

	/**
	 * Sets the value of the '{@link netlist.Connexion#getPortArrivee <em>Port Arrivee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Arrivee</em>' reference.
	 * @see #getPortArrivee()
	 * @generated
	 */
	void setPortArrivee(InstancePort value);

} // Connexion
