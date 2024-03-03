package com.basic;

public class DuplicateNo1Array {

	// find the duplicate no in 1 array

	public static void main(String[] args) {

		int arr[] = { 2, 5, 8, 3, 0, 9, 8, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1 + i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
