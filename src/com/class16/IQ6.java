package com.class16;

public class IQ6 {

	public static void main(String[] args) {
		// Write a Java Program to find whether a String is palindrome or not?
		// revered and original string is same that  is palindrome
		// mom, dad, madam, racecar, kayak, bob vs.
		// locig:
		// Step 1: reversed the string
		// Step 2: Compare two Strings:
		// if string are equal ---> palindrome
		//  else ---> not palindrome
		
		String original="kayak";
		String reversed="";
		
		for(int i=original.length()-1; i>=0; i--) {
			reversed =reversed+original.charAt(i); // +k=k+a=ka+k..
		} System.out.println(reversed);
		if (original.equals(reversed)) {
			System.out.println("String is Polindrome");
		}else {
			System.out.println("String is NOT Polindrome");
		}
		
	}

}
