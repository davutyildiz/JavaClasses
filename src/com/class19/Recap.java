package com.class19;

public class Recap {
	void sum(int num1, int num2) {
		int c=num1+num2;
		System.out.println("The sum of 2 number is ="+c);
	}
	
	// create method to display hello 5 times
	
	void sayHello(int times) {
		for(int i=0; i<times;i++) {
			System.out.println("hello");
		}
	}
	// create method to say somthing # number of times
	
	void saySomething(String word, int times) {
		for(int i=0; i<times; i++ ) {
			System.out.println(word);
		}
	}
	
	public static void main(String[] args) {
	Recap obj=new Recap();
	obj.sum(10, 20);  
	obj.sayHello(1);
	obj.saySomething("bye", 4);
}
}
