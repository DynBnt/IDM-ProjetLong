/**
 */
package catalogue.provider;


import catalogue.CatalogueFactory;
import catalogue.CataloguePackage;
import catalogue.Composant;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link catalogue.Composant} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComposantItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposantItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addBrandPropertyDescriptor(object);
			addDatasheetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Composant_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Composant_id_feature", "_UI_Composant_type"),
				 CataloguePackage.Literals.COMPOSANT__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Composant_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Composant_name_feature", "_UI_Composant_type"),
				 CataloguePackage.Literals.COMPOSANT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Brand feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBrandPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Composant_brand_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Composant_brand_feature", "_UI_Composant_type"),
				 CataloguePackage.Literals.COMPOSANT__BRAND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Datasheet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatasheetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Composant_datasheet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Composant_datasheet_feature", "_UI_Composant_type"),
				 CataloguePackage.Literals.COMPOSANT__DATASHEET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CataloguePackage.Literals.COMPOSANT__METADATA);
			childrenFeatures.add(CataloguePackage.Literals.COMPOSANT__FOOTPRINT);
			childrenFeatures.add(CataloguePackage.Literals.COMPOSANT__PORTS);
			childrenFeatures.add(CataloguePackage.Literals.COMPOSANT__CONTRAINTES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Composant.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Composant"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Composant)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Composant_type") :
			getString("_UI_Composant_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Composant.class)) {
			case CataloguePackage.COMPOSANT__ID:
			case CataloguePackage.COMPOSANT__NAME:
			case CataloguePackage.COMPOSANT__BRAND:
			case CataloguePackage.COMPOSANT__DATASHEET:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CataloguePackage.COMPOSANT__METADATA:
			case CataloguePackage.COMPOSANT__FOOTPRINT:
			case CataloguePackage.COMPOSANT__PORTS:
			case CataloguePackage.COMPOSANT__CONTRAINTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CataloguePackage.Literals.COMPOSANT__METADATA,
				 CatalogueFactory.eINSTANCE.createMetadata()));

		newChildDescriptors.add
			(createChildParameter
				(CataloguePackage.Literals.COMPOSANT__FOOTPRINT,
				 CatalogueFactory.eINSTANCE.createFootprint()));

		newChildDescriptors.add
			(createChildParameter
				(CataloguePackage.Literals.COMPOSANT__PORTS,
				 CatalogueFactory.eINSTANCE.createPort()));

		newChildDescriptors.add
			(createChildParameter
				(CataloguePackage.Literals.COMPOSANT__CONTRAINTES,
				 CatalogueFactory.eINSTANCE.createOpBinaire()));

		newChildDescriptors.add
			(createChildParameter
				(CataloguePackage.Literals.COMPOSANT__CONTRAINTES,
				 CatalogueFactory.eINSTANCE.createEt()));

		newChildDescriptors.add
			(createChildParameter
				(CataloguePackage.Literals.COMPOSANT__CONTRAINTES,
				 CatalogueFactory.eINSTANCE.createOu()));

		newChildDescriptors.add
			(createChildParameter
				(CataloguePackage.Literals.COMPOSANT__CONTRAINTES,
				 CatalogueFactory.eINSTANCE.createNon()));

		newChildDescriptors.add
			(createChildParameter
				(CataloguePackage.Literals.COMPOSANT__CONTRAINTES,
				 CatalogueFactory.eINSTANCE.createRedondance()));

		newChildDescriptors.add
			(createChildParameter
				(CataloguePackage.Literals.COMPOSANT__CONTRAINTES,
				 CatalogueFactory.eINSTANCE.createGeometrique()));

		newChildDescriptors.add
			(createChildParameter
				(CataloguePackage.Literals.COMPOSANT__CONTRAINTES,
				 CatalogueFactory.eINSTANCE.createGeoGenerale()));

		newChildDescriptors.add
			(createChildParameter
				(CataloguePackage.Literals.COMPOSANT__CONTRAINTES,
				 CatalogueFactory.eINSTANCE.createGeoSpecifique()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CatalogueEditPlugin.INSTANCE;
	}

}
