package com.class6;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/* Write a program to find largest of three double values using if-else..if
		 * provided by a user (numbers must be distinct)
		*/

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter three distinct number");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		double num3=scan.nextDouble();
		String largest;
		
		if(num1>num2 && num1>num3) {
			largest="num1";
		} else if(num2>num1 && num2>num3) {
			largest="num2";
		} else {
			largest="num3";
		}
		System.out.println(largest);
		
		System.out.println("#######################");
		/* program to find largest number among three numbers using nested if 
		 * provided by a user (numbers must be distinct)
		 */
		System.out.println("Please enter three distinct number");
		double n1=scan.nextDouble();
		double n2=scan.nextDouble();
		double n3=scan.nextDouble();
		double largestNumber;
		
		 if (n1 >= n2) {
	            if (n1 >= n3) {
	                largestNumber =n1;
	            } else {
	                largestNumber = n3;
	            }
	        } else {
	            if (n2 >= n3) {
	                largestNumber = n2;
	            } else {
	                largestNumber = n3;
	            }
	        }
	        System.out.println("Largest number is " + largestNumber);

	}

}
