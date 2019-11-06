package com.class10;

public class Task2 {

	public static void main(String[] args) {
		// Create an array of countries. While retrieving all values 
		// from an array print capital for each country.
		String [] Country= {"Turkey","Russia","Usa","Albenia","France"};
		for(int i=0; i<Country.length; i++) {
			if(Country[i].equals("Albenia")) {
				System.out.println("Captial of Albenia is Tirana");
			} else if(Country[i].equals("Turkey")) {
				System.out.println("Captial of Turkey is Ankara");
			}else if(Country[i].equals("Usa")) {
				System.out.println("Captial of Usa is DC");
			}else if(Country[i].equals("France")) {
				System.out.println("Captial of France is Paris");
			} else {
				System.out.println("Captial of Russia is Moscow");
			}
		}

	}

}
