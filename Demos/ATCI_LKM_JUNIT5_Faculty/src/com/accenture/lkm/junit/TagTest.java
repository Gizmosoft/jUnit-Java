package com.accenture.lkm.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagTest {

	@Test
	@Tag("slow")
	void test() {
		Assertions.assertEquals(3, 3, "2 + 1 = 3");
		System.out.println("I am in test");
	}
@Test
	@Tag("fast")
	void test1() {
	Assertions.assertEquals(2, 2, "1 + 1 = 2");
	System.out.println("I am in test1");
	}

}
