package com.class11;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		// Declare 2D Array
		int[][] array= new int[3][4];
		
		// 1st row
		array[0][0]=44;
		array[0][1]=80;
		array[0][2]=33;
		array[0][3]=20;
		// 2nd row
		array[1][0]=10;
		array[1][1]=5;
		array[1][2]=40;
		array[1][3]=30;
		// 3 rd row
		array[2][0]=10;
		array[2][1]=9;
		array[2][2]=70;
		array[2][3]=80;
		System.out.println(array[1][3]);	
		System.out.println(array[2][1]);
		
		for(int i=0; i<3;i++) {
			for (int j=0; j<4; j++) {
				System.out.print(array[i][j]+" ");
			}System.out.println();
		}
		System.out.println("***********");
		int [][] numbers= {
				{8,7,5,3,8},
				{1,5,6,4,9},
				{3,6,8,0,7}
		};
		System.out.println(numbers[2][4]);
		// to identify the numbers of Rows
		System.out.println("The numbers of rows "+numbers.length);
		// to identify the numbers of the columns// elements
		System.out.println("The numbers of columns "+numbers[1].length);

	}

}
