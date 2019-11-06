package com.class5;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter working years for company");
		double year = input.nextDouble();

		if (year >= 5) {
			System.out.println("Please enter your salary");
			double salary = input.nextDouble();
			if (salary > 50000) {
				System.out.println("your bonus is 5000");
			} else {
				System.out.println("your bonus is 3000");
			}

		} else {
			System.out.println("you are not eligible for bonus");
		}
input.close();
	}

}
