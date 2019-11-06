package com.class5;

import java.util.Scanner;

public class LigicalAndScanner {

	public static void main(String[] args) {
		// ask user to enter age
		// if age is from 1 to 3 --->you are a baby
		// if age is 3-5 --> you are a toddler
		// if age from 5-12 ---> you are a kid
		// if age from 12-19 ---> teenager
		// if age>20 ---> you are an adult

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = input.nextInt();
		String human;

		if (age >= 1 && age <= 3) {
			// System.out.println("you are a baby");
			human = "baby";
		} else if (age > 3 && age <= 5) {
			// System.out.println("you are a toddler");
			human = "toddler";
		} else if (age > 5 && age <= 12) {
			// System.out.println("you are a kid");
			human = "kid";
		} else if (age > 12 && age <= 19) {
			// System.out.println("you are a teeneger");
			human = "teeneger";
		} else {
			// System.out.println("you are an adult");
			human = "adult";
		}
		System.out.println("you are a " + human);
	input.close();
	}

}
