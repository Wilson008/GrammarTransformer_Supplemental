/**
 */
package ATLnoOCL.tests;

import ATLnoOCL.ATLnoOCLFactory;
import ATLnoOCL.ActionBlock;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Action Block</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionBlockTest extends LocatedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActionBlockTest.class);
	}

	/**
	 * Constructs a new Action Block test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionBlockTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Action Block test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ActionBlock getFixture() {
		return (ActionBlock)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ATLnoOCLFactory.eINSTANCE.createActionBlock());
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

} //ActionBlockTest
