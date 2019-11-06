package com.class10;

public class ArrayForLoop {

	public static void main(String[] args) {
		char [] grade=new char[7];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		grade[6]='A';
		System.out.println(grade[1]);
		
		// 2 way 
		char [] grades={'A','B','C','D','E','F','A'};
		int a=2;
		System.out.println(grades[a]);
		System.out.println("-----------");
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
		}
		
		
		String[] animals= {"Cat","Dog","cow","Snake","Elephant"};
		int size=animals.length;
		for(int i=0; i<size; i++) {
			System.out.println(animals[i]+" ");
		}
		
		// create an array to store 5 double values, print all elements in 1 line
		double [] array= {1.10, 2.10, 3.10,4.10,5.10};
		int legt=array.length;
		for(int i=0; i<legt; i++) {
			System.out.print(array[i]);
		}
		
		

	}

}
