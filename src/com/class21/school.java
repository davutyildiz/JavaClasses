package com.class21;

public class school {
	public static void main(String[] args) {
		Student student1=new Student();
		// assigning instance variable
		student1.studentName="Eric";
		student1.GPA=3.95;
		student1.school="Syntax";
		
		Student student2=new Student();
		student2.studentName="Jamie";
		student2.GPA=3.90;
		student2.school="Syntax";
		
		student1.displayInfo();
		student2.displayInfo();
		
		
		int hours=3;
		student1.study(3);
	
		
		
		
	}

}
