package com.class24;

public class ThisWithConstructor {
	ThisWithConstructor(){
		System.out.println("I am non argumnet constructor");
	}
	ThisWithConstructor(String str,String str2){
		this(str);// this(); always MUST be a first statement
		System.out.println("I am constructor with 2 arguments ");
	}
	ThisWithConstructor(String str){
		this();// used to call current class constructor
		System.out.println("I am constructor with 1 argument");
	}
	public static void main(String[] args) {
		ThisWithConstructor obj=new ThisWithConstructor("Hello");
		// can we execute 2 constructors when creating an object?
		// yes= it can be achived using this()
		// this type of constructor calls is known as CONSTRUCTORS CHAINING
		ThisWithConstructor obj1=new ThisWithConstructor("Hello", "Bye");
	}
	
}
