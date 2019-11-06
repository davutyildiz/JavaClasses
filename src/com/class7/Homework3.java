package com.class7;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		// homework2 solve by do while
		Scanner scan=new Scanner(System.in);
		int price;
		do {
			System.out.println("Please pay for your coeffe");
			price=scan.nextInt();
		}while(price!=5);
		System.out.println("Enjoy your coffee");
		
		
		// second way while
		int price1;
		System.out.println("Please pay for your coffee");
		price1=scan.nextInt();
		while(price1 !=5) {
			System.out.println("Please pay for your coffee");
			price1=scan.nextInt();
		}
	}

}
