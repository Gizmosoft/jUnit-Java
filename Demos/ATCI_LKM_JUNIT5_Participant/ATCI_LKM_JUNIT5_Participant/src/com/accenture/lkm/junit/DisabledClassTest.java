package com.accenture.lkm.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public class DisabledClassTest {

	@Test
	public void testConcatWithRegularInput() {
		String sVal1 = "Hello";
		String sVal2 = "World";
		String sVal3 = "Hello World";
		String result = sVal1 + sVal2;
		Assertions.assertEquals(result, sVal3);
	}

}