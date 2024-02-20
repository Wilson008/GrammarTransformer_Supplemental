/**
 */
package qvtoperational.tests;

import junit.textui.TestRunner;

import qvtoperational.ClassifierGO;
import qvtoperational.QvtoperationalFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Classifier GO</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassifierGOTest extends ImperativeOperationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClassifierGOTest.class);
	}

	/**
	 * Constructs a new Classifier GO test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierGOTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Classifier GO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClassifierGO getFixture() {
		return (ClassifierGO)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QvtoperationalFactory.eINSTANCE.createClassifierGO());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ClassifierGOTest
