package com.accenture.lkm.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class MyCalculatorTest1 {

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
	
	//TODO3 : Add annotation @Test
	//TODO4 : Add annotation @DisplayName("Addition Test")
	public void testGetSum() {

		int a = 5;
		int b = 10;
		// Checks the sum of two (2) positive values
		Assertions.assertEquals(15, (theCalculator.getSum(a, b)));
		Assertions.assertEquals(15, (theCalculator.getSum(b, a)));

		a = -5;
		b = 10;
		// Checks the sum of a postive value and a negative value
		Assertions.assertEquals(5, (theCalculator.getSum(a, b)));
		Assertions.assertEquals(5, (theCalculator.getSum(b, a)));

		a = -5;
		b = -10;
		// Checks the sum of two (2) negative values
		Assertions.assertEquals(-15, (theCalculator.getSum(a, b)));
		Assertions.assertEquals(-15, (theCalculator.getSum(b, a)));
	}

}
