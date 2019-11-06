package com.class8;

public class BreakAndContinue {

	public static void main(String[] args) {
		// break keyword breaks/exit the loop

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("I am outside of the loop");

		System.out.println("@@@@@@@@@@@@@@@@@@@@");
		// continue- it will skip CURRENT iteration

		for (int i = 1; i <= 5; i++) {
			if (i == 2) { // skip 2
				continue;
			}
			System.out.println(i);
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@");
		for (int i = 1; i <= 5; i++) {
			if (i == 2 || i == 3) { // skip 2 and 3
				continue;
			}
			System.out.println(i);
		}
		
		// I want to print numbers from 1 to 20 except 5,6,and 7
		
		for(int i=1; i<=20; i++) {
			if(i==5 || i==6 ||i==7) { // skip 5,6,7  or you can use if(a>=5 && a<=7) range
				continue;
			}
			System.out.println(i);
		}
		
		
	}

}
