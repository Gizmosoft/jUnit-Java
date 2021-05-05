package com.accenture.lkm.junit;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;



@ExtendWith(JUnitPlatform.class)
@SelectClasses( OneTest.class )
public class TestSuiteJunit5 {

	
}
