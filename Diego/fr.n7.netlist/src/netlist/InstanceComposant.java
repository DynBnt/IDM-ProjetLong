/**
 */
package netlist;

import catalogue.Composant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Composant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link netlist.InstanceComposant#getNom <em>Nom</em>}</li>
 *   <li>{@link netlist.InstanceComposant#getType <em>Type</em>}</li>
 *   <li>{@link netlist.InstanceComposant#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see netlist.NetlistPackage#getInstanceComposant()
 * @model
 * @generated
 */
public interface InstanceComposant extends NetlistElement {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see netlist.NetlistPackage#getInstanceComposant_Nom()
	 * @model id="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link netlist.InstanceComposant#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Composant)
	 * @see netlist.NetlistPackage#getInstanceComposant_Type()
	 * @model required="true"
	 * @generated
	 */
	Composant getType();

	/**
	 * Sets the value of the '{@link netlist.InstanceComposant#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Composant value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link netlist.InstancePort}.
	 * It is bidirectional and its opposite is '{@link netlist.InstancePort#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see netlist.NetlistPackage#getInstanceComposant_Ports()
	 * @see netlist.InstancePort#getInstance
	 * @model opposite="instance" containment="true"
	 * @generated
	 */
	EList<InstancePort> getPorts();

} // InstanceComposant
