package com.class17;

public class ObjectOfCarClass {

	public static void main(String[] args) {
		//to create an object syntax is
		// ClassName variable=new ClassNmae();
		// Scanner scan= new Scanner(System.in);
		// String str=new String();
		
		Car car1=new Car();
		car1.make="Telsa";
		car1.model="S3";
		car1.color="Black";
		car1.year=2020;
		car1.wheels=4;
		car1.windows=5;
		car1.speed=200;
		
		
		Car car2=new Car();
		car2.make="BMW";
		car2.model="I8";
		car2.color="Purple";
		car2.year=2019;
		car2.wheels=4;
		car2.windows=5;
		car2.speed=300;
		
		
		// print feature of the car
		// I have Black Telsa
		
		System.out.println("I have "+car1.color+" "+car1.make);
		
		// I drive BMW 2019
		System.out.println("I drive "+car2.make+" "+ car2.year);
	}

}
