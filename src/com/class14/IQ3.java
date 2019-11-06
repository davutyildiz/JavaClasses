package com.class14;

public class IQ3 {

	public static void main(String[] args) {
		// Find out how many alpha characters present in a string?
		String str="abcde12345cfr45!@#$%^";
		String str1=str.replaceAll("[^a-zA-Z]","");
		System.out.println(str1);
		System.out.println(str1.length());

	}

}
