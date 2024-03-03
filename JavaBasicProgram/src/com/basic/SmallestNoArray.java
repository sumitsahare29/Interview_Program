package com.basic;

public class SmallestNoArray {
	
//	find smallest number of an array
	
	public static void main(String[] args) {

//		int arr[] = { 12, 45, 23, 8, 11, 90, 2, 54 };
//		int min = arr[0];
//
//		for (int i = 1; i <= arr.length-1; i++) {
//			if (arr[i] < min) {  
//				min = arr[i];
//			}
//
//		}
//		System.out.println("Smallest number is---> " + min);

		
		
		int arr[] = { 12, 45, 23, 8, 11, 90, 2, 54 };
		int min = arr[0];
		
		for (int i : arr) {  // i->2 
			if(i<min) {    // 2<8
				min=i;    // min->2
			}
		}
		System.out.println(min);
		
		
	}
}
