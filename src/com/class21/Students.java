package com.class21;

public class Students {
	
	String studentName;
	int studentID;
	public static int numberOfstudent;
	
	
	public static void main(String[] args) {
	
		Students std1=new Students();
		std1.studentName="Ali";
		std1.studentID=123;
		Students.numberOfstudent++;
		System.out.println("The total number o students is: "+Students.numberOfstudent);
		
		Students std2=new Students();
		std2.studentName="Veli";
		std2.studentID=103;
		Students.numberOfstudent++;
		System.out.println("The total number o students is: "+Students.numberOfstudent);

		Students std3=new Students();
		std3.studentName="Veli";
		std3.studentID=103;
		Students.numberOfstudent++;
		System.out.println("The total number o students is: "+Students.numberOfstudent);
	}
	

	
}
