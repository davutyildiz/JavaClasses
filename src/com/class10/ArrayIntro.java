package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		int[] b; // 1 way  declare an array----> preferred way
		
		int c[]; // 2 way declare an array 
		
		b=new int[4]; // assigned variable/initialization it will hold 4 elements 
		
		int[] array=new int[4]; // declaretion and initialization in one line
		
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		// access value from an array
		
		System.out.println(array[2]);
		
		// let create an array that will store classes
		String[] classes=new String[4];
		classes[0]="java";
		classes[1]="SDLC";
		classes[2]="Manual Testing";
		classes[3]="GIT";
		
		System.out.println(classes[0]);
		// Today we have Java class
		System.out.println("Today we have "+classes[0]+"class");
		
		int [] nums=new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		System.out.println(nums[0]);
		// how can change 1 to 100
		nums[0]=100;
		System.out.println(nums[0]);
		System.out.println(nums[0]+nums[2]);
		
		// the size of an array is fixed
		String[] names=new String[3];
		names[0]="James";
		names[1]="Rodin";
		names[2]="Ali";
		// names[3]="Zeren";
		// System.out.println(names[3]);
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		//at com.class10.ArrayIntro.main(ArrayIntro.java:48)
	
		
		// we are putting less elements inside --> complier will give default values
		int [] numbers=new int[4];
		numbers[1]=100;
		numbers[3]=200;
		System.out.println(numbers[2]);
		// double if leave empty it will excepted as zero
		double [] number=new double[4];
		number[1]=100;
		number[3]=200;
		System.out.println(number[2]);
		
		
		
	}

}
