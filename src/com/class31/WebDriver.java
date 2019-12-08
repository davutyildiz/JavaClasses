package com.class31;

interface TakesScreenshot{
	//public static final
	 String $FILE_EXTENSION=".png";
	void takesScreen();
	static void takeSelfie() {
		System.out.println("I am defined static method of TakesScreens interfece");
	}
	default void takePictures(){
		System.out.println("I am default defined method of TakesScreenshot interface");
	}
}
interface Application{
	void applicationTest();
}
public interface WebDriver extends TakesScreenshot{
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
}
abstract class Browser{
	String name;
	public abstract void refresh();
}



 class FireFoxDriver extends Browser implements WebDriver,Application{
	@Override
	public void openBrowser() {
		System.out.println("Open Fire Fox Browser");
	}
	@Override
	public void closeBrowser() {
		System.out.println("Close Fire Fox Browser");		
	}
	@Override
	public void maximizeWindow() {
		System.out.println("Maximize Window in FireFox Browser");
	}
	@Override
	public void findElement() {
		System.out.println("Find an element in Fire Fox Browser");
	}
	@Override
	public void refresh() {
		System.out.println("Refresh firefox Browser");
		
	}
	@Override
	public void takesScreen() {
		System.out.println(" Takes ScreenShot in Firefox");
		
	}
	@Override
	public void applicationTest() {
		System.out.println("Application test in firefixbrowser");
		
	}
}
 class ChromeDriver extends Browser implements WebDriver,Application {
	@Override
	public void openBrowser() {
		System.out.println("Open Chrome Browser");
	}
	@Override
	public void closeBrowser() {
		System.out.println("Close Chrome Browser");		
	}
	@Override
	public void maximizeWindow() {
		System.out.println("Maximize Window in Chrome Browser");		
	}
	@Override
	public void findElement() {
		System.out.println("Find an element in Chrome Browser");		
	}
	@Override
	public void refresh() {
		System.out.println("Refresh Chrome Browser");
		
	}
	@Override
	public void takesScreen() {
		System.out.println(" Takes ScreenShot in Chrome");
	}
	@Override
	public void applicationTest() {
		System.out.println("Application test in Chrome browser");
		
	}
}
