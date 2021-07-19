/**
 */
package de.unistuttgart.ma.saga.impact.impact.tests;

import de.unistuttgart.ma.saga.impact.impact.Impact;
import de.unistuttgart.ma.saga.impact.impact.ImpactFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Impact</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImpactTest extends TestCase {

	/**
	 * The fixture for this Impact test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Impact fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImpactTest.class);
	}

	/**
	 * Constructs a new Impact test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Impact test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Impact fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Impact test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Impact getFixture() {
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
		setFixture(ImpactFactory.eINSTANCE.createImpact());
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

} //ImpactTest
