package com.accenture.lkm.junit;

import org.junit.jupiter.api.*;


class AnnotationExample {

	// This method should be static (Class level invocation)
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before all my test methods");
	}

	// This method should not be static (Test level invocation)
	@BeforeEach
	void beforeEach() {
		System.out.println("Before each my test method");
	}

	@AfterEach
	void afterEach() {
		System.out.println("After each my test method");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("After all my test methods");
	}

	@Test
	@DisplayName("My First test")
	void firstTest() {
		System.out.println("My First test method");
	}

	@Test
	@DisplayName("My Second test")
	void secondTest() {
		System.out.println("My Second test method");
	}
	
	//Disabled applied at method level
	//If applied at Class level, the class itself is ignored in testing
	@Disabled
	   public void disabledTest() {
	      System.out.println("in disabled test");
	   }
	
}