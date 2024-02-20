/**
 */
package QVTOperational.tests;

import QVTOperational.PopulationSection;
import QVTOperational.QVTOperationalFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Population Section</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PopulationSectionTest extends TestCase {

	/**
	 * The fixture for this Population Section test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopulationSection fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PopulationSectionTest.class);
	}

	/**
	 * Constructs a new Population Section test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationSectionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Population Section test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PopulationSection fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Population Section test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopulationSection getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QVTOperationalFactory.eINSTANCE.createPopulationSection());
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

} //PopulationSectionTest
