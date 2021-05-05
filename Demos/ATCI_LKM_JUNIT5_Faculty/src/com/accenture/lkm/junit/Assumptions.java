package com.accenture.lkm.junit;

import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Examples of Assumptions in Junit 5")
public class Assumptions {
	@Test
	@DisplayName("Basic assumptions")
	void testAssumeFalse() {
		System.setProperty("DB", "UAT");
		assumeFalse("UAT".equals(System.getProperty("DB")), "Assumption is True");
		// remainder of code will be aborted
		System.out.println("testAssumeFalse");
	}

	@Test
	void testAssumeTrue() {
		System.setProperty("DB", "Live");
		assumeTrue("Live".equals(System.getProperty("DB")));
		// remainder of code will be executed
		System.out.println("testAssumeTrue");

	}

	@Test

	@DisplayName("assumingThat")
	void testingThat() {
		assumingThat(2 > 1, () -> System.out.println("This must be true!"));
		assumingThat(2 < 1, () -> System.out.println("This should never happen."));
	}

}