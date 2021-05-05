package com.accenture.lkm.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.TestInfo;

class MyCalculatorTest3 {

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


	//TODO2 : Add annotation @ParameterizedTest
	//TODO3 : Add annotation @ValueSource(strings = { "Accenture", "Java" })
	void checkStringLength(String stringinput) {
		System.out.println("---Inside Check length of String---");
		assertTrue(theCalculator.getStringLength(stringinput)>1, "stinginput length is less");
		
	}
	
	//TODO4 : Add annotation @Disabled
	//TODO5 : Add annotation @Test
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
}
