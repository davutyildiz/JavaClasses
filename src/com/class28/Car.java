package com.class28;

public class Car {
	String make,model;
	Car(){
		System.out.println("I am non paramtere constructor");
	}
	Car(String make, String model){
		this.make=make;
		this.model=model;
	}

}
class Telsa extends Car{
	boolean autopilot;
	Telsa(){
		super();
		System.out.println("I am non paramter constructor of child class");
	}
	Telsa(String make, String model,boolean autopilot){
		super(make,model);// constructor call
		this.autopilot=autopilot;
	}
	public void displayInfo() {
		System.out.println("Car "+make+" "+model+" has an autopilot");
	}
}