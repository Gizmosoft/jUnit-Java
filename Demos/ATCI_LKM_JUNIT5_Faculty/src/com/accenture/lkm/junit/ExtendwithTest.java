package com.accenture.lkm.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExtendwithTest {
	@Test
	void testmethod1() {
		String s1 = null;
		
		Assertions.assertThrows(NullPointerException.class, () -> s1.length());

	}

	@Test()
	void testmethod2() {
		String s1 = "abc";
		
		Assertions.assertThrows(NullPointerException.class, () -> s1.length());
	}
	
//	@Test(expected=NullPointerException.class)
//	void testmethod3() {
//		throw new NullPointerException();
//		
//	}

}
