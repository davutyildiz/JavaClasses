package com.class7;

public class Task {

	public static void main(String[] args) {
		/*Create a boolean variable workDay and assign true 
		 * create int variable day and assign it to 1
			As long as it is workDay print “I need a day off” and increase day.
			Once day is 6 or 7 print “I do not need a day off any more”
			
			
		// the way I solve it
		  	boolean workday=true;
		int a=1;
		while(a<6) {
			System.out.println("I need a day off");
			a++;
		}
		System.out.println("I do not need a day off any more");
		 */
		
		// the way instructor solve it
		boolean workDay=true;
		int day=1;
		while(workDay) {
			if(day==6) {
				workDay=false;
				System.out.println("I do not need a day off");
			}else {
				System.out.println("I need a day off");
			} day++;
		}
			
	}

}
