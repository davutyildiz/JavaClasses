package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeWork3 {

	public static void main(String[] args) {
		/*Create an arrayList of drinks.
		 * if any drinks has letter "a" ot "e" replace it with water
		 */
		List<String> drinks=new ArrayList<>();
		drinks.add("Cola");
		drinks.add("milk");
		drinks.add("juice");
		drinks.add("coefee");
		drinks.add("tea");
		
		drinks.set(0, "water");
		System.out.println(drinks);
		
		for(int i=0; i<drinks.size();i++) {
			if(drinks.contains("a")||drinks.contains("e")) {
				drinks.set(i,"water");
			}
		}
		System.out.println(drinks);
		
		
//		Iterator<String> drk=drinks.iterator();
//		while(drk.hasNext()) {
//			if(drk.next().con)
//		}
//		

	}

}
