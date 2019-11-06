package com.class2;

public class VariableDecoration {
	public static void main (String[] args) {
		
		// 1. declarin variable num1 that will hold value of int and 
		//assigning/ initializing value of 123 to it
		
		int num1=123;
		int num2=6767;
		long num3=78687623434657l;
		char num4='A';
		
		// 2. declare variable first and then assign value
		int n1;
		int n2;
		int n3;
		
		n1=56;
		n2=7667;
		n3=456;
		
		// 3. declare all variable together and then assign value
		
		int number1, number2,number3;
		number1=12;
		number2=145;
		number3=4546;
		
		// System.out.println(num1);
		System.out.println(number3);
		
		
		number3=1000;
		System.out.println(number3);
		
		
		boolean var=true;
		System.out.println(var);
		
		char myVariable='*';
		System.out.println(myVariable);
		
		number2=number1;
		System.out.println(number2);
		
		// number2=false;==> compile time error asking to change data type of 
		// variable number2 to boolean
		
		
		 boolean isRain=false;
		 boolean isSnow;
		 isSnow=isRain; // isSnow=false
		 System.out.println(isSnow);
		 
		
		
	}

}
