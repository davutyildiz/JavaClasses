package com.class13;

public class Task2 {

	public static void main(String[] args) {
		// Create a string and print it in reverse order(sunday---> yadnus)
		String day=("Sunday");
		
		
		
		for(int i=day.length()-1; i>=0; i--) {
			System.out.println(day.charAt(i));
			
		}
		
		System.out.println("****************");
		
		/* Create a string and if the String is not empty perform the following: 
		 * if the string has an odd number of characters and has 3 or more characters,
		 * print the character in the middle of the string
		 * 
		 */
		
		  String str2 = "Hello";
	        if (str2.isEmpty()) {
	        } else {
	            if (str2.length() % 2 != 0 && str2.length() > 2) {
	                System.out.println(str2.charAt(str2.length() / 2));
	}

}
	}
}
