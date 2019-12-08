package com.class26;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		// creating an object of parent class
		Animal animal=new Animal();
		animal.sleep();
		animal.eat();
		
		System.out.println("_____________");
		/// Creating an object of child class
		Cat cat=new Cat();
		cat.eat();// from parent
		cat.meow(); // from child
		cat.sleep();// from child
		System.out.println("_____________");
		// widening
		double d=90;
		// narrowing
		int i=(int)1.99;
		
		
		
		// Non Primitive Typecasting
		// Widening--> creating an object of the class
		//				and giving reference to the Parent class
		Animal obj=new Cat();
		
		// narrowing
		// Cat obj2=new Animal(); --> Cannot convert from Animal to Cat
		obj.eat();// from parent
		obj.sleep();// from child--> run time Polymorphsim
		// obj.meow(); compiler error--> method wont available
	}

}
