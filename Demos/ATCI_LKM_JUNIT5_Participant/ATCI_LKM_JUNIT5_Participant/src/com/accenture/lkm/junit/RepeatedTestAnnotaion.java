package com.accenture.lkm.junit;

import org.junit.jupiter.api.RepetitionInfo;

class RepeatedTestAnnotaion {

	//TODO1 : Add annotation @BeforeEach
	void beforeEach() {
		System.out.println("Before each my test method");
	}
	
	//TODO2 : Add annotation @RepeatedTest(3)
	void test(RepetitionInfo r1) {
		
		System.out.println("This is test #" +r1.getCurrentRepetition());
	}
	//TODO3 : Add annotation @AfterEach
	void afterEach() {
		System.out.println("After each my test method");
	}
	
	//TODO4 : Add annotation @DisplayName("Add Two Numbers")
	//TODO5 : Add annotation @RepeatedTest(value = 6, name = "{displayName} - repetition {currentRepetition} of {totalRepetitions}")
    void addTwoNumber() {
        
		System.out.println("repeated test each my test method");
    }

}
