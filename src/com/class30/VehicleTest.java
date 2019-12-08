package com.class30;

public class VehicleTest {

	public static void main(String[] args) {
		BMW bmw=new BMW("7681","SUV","BMW","X3");
		BMW.displayTotal();
		Vehicle.displayTotal();
		// come from Vehicle class
		bmw.drive();
		bmw.speed();
		bmw.stop();
		// comes from Car class
		bmw.breaking();
		// comes from BMW class
		bmw.display();
		Car car=new BMW("520i","sedan","BMW","X");
		// come from Vehicle class
		car.drive();
		car.speed();
		car.stop();
		// comes from Car class
		car.breaking();
		// comes from BMW class-- Wont be avaible tp the parent
		// car.display();
		Vehicle vehicle=new BMW("768i","sedan","BMW","X5");
		// come from Vehicle class
		vehicle.drive();
		vehicle.speed();
		vehicle.stop();
		// comes from Car class
		// vehicle.breaking();
		// comes from BMW class
		// vehicle.display();
		new BMW("7681","SUV","BMW","i2");
		new BMW("7681","SUV","BMW","i3");
		new BMW("7681","SUV","BMW","i5");
		BMW.displayTotal();
		Vehicle.displayTotal();
	}

}
