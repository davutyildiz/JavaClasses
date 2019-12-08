package com.class30;

public class DrivableTest {

	public static void main(String[] args) {
		Drivable obj=new Toyota();
		obj.drive();
		// Derivable.DRIVE_FAST=False --> Commpiler error
		Toyota toyota=new Toyota();
		toyota.drive();
		toyota.stop();
	}

}
