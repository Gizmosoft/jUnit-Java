package com.accenture.lkm.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

class RepeatedTestAnnotaion {

	@BeforeEach
	void beforeEach() {
		System.out.println("Before each my test method");
	}
	
	@RepeatedTest(3)
	void test(RepetitionInfo r1) {
		
		System.out.println("This is test #" +r1.getCurrentRepetition());
	}
	@AfterEach
	void afterEach() {
		System.out.println("After each my test method");
	}
	
	@DisplayName("Add Two Numbers")
    @RepeatedTest(value = 6, name = "{displayName} - repetition {currentRepetition} of {totalRepetitions}")
    void addTwoNumber() {
        
		System.out.println("repeated test each my test method");
    }

}
