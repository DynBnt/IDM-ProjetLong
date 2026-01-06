/**
 */
package netlist;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see netlist.NetlistFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL inv_PortMustBelongToComponent='self.instance.type.ports-&gt;includes(self.port)'"
 * @generated
 */
public interface NetlistPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "netlist";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/netlist";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "netlist";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetlistPackage eINSTANCE = netlist.impl.NetlistPackageImpl.init();

	/**
	 * The meta object id for the '{@link netlist.impl.NetlistImpl <em>Netlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see netlist.impl.NetlistImpl
	 * @see netlist.impl.NetlistPackageImpl#getNetlist()
	 * @generated
	 */
	int NETLIST = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETLIST__NOM = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETLIST__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Netlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETLIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Netlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETLIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link netlist.impl.NetlistElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see netlist.impl.NetlistElementImpl
	 * @see netlist.impl.NetlistPackageImpl#getNetlistElement()
	 * @generated
	 */
	int NETLIST_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETLIST_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETLIST_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link netlist.impl.InstanceComposantImpl <em>Instance Composant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see netlist.impl.InstanceComposantImpl
	 * @see netlist.impl.NetlistPackageImpl#getInstanceComposant()
	 * @generated
	 */
	int INSTANCE_COMPOSANT = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_COMPOSANT__NOM = NETLIST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_COMPOSANT__TYPE = NETLIST_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_COMPOSANT__PORTS = NETLIST_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instance Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_COMPOSANT_FEATURE_COUNT = NETLIST_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Instance Composant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_COMPOSANT_OPERATION_COUNT = NETLIST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link netlist.impl.InstancePortImpl <em>Instance Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see netlist.impl.InstancePortImpl
	 * @see netlist.impl.NetlistPackageImpl#getInstancePort()
	 * @generated
	 */
	int INSTANCE_PORT = 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PORT__PORT = 0;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PORT__INSTANCE = 1;

	/**
	 * The number of structural features of the '<em>Instance Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Instance Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link netlist.impl.ConnexionImpl <em>Connexion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see netlist.impl.ConnexionImpl
	 * @see netlist.impl.NetlistPackageImpl#getConnexion()
	 * @generated
	 */
	int CONNEXION = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION__NOM = NETLIST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Depart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION__DEPART = NETLIST_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arrivee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION__ARRIVEE = NETLIST_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port Depart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION__PORT_DEPART = NETLIST_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Port Arrivee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION__PORT_ARRIVEE = NETLIST_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Connexion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION_FEATURE_COUNT = NETLIST_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Connexion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION_OPERATION_COUNT = NETLIST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link netlist.impl.CommentaireImpl <em>Commentaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see netlist.impl.CommentaireImpl
	 * @see netlist.impl.NetlistPackageImpl#getCommentaire()
	 * @generated
	 */
	int COMMENTAIRE = 5;

	/**
	 * The feature id for the '<em><b>Texte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTAIRE__TEXTE = NETLIST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sujet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTAIRE__SUJET = NETLIST_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Commentaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTAIRE_FEATURE_COUNT = NETLIST_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Commentaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTAIRE_OPERATION_COUNT = NETLIST_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link netlist.Netlist <em>Netlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Netlist</em>'.
	 * @see netlist.Netlist
	 * @generated
	 */
	EClass getNetlist();

	/**
	 * Returns the meta object for the attribute '{@link netlist.Netlist#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see netlist.Netlist#getNom()
	 * @see #getNetlist()
	 * @generated
	 */
	EAttribute getNetlist_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link netlist.Netlist#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see netlist.Netlist#getElements()
	 * @see #getNetlist()
	 * @generated
	 */
	EReference getNetlist_Elements();

	/**
	 * Returns the meta object for class '{@link netlist.NetlistElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see netlist.NetlistElement
	 * @generated
	 */
	EClass getNetlistElement();

	/**
	 * Returns the meta object for class '{@link netlist.InstanceComposant <em>Instance Composant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Composant</em>'.
	 * @see netlist.InstanceComposant
	 * @generated
	 */
	EClass getInstanceComposant();

	/**
	 * Returns the meta object for the attribute '{@link netlist.InstanceComposant#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see netlist.InstanceComposant#getNom()
	 * @see #getInstanceComposant()
	 * @generated
	 */
	EAttribute getInstanceComposant_Nom();

	/**
	 * Returns the meta object for the reference '{@link netlist.InstanceComposant#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see netlist.InstanceComposant#getType()
	 * @see #getInstanceComposant()
	 * @generated
	 */
	EReference getInstanceComposant_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link netlist.InstanceComposant#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see netlist.InstanceComposant#getPorts()
	 * @see #getInstanceComposant()
	 * @generated
	 */
	EReference getInstanceComposant_Ports();

	/**
	 * Returns the meta object for class '{@link netlist.InstancePort <em>Instance Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Port</em>'.
	 * @see netlist.InstancePort
	 * @generated
	 */
	EClass getInstancePort();

	/**
	 * Returns the meta object for the reference '{@link netlist.InstancePort#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see netlist.InstancePort#getPort()
	 * @see #getInstancePort()
	 * @generated
	 */
	EReference getInstancePort_Port();

	/**
	 * Returns the meta object for the container reference '{@link netlist.InstancePort#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Instance</em>'.
	 * @see netlist.InstancePort#getInstance()
	 * @see #getInstancePort()
	 * @generated
	 */
	EReference getInstancePort_Instance();

	/**
	 * Returns the meta object for class '{@link netlist.Connexion <em>Connexion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connexion</em>'.
	 * @see netlist.Connexion
	 * @generated
	 */
	EClass getConnexion();

	/**
	 * Returns the meta object for the attribute '{@link netlist.Connexion#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see netlist.Connexion#getNom()
	 * @see #getConnexion()
	 * @generated
	 */
	EAttribute getConnexion_Nom();

	/**
	 * Returns the meta object for the reference '{@link netlist.Connexion#getDepart <em>Depart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depart</em>'.
	 * @see netlist.Connexion#getDepart()
	 * @see #getConnexion()
	 * @generated
	 */
	EReference getConnexion_Depart();

	/**
	 * Returns the meta object for the reference '{@link netlist.Connexion#getArrivee <em>Arrivee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Arrivee</em>'.
	 * @see netlist.Connexion#getArrivee()
	 * @see #getConnexion()
	 * @generated
	 */
	EReference getConnexion_Arrivee();

	/**
	 * Returns the meta object for the reference '{@link netlist.Connexion#getPortDepart <em>Port Depart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Depart</em>'.
	 * @see netlist.Connexion#getPortDepart()
	 * @see #getConnexion()
	 * @generated
	 */
	EReference getConnexion_PortDepart();

	/**
	 * Returns the meta object for the reference '{@link netlist.Connexion#getPortArrivee <em>Port Arrivee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Arrivee</em>'.
	 * @see netlist.Connexion#getPortArrivee()
	 * @see #getConnexion()
	 * @generated
	 */
	EReference getConnexion_PortArrivee();

	/**
	 * Returns the meta object for class '{@link netlist.Commentaire <em>Commentaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commentaire</em>'.
	 * @see netlist.Commentaire
	 * @generated
	 */
	EClass getCommentaire();

	/**
	 * Returns the meta object for the attribute '{@link netlist.Commentaire#getTexte <em>Texte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texte</em>'.
	 * @see netlist.Commentaire#getTexte()
	 * @see #getCommentaire()
	 * @generated
	 */
	EAttribute getCommentaire_Texte();

	/**
	 * Returns the meta object for the reference '{@link netlist.Commentaire#getSujet <em>Sujet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sujet</em>'.
	 * @see netlist.Commentaire#getSujet()
	 * @see #getCommentaire()
	 * @generated
	 */
	EReference getCommentaire_Sujet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NetlistFactory getNetlistFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link netlist.impl.NetlistImpl <em>Netlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see netlist.impl.NetlistImpl
		 * @see netlist.impl.NetlistPackageImpl#getNetlist()
		 * @generated
		 */
		EClass NETLIST = eINSTANCE.getNetlist();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETLIST__NOM = eINSTANCE.getNetlist_Nom();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETLIST__ELEMENTS = eINSTANCE.getNetlist_Elements();

		/**
		 * The meta object literal for the '{@link netlist.impl.NetlistElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see netlist.impl.NetlistElementImpl
		 * @see netlist.impl.NetlistPackageImpl#getNetlistElement()
		 * @generated
		 */
		EClass NETLIST_ELEMENT = eINSTANCE.getNetlistElement();

		/**
		 * The meta object literal for the '{@link netlist.impl.InstanceComposantImpl <em>Instance Composant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see netlist.impl.InstanceComposantImpl
		 * @see netlist.impl.NetlistPackageImpl#getInstanceComposant()
		 * @generated
		 */
		EClass INSTANCE_COMPOSANT = eINSTANCE.getInstanceComposant();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_COMPOSANT__NOM = eINSTANCE.getInstanceComposant_Nom();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_COMPOSANT__TYPE = eINSTANCE.getInstanceComposant_Type();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_COMPOSANT__PORTS = eINSTANCE.getInstanceComposant_Ports();

		/**
		 * The meta object literal for the '{@link netlist.impl.InstancePortImpl <em>Instance Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see netlist.impl.InstancePortImpl
		 * @see netlist.impl.NetlistPackageImpl#getInstancePort()
		 * @generated
		 */
		EClass INSTANCE_PORT = eINSTANCE.getInstancePort();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_PORT__PORT = eINSTANCE.getInstancePort_Port();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_PORT__INSTANCE = eINSTANCE.getInstancePort_Instance();

		/**
		 * The meta object literal for the '{@link netlist.impl.ConnexionImpl <em>Connexion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see netlist.impl.ConnexionImpl
		 * @see netlist.impl.NetlistPackageImpl#getConnexion()
		 * @generated
		 */
		EClass CONNEXION = eINSTANCE.getConnexion();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNEXION__NOM = eINSTANCE.getConnexion_Nom();

		/**
		 * The meta object literal for the '<em><b>Depart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNEXION__DEPART = eINSTANCE.getConnexion_Depart();

		/**
		 * The meta object literal for the '<em><b>Arrivee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNEXION__ARRIVEE = eINSTANCE.getConnexion_Arrivee();

		/**
		 * The meta object literal for the '<em><b>Port Depart</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNEXION__PORT_DEPART = eINSTANCE.getConnexion_PortDepart();

		/**
		 * The meta object literal for the '<em><b>Port Arrivee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNEXION__PORT_ARRIVEE = eINSTANCE.getConnexion_PortArrivee();

		/**
		 * The meta object literal for the '{@link netlist.impl.CommentaireImpl <em>Commentaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see netlist.impl.CommentaireImpl
		 * @see netlist.impl.NetlistPackageImpl#getCommentaire()
		 * @generated
		 */
		EClass COMMENTAIRE = eINSTANCE.getCommentaire();

		/**
		 * The meta object literal for the '<em><b>Texte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENTAIRE__TEXTE = eINSTANCE.getCommentaire_Texte();

		/**
		 * The meta object literal for the '<em><b>Sujet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENTAIRE__SUJET = eINSTANCE.getCommentaire_Sujet();

	}

} //NetlistPackage
