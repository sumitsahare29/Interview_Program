package com.basic;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramOrNot {
	
//	check the string is anagram or not

	public void anagramMethod(String str1, String str2) {

		char a[] = str1.toLowerCase().toCharArray();
		char b[] = str2.toLowerCase().toCharArray();

//		char a[] = str1.toCharArray();
//		char b[] = str2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);	

		if (Arrays.equals(a, b)) {
			System.out.println("Anagram");
		} else {
			System.out.println("NOT-Anagram");
		}
	}

	public static void main(String[] args) {
		AnagramOrNot an = new AnagramOrNot();
		an.anagramMethod("JBK", "JbK");
		
		
	
		
//		Scanner scanner=new Scanner(System.in);
//		
//		String str1=scanner.next(); //SumiT
//		String str2=scanner.next(); //suMIt
//		
//		
//		char a[]=str1.toLowerCase().toCharArray(); // {s u m i t} 
//		char b[]=str1.toLowerCase().toCharArray(); // {s u m i t} 
//		
//		
//		Arrays.sort(a); //{i m s t u}
//		Arrays.sort(b); //{i m s t u}
//		
//		if (Arrays.equals(a, b)) {
//			System.out.println("yes");
//		}
//		
//		else {
//			System.out.println("not");
//		}
//		
	}

}
