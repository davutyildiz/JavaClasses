package com.class29;

public class PhoneTest {

	public static void main(String[] args) {
		// You cannot driectly create an object of an abstract class
		// Phone phone=new Phone(); Complier error
		
		// we can create it indirectly
		Phone phone=new iPhone();
		phone.makeCall();
		phone.sendText();
		phone.takePictures();
		phone.playGames();


	}

	
}
