package com.class31;
/*We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A 
 * and in four subjects (each out of 100) by student B. Create class ‘Marks’ with an
 * abstract method ‘getPercentage’. It is inherited by classes ‘A’ and ‘B’ each having a method 
 * with the same name which returns the percentage of the students. The constructor of student A 
 * takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. 
 * Test your code
 */
abstract class Marks{
	public abstract double getPercentage();

}
class StudentA extends Marks{
	double math;
	double biology;
	double geography;
	StudentA(double math, double biology, double geography){
		this.math=math;
		this.biology=biology;
		this.geography=geography;
	}
	@Override
	public double getPercentage() {
		double average=(math+biology+geography)/3;
		return average;
	}
}

class StudentB extends Marks{
	double math;
	double biology;
	double geography;
	double science;
	StudentB(double math, double biology, double geography, double science){
		this.math=math;
		this.biology=biology;
		this.geography=geography;
		this.science=science;
	}
	@Override
	public double getPercentage() {
		double average=(math+biology+geography+science)/4;
		return average;
	}
}


public class StudentTest {
	public static void main(String[] args) {
		StudentB b=new StudentB(90,93,80,99);
		double average=b.getPercentage();
		System.out.println(average);
		
		StudentA a=new StudentA(70,93,80);
		double average1=a.getPercentage();
		System.out.println(average1);
		
	}

}
