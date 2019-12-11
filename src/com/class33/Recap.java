package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {
	public static void main(String[] args) {
		// Let create Array list
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000);
		
		int size=numbers.size();
		System.out.println(size);
		System.out.println(numbers);
		// add more
		numbers.add(100000);
		
		// remove
		numbers.remove(1);
		System.out.println(numbers);
		System.out.println(size-1);
		System.out.println(numbers);
		System.out.println("________________");
		// retrive value from an arrayList
		int element=numbers.get(0);
		System.out.println(element);
		System.out.println("________________");
		// 1. for loop
		for(int i=0; i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println("________________");	
		// 2. advenced loop
			for(int num:numbers) {
				System.out.println(num);
			}
		System.out.println("________________");
		// I want to get values backward
			for(int i=numbers.size()-1;i>=0;i--) {
				System.out.println(numbers.get(i));
			}
		System.out.println("________________");
		// 3. using Iterator: we dont know how many element is there thats why we use while loop	
		// iterator is interface that helps tp iterate throug collections(List,Set,queue)	
		Iterator<Integer>iterator=numbers.iterator();
		while(iterator.hasNext()){
			int number=iterator.next();// autounboxing
			if(number%2==0) {
				System.out.println(numbers);
			}
		}
	}

}
