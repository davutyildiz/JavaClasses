package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your class day: ");
		String day=scan.nextLine();
		// String day1=day.toLowerCase();
		if(day.trim().equalsIgnoreCase("saturday")) {
			System.out.println("Saturday is your Java Class");
		} else if(day.trim().toLowerCase().equals("sunday")) {
			System.out.println("Sunday is your Git Class");
		} else if(day.trim().toUpperCase().equals("TUESDAY")) {
			System.out.println("Tuesday is your SDLC Class");
		}else if(day.trim().equals("thursday")) {
			System.out.println("Thursday is your SDLC Class");
		}else {
			System.out.println("In valid day");
		}
		scan.close();

	}

}
