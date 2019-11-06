package com.class7;

public class WhileLoopPractice {

	public static void main(String[] args) {
		// How to print numbers from 1 to 20
		int i=0;
		while(i<=20) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("***************");
		
		// how to print values from 10 to 1
		int a=10;
		while(a<=1) {
			System.out.print(a);
			a--;
		}
		System.out.println("***************");
		// print values from 50 to 20
		
		int b=50;
		while(b>=20) {
			System.out.println(b);
			b--;
		}
		System.out.println("***************");
		
		// I want to print all even numbers from 1 to 20
		// 1. way- increment value by 2
		
		int z=2;
		while(z<=20) {
			System.out.println(z);
			z+=2;
		}
		System.out.println("***************");
		// 2. way using modulus
		int q=1;
		while(q<=20) {
			if(q%2==0) {
				System.out.println(q);
				
			}
			q++;
		}
		System.out.println("***************");
		
		// print only odd numbers from 50 to 100
		// print only even numbers from 100 to 1
		
		int x=51;
		while(x<=100) {
			System.out.println(x);
			x+=2;
		}
		System.out.println("---------------");
		
		int v=99;
		while(v>=1) {
			System.out.println(v);
			v-=2;
		}
	}

}
