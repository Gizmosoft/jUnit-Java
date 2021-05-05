package com.accenture.lkm.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(Lifecycle.PER_CLASS)
public class ClassInsatanceLifeCylceTest {

	private int count = 0;

	@BeforeAll
	void setup() {
		System.out.println("Start!");
	}

	@BeforeEach
	void reset() {
		this.count = 0;
	}

	@Test
	@DisplayName("increase")
	void testIncrease() {
		this.count++;
		assertEquals(1, this.count);
	}

	@Test
	@DisplayName("decrease")
	void testDecrease() {
	this.count--;
	
		assertEquals(-1, this.count);
	}
}
