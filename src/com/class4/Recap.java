package com.class4;

public class Recap {

	public static void main(String[] args) {
		int num;
		num=90;
		num-=200; // -110=90-200
		num-=110; // -220=-110-110
		num+=220;
		
		if (num>0) {
			System.out.println(num+ " is a positive number");
		}
		else if (num==0) {
			System.out.println(num+" is zero");
		}
		else {
			System.out.println(num+" is a negative number");
		}
		
	
		System.out.println("######################");
		// even or odd number
		
		int i=136;
		if (i%2==0) {
			System.out.println(i+ " is a even number");
		}
		else {
			System.out.println(i +" is a odd number");
			
		}
		
		if (i%2!=0) {
			System.out.println(i +" is a odd number");
		}
		else {
			System.out.println(i+ " is a even number");
		}
		System.out.println( " #######################");
		
		
		
	}

}
