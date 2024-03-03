package com.basic;

public class CheckPrimeORNot {

//	check the given number is prime or not
	
	public static void main(String[] args) {
		
		int number=8;
		int temp = 0;
		
		for(int i=2;i<=number-1;i++) {
			if (number%i==0) {
				temp++;
			}
		}
		if (temp==0) {
			System.out.println(number+" is prime Number");
		}else {
			System.out.println(number+" is not prime Number");
		}
			
	}
}
		
