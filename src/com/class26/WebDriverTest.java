package com.class26;

public class WebDriverTest {

	public static void main(String[] args) {
		ChromeDriver chrome=new ChromeDriver();
		chrome.refresh();
		chrome.open();
		System.out.println("________________");
		FireFoxDriver firefox=new FireFoxDriver();
		firefox.refresh();
		firefox.open();
		System.out.println("________________");
		// Creating object of Child class giving reference to the Parent class
		WebDriver driver=new ChromeDriver();
		driver.open();
		driver.refresh();
		System.out.println("________________");
		WebDriver driver1=new FireFoxDriver();
		driver1.open();
		driver1.refresh();
		// no access to child specific class through   parent type
	}

}
