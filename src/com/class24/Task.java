package com.class24;

public class Task {
 public Task() {
	System.out.println("I am public sonstructor");
}
 Task(String str) {
		System.out.println("I am default sonstructor ");
	}

 protected Task(int num) {
		System.out.println("I am protected sonstructor ");
	}
 private Task(int num,int num2) {
		System.out.println("I am protected sonstructor ");
	}
 public static void main(String[] args) {
	Task obj=new Task();
	Task ob1=new Task(2);
	Task ob2=new Task(4,6);
	Task ob3=new Task("Some thing");
}
 
 
}
