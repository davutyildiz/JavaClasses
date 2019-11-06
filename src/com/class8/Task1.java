package com.class8;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Write a code to find the sum of even and odd numbers from range 1 to 20
		 */

		int sumEven = 0;
		int sumOdd = 0;
		int sumAll = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				sumEven = sumEven + i;
			} else {
				sumOdd = sumOdd + i;
			}
			sumAll += i;
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
		System.out.println(sumAll);

	}

}
