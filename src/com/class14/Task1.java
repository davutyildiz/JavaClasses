package com.class14;

import java.lang.reflect.Array;

public class Task1 {

	public static void main(String[] args) {
		/*Create a String that will hold a sentence. 
		 * Write a program to get a new String without any spaces.
Create a String that should be combination of letters, numbers and special characters. 
Find out how many alpha characters are there in the String.
You have a String a=”Is it saturday? Is it raining? 
Do we have a Java Class today?” How would you find out how many sentences are in that String?

		 * 
		 */
		
		String str=" I am very happy ";
		String str1=str.replace(" ","");
		System.out.println(str1);

		System.out.println("*******************");
		
		
		String str2="abdcerff12345%^&@#$%";
		String str3=str2.replaceAll("[^a-zA-Z]", "");
		
		//System.out.println(str2.replaceAll("[^a-zA-Z]", " "));
		
		System.out.println(str3.length());
		System.out.println(str3);
		
		
		System.out.println("******************");
		
		String a="Is it saturday? Is it raining?" + 
				"Do we have a Java Class today?";
		String [] array2=a.split("\\?");
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i].trim());
			
		}
		
	}

}
