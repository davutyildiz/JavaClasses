package com.class17;

public class ObjectOfPhoneClass {

	public static void main(String[] args) {
		Phone Iphone=new Phone();
		Iphone.color="Blue";
		Iphone.model="S";
		Iphone.size=10;
		Iphone.Snap();
		Iphone.record();
		Iphone.call();
		
		Phone Android=new Phone();
		Android.color="Blue";
		Android.size=10;
		Android.model="M";
		Android.Snap();
		Android.record();
		Android.call();
		
		
		Phone Nokia=new Phone();
		Nokia.color="Blue";
		Nokia.size=10;
		Nokia.model="XL";
		Nokia.Snap();
		Nokia.record();
		Nokia.call();
		System.out.println("I have Iphone "+Iphone.model+" "+Iphone.size+" "+Iphone.color);
		System.out.println("I have Nokia "+Nokia.model+" "+Nokia.size+" "+Nokia.color);
	}

}
