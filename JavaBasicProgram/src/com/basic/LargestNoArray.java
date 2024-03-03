package com.basic;

public class LargestNoArray {
	
//	find the largest number of an array
	
	public static void main(String[] args) {

//		int arr[] = { 12, 45, 23, 88, 99, 65, 87 };
//		int max = arr[0];
//		for (int i = 1; i <= arr.length - 1; i++) {
//			
//
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println("Largest Number is----> " + max);

		int arr[] = { 12, 45, 23, 88, 99, 65, 87 };
		int maxNumber = arr[0];

		for (int i : arr) {
			if (i > maxNumber) {

				maxNumber=i;
			}
		}

		System.out.println("Maximum number is---> " + maxNumber);

	}
}
