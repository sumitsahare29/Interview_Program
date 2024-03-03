package com.basic;

public class CheckArmstrong {

//	check the give number is armstrong or not
	
	public static void main(String[] args) {

		int armNo = 153;
		int temp;
		int countNo = 0, sum = 0, digit;

		// count the length of given number.
		temp=armNo;
		while (temp != 0) {
			countNo++;
			temp = temp / 10;
		}
//		System.out.println("The count of digit of given number--> " + countNo);

		temp = armNo;
		int mul;
		

		while (temp != 0) {
			digit = temp % 10; 
			mul=1;
			for (int i = 1; i <= countNo; i++) {

				mul = mul * digit;
			}
			
			sum = sum + mul;
			temp = temp / 10;
		}

		if (sum == armNo)
			System.out.println("armstrong");

		else
			System.out.println("no armstrong");

	}

}
