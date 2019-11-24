package com.class24;

public class Test {

	public static void main(String[] args) {
		Child1 child1=new Child1();
		//System.out.println(child1.race); // static
		System.out.println(Parent.race);// static will call by its class name!
		System.out.println(child1.hairColor);
		System.out.println(child1.eyeColor);
		child1.sing();
		child1.code();
		
		Parent parent=new Parent();
		System.out.println(parent.hairColor);
		System.out.println(parent.eyeColor);
		parent.sing();
		// parent.Code(); Compiler will give error
		
		
		Child2 child2=new Child2();
		System.out.println(Parent.race);// static will call by its class name!
		System.out.println(child2.hairColor);
		System.out.println(child2.eyeColor);
		child2.sing();
		child2.playGuitar();
		
	}

}
