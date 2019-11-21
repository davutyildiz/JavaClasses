package com.class18;
// Create a method that will take 2 parameters as a numbers and prints which number is larger.
// Create a method that will take a number and prints whether the number is even or odd.
//Create a method that will print whether given String is palindrome or not.

public class task {
	public static void main(String[] args) {
		task task1=new task();
		task1.maximumNUmber(3, 5);
		task1.evenORodd(5);
		task1.palindrome("ala");
		
	}
	
void maximumNUmber(int n1, int n2) {
	int max;
	if(n1>n2) {
		max=n1;
	}else if(n1==n2) {
		max=n1;
		System.out.println("numbers equal");
	}
	else {
		max=n2;
	}
	System.out.println("The largest number is "+max);
	
}

void evenORodd(int m) {
	if(m%2==0) {
		System.out.println(m+" is even number");
	}else {
		System.out.println(m+" is odd number");
	}
}
	void palindrome(String str) {
		
		String original="ala";
		String reversed="";
		for(int i=original.length()-1; i>=0; i--) {
			reversed =reversed+original.charAt(i); // +k=k+a=ka+k..
		} System.out.println(reversed);
		if (original.equals(reversed)) {
			System.out.println("String is Polindrome");
		}else {
			System.out.println("String is NOT Polindrome");
		}
		
	}





}
