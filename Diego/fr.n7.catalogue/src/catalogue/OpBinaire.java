/**
 */
package catalogue;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Binaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link catalogue.OpBinaire#getOperandes <em>Operandes</em>}</li>
 * </ul>
 *
 * @see catalogue.CataloguePackage#getOpBinaire()
 * @model abstract="true"
 * @generated
 */
public interface OpBinaire extends Contrainte {
	/**
	 * Returns the value of the '<em><b>Operandes</b></em>' containment reference list.
	 * The list contents are of type {@link catalogue.Contrainte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operandes</em>' containment reference list.
	 * @see catalogue.CataloguePackage#getOpBinaire_Operandes()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Contrainte> getOperandes();

} // OpBinaire
