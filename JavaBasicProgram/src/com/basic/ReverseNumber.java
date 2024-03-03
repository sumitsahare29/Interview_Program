package com.basic;

public class ReverseNumber {
	
//	Reverse Number
	
	public static void main(String[] args) {

		int Number = 123;
		int rev = 0, temp;

		while (Number != 0) {
			temp = Number % 10; // temp-> 3, 2, 1, 
			rev = (rev * 10) + temp; // rev-> 3, 32, 321 
			Number = Number / 10;  // Number-> 12, 1, 0
		}
		System.out.println("Reverse Number----> " + rev);
	}
}
