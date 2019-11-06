package com.class14;

public class IQ1 {

	public static void main(String[] args) {
		int a=5;
		int b=7;
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		
		
		a= a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		
		
		// String // second part of question
		
		String x="abc";
		String y="defg";
		 x=x.concat(y);
		 x.length();
		 y.length();
//	System.out.println(x);
//	System.out.println(y);
	y=x.substring(0,x.length()-y.length());
	System.out.println(y);
	x=x.substring(y.length());
	System.out.println(x);
		
		
	
		
		
	
	
		

	}

}
