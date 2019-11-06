package com.class3;

public class IfConditions {

	public static void main(String[] args) {
		
		int a=90;
		int b=300;
		
		// if number a is bigger than number b
		// i want to print a is larger than b
		if (a>b) {
			System.out.println("a is larger than b");	
		}
		
		else {
			System.out.println("a is smaller than b");
		
		}
		
		int expectedHours=15;
		int actualHours=20;
		
		// if expected hours are more than actual -> you will succeed
		// otherwise, please study more
		
		if (expectedHours>actualHours) {
			System.out.println("you will succed");
		}
		else {
			System.out.println("please study more");
		}
		
		
		double teaPrice=4.99;
		double allowedPrice=3.99;
		teaPrice-=2; // 2.99=4.99-2
		// if price is more than I can afford I eill NOT buy
		// if price is less or matches what I can afford then I will buy
		
		if (allowedPrice>=teaPrice) {
			System.out.println("I will buy");	
		}
		else {
			System.out.println("I cannot afford, I need more money ");
			
		}
		System.out.println("I keep writing some code ");
		System.out.println("I keep writing more code ");
		
		System.out.println("###########################");
		
		boolean val=false;
		if (val) { // if val==true
			System.out.println("hello");
		}
		else {
			System.out.println("bye");
		}
		
		
		boolean isRain=false;
		// if it is raining I will take umbrealla
		if (isRain) {
			System.out.println("I will take umbrella");
		}
		else {
			System.out.println("I go for a walk");
		}
	}

}
