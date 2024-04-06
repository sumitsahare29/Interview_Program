package com.basic;

public class ReverseString {
	public static void main(String[] args) throws Exception {

//		Reverse String

		String name = "RajKumar";
		String rev = "";
		System.out.println("Original String is---> " + name);

		for (int i = name.length()-1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}

		System.out.println("Reverse String is---> " + rev);
	}

}
