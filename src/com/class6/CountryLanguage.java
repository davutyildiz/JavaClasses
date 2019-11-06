package com.class6;

import java.util.Scanner;

public class CountryLanguage {

	public static void main(String[] args) {
		/*Ask user to enter their country and capture it.
		 * Once values are captured print which language user speaks.
		 */
		Scanner scan=new Scanner(System.in);
		String country, language;
		System.out.println("Please enter country name");
		country=scan.nextLine();
		language=null;
		
		switch(country) {
		case "USA":
			language="English";
			break;
		case "India":
			language="Indian";
			break;
		case "Russia":
			language="Russian";
			break;
		case "Kurdistan":
			language="Kurdish";
			break;
			default:
				language="Invalid country!";
				break;
		
		
		} System.out.println(country+" speak "+language);
		
 
		
	}

}
