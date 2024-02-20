/**
 */
package dot.impl;

import dot.AttrList;
import dot.AttrStmt;
import dot.Attribute;
import dot.AttributeType;
import dot.DotAst;
import dot.DotFactory;
import dot.DotGraph;
import dot.DotPackage;
import dot.EdgeOp;
import dot.EdgeRhs;
import dot.EdgeRhsNode;
import dot.EdgeRhsSubgraph;
import dot.EdgeStmtNode;
import dot.EdgeStmtSubgraph;
import dot.GraphType;
import dot.NodeId;
import dot.NodeStmt;
import dot.Port;
import dot.Stmt;
import dot.Subgraph;
import dot.SubgraphOrEdgeStmtSubgraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DotPackageImpl extends EPackageImpl implements DotPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dotAstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dotGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeStmtNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeStmtSubgraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeStmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attrStmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attrListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subgraphOrEdgeStmtSubgraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subgraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeRhsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeRhsNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeRhsSubgraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum edgeOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum graphTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeTypeEEnum = null;

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
	 * @see dot.DotPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DotPackageImpl() {
		super(eNS_URI, DotFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DotPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DotPackage init() {
		if (isInited) return (DotPackage)EPackage.Registry.INSTANCE.getEPackage(DotPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDotPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DotPackageImpl theDotPackage = registeredDotPackage instanceof DotPackageImpl ? (DotPackageImpl)registeredDotPackage : new DotPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theDotPackage.createPackageContents();

		// Initialize created meta-data
		theDotPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDotPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DotPackage.eNS_URI, theDotPackage);
		return theDotPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDotAst() {
		return dotAstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDotAst_Graphs() {
		return (EReference)dotAstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDotGraph() {
		return dotGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDotGraph_Strict() {
		return (EAttribute)dotGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDotGraph_Type() {
		return (EAttribute)dotGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDotGraph_Name() {
		return (EAttribute)dotGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDotGraph_Stmts() {
		return (EReference)dotGraphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStmt() {
		return stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeStmtNode() {
		return edgeStmtNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeStmtNode_Node() {
		return (EReference)edgeStmtNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeStmtNode_EdgeRHS() {
		return (EReference)edgeStmtNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeStmtNode_AttrLists() {
		return (EReference)edgeStmtNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeStmtSubgraph() {
		return edgeStmtSubgraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeStmtSubgraph_Subgraph() {
		return (EReference)edgeStmtSubgraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeStmtSubgraph_EdgeRHS() {
		return (EReference)edgeStmtSubgraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeStmtSubgraph_AttrLists() {
		return (EReference)edgeStmtSubgraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeStmt() {
		return nodeStmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeStmt_Node() {
		return (EReference)nodeStmtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeStmt_AttrLists() {
		return (EReference)nodeStmtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttrStmt() {
		return attrStmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttrStmt_Type() {
		return (EAttribute)attrStmtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttrStmt_AttrLists() {
		return (EReference)attrStmtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttrList() {
		return attrListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttrList_Attributes() {
		return (EReference)attrListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Value() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubgraphOrEdgeStmtSubgraph() {
		return subgraphOrEdgeStmtSubgraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubgraph() {
		return subgraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubgraph_Name() {
		return (EAttribute)subgraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubgraph_Stmts() {
		return (EReference)subgraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Compass_pt() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Name() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeRhs() {
		return edgeRhsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdgeRhs_Op() {
		return (EAttribute)edgeRhsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeRhsNode() {
		return edgeRhsNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeRhsNode_Node() {
		return (EReference)edgeRhsNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeRhsSubgraph() {
		return edgeRhsSubgraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdgeRhsSubgraph_Subgraph() {
		return (EReference)edgeRhsSubgraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeId() {
		return nodeIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeId_Name() {
		return (EAttribute)nodeIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodeId_Port() {
		return (EReference)nodeIdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEdgeOp() {
		return edgeOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGraphType() {
		return graphTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributeType() {
		return attributeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DotFactory getDotFactory() {
		return (DotFactory)getEFactoryInstance();
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
		dotAstEClass = createEClass(DOT_AST);
		createEReference(dotAstEClass, DOT_AST__GRAPHS);

		dotGraphEClass = createEClass(DOT_GRAPH);
		createEAttribute(dotGraphEClass, DOT_GRAPH__STRICT);
		createEAttribute(dotGraphEClass, DOT_GRAPH__TYPE);
		createEAttribute(dotGraphEClass, DOT_GRAPH__NAME);
		createEReference(dotGraphEClass, DOT_GRAPH__STMTS);

		stmtEClass = createEClass(STMT);

		edgeStmtNodeEClass = createEClass(EDGE_STMT_NODE);
		createEReference(edgeStmtNodeEClass, EDGE_STMT_NODE__NODE);
		createEReference(edgeStmtNodeEClass, EDGE_STMT_NODE__EDGE_RHS);
		createEReference(edgeStmtNodeEClass, EDGE_STMT_NODE__ATTR_LISTS);

		edgeStmtSubgraphEClass = createEClass(EDGE_STMT_SUBGRAPH);
		createEReference(edgeStmtSubgraphEClass, EDGE_STMT_SUBGRAPH__SUBGRAPH);
		createEReference(edgeStmtSubgraphEClass, EDGE_STMT_SUBGRAPH__EDGE_RHS);
		createEReference(edgeStmtSubgraphEClass, EDGE_STMT_SUBGRAPH__ATTR_LISTS);

		nodeStmtEClass = createEClass(NODE_STMT);
		createEReference(nodeStmtEClass, NODE_STMT__NODE);
		createEReference(nodeStmtEClass, NODE_STMT__ATTR_LISTS);

		attrStmtEClass = createEClass(ATTR_STMT);
		createEAttribute(attrStmtEClass, ATTR_STMT__TYPE);
		createEReference(attrStmtEClass, ATTR_STMT__ATTR_LISTS);

		attrListEClass = createEClass(ATTR_LIST);
		createEReference(attrListEClass, ATTR_LIST__ATTRIBUTES);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);

		subgraphOrEdgeStmtSubgraphEClass = createEClass(SUBGRAPH_OR_EDGE_STMT_SUBGRAPH);

		subgraphEClass = createEClass(SUBGRAPH);
		createEAttribute(subgraphEClass, SUBGRAPH__NAME);
		createEReference(subgraphEClass, SUBGRAPH__STMTS);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__COMPASS_PT);
		createEAttribute(portEClass, PORT__NAME);

		edgeRhsEClass = createEClass(EDGE_RHS);
		createEAttribute(edgeRhsEClass, EDGE_RHS__OP);

		edgeRhsNodeEClass = createEClass(EDGE_RHS_NODE);
		createEReference(edgeRhsNodeEClass, EDGE_RHS_NODE__NODE);

		edgeRhsSubgraphEClass = createEClass(EDGE_RHS_SUBGRAPH);
		createEReference(edgeRhsSubgraphEClass, EDGE_RHS_SUBGRAPH__SUBGRAPH);

		nodeIdEClass = createEClass(NODE_ID);
		createEAttribute(nodeIdEClass, NODE_ID__NAME);
		createEReference(nodeIdEClass, NODE_ID__PORT);

		// Create enums
		edgeOpEEnum = createEEnum(EDGE_OP);
		graphTypeEEnum = createEEnum(GRAPH_TYPE);
		attributeTypeEEnum = createEEnum(ATTRIBUTE_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		edgeStmtNodeEClass.getESuperTypes().add(this.getStmt());
		edgeStmtSubgraphEClass.getESuperTypes().add(this.getSubgraphOrEdgeStmtSubgraph());
		nodeStmtEClass.getESuperTypes().add(this.getStmt());
		attrStmtEClass.getESuperTypes().add(this.getStmt());
		attributeEClass.getESuperTypes().add(this.getStmt());
		subgraphOrEdgeStmtSubgraphEClass.getESuperTypes().add(this.getStmt());
		subgraphEClass.getESuperTypes().add(this.getSubgraphOrEdgeStmtSubgraph());
		edgeRhsNodeEClass.getESuperTypes().add(this.getEdgeRhs());
		edgeRhsSubgraphEClass.getESuperTypes().add(this.getEdgeRhs());

		// Initialize classes, features, and operations; add parameters
		initEClass(dotAstEClass, DotAst.class, "DotAst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDotAst_Graphs(), this.getDotGraph(), null, "graphs", null, 0, -1, DotAst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dotGraphEClass, DotGraph.class, "DotGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDotGraph_Strict(), ecorePackage.getEBoolean(), "strict", null, 0, 1, DotGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDotGraph_Type(), this.getGraphType(), "type", null, 0, 1, DotGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDotGraph_Name(), ecorePackage.getEString(), "name", null, 0, 1, DotGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDotGraph_Stmts(), this.getStmt(), null, "stmts", null, 0, -1, DotGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stmtEClass, Stmt.class, "Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edgeStmtNodeEClass, EdgeStmtNode.class, "EdgeStmtNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeStmtNode_Node(), this.getNodeId(), null, "node", null, 0, 1, EdgeStmtNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeStmtNode_EdgeRHS(), this.getEdgeRhs(), null, "edgeRHS", null, 0, -1, EdgeStmtNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeStmtNode_AttrLists(), this.getAttrList(), null, "attrLists", null, 0, -1, EdgeStmtNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeStmtSubgraphEClass, EdgeStmtSubgraph.class, "EdgeStmtSubgraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeStmtSubgraph_Subgraph(), this.getSubgraph(), null, "subgraph", null, 0, 1, EdgeStmtSubgraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeStmtSubgraph_EdgeRHS(), this.getEdgeRhs(), null, "edgeRHS", null, 0, -1, EdgeStmtSubgraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdgeStmtSubgraph_AttrLists(), this.getAttrList(), null, "attrLists", null, 0, -1, EdgeStmtSubgraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeStmtEClass, NodeStmt.class, "NodeStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodeStmt_Node(), this.getNodeId(), null, "node", null, 0, 1, NodeStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeStmt_AttrLists(), this.getAttrList(), null, "attrLists", null, 0, -1, NodeStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attrStmtEClass, AttrStmt.class, "AttrStmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttrStmt_Type(), this.getAttributeType(), "type", null, 0, 1, AttrStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttrStmt_AttrLists(), this.getAttrList(), null, "attrLists", null, 0, -1, AttrStmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attrListEClass, AttrList.class, "AttrList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttrList_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, AttrList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subgraphOrEdgeStmtSubgraphEClass, SubgraphOrEdgeStmtSubgraph.class, "SubgraphOrEdgeStmtSubgraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subgraphEClass, Subgraph.class, "Subgraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubgraph_Name(), ecorePackage.getEString(), "name", null, 0, 1, Subgraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubgraph_Stmts(), this.getStmt(), null, "stmts", null, 0, -1, Subgraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Compass_pt(), ecorePackage.getEString(), "compass_pt", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeRhsEClass, EdgeRhs.class, "EdgeRhs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdgeRhs_Op(), this.getEdgeOp(), "op", null, 0, 1, EdgeRhs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeRhsNodeEClass, EdgeRhsNode.class, "EdgeRhsNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeRhsNode_Node(), this.getNodeId(), null, "node", null, 0, 1, EdgeRhsNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeRhsSubgraphEClass, EdgeRhsSubgraph.class, "EdgeRhsSubgraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdgeRhsSubgraph_Subgraph(), this.getSubgraph(), null, "subgraph", null, 0, 1, EdgeRhsSubgraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeIdEClass, NodeId.class, "NodeId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeId_Name(), ecorePackage.getEString(), "name", null, 0, 1, NodeId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNodeId_Port(), this.getPort(), null, "port", null, 0, 1, NodeId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(edgeOpEEnum, EdgeOp.class, "EdgeOp");
		addEEnumLiteral(edgeOpEEnum, EdgeOp.DIRECTED);
		addEEnumLiteral(edgeOpEEnum, EdgeOp.UNDIRECTED);

		initEEnum(graphTypeEEnum, GraphType.class, "GraphType");
		addEEnumLiteral(graphTypeEEnum, GraphType.GRAPH);
		addEEnumLiteral(graphTypeEEnum, GraphType.DIGRAPH);

		initEEnum(attributeTypeEEnum, AttributeType.class, "AttributeType");
		addEEnumLiteral(attributeTypeEEnum, AttributeType.GRAPH);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.NODE);
		addEEnumLiteral(attributeTypeEEnum, AttributeType.EDGE);

		// Create resource
		createResource(eNS_URI);
	}

} //DotPackageImpl
