package com.class10;

public class Task1 {

	public static void main(String[] args) {
		// Create an array of chars and store grades into it: A,B,C,D,E,F. 
		// Then print a grade B (use 2 different ways of creating an array)
		// 1 way
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
		System.out.println(grades[1]);
		// 2 nd task		
		String [] names= {"Ali", "Veli","Aziz","Deli","Zirdeli","Davut"};
		System.out.println(names[5]);
		
		// 3 th task
		// Create an array of words: Java, Saturday, day, coding, 
		// is. Print the following sentence using element of array:
		//“Saturday is Java coding Day”.
		
		String [] array= {"Java","Saturday","day","coding","is"};
		System.out.println(array[1]+" "+array[4]+" "+array[0]+" "+array[3]+" "+array[2]);

	}

}
