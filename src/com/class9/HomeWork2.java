package com.class9;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		/*Write a guessing game where the user has to
		 * guess a secret number between 1 and 20.
		 * After every guess input, the program tells 
		 * the user whether their number was too large or too small.
		 * The program will keep asking the user to enter 
		 * the number until he finds the correct number.
		 * When the correct answer is found the system 
		 * should display “Congratulations!!. You got it!”
		 */
		Scanner scan=new Scanner(System.in);
		int secretNumber=17;
	    int num;
	    
	    
	    for(int i=1; i<=20; i++) {
	        System.out.println("guess a secret number ranging from 1-20");
	        num=scan.nextInt();
	        if(num<17) {
	            System.out.println("number is too small ");
	            
	            
	        }else if(num>17) {
	            System.out.println("number is too  large");
	        }else if(num==secretNumber) {
	            System.out.println("congrats! you found the right number");
	            break;
	        }
	    }
	    
		
	}

}
