package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeWork4 {

	public static void main(String[] args) {
		/* Create an arrayList of even numbers from 1 to 50.
		 * Using Iterator remove any numbers that is divsible by 5
		 * from that arrayList
		 * 
		 */
		// creating an Object of arrayList and referong to the List
		List<Integer>numbers=new ArrayList<>();
		for(int i=1; i<=50; i++) {
			if(i%2==0) {
				numbers.add(i);
			}
		}
		System.out.println(numbers);
		// removing number that are divisible by using Iterator
		Iterator<Integer> it=numbers.iterator();
		while(it.hasNext()) {
			if(it.next()%5==0) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}

}
