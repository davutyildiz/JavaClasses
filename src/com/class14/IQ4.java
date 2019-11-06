package com.class14;

public class IQ4 {

	public static void main(String[] args) {
		// How to find out the part of the string from a string? What is substring? 
		//Find number of words in string?
		String a="We love Java";
		String[] b=a.split(" ");
		System.out.println(b.length);
		for(int i=0;i<b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("**********");
		System.out.println(a.substring(5, 10));
	}

}
