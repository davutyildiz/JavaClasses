package com.class9;

public class Pattern2 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
  System.out.println("----------------");
  
  for (int i=1; i<=5; i++) {
	  for(int j=1;j<=i; j++) {
		  System.out.print(j);
	  }System.out.println();
  }
  System.out.println("----------------");
  
  for (int i=1; i<=9; i++) {
	  for(int j=1;j<=i; j++) {
		  System.out.print(i);
	  }System.out.println();
  }
  System.out.println("----------------");
  
  for (int i=9; i>=1; i--) {
	  for(int j=1;j<=i; j++) {
		  System.out.print(i);
	  }System.out.println();
  }
  System.out.println("----------------");
  for (int i=9; i>=1; i--) {
	  for(int j=1;j<=i; j++) {
		  System.out.print(j);
	  }System.out.println();
  }
  
	}

}
