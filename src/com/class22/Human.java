package com.class22;

public class Human {
	// instance variables
	String name;
	String lastName;
	
	// static variables
	static int eyes=2;
	static int nose=1;
	static boolean brain=true;
	
	public static void main(String[] args) {
		Human human1=new Human();
		human1.name="John";
		human1.lastName="Smith";
		human1.lastName="muller";
		System.out.println("Printing static class variables");
		System.out.println(Human.eyes);// can acesses by it class name
		System.out.println(human1.nose);// can acesses by object name
		System.out.println(brain);// can accesses by its name
		
		
		Human human2=new Human();
		human2.name="Joy";
		human2.lastName="Sammy";
		
		System.out.println(human1.lastName);
		
	}

}
