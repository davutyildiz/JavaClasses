package com.class12;

public class StringMiniPulationDemo {

	public static void main(String[] args) {
		// There are two ways to create string objects.
		// 1 st way
		// String Literal
		String name= "Jhon";
		System.out.println(name);
		System.out.println(name.length());
		
		System.out.println("************");
		// 2 nd way
		// Creating String with new key word
		String name1=new String ("John1@");
		System.out.println(name1);
		System.out.println(name1.length());
		System.out.println("************");
		/* This method returns the length of this string.
		 * The length is equal to the number
		 * of the 16-bit Unicode characters in the string
		 */
		int name1Len=name1.length();
		System.out.println("The length of the name1 is = "+name1Len);
		
		System.out.println("***************");
		
		String str1="Hello World";
		str1=str1.toLowerCase();
		System.out.println(str1);
		
		// .equals()
		// This method care about upper case and lower case
		String str2="HEllo WoRld";
		boolean isEqual=str1.equals(str2);
		System.out.println(isEqual);
		
		System.out.println("**************");
		// .equalsIgnoreCase();
		// This method does not care for capitalization and compare content only!!
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println("************");
		// this method convert all characters to Upper case
		String str3="Mohammad";
		System.out.println("Before: "+str3);
		str3=str3.toUpperCase();
		System.out.println("After: "+str3);
		
		System.out.println("****************");
		
		
		
		
	}

}
