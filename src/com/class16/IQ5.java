package com.class16;

public class IQ5 {

	public static void main(String[] args) {
		
		//Reverse a string word by word?
		String given="Welcome to the java class";
		String reversed="";
		String [] str=given.split("\\s");
		for(int i=str.length-1; i>=0; i--)
		{
			reversed=reversed+str[i]+" ";
		}
		System.out.println(reversed);
		
		// Write a java program to reverse String? 
		
		//methods:  toCharArray(); or charAt();
		String newstr="Hello , today is Saturday";
		char[] charArray=newstr.toCharArray();
		for(int i=charArray.length-1; i>=0; i--) {
			System.out.println(charArray[i]);
		}
		
		
		// using charAt()
		
		String Words="I love java";
		
		for (int i=Words.length()-1; i>=0; i--) {
			System.out.print(Words.charAt(i));
		}
		
	}

}
