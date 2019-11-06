package com.class9;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		/*Write a program that reads a range of integers (Start and end point)
		 * provided by the user and then from that range print the sum of the even and odd integers.
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter range");
		//int a;
		//int b;
		 int a=scan.nextInt();
		 int b=scan.nextInt();
		 int sumeven=0;
		 int sumodd=0;

		for (int i=a; i<=b; i++) {
			if(i%2==0) {
				sumeven=sumeven+i;
				
			} else {
				sumodd=sumodd+i;
			}
			
		}
		System.out.println(sumeven);
		System.out.println(sumodd);
		
		
		
		
	}

}
