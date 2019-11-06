package com.class14;

public class IQ8 {

	public static void main(String[] args) {
		// Write a Java Program to print first 10 numbers of Fibonacci series.
		int[] Fb=new int[11];
		
		Fb[0]=1;
		Fb[1]=1;
		System.out.println(Fb[0]);
		for(int i=1; i<10; i++) {
			Fb[i+1]=Fb[i-1]+Fb[i];
			System.out.println(Fb[i]);
		}

	}

}
