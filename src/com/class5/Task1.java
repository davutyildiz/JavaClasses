package com.class5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("please enter your height");
		double height=input.nextDouble();
		if(height<5) {
			System.out.println("You are short");
		} else if (height>5 && height<6) {
			System.out.println("You are medium");
		} else if (height>= 6) {
			System.out.println("You are tall");
		}else {
			System.out.println("Not classify!");
			
			input.close();
		
	}

}
}
