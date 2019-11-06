package com.class4;

public class IfElseRecap {

	public static void main(String[] args) {
		/* Class Schedule
		 *  if tuesday-->SDLC
		 *  if wednesday --> Java review
		 *  if thursay --> SDLC
		 *  if saturday--> Java coding
		 *  if sunday ---> my favorite Java coding
		 */
		int day=2;
		if (day==2) {
			System.out.println("SDLC Class");
		}
		else if (day==3) {
			System.out.println("Java review");
		}
		else if (day==4){
			System.out.println("SDLC Class");
		}
		else if (day==6) {
			System.out.println("Java coding");
		}
		else if (day==7) {
			System.out.println("my favorite Java Class");
		}
		else {
			System.out.println("There is no class at school");
		}
			

	}

}
