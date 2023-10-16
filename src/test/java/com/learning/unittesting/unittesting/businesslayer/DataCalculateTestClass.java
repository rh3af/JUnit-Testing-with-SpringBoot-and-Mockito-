package com.learning.unittesting.unittesting.businesslayer;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.learning.unittesting.unittesting.datalayer.DataCalculate;


class SomeDataCalculate implements DataCalculate{

	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		return new int[] { 1, 2, 3};
	}
	
}
public class DataCalculateTestClass {

	@Test
	public void sumCalculationUsingDataLayerBasicCase() {
		
		CalculateSum sum = new CalculateSum();
		sum.setDatacalculate(new SomeDataCalculate());
		int actualResult = sum.sumCalculationUsingDataLayer();
		int expectedResult = 6;
		
		assertEquals(expectedResult, actualResult);
	}
	
//	@Test
//	public void sumCalculationUsingDataLayerNullCase() {
//		
//		CalculateSum sum = new CalculateSum();
//		int actualResult = sum.sumCalculationUsingDataLayer();
//		int expectedResult = 0;
//		
//		assertEquals(expectedResult, actualResult);
//	}
//	
//	@Test
//	public void sumCalculationUsingDataLayerSingleValue() {
//		
//		CalculateSum sum = new CalculateSum();
//		int actualResult = sum.sumCalculationUsingDataLayer();
//		int expectedResult = 1;
//		
//		assertEquals(expectedResult, actualResult);
//	}

}
