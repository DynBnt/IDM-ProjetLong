/**
 */
package netlist.impl;

import catalogue.CataloguePackage;

import netlist.Commentaire;
import netlist.Connexion;
import netlist.InstanceComposant;
import netlist.InstancePort;
import netlist.Netlist;
import netlist.NetlistElement;
import netlist.NetlistFactory;
import netlist.NetlistPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetlistPackageImpl extends EPackageImpl implements NetlistPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass netlistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass netlistElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceComposantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instancePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connexionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentaireEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see netlist.NetlistPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NetlistPackageImpl() {
		super(eNS_URI, NetlistFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link NetlistPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NetlistPackage init() {
		if (isInited) return (NetlistPackage)EPackage.Registry.INSTANCE.getEPackage(NetlistPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNetlistPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NetlistPackageImpl theNetlistPackage = registeredNetlistPackage instanceof NetlistPackageImpl ? (NetlistPackageImpl)registeredNetlistPackage : new NetlistPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CataloguePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theNetlistPackage.createPackageContents();

		// Initialize created meta-data
		theNetlistPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNetlistPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NetlistPackage.eNS_URI, theNetlistPackage);
		return theNetlistPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetlist() {
		return netlistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetlist_Nom() {
		return (EAttribute)netlistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetlist_Elements() {
		return (EReference)netlistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetlistElement() {
		return netlistElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstanceComposant() {
		return instanceComposantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstanceComposant_Nom() {
		return (EAttribute)instanceComposantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstanceComposant_Type() {
		return (EReference)instanceComposantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstanceComposant_Ports() {
		return (EReference)instanceComposantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstancePort() {
		return instancePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstancePort_Port() {
		return (EReference)instancePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstancePort_Instance() {
		return (EReference)instancePortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnexion() {
		return connexionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnexion_Nom() {
		return (EAttribute)connexionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnexion_Depart() {
		return (EReference)connexionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnexion_Arrivee() {
		return (EReference)connexionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnexion_PortDepart() {
		return (EReference)connexionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnexion_PortArrivee() {
		return (EReference)connexionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommentaire() {
		return commentaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommentaire_Texte() {
		return (EAttribute)commentaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommentaire_Sujet() {
		return (EReference)commentaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetlistFactory getNetlistFactory() {
		return (NetlistFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		netlistEClass = createEClass(NETLIST);
		createEAttribute(netlistEClass, NETLIST__NOM);
		createEReference(netlistEClass, NETLIST__ELEMENTS);

		netlistElementEClass = createEClass(NETLIST_ELEMENT);

		instanceComposantEClass = createEClass(INSTANCE_COMPOSANT);
		createEAttribute(instanceComposantEClass, INSTANCE_COMPOSANT__NOM);
		createEReference(instanceComposantEClass, INSTANCE_COMPOSANT__TYPE);
		createEReference(instanceComposantEClass, INSTANCE_COMPOSANT__PORTS);

		instancePortEClass = createEClass(INSTANCE_PORT);
		createEReference(instancePortEClass, INSTANCE_PORT__PORT);
		createEReference(instancePortEClass, INSTANCE_PORT__INSTANCE);

		connexionEClass = createEClass(CONNEXION);
		createEAttribute(connexionEClass, CONNEXION__NOM);
		createEReference(connexionEClass, CONNEXION__DEPART);
		createEReference(connexionEClass, CONNEXION__ARRIVEE);
		createEReference(connexionEClass, CONNEXION__PORT_DEPART);
		createEReference(connexionEClass, CONNEXION__PORT_ARRIVEE);

		commentaireEClass = createEClass(COMMENTAIRE);
		createEAttribute(commentaireEClass, COMMENTAIRE__TEXTE);
		createEReference(commentaireEClass, COMMENTAIRE__SUJET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CataloguePackage theCataloguePackage = (CataloguePackage)EPackage.Registry.INSTANCE.getEPackage(CataloguePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		instanceComposantEClass.getESuperTypes().add(this.getNetlistElement());
		connexionEClass.getESuperTypes().add(this.getNetlistElement());
		commentaireEClass.getESuperTypes().add(this.getNetlistElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(netlistEClass, Netlist.class, "Netlist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetlist_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Netlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetlist_Elements(), this.getNetlistElement(), null, "elements", null, 0, -1, Netlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(netlistElementEClass, NetlistElement.class, "NetlistElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceComposantEClass, InstanceComposant.class, "InstanceComposant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstanceComposant_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, InstanceComposant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceComposant_Type(), theCataloguePackage.getComposant(), null, "type", null, 1, 1, InstanceComposant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceComposant_Ports(), this.getInstancePort(), this.getInstancePort_Instance(), "ports", null, 0, -1, InstanceComposant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instancePortEClass, InstancePort.class, "InstancePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstancePort_Port(), theCataloguePackage.getPort(), null, "port", null, 1, 1, InstancePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstancePort_Instance(), this.getInstanceComposant(), this.getInstanceComposant_Ports(), "instance", null, 1, 1, InstancePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connexionEClass, Connexion.class, "Connexion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnexion_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Connexion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnexion_Depart(), this.getInstanceComposant(), null, "depart", null, 0, 1, Connexion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnexion_Arrivee(), this.getInstanceComposant(), null, "arrivee", null, 0, 1, Connexion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnexion_PortDepart(), this.getInstancePort(), null, "portDepart", null, 0, 1, Connexion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnexion_PortArrivee(), this.getInstancePort(), null, "portArrivee", null, 0, 1, Connexion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentaireEClass, Commentaire.class, "Commentaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommentaire_Texte(), ecorePackage.getEString(), "texte", null, 0, 1, Commentaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommentaire_Sujet(), this.getNetlistElement(), null, "sujet", null, 0, 1, Commentaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "inv_PortMustBelongToComponent", "self.instance.type.ports->includes(self.port)"
		   });
	}

} //NetlistPackageImpl
