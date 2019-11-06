package com.class8;

public class ForLoop {

	public static void main(String[] args) {
		// Say good morning 5 times
		//  initialize ; test condition; increment/decrement; same line (we know 5 times good morning)
		for(int i=0; 		i<=4; 			i++) {
			System.out.println("Good morning");
		}

		
		 // print numbers from 1-10
		for (int i=1; i<=10; i++) {
			System.out.print(i+" ");// same line aralarinda bosluk
		}
		// print numbers from 10-1
		for(int i=10; i>=1; i--) {
			System.out.print(i+" ");
		}
		for(int i=0; i<=50; i+=5) {
			System.out.println(i);
		}
	}

}
