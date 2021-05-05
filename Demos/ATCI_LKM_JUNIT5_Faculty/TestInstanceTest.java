package com.accenture.lkm.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(Lifecycle.PER_CLASS)
class TestInstanceTest {

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


}
