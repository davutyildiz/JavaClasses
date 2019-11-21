package com.class20;

public class Task1 {

	public static void main(String[] args) {
		Task1 task=new Task1();
	String result=	task.reverseString("Syntax");
	System.out.println(result);
	String param="Syntax";
	boolean result2=task.isPalindrome(param);
	System.out.println("is \""+ param+ "\" Palindrome? "+ result2);
	
	String[] strArray=task.arrayOfWords("What a beatiful day is today!");
	System.out.println("The length of the array is: "+ strArray.length);
	for(String word: strArray) {
		System.out.println(word);
	}

	}
	 String reverseString(String str) {
		 String result="";
	char[]charArray=str.toCharArray();
	for(int i=charArray.length-1; i>=0; i--) {
		result+=charArray[i];
	}
	
	return result;
}
	public  boolean isPalindrome(String str1) {
		 boolean result=false;
		 String reverse=reverseString(str1);
		 if(str1.equalsIgnoreCase(reverse)) {
			 result=true;
		 }else {
			 result=false;
		 }
		 return result;
	 }
	String [] arrayOfWords(String sentence) {
//		String[] stringArray;
//	stringArray=sentence.split(" ");
//	return stringArray;
//		
		return sentence.split(" ");
	}
	
	 
}
