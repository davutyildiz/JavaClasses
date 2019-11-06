package com.class9;

public class Pattern {

	public static void main(String[] args) {
		
for (int k=1; k<=4; k++) { // numbers of rows
	for (int l=1; l<=5; l++) {// numbers of column
		System.out.print("*");
	}System.out.println();
}

System.out.println("-----------------");

 for (int i=1; i<=9; i++) { // rows
	 for(int j=1; j<=9; j++) { //columns
		 System.out.print("#");
	 }
	 System.out.println();
 }
 System.out.println("-----------------");
 
 
 for (int i=1; i<=5; i++) { // rows
	 for(int j=1; j<=5; j++) { //columns
		 System.out.print(j);
	 }
	 System.out.println();
 }
 System.out.println("-----------------");
 for (int i=1; i<=5; i++) { // rows
	 for(int j=1; j<=5; j++) { //columns
		 System.out.print(i);
	 }
	 System.out.println();
 }
 System.out.println("-----------------");
 for (int i=1; i<=9; i++) { // rows
	 for(int j=1; j<=9; j++) { //columns
		 System.out.print(j);
	 }
	 System.out.println();
 }
 System.out.println("-----------------");
 for (int i=1; i<=5; i++) { // rows
	 for(int j=5; j>=1; j--) { //columns
		 System.out.print(j);
	 }
	 System.out.println();
 }
 System.out.println("-----------------");
 for (int i=5; i>=1; i--) { // rows
	 for(int j=1; j<=5; j++) { //columns
		 System.out.print(i);
	 }
	 System.out.println();
 }
	}

}
