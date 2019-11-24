package com.class23;

public class CarTest {

	public static void main(String[] args) {
		
//		Car.make="Toyota";
//		Car car1=new Car();
//		car1.model="Camry";
//		car1.color="Pink";
//		car1.speed=180;
//		car1.doors=2;
//		car1.getDetails();		
//		Car car2=new Car();
//		car2.model="Corolla";
//		car2.color="Bule";
//		car2.speed=130;
//		car2.doors=4;
//		car2.getDetails();
//		
//		Car car3=new Car();
//		car3.model="Prius";
//		car3.color="Green";
//		car3.speed=120;
//		car3.doors=4;
//		car3.getDetails();
		System.out.println("_________________");
		BetterCar.make="Toyota";
		BetterCar betterCar1=new BetterCar("Corolla", "White", 120, 4);
		betterCar1.getDetails();
		
	}

}
