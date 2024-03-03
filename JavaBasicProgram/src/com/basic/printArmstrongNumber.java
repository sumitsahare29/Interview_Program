package com.basic;

public class printArmstrongNumber {

//	print armstrong number in between 1 to 10000
	
	public static void checkArmNo(int no) {

		int temp, count = 0, sum = 0, digit;

		temp = no;

		// count
		while (temp != 0) {
			count++;
			temp = temp / 10;
		}

		temp = no;
		while (temp != 0) {
			digit = temp % 10;  

			int mul = 1;

			for (int i = 1; i <= count; i++) {
				mul = mul * digit;

			}
			
			sum=sum+mul;
			temp=temp/10;

		}

		if (sum==no) {
			System.out.println(no);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10000; i++) {
			
			checkArmNo(i);
		}
		
		
	}

}
