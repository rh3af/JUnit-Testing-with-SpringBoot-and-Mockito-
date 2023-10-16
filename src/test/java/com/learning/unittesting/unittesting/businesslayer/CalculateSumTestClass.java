package com.learning.unittesting.unittesting.businesslayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class CalculateSumTestClass {

	@Test
	public void sumCalculationBasicCase() {
		
		CalculateSum sum = new CalculateSum();
		int actualResult = sum.sumCalculation(new int[] {1, 2, 3});
		int expectedResult = 6;
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void sumCalculationNullCase() {
		
		CalculateSum sum = new CalculateSum();
		int actualResult = sum.sumCalculation(new int[] {});
		int expectedResult = 0;
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void sumCalculationSingleValue() {
		
		CalculateSum sum = new CalculateSum();
		int actualResult = sum.sumCalculation(new int[] {1});
		int expectedResult = 1;
		
		assertEquals(expectedResult, actualResult);
	}

}
