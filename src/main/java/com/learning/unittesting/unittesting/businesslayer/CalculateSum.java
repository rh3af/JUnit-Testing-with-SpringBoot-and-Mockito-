package com.learning.unittesting.unittesting.businesslayer;

import com.learning.unittesting.unittesting.datalayer.DataCalculate;

public class CalculateSum {
	
	private DataCalculate datacalculate;
	
	
	public void setDatacalculate(DataCalculate datacalculate) {
		this.datacalculate = datacalculate;
	}

	public int sumCalculation(int[] data) {
		int sum=0;
		
		for(int value:data) {
			sum= sum +value;
		}
		
		return sum;
	}
	
	public int sumCalculationUsingDataLayer() {
		int sum=0;
		int[] data = datacalculate.retrieveData();
		
		for(int value:data) {
			sum= sum +value;
		}
		
		return sum;
	}

}
