package com.class17;

public class Computer {
	// define features, attributes
	String  monitor,mouse,name, brand;
	int ram, memory,screen;
	boolean keyboard;
	
	// define behavior, actions
	void playGames() {// method header
		// method body
		System.out.println("I can play on my "+name);
	}
	void JavaCoding() {
		System.out.println("I can do Java coding on mu "+name);
	}
	void watchMovie() {
		System.out.println("I can watch movie on my "+name);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////
public static void main(String[] args) { // this main method just for executin our program
	Computer comp1=new Computer();
	comp1.brand="Apple";
	comp1.name="MacBook Pro";
	comp1.memory=250;
	System.out.println("I have "+comp1.brand+" "+ comp1.name);
	comp1.JavaCoding();
	comp1.watchMovie();
	System.out.println("---Creating 2. onject pf a computer type---");
	Computer computer2=new Computer();
	computer2.brand="Dell";
	computer2.name="420";
	computer2.memory=256;
	
	computer2.JavaCoding();
	computer2.watchMovie();
	computer2.playGames();
	System.out.println("I have "+computer2.brand+" "+computer2.name);
}
}
