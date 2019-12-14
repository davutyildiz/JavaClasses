package com.class35;

import java.util.HashMap;

public class Task {
public static void main(String[] args) {
	HashMap<Integer, String> fl=new HashMap<>();
	fl.put(1, "Google");
	fl.put(2, "Facebook");
	fl.put(3, "Twitter");
	fl.put(4, "Syntax");
	fl.put(5, "Dell");
	fl.put(6, "Apple");
	fl.put(7, "Samsung");
	System.out.println(fl);
	int Nfloor=fl.size();
	System.out.println(Nfloor);
	fl.put(4, "Cisco");
	System.out.println(fl);
	fl.remove(7);
	System.out.println(fl);
	
}
}
