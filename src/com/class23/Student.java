package com.class23;

public class Student {
	String name;
	int grade1, grade2,grade3;
	
	
	Student(String studentName, int gr1, int gr2, int gr3){
		name=studentName;
		grade1=gr1;
		grade2=gr2;
		grade3=gr3;
	}
	public void calculateAverage() {
		int average=(grade1+grade2+grade3)/3;
		System.out.println("Student "+name+" has an average "+average);
	}
public static void main(String[] args) {
	Student student1=new Student("John", 60, 90, 100);
	student1.calculateAverage();
	
	Student student2=new Student("Ali", 90, 85, 99);
	student2.calculateAverage();
	
	Student student3=new Student("Rodin", 90, 98, 99);
	student3.calculateAverage();
	
	Student student4=new Student("Zeren", 90, 100, 99);
	student4.calculateAverage();
	
	Student student5=new Student("rojin", 84, 95, 98);
	student5.calculateAverage();
	
}

	
}
