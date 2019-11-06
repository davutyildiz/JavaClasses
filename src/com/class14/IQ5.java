package com.class14;

public class IQ5 {

	public static void main(String[] args) {
		// Write a java program to reverse String? Reverse a string word by word?
		String str="My names is Rodin. I am from NJ. How are you?";
		String [] array=str.split(" ");
		for(int i=array.length-1; i>=0; i--) {
			System.out.println(array[i]);
		}
		
		
		

	}

}
