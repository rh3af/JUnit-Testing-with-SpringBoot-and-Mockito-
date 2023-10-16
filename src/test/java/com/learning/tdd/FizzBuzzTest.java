package com.learning.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FizzBuzzTest {
	
	
	@Test
	@DisplayName("Divisible by 3")
	@Order(1)
	void testForDivisibleByThree() {
		
		String expected = "Fizz";
		
		assertEquals(expected, FizzBuzz.compute(3), "Should return Fizz");
		
	}
	
	@Test
	@DisplayName("Divisible by 5")
	@Order(2)
	void testForDivisibleByFive() {
		
		String expected = "Buzz";
		
		assertEquals(expected, FizzBuzz.compute(5), "Should return Buzz");
		
	}
	
	@Test
	@DisplayName("Divisible by 3 & 5")
	@Order(3)
	void testForDivisibleBThereeAndFive() {
		
		String expected = "FizzBuzz";
		
		assertEquals(expected, FizzBuzz.compute(15), "Should return FizzBuzz");
		
	}
	
	@Test
	@DisplayName("NOT Divisible by 3 & 5")
	@Order(3)
	void testForNOTDivisibleBThereeAndFive() {
		
		String expected = "1";
		
		assertEquals(expected, FizzBuzz.compute(1), "Should return 1");
		
	}
	
	@DisplayName("testing with CSV data")
	@ParameterizedTest(name="value={0}, expected={1}")
	@CsvFileSource(resources="/test_data.csv")
	@Order(3)
	void testCSVDataFile(int value, String expected) {
		
		
		assertEquals(expected, FizzBuzz.compute(value));
		
	}

	
}
