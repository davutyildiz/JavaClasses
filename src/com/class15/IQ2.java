package com.class15;

import java.util.Arrays;

public class IQ2 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array? 
		//Maximum and minimum number in the array?
		int[] array= {100, -99, 433,0,1};
		// 1 easiest way
		Arrays.sort(array);
		int min=array[0];
		int max=array[array.length-1];
		System.out.println(min);
		System.out.println(max);
		
		// 2 way
		int[] myArray= {100, -99, 433,0,1};
		int largest=myArray[0];
		int smallest=myArray[0];
		for(int i=0; i<myArray.length;i++) {
			if(myArray[i]>largest) {
				largest=myArray[i];
			}
		
			 if(myArray[i]<smallest) {
				 smallest=myArray[i];
			 }
		}
		System.out.println("The smallest valu in the array is "+smallest);
		System.out.println("The largest valu in the array is "+largest);
		System.out.println("***********************");
		int[] nums= {100, -99, 433,0,1};
		int large=nums[0];
		int secondlarge=nums[0];
		for(int i=1; i<nums.length; i++) {
			if(nums[i]>large) {
				secondlarge=large;
				large=nums[i];
			} if(nums[i]>secondlarge && nums[i]<large) {
				secondlarge=nums[i];
			}
	
		}
		System.out.println("The secondlargest valu in the array is "+secondlarge);
		System.out.println("The largest valu in the array is "+large);
		
	
	}
	

}
