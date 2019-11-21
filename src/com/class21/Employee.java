package com.class21;

public class Employee {
	static String CEO;
//static String CEO ="Suamir";
int eID, salary;

void printInfo() {
	System.out.println("Employee "+eID+ " and  salary is: "+ salary+ " CEO is: "+ CEO);
}

public static void main(String[] args) {
	 Employee.CEO="Suamir";
 Employee emp1= new Employee();

 emp1.eID=123456790;
 emp1.salary=100000;

 
 emp1.printInfo();
 
 Employee emp2= new Employee();
 emp2.eID=1234;
 emp2.salary=500000;
 
 emp2.printInfo();
 
 

}


}


