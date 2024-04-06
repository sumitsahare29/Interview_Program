package com.basic;

public class SecondLargestNumber {

//	Find the second largest number in an array.

	public static void main(String[] args) {

		int arr[] = { 1, 8, 4, 7, 2, 0, 5 };

		int temp;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 1 + i; j < arr.length; j++) {

				if (arr[i] < arr[j]) {

					temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;
				}

			}
		}

		System.out.println("Second Largest Number--> "+arr[1]);
	}
}
