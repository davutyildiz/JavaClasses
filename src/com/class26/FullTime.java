package com.class26;

public class FullTime extends Employee{
	int bonus;
	public void getpaid() {// overriding
		System.out.println("Full time Employee getPaid "+salary+" and bonus "+bonus);
	}

}
