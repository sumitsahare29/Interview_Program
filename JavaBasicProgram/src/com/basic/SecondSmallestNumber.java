package com.basic;

public class SecondSmallestNumber {

//	Find the second smallest number in an array.
	
	public static void main(String[] args) {

		int arr[] = { 5, 8, 3, 9, 1, 4 };

		int temp;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;

				}
			}
		}
		
		System.out.println("Second Smallest Number--> " + arr[1]);

	}
}
