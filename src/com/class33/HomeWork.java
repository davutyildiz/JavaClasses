package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeWork {

	public static void main(String[] args) {
		/* Create an arraylist of cars and retrieve all the values
		 * using 3 different ways
		 */
		List<String> car=new ArrayList<>();
		//ArrayList<String> car=new ArrayList<>();
		car.add("Nissan");
		car.add("Toyota");
		car.add("Honda");
		car.add("BMW");
		System.out.println("_________First Way________");
		for(String cars:car) {
			System.out.println(cars);
		}
		System.out.println("_________Second Way________");
		for(int i=0; i<car.size();i++) {
			System.out.println(car.get(i));
		}
		
		System.out.println("_________Third Way________");
		Iterator<String> it=car.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	

}
