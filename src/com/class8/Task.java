package com.class8;

public class Task {

	public static void main(String[] args) {
		// 1. Print numbers from 1 to 100 line with space
		for(int i=1; i<=100; i++) {
			System.out.println(i+" ");
		}//2.  Print number from 100 to 1
		for (int i=100; i>=1; i--) {
			System.out.print(i+" ");
		}
		//3.  print even numbers 20 to 1(2 ways)
		for(int i=22; i>=2; i-=2) {
			System.out.println(i);
		}
		System.out.println("***************");
		for(int i=20; i>=1; i--) {
			if(i%2==0) {
			System.out.println(i);}
		}
		System.out.println("##############");
		// 4. print odd numbers between 20 and 50 (2 ways)
		 
		for(int i=19; i<=50; i+=2) {
			 if(i%2!=0) {
			 System.out.println(i);}
		 }
		System.out.println("$$$$$$$$$$$$$$$");
		// 
		int sum=0;
		for(int i=1; i<=5; i++) {
			sum=sum+i;
		} System.out.println(sum);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%");
		int sumAll=0;
		for (int i=0; i<=20; i+=5) {
			sumAll=sumAll+i;
		} System.out.println(sumAll);
		int total=2;
		for(int y=1; y<=3; y++) {
			total=total*y;
		}System.out.println(total);
		
	}

}
