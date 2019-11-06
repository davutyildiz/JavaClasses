package com.class8;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Print number from 1 to 50 except those are divisible by 3
		
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		} 
		
		
		
		Scanner scan = new Scanner(System.in); 
		
		for(int i=1; i<=10; i++) {
			System.out.println("Aplly credit card");
			String card=scan.nextLine();
			if(card.equals("yes")) {
				break;
			}
			
		}
		
		scan.close();
		
	
		
	}
}


