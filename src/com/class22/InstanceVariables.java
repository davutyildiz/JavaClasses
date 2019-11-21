package com.class22;

public class InstanceVariables {
	
	String name="Samir"; // instance variable
	
	
	public static void main(String[] args) {
		String name="Burcu";
		System.out.println(name);
		
		InstanceVariables obj=new InstanceVariables();
		System.out.println(obj.name);
		// changing value of the instance variable
		obj.name="Smith";
		System.out.println(obj.name);
		// creating a new instance of Class InstanceVariables
		InstanceVariables obj1=new InstanceVariables();
		// value will be Samir
		System.out.println(obj1.name);	
	}

}
