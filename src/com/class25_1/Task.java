package com.class25_1;

public class Task {
	
	public int calculate(int a,int b) {
		int Area=a*b;
		System.out.println(Area);
		return Area;
	}
	public int calculate(int a) {
		int area=a*a;
		System.out.println(area);
		return area;
	}
public int calculate(int a,int b,int c) {
	int volume=a*b*c;
	System.out.println(volume);
	return volume;
}
	public static void main(String[] args) {
		Task obj=new Task();
		obj.calculate(2, 3);
		obj.calculate(2);
		obj.calculate(2, 3, 4);
		
	}
}
