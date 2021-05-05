package com.accenture.lkm.junit;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.EnumSource.Mode;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterisedTest {
	// supported for ints, longs, strings, doubles for junit 5.0
	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 4 })
	@DisplayName("simple")
	void intValue(final int num) {
		assertTrue(num > 0, "the number is" + num);
	}

	@ParameterizedTest
	@ValueSource(strings = { "Car", "Bus", "Train" })
	@DisplayName("simple")
	void stringValue(final String s) {
		System.out.println(s);

	}

	@ParameterizedTest
	@ValueSource(doubles = { 5.0, 6.0, 7.0 })
	@DisplayName("double")
	void doubles(final double n) {
		assertTrue(n > 0);
	}
	// shorts,bytes,floats,chars,classes are supported in junit5.1 onwards

	// Enumsource
	public enum myColors {
		PINK, GREEN, RED, BLUE
	}

	@ParameterizedTest
	@EnumSource(myColors.class)
	@DisplayName("simple enum")
	void simple(final myColors colors) {
		assertNotNull(colors);
		System.out.println(colors);
	}

	// we can also exclude specific colors from enum
	@ParameterizedTest
	@EnumSource(value = myColors.class, names = { "RED", "PINK" }, mode = Mode.EXCLUDE)
	@DisplayName("excluded constants")
	void excludedConstants(final myColors col) {
		assertNotNull(col);
		System.out.println(col);
	}

	// Method Source

	@ParameterizedTest
	@MethodSource("myMethod")
	@DisplayName("Basic one")
	void simpleMethod(final String str) {
		assertNotNull(str);
		System.out.println(str);
	}

	static List<String> myMethod() {
		List<String> List1 = new ArrayList<String>();
		List1.add("LKM");
		List1.add("Junit5");
		List1.add("Java");
		return List1;

	}

	// CsvSource
	@ParameterizedTest
	// @CsvSource({"Accenture, 1", "Bangalore, 2"})
	@CsvSource(value = { "Accenture@1", "Bangalore@2" }, delimiter = '@')
	@DisplayName("Test CSV")
	void simpleCsv(final String s1, final int n1) {
		assertNotNull(s1);
		assertTrue(n1 > 0);
		System.out.println("String value" + s1);
		System.out.println("Number Value" + n1);
	}

	// //CsvFileSource
	@ParameterizedTest
	@CsvFileSource(resources = "users.csv")
	@DisplayName("simple example of CSV file")
	void simpleCsvFile(final String firstName, final String emailId) {
		assertNotNull(firstName);
		assertNotNull(emailId);
		System.out.println("First name is" + firstName);
		System.out.println("Email id is" + emailId);
	}
}
