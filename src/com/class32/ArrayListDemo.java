package com.class32;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	ArrayList<String>arrayList=new ArrayList<String>();
	//to store values inside your collection
	arrayList.add("John");
	arrayList.add("Jane");
	arrayList.add("Jack");
	// to retrive the value from arrayList
	System.out.println(arrayList.get(1));
	System.out.println("______________________");
	// add more values
	arrayList.add("James");
	arrayList.add("John");
	arrayList.add("Jane");
	arrayList.add("Rodin");
	// how many elements inside the arrayList
	int size=arrayList.size();
	System.out.println(size);
	System.out.println("______________________");
	// creating an object of  ArrayList that will hold numberic values
	ArrayList<Integer>numArrayList=new ArrayList<>();
	numArrayList.add(100);
	numArrayList.add(200);
	numArrayList.add(300);
	// update the value
	numArrayList.set(0, 1000);
	System.out.println(numArrayList);
	System.out.println(numArrayList.get(2));
	System.out.println("______________________");
	
	int size1=numArrayList.size();
	System.out.println(size1);
	
	System.out.println("______________________");
	// int num=control or counter--> controls# of iterations for the loop
	for(int num=0; num<numArrayList.size(); num++){
		System.out.println(numArrayList.get(num));
	}
	System.out.println("______________________");
	for(Integer number:numArrayList) {
		System.out.println(number);
	}
	}

}
