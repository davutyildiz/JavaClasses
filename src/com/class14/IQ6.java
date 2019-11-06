package com.class14;

public class IQ6 {

	public static void main(String[] args) {
		// Write a Java Program to find whether a String is palindrome or not?
		String str="abcba";
		char[] array=str.toCharArray();
		int a=str.length();
		System.out.println(a);
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
			if(array[i]==array.length()) {
				System.out.println("palindrome");
			}else {
				System.out.println("not palindrome");
			}
		}
		
	}

}
