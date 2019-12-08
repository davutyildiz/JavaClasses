package com.class28;

public class CarTest {
public static void main(String[] args) {
	//Telsa telsa=new Telsa();
	Telsa telsa1=new Telsa("Telsa","S4",true);
	telsa1.displayInfo();
	System.out.println("_________Creating another object___________");
	Telsa telsa2=new Telsa("Telsa","S8",false);
	telsa2.displayInfo();
	
	
	
}
}
