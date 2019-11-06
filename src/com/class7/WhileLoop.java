package com.class7;

public class WhileLoop {

	public static void main(String[] args) {
			int time=8;
			if (time<12) {// condition id true
				System.out.println("Good morning");// code executed	
			}
			System.out.println("---------------------");
			
			while(time<12) { // while condition is ture
				System.out.println("Good morning");
				time++;
			}

			
			System.out.println("**************");
			
			// I want to print Good afternoon 5 times
			int i=1;
			while(i<6) {
				System.out.println("Good afternoon");
				i++;
			} System.out.println("Outside of loop");
	}

}
