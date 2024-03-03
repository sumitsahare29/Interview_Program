package com.basic;

public class PalindromNumber {

//	check the given number is palindrom or not
	
	public static void main(String[] args) {

		int number = 121;
		int random=number;
		int temp, rev = 0;

		while (random != 0) {
			temp = random % 10;
			rev = (rev * 10) + temp;
			random = random / 10;
		}
//		System.out.println(rev);
		
//		System.out.println(number);

		
		if (number == rev) {
			System.out.println("Palindrom Number");
		} else {
			System.out.println("Not Palindrom Number");
		}

	}

}
