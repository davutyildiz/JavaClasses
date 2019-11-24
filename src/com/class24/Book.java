package com.class24;

public class Book {
/*Write program as a Book class that will have 2 Constructors. 
* While creating an object make sure:
*Instance variables are being initialized Both Constructors are being executed
	 */
	public String Book1Name, Book2Name;
	
	Book(String Book1Name){
		this.Book1Name=Book1Name;
		System.out.println("Book 1 name is "+Book1Name);
	}
	Book(String Book1Name, String Book2Name){
		this.Book1Name=Book1Name;
		this.Book2Name=Book2Name;
	}
	public void displayInfo() {
		System.out.println("Book 1 name is "+Book1Name);
	}
	public static void main(String[] args) {
		Book b1=new Book("The Lord Of The Rings");
		b1.displayInfo();
		Book b2=new Book("My name is Black","The Alchemist");
		b2.displayInfo();
	}
}
