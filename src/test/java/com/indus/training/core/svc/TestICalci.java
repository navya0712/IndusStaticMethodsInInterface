package com.indus.training.core.svc;

/**
 * Provides Test Cases for Static methods in ICalci Interface
 */
import junit.framework.TestCase;

public class TestICalci extends TestCase {

	/**
	 * Sets Up the Test Environment
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * Tears Down the Test Environment
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test Case for addition method
	 */
	public void testAddition() {
		// 1. Inputs
		double param1 = 10.0;
		double param2 = 20.0;

		// 2. Expected Result
		double expResult = 30.0;

		// 3. Actual Result
		double actualResult = ICalci.addition(param1, param2);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);
	}

	/**
	 * Test Case for Subtraction method
	 */
	public void testSubtraction() {

		// 1. Inputs
		double param1 = 40.0;
		double param2 = 20.0;

		// 2. Expected Result
		double expResult = 20.0;

		// 3. Actual Result
		double actualResult = ICalci.subtraction(param1, param2);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);
	}

	/**
	 * Test Case for multiplication method
	 */
	public void testMultiplication() {

		// 1. Inputs
		double param1 = 10.0;
		double param2 = 20.0;

		// 2. Expected Result
		double expResult = 200.0;

		// 3. Actual Result
		double actualResult = ICalci.multiplication(param1, param2);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);
	}

	/**
	 * Test Case for division method
	 */
	public void testDivision() {

		// 1. Inputs
		double param1 = 200.0;
		double param2 = 10.0;

		// 2. Expected Result
		double expResult = 20.0;

		// 3. Actual Result
		double actualResult = ICalci.division(param1, param2);

		// 4. Assertion
		assertEquals(expResult, actualResult, 0);
	}

}
