package com.class6;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		/*HomeWork: Using scanner class create calculator. Allow user to enter 2 numbers and
  		operator(+,-,*,/). Based on operator provide the result to user.
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two number");
		double num1=scan.nextDouble();
		double num2=scan.nextDouble();
		System.out.println("Please enter operator");
		char operator=scan.next().charAt(0);
		double result=0;
		
		switch(operator) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;;
			break;
			default:
				System.out.println("Invalid Operator");
				break;

		}
		System.out.println(num1+" "+operator + " "+ num2 +" is "+result);
		
		

	}

}
