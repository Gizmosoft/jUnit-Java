package com.accenture.lkm.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TagTest {

	@Test
	//TODO1 : Add annotation @Tag("slow")
	void test() {
		Assertions.assertEquals(3, 3, "2 + 1 = 3");
		System.out.println("I am in test");
	}
@Test
//TODO2 : Add annotation@Tag("fast")
	void test1() {
	Assertions.assertEquals(2, 2, "1 + 1 = 2");
	System.out.println("I am in test1");
	}

}
