 package com.class19;

public class TestAllMethods {

	public static void main(String[] args) {
		// find the largest number from 300 and 500
		// then identify is the largest number is odd?

		AllMethods obj=new AllMethods();
		int largest=obj.findLargest(300, 500);
		System.out.println(largest);
		boolean odd=obj.isOdd(largest);
		System.out.println(odd);
		String day=obj.weekDayName(6);
		//System.out.println(day);
		
		// call method weekDayName
		// if(tuesday, wednesday, thursday, saturday, sunday)
		// I am learning Java
		if(day.equals("Tuesday")||day.equals("Thursday")|| day.equals("Wednesday")||
				day.equals("Saturday")||day.equals("Sunday")) {
			System.out.println("I am lerning Java");
		}else {
			System.out.println("I am practicing Java");
		}
		
	}

}
