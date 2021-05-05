package com.junit.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.junit.demos.Calculator;

@TestInstance(Lifecycle.PER_CLASS)
class CalculatorTest {
	Calculator calc = null;
	int result;
	
	@BeforeAll
	void setUpCalc() {
		calc = new Calculator();
		result = 0;
		System.out.println("Calc created");
	}
	
	@AfterAll
	void tearDownCalc() {
		calc = null;
		System.out.println("Calc memory reclaimed");
	}

	@Test
	@DisplayName(value="Both arguments are positive")
	void testFindSum() {
		result = calc.findSum(20, 10);
		// expected result = 30
		// actual result is variable
		assertEquals(30, result);
	}
	
	@Test
	@DisplayName(value="Second argument is negative")
	void testFindSumNegative() {
		result = calc.findSum(30, -5);
		assertEquals(25, result);
	}
	
	@Test
	@DisplayName(value="First argument is negative")
	void testFindSumNegativeSecond() {
		result = calc.findSum(-10, 40);
		assertEquals(30, result);
	}

}
