/**
 */
package dot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dot.DotPackage
 * @generated
 */
public interface DotFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DotFactory eINSTANCE = dot.impl.DotFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ast</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ast</em>'.
	 * @generated
	 */
	DotAst createDotAst();

	/**
	 * Returns a new object of class '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph</em>'.
	 * @generated
	 */
	DotGraph createDotGraph();

	/**
	 * Returns a new object of class '<em>Stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stmt</em>'.
	 * @generated
	 */
	Stmt createStmt();

	/**
	 * Returns a new object of class '<em>Edge Stmt Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Stmt Node</em>'.
	 * @generated
	 */
	EdgeStmtNode createEdgeStmtNode();

	/**
	 * Returns a new object of class '<em>Edge Stmt Subgraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Stmt Subgraph</em>'.
	 * @generated
	 */
	EdgeStmtSubgraph createEdgeStmtSubgraph();

	/**
	 * Returns a new object of class '<em>Node Stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Stmt</em>'.
	 * @generated
	 */
	NodeStmt createNodeStmt();

	/**
	 * Returns a new object of class '<em>Attr Stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attr Stmt</em>'.
	 * @generated
	 */
	AttrStmt createAttrStmt();

	/**
	 * Returns a new object of class '<em>Attr List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attr List</em>'.
	 * @generated
	 */
	AttrList createAttrList();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Subgraph Or Edge Stmt Subgraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subgraph Or Edge Stmt Subgraph</em>'.
	 * @generated
	 */
	SubgraphOrEdgeStmtSubgraph createSubgraphOrEdgeStmtSubgraph();

	/**
	 * Returns a new object of class '<em>Subgraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subgraph</em>'.
	 * @generated
	 */
	Subgraph createSubgraph();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Edge Rhs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Rhs</em>'.
	 * @generated
	 */
	EdgeRhs createEdgeRhs();

	/**
	 * Returns a new object of class '<em>Edge Rhs Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Rhs Node</em>'.
	 * @generated
	 */
	EdgeRhsNode createEdgeRhsNode();

	/**
	 * Returns a new object of class '<em>Edge Rhs Subgraph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Rhs Subgraph</em>'.
	 * @generated
	 */
	EdgeRhsSubgraph createEdgeRhsSubgraph();

	/**
	 * Returns a new object of class '<em>Node Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Id</em>'.
	 * @generated
	 */
	NodeId createNodeId();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DotPackage getDotPackage();

} //DotFactory
