package com.accenture.lkm.junit.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.accenture.lkm.junit.demos.Calculator;

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
	@DisplayName(value = "Both arguments are positive")
	void testFindSum() {
		result = calc.findSum(20, 10);
		// expected result will be 30
		// actual result will be variable result
		assertEquals(30, result);
	}

	@Test
	@DisplayName(value = "Second argument is negative")
	void testFindSumNegative() {
		result = calc.findSum(30, -5);
		assertEquals(25, result);
	}

	@Test
	@DisplayName(value = "First argument is negative")
	void testFindSumNegativeSecond() {

		result = calc.findSum(-10, 40);
		assertEquals(30, result);
	}
	
	@Test
	@DisplayName(value = "Both arguments are negative")
	void testFindSumNegativeBoth() {
		result = calc.findSum(-10, -5);
		assertEquals(-15, result);
	}
	
	@Test
	@DisplayName(value = "Both arguments are zero")
	void testFindSumZero() {
		result = calc.findSum(0, 0);
		assertEquals(0, result);
	}
	
	@Test
	@DisplayName(value = "First argument is zero")
	void testFindSumZeroFirst() {
		result = calc.findSum(0, 10);
		assertEquals(10, result);
	}
	
	@Test
	@DisplayName(value = "Second argument is zero")
	void testFindSumZeroSecond() {
		result = calc.findSum(10, 0);
		assertEquals(10, result);
	}

}
