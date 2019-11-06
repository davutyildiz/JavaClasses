package com.class4;

public class task1 {
	public static void main(String[] args) {
		
		boolean diploma=true;
		double gpa=3.0;
		
		if (diploma) {
			System.out.println("Congratulations!!!");
			if (gpa>=3.5) {
				System.out.println("You are eligible for Scholarship");
			}
			else {
				System.out.println("You should study harder");
			}
		}
		else {
			System.out.println("You Shoul get a degree!!!");
		}
		
	}

}
