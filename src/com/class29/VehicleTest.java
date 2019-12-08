package com.class29;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle vehicle=new BMW();
		vehicle.drive();
		vehicle.speed();
		vehicle.start();
		vehicle.stop();
		// vehcle.breaking(); not acceccible !!! breakig(); abstract in Car class!!!
		
		System.out.println("__________");
		Car car=new BMW();
		car.drive();
		car.speed();
		car.start();
		car.stop();
		car.breaking();
		
	}

}
