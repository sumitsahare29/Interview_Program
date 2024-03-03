package com.basic;

public class SumOfDigit {
	
//	sum of each an every digit of given number
	
	public static void main(String[] args) {

		int number = 12345;
		int sum = 0, temp;
//
//		while (number > 0) {     
//			sum = sum + number%10;   
//			number = number / 10;
//		}
//		System.out.println(sum);

		int no=number;
		
		while(number!=0) {
			temp=number%10;
			sum=sum+temp;
			number=number/10;
		}
		System.out.println("The sum of "+no+" is---> "+sum);


	}
}
