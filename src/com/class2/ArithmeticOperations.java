package com.class2;

public class ArithmeticOperations {
	/*
	 * declare 2 variables and initialize them display result of addition,
	 * subtruction, multiplication and division
	 * 
	 */
	public static void main(String[] args) {

		int num1, num2;
		num1 = 20;
		num2 = 10;

		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		System.out.println(num2 % num1);

		// how can we print value of num1 and num2 together
		System.out.println(num1 + "" + num2);

		int sum = num1 + num2;
		int sub = num1 - num2;
		int mult = num1 * num2;
		int div = num1 / num2;

		System.out.println(sum);
		System.out.println(sub);
		System.out.println(div);
		System.out.println(mult);

		// The addition of 2 numbers is_

		System.out.println("The addition of 2 numbers is " + sum);
		System.out.println("The addition of " + num1 + " and " + num2 + " is " + sum);
		System.out.println("The subtraction of 2 numbers is " + sub);
		System.out.println("The multiplication of 2 numbers is " + "mult");
		System.out.println("The division of 2 numbers is " + "div");
		System.out.println();

	}

}
