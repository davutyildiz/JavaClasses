package com.class12;

public class FindDublicatesInArray {

	public static void main(String[] args) {
		int[] array2={2,5,4,2,8,7};{
			for (int i = 0; i < array2.length; i++) {
				for(int j=i+1; j<array2.length; j++) {
					if(array2[i]==array2[j]) {
				System.out.println(array2[j]);
						}
				}
			}
		}
		

	}

}
