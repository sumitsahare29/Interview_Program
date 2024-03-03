package com.basic;

public class FibonacciSeries {
	
//print the finonacci series in between 1 to 10	
	public static void main(String[] args) {

		int firstNumber = 1;
		int secondNumber = 2;
		
		for (int i = 1; i <= 10; i++) {
			
			int thirdNumber = firstNumber + secondNumber;
			System.out.println(thirdNumber);
			firstNumber=secondNumber;
			secondNumber=thirdNumber;

		}
	}
}
