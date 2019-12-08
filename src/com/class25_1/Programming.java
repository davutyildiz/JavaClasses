package com.class25_1;

public class Programming {
	
	public void info() {
		System.out.println("I love programming language");
	}
	public void info(String str) {
		System.out.println("I love "+str);
	}
	
	public static void info(int num1) {
		System.out.println("I am static method with one parameter");
	}
	public static void info(int num1, double num2) {
	System.out.println("I am static method with two parameters");
	}
	public static void info(double num1, double num2) {
		System.out.println("I am static method with two double parameter");
	}
	private void info(double num1) {
		System.out.println("I am private method with a double  parameter");
	} 
	private void info(double num1, double num2, int num3) {
		System.out.println("I am private method with 3 parameter two double one int");
	}
	private void info(String str, String str1, int num1) {
		System.out.println(" I am private 3 parameters and two string one int");
	}
	public static void main(String[] args) {
		Programming obj=new Programming();
		obj.info();
		obj.info("Java");
		obj.info(2.6, 3.2, 3);
	}
}