package com.accenture.lkm.junit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class OneTest {
	
	public OneTest(){
		System.out.println("I am here");
	}

	
	@Test
	public void test1() {
		Assertions.assertEquals(2, 2, "1 + 1 = 2");
		System.out.println("I am in method1");
       
	}
	@Test
	public void test2() {
		Assertions.assertEquals(2, 2, "1 + 1 = 2");
		System.out.println("I am in method2");
       
	}


}
