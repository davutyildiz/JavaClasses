package com.class28;

public class DeviceTest {

	public static void main(String[] args) {
		Apple apple=new Apple("Iphone ", "11Pro");
		System.out.println(apple.deviceType+" "+apple.name);
		System.out.println("_____________________________");
		Apple apple1=new Apple("Ipad ", "12Pro");
		System.out.println(apple1.deviceType+" "+apple1.name);
		System.out.println("_____________________________");
		
	}

}
