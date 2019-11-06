package com.class5;

public class NestedIfRecap {
	
	// we want to know that sing in buttom is there on screen . check it with automation

	public static void main(String[] args) {
		boolean isDisplayed=true;
		String buttonText="Sign In";
		
		if (isDisplayed) {
			System.out.println("Button is displayed");

		if(buttonText.contentEquals("Sign In")) {
			System.out.println("Test case pass");
		} 
		}
		else {
			System.out.println("Button is not display");
			
		}

	}

}
