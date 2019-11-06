package com.class7;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/*You need to ask user to pay for coffee
		 * You need to keep asking user to pay for it until
		 * entered price is equal=5;
		 * after user paid then say"Enjoy your coffee!"
		 */
		Scanner scan=new Scanner(System.in);
		
		int coffee=1;
		while(coffee<=5) {
			System.out.println("Please pay for your coffee");
			coffee=scan.nextInt();
			coffee++;
		}
		System.out.println("Enjoy your coffee");
		
	}
}
