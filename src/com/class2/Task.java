package com.class2;

public class Task {
	
	public static void main (String[] args) {
		double num1, num2;
		num1 = 2.24;
		num2 = 1.12;
		
		double sum= num1+num2;
		double sub=num1-num2;
		double mult=num1*num2;
		double div=num1/num2;
		//double s1=3.9*3.9;
		
		
		System.out.println("The sum of "+ num1 +"and "+num2+ " is equal to "+ sum);
		System.out.println("The sub of "+ num1 +"and "+num2+ " is equal to "+ sub);
		System.out.println("The div of "+ num1 +"and "+num2+ " is equal to "+ div);
		System.out.println("The mult of "+ num1 +"and "+num2+ " is equal to "+ mult);
		System.out.println("The square of "+ 3.9 + " is equal to "+ sum);
		
		int width=5;
		int length=8;
		int perimeter=2*(width+length);
		int area=(width*length);
		System.out.println("The perimeter of rectagle with width "+ width +" and length "+length+ " is equal to "+ perimeter);
		System.out.println("The area of rectagle with width "+ width +" and lenght "+length+ " is equal to "+ area);
		
	}
	

}
