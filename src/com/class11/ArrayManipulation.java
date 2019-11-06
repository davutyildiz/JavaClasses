package com.class11;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		String[] actualNames= {"Jhon","Smith","Alex","Tanaz"};
		Arrays.sort(actualNames);
		String[] expectedNames= {"Jhon","Smith","Alex","Tanaz"};
		Arrays.sort(expectedNames);
		System.out.println(Arrays.deepToString(actualNames));
		
		String actual=Arrays.toString(actualNames);
		String expected=Arrays.toString(expectedNames);
		System.out.println(actual.equals(expected));

	}

}
