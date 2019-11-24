package com.class25;

public class Employee {
	public static String companyName;
	int salary;// accessible within same package
	protected int employeeId;
	private String enmployeeSsn;
	void work(){
		System.out.println(" I work in "+ companyName+" company");
	}
	void getPaid() {
		System.out.println("I get paid "+ salary);
	}

}
