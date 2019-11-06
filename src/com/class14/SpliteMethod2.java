package com.class14;

public class SpliteMethod2 {

	public static void main(String[] args) {
		// How to seperate comma delimited string.
		String str=" If you come to class early, "
				+ "then you can study more, also you can learn more, "
				+ "and you can leave early";
			String[] array=str.split(",");
			for(int i=0; i<array.length; i++) {
				System.out.println(array[i]);
			}
			System.out.println("*********************************");
			
			String str1="Welcome To Sytax Techonologies";
			String[] array1=str1.split(" ", 3);
			System.out.println(array1.length);
				
			for(int i=0; i<array1.length; i++) {
				System.out.println(array1[i]);
			}
			
			
			
			
	}

}
