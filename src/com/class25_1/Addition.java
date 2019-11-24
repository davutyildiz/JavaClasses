package com.class25_1;

public class Addition {
	// Polymorphism
	// method overloding:
	// 1 way:  by passing different amount of parameter
	public void add(int num1, int num2) {
		System.out.println("The sum of "+(num1+num2));
	}
	
	public void add(int num1, int num2, int num3) {
		System.out.println("The sum of "+(num1+num2+num3));
	}
	// 2 way: having different tpyes of parameters
	public void add(double num1, double num2) {
		System.out.println(num1+num2);
	}
	public void add(int num1, double num2) {
		System.out.println(num1+num2);
	}
	

	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.add(12,13);
		obj.add(12,13,14);
		obj.add(12.0,11.0);
		obj.add(12, 11.0);
		
		String str="Hello";
		System.out.println(str.substring(3));
		System.out.println(str.substring(1,3));
	}
}
