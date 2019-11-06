package com.class4;

public class task2 {
	public static void main(String[] args) {

		double rate = 3.5;
		int price = 700000;
		if (rate >= 4.5) {
			System.out.println("Not Buy House");
		} else {
			System.out.println("Buy House");
			if (price > 200000) {
				System.out.println("Take Loan");
			} else {
				System.out.println("Pay Cash");
			}
		}

	}
}
