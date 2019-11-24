package com.class24;

public class Student {
/*Write program as a Student class that has 
*instance variables name and address. 
*Create a constructor that will initialize those variables.
*Print name & address of given student by the displayInfo method.*/
	public String name;
public  String address;
	
	Student(String name, String address){
		this.name=name;
		this.address=address;		
	}
	public void displayInfo() {
		System.out.println("Student name is "+ name +" and address is "+address);
	}
public static void main(String[] args) {
	Student s1=new Student("Ali", "NewYork");
	s1.displayInfo();
	
	Student s2=new Student("Jonh", "NewJersey");
	s2.displayInfo();
	
}
}
