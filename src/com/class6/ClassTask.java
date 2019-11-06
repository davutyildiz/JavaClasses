package com.class6;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		/* ask user to enter the month they were born
		 * base on the month define the season
		 * if user is born in jan,feb, dec---> winter
		 * if march, apri, may ---> spring
		 * if jun, jul, aug ---> summer
		 * if sep, oct, nov --->
		 * other wise ---> unkown
		 * at the end of the program
		 *  "you were born in_____"
		 */

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your month of birth");
		String month=input.nextLine();
		String Season;
		if (month.equals("january") || month.equals("february") || month.equals("december")) {
			Season="Winter";
		} else if (month.equals("march") || month.equals("april") || month.equals("may")) {
			Season="Spring";
		} else if (month.equals("june") || month.equals("july") || month.equals("august")) {
			Season="Summer";
		}else if (month.equals("september") || month.equals("october") || month.equals("november")) {
			Season="Fall";
			
		} else {
			Season="Unknown";
		}
		System.out.println("you were born in "+Season);
		
		
		
		
		
	}

}
