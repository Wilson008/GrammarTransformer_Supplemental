/**
 */
package dot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dot.DotAst#getGraphs <em>Graphs</em>}</li>
 * </ul>
 *
 * @see dot.DotPackage#getDotAst()
 * @model
 * @generated
 */
public interface DotAst extends EObject {
	/**
	 * Returns the value of the '<em><b>Graphs</b></em>' containment reference list.
	 * The list contents are of type {@link dot.DotGraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphs</em>' containment reference list.
	 * @see dot.DotPackage#getDotAst_Graphs()
	 * @model containment="true"
	 * @generated
	 */
	EList<DotGraph> getGraphs();

} // DotAst
