package com.class10;

public class Task2AnotherWay {

	public static void main(String[] args) {
		// Create an array of countries. While retrieving all values 
		// from an array print capital for each country.
		String [] Country= {"Turkey","Russia","Usa","Albenia","France"};
		for(int i=0; i<Country.length; i++) {
			switch(Country[i]) {
			case "Turkey":
				System.out.println("Ankara");
				break;
			case "Russia":
				System.out.println("Moscow");
				break;
			case "Usa":
				System.out.println("DC");
				break;
			case "Albenia":
				System.out.println("Tirana");
				break;
			case "France":
				System.out.println("Paris");
				break;
				default:
			
			}
		}

	}

}
