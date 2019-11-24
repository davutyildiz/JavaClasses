package com.class24;

public class ThisKeyWord {
int a , b;

public ThisKeyWord(int a, int b) {
	this.a=a;
	this.b=b;
}
public ThisKeyWord() {
	System.out.println("I am non argument constructor");
}
public void sum(int a, int b) {
	System.out.println("The sum of the local parameters is " +(a+b));
	System.out.println("The sum of instance variable is "+(this.a+this.b));
}
public void sayA() {
	System.out.println(a);
}
public void sayB() {
	System.out.println(b);
}
public void SayAndB() {
	this.sayA();
	sayA();// complier adds this aitomatically--> this.sayB()
}

public static void main(String[] args) {
	ThisKeyWord total=new ThisKeyWord(3,4);
	total.sum(1, 2);
	
	System.out.println("____________");
	
	ThisKeyWord obj=new ThisKeyWord();// non argument constructor call .
	obj.sum(100,200);
	
	System.out.println("_____________");
	total.sayA();
	total.sayB();
	total.SayAndB();
	
}

}
