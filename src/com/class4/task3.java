package com.class4;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Please enter amount money you need");
		double amount=keyboard.nextDouble();
		
		if (amount<200000) {
			System.out.println("your loan Approved");
		}
		else {
			System.out.println("your loan Reject");
		}
		
		
		System.out.println("Please enter your age");
		int age=keyboard.nextInt();
		if (age>=18) {
			System.out.println("Driver licence issued");
		}
		else {
			System.out.println("Learnes permit issued");
		}
    
		System.out.println("Please enter City name");
		System.out.println("Please enter Tempreture");
		
		String city=keyboard.next();
		int temp=keyboard.nextInt();
		int convertedTemp=(temp-32)*5/9;
		
		System.out.println("The tempreture is the city "+ city+ " is "+ convertedTemp );
		
		
	}

}
