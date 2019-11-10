package com.class16;

public class IQ7 {

	public static void main(String[] args) {
		/*Write a java program to check whether a given number is prime or not?
		 * 
		 */
		
		// take range of numbers from 1 to 100 and print all prime numbers
		
		int num=5;
		boolean isPrime=true;
		if(num==0 || num==1) {
			isPrime=false;
		}
		else {
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				//System.out.println(" number "+num +"is not prime");
				isPrime=false;
				break;
			}
			
		}
		}
		
		if (isPrime) {
			System.out.println(num+" is a Prime number");
		}else {
			System.out.println(num+" is Not a Prime number");
		}
		
	}

}
