package com.class16;

public class IQ4 {

	public static void main(String[] args) {
		// How to find out the part of the string from a string?
		// What is substring? Find number of words in string?
		
		String str="Today is very cold out side";
		String substring=str.substring(0,5);
		System.out.println(substring);
		
		// how many words is there
		// Step1: Split base on space
		// step2: find the length of array
		
		String[] words=str.split("");
		System.out.println(words.length);
		
		


	}

}
