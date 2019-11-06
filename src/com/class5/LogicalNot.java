package com.class5;

public class LogicalNot {

	public static void main(String[] args) {

		// using ! we are reverting condition
		boolean b1 = !true;
		boolean b2 = !false;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println("##################");
		boolean traffic = true;
		// if traffic--> late, else --> on time

		if (!traffic) {
			System.out.println("On time");
		} else {
			System.out.println("Late");
		}
		System.out.println("##################");

		boolean isRain = true;

		if (!isRain) {
			System.out.println("Do not take umbralla");
		} else {
			System.out.println("Take an umbrella.");
		}

		System.out.println("##################");
		// let's compare 2 numbers using NOT operator
		int num1 = 10;
		int num2 = 11;
		if (num1 == num2) {
			System.out.println("Numbers are equal");
		} else {
			System.out.println("Numbers are not equal");
		}

		if (!(num1 == num2)) {
			System.out.println("Numbers are NOT equal");
		} else {
			System.out.println("NUmbers are equal");
		}

		System.out.println("##################");
		// if name is NOT Mary or Anna then you are my sister
		String name = "Mary";
		String name2 = "Anna";
		if (!(name.equals("Mary") || name.equals("Anna"))) {
			System.out.println("You are not my sister");
		} else {
			System.out.println("You are my sister");
		}

	}

}
