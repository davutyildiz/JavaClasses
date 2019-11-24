package com.class25_1;

public class ConstuctorOverloading {
	// different amount of parameters
	ConstuctorOverloading(){
		System.out.println("I am non=argument constructor");
	}
	ConstuctorOverloading(String str){
		System.out.println("I am  cosntructor with 1 string paramaeter");
	}
	// having different type of parameters
	ConstuctorOverloading(int  num){
		System.out.println("I am  contructor with 1 parameter");
	}

}
