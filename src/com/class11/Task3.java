package com.class11;

public class Task3 {

	public static void main(String[] args) {
		// Create a 2D array of integer type with 3 rows and 4 columns
		//and print all values of the whole array.

		int[][] numbers= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		for (int i=0; i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j]+" ");
			}System.out.println();
		}
		
		System.out.println("**********");
		// Create a 2D array or integer type where you will store 
		//odd and even numbers in 3 rows and 4 columns. 
		//Develop a program which will identify/print the even numbers only.
		
		int[][] aray= {
                {13,23,44,27},
                {67,87,90,77},
                {56,43,67,21}
        };
        for(int[] nums: aray) {
            for(int even:nums) {
                if(even%2==0) {
                    System.out.print(even+" ");
            }
            }System.out.println();
        }
		
		
		System.out.println("*********");
		//Create a 2D array or integer type and store numbers in 3 rows and 3 columns. 
		//Print the sum of all numbers.
		
		
		
		int[][] array= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		int sum=0;
		for (int i=0; i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sum=sum+array[i][j];
				//System.out.print(sum);
			}System.out.println();
		}
		System.out.println("The sum of all element of array is "+sum);
	}

}
