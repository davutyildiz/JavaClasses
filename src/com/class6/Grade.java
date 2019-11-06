package com.class6;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		/*Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average,
  		D-Bad, any other grade --> Not Acceptable. At the end your program should print which grade was
  		entered by a user with explanation.
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a grade");
		char grade=scan.next().charAt(0);
		String explanation;
		
		switch(grade) {
		case 'A':
			explanation="Excelent";
			break;
		case 'B':
		explanation="Good";
		break;
		case 'C':
			explanation="Average";
			break;
		case 'D':
			explanation="Bad";
			break;
			default:
				explanation="Not Acceptable";
			break;
				
			
		} System.out.println(grade+" "+explanation);
		
	}

}
