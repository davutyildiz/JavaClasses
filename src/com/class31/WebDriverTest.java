package com.class31;

public class WebDriverTest {

	public static void main(String[] args) {
		WebDriver browser1=new FireFoxDriver();
		browser1.openBrowser();
		browser1.closeBrowser();
		browser1.maximizeWindow();
		browser1.findElement();
		browser1.takesScreen();
		System.out.println("________________________");
		WebDriver browser2=new ChromeDriver();
		browser2.openBrowser();
		browser2.closeBrowser();
		browser2.maximizeWindow();
		browser2.findElement();
		browser2.takesScreen();
		
		TakesScreenshot ts=new ChromeDriver();
//		ts.openBrowser();
//		ts.closeBrowser();
//		ts.maximizeWindow();
//		ts.findElement();
		ts.takesScreen();

	}

}
