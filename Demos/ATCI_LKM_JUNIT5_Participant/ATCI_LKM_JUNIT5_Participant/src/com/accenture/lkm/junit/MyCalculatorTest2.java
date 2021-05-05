package com.accenture.lkm.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.TestInfo;

class MyCalculatorTest2 {
	private MyCalculator theCalculator;

	//TODO1 : Add annotation @BeforeAll
		void setupCalc() {
			System.out.println("Setting up Calculator");
			theCalculator = new MyCalculator();
		}
		//TODO2 : Add annotation @AfterAll
		void tearDwonCalc() {
			System.out.println("Tearing Down Calculator");
			theCalculator = null;
			System.gc();
		}
	//TODO1 : Add annotation @BeforeEach
	void startTest(TestInfo testInfo) {
		System.out.println("Start Executing Test..." + testInfo.getDisplayName());
	}

	//TODO1 : Add annotation @AfterEach
	void endTest(TestInfo testInfo) {
		System.out.println("Completed Test..." + testInfo.getDisplayName());
	}

	//TODO1 : Add annotation @Test
	public void testGetSum() {

		int a = 5;
		int b = 10;
		// Checks the sum of two (2) positive values
		assertEquals(15, (theCalculator.getSum(a, b)));
		assertEquals(15, (theCalculator.getSum(b, a)));

		a = -5;
		b = 10;
		// Checks the sum of a postive value and a negative value
		assertEquals(5, (theCalculator.getSum(a, b)));
		assertEquals(5, (theCalculator.getSum(b, a)));

		a = -5;
		b = -10;
		// Checks the sum of two (2) negative values
		assertEquals(-15, (theCalculator.getSum(a, b)));
		assertEquals(-15, (theCalculator.getSum(b, a)));
	}

	//TODO1 : Add annotation @Test
	public void testGetDifference() {

		int a = 3;
		int b = 2;
		// Checks if b is lesser than a
		assertEquals(1, (theCalculator.getDifference(a, b)));
		// Checks if b is greater than a
		assertEquals(-1, (theCalculator.getDifference(b, a)));

		a = 5;
		b = -4;
		// Checks if negative value is subtracted from positive value
		assertEquals(9, (theCalculator.getDifference(a, b)));
		// Checks if positive value is subtracted from negative value
		assertEquals(-9, (theCalculator.getDifference(b, a)));

		a = -10;
		b = -5;
		// Checks if negative value is subtracted from negative value: a > b
		assertEquals(-5, (theCalculator.getDifference(a, b)));
		// Checks if negative value is subtracted from negative value: b < a
		assertEquals(5, (theCalculator.getDifference(b, a)));
	}

}
