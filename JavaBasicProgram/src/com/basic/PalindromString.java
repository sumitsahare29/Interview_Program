package com.basic;

public class PalindromString {

//check the string is palindrom or not

	public static void main(String[] args) {

		String name = "madam";
		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);

		if (name.equals(rev)) {
			System.out.println("Palindrom String");
		} else {
			System.out.println("NOT Palindrom String");
		}

	}
}
