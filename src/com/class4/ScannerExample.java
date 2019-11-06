package com.class4;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any number");
		/* nextInt();--> for numbers
		 * nextLine(); --> String
		 * nextDouble(); -->
		 * 
		 */
		int number=scan.nextInt();
		System.out.println("Enter number is "+number);
		
		
System.out.println("********************************");
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=input.nextLine();
		System.out.println("Good afternnoon "+name);
		
		
	}

}
