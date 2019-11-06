package com.class11;

import java.util.Arrays;

public class Task {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it.
		//Using 2 different loops print all values from the array.
		
				String[] array={"BMV","HONDA","CADILLAC","WW","CHWY","FERRRARI"};
				for(int i=0; i<array.length; i++) {
				System.out.println(array[i]);
				}
				
				// Create an array on integers and calculate the sum of all elements in an array.
				
				int[] array1={10,20,30,40,50,60,70,80,90,100};
				int sum=0;
				for(int i=0; i<array1.length; i++) {
					sum=sum+array1[i];
					
				}
				System.out.println(sum);
				
				
				//Create an array of countries. While retrieving all values from 
				//an array print capital for each country. (use 2 different loops).
				

				String[] countries= {"Canada", "India", "USA"};
				for(String getCountry:countries) {
					if(getCountry.equals("USA")) {
						System.out.println("The capital is Wahington DC");
					}
					else if(getCountry.equals("Canada")) {
						System.out.println("The capital is Ottowa");
					}
					else if(getCountry.equals("India")) {
						System.out.println("The capital is New Dehli");
					}
				}
				
				
				// 2. way
				
				//String[] Country= {"Canada", "India", "USA"};
				//for(int i=0; i<Country.length; i++) {
				//	if(String[i].equals("USA")){
				//		System.out.println("Washinton DC");
				//		}
				//}
				
				
				int[] numbers= {123,34,15,66,99};
		        
		        for(int i:numbers) {
		            System.out.print(i+" ");
		        }
		        
		        System.out.println();
		        System.out.println("*****");
		        
		        
		        Arrays.sort(numbers);
		        for(int i:numbers) {
		            System.out.print(i+" ");
		        }
				
				
	}

}
