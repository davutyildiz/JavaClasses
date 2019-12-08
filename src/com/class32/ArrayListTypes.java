package com.class32;

import java.util.ArrayList;

public class ArrayListTypes {

	public static void main(String[] args) {
		// non generic arraylist
		ArrayList alist=new ArrayList();
		alist.add("hello");
		alist.add(10);
		alist.add(11.10);
		alist.add(true);
		alist.add('c');
		alist.add(-1);
		
		System.out.println(alist);
		
		System.out.println("_____________");
		// generic

		ArrayList<Double>list=new ArrayList<Double>();
		list.add(110.23);
		list.add(10.90);
		System.out.println(list);

	}

}
