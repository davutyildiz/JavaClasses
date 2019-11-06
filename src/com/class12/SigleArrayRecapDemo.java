package com.class12;

public class SigleArrayRecapDemo {

	public static void main(String[] args) {
		int[] array1=new int[4];
		array1[0]=12;
		array1[1]=13;
		array1[2]=14;
		array1[3]=15;
		//System.out.println(array1[1]);
		int sum=0;
		for(int s=0; s<4; s++) {
			sum=sum+array1[s];
			System.out.println(array1[s]);
		}System.out.println("The sum of Array1 is = "+sum);
		System.out.println("&&&&&&&&&&&&");	
	// for enhance loop
		for(int i:array1) {
			System.out.println(i);
		}
		
		System.out.println("**************");
		
		int [] array2= {2,5,4,7};
		
	for(int s=0; s<4; s++) {
		System.out.println(array2[s]);
	}
	System.out.println("&&&&&&&&&&&&");	
// for enhance loop
	for(int i:array2) {
		System.out.println(i);
	}
	
	
	}

}
