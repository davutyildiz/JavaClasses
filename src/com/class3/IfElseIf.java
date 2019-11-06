package com.class3;

public class IfElseIf {

	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 100;
		if (num1 > num2) {
			System.out.println("Num1 is larger than Num2");
		} else if (num1 == num2) {
			System.out.println("Num1 equal Num2");
		} else {
			System.out.println("Num1 is smaller than Num2");
		}
		System.out.println("##################");
		int day = 6;
		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");

		} else {
			System.out.println("sunday");
		}

	}

}
