package com.class22;

public class StaticVsNonStatic {
// template for a students(schhol, name,grade)
	
	static String school="Syntax";
	String name;
	char grade;
	 
	
	// instance method , non static method
	void getInfo() {
		System.out.println("my name is "+ name+ "and i am goig to "
	+school+ " and my grade is "+grade);
	}
	
	// static method
	static void getInfo1() {
		System.out.println(" I am attending classes at "+school);
		// System.out.println("My name is "+name);
		// complier will give an error
		// you CANNOT access NON static members within STATIC methods
	}
	public static void main(String[] args) {
		/*accessing static members within same class
		 *  just use name for a variable or 
		 *  call method by its name only
		 * 
		 */
		System.out.println(school);
		getInfo1();
	}
	
}
