package com.class21;

public class Student {
 public String studentName;
 double GPA;
 public String school;
 
 public void displayInfo() {
	 System.out.println(studentName+ " attanding "+school+" has a GPA "+GPA);
 }
 protected void study(int hours) {
	 int localVariable=4;
	 System.out.println(studentName+" studying for "+hours+ " hours");
 }
 
}
