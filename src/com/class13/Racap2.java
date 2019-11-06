package com.class13;

public class Racap2 {

	public static void main(String[] args) {
		String str1="Hello";
		String str2="Hello";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);

	
		System.out.println("***********");
		
		
		String str3=new String("Bye");
		String str4=new String("Bye");
		
		
		System.out.println(str3.equals(str4));
		System.out.println(str1==str3);
		
		
		System.out.println("***********");
		System.out.println(str1.contains("l"));
		System.out.println(str1.contains("j"));
		
		System.out.println("***** Start with and with ******");
		
		String str5="Today is Saturday";
		System.out.println(str5.startsWith("Today"));
		System.out.println(str5.endsWith("day"));
		
		System.out.println("***** Concat ******");
		System.out.println(str5.concat(" and we have java class"));
		
		
		System.out.println("***** Concat ******");
		String str6=("   It is sunny   ");
		
		
		System.out.println("Before trimming: "+str6);
		System.out.println(str6.trim());
		
		System.out.println("***** Index OF and CharAt ******");
		String str7=("Tomorrow we will be done String Manipulations");
		System.out.println(str7.indexOf('e'));
		System.out.println(str7.indexOf('e', 11));
		System.out.println(str7.indexOf("we"));
		
		System.out.println(str7.charAt(10));
		
		
		
		
		
		
		

	}

}
