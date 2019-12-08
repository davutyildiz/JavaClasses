package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {
		// generic arraylist
		ArrayList<String> nameArray = new ArrayList<String>();
		nameArray.add("John");
		nameArray.add("Jane");
		nameArray.add("Jack");
		nameArray.add("Rodin");
		nameArray.add("Zeren");
		System.out.println(nameArray);

		System.out.println(nameArray.isEmpty());
		System.out.println(nameArray.contains("Ali"));
		System.out.println(nameArray.size());
		
		System.out.println("________________");
		// retrive values from an Arraylist
		// 1-way: for loop
		for(int i=0;i<nameArray.size(); i++) {
			System.out.println(nameArray.get(i));
		}
		System.out.println("________________");
		// 2-way: enhence loop
		for(String name: nameArray) {
			System.out.println(name);
		}
		System.out.println("________________");
		// 3-way: 
		Iterator<String>it=nameArray.iterator();
	}

	
	
}

