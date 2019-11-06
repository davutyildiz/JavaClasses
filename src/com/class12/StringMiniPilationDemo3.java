package com.class12;

public class StringMiniPilationDemo3 {

	public static void main(String[] args) {
		/* This method checks whether a string is empty or not
		 * This method returns true if the given string 
		 * is empty else it return false
		 */
		String str="";
		System.out.println("Is this string is empty= "+ str.isEmpty());
		String str2="Hello";
		System.out.println("Is this string is empty= "+ str2.isEmpty());
		System.out.println();
		System.out.println("****************");
		if(!str.isEmpty()) {
			System.out.println("Is this string is NOT empty");	
		}else {
			System.out.println("Is this string is empty");
		}
		System.out.println("************");
		// \n take down as a second line
		String sentence="Each day has a promise to brighten up the day,\nBut first you must allow the sun to come your way";
		System.out.println(sentence);
		System.out.println("**************");
		
		/*This method appends one string to the end of another
		 * the method returns a string with the value of the
		 * string passed in to the method appended to the end
		 * of the string used to invoke this method
		 */
		String str3="Hello";
		String str4="World";
		System.out.println(str3+" "+str4);
		System.out.println(str3.concat(str4));
		System.out.println(str3.concat(" ").concat(str4));
		
		System.out.println("******************");
		/*This method return a copy of the string
		 * with leading and trailing whitespace omitted
		 */
		String str6="  How are you";
		System.out.println(str6.trim());
		
		System.out.println("*************");
		
		/* This method returns the character located at the string's specified index
		 * The string indexes start from zero
		 */
		String str7="We might be done early today";
		System.out.println(str7.charAt(9));
		
		System.out.println("***************");
		/*This method returns the index within this string of the 
		 * first occurrence of the specified character of -1 
		 * if the character does not occur
		 */
		String str8="We might not  be done early today";
		System.out.println(str8.indexOf('e'));// first 'e'in index 1
		System.out.println(str8.indexOf('e',3)); // after index 3 there is 'e' in index 15
		System.out.println(str8.indexOf('e',23)); // after  index 23  there is no 'e'
		System.out.println("*************");
		// can we solve how many 'e' we have !!!
		
		
	}

}
