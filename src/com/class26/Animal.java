package com.class26;

public class Animal {

	public void sleep() {
		System.out.println("Animals sleep");
	}
	public void eat() {
		System.out.println("Animal eat");
	}
}

class Cat extends Animal{
	public void sleep() {
		System.out.println("Cat sleep all day");
	}
	public void meow() {
		System.out.println("I meiw when U am hungry");
	}
	public void eat() {
		System.out.println(" Cat eat mouse");
	}

}