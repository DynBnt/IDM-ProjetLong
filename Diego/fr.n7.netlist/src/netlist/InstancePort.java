/**
 */
package netlist;

import catalogue.Port;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link netlist.InstancePort#getPort <em>Port</em>}</li>
 *   <li>{@link netlist.InstancePort#getInstance <em>Instance</em>}</li>
 * </ul>
 *
 * @see netlist.NetlistPackage#getInstancePort()
 * @model
 * @generated
 */
public interface InstancePort extends EObject {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see netlist.NetlistPackage#getInstancePort_Port()
	 * @model required="true"
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link netlist.InstancePort#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link netlist.InstanceComposant#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' container reference.
	 * @see #setInstance(InstanceComposant)
	 * @see netlist.NetlistPackage#getInstancePort_Instance()
	 * @see netlist.InstanceComposant#getPorts
	 * @model opposite="ports" required="true" transient="false"
	 * @generated
	 */
	InstanceComposant getInstance();

	/**
	 * Sets the value of the '{@link netlist.InstancePort#getInstance <em>Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' container reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(InstanceComposant value);

} // InstancePort
