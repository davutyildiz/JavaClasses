package com.class19;

public class MethodWithReturnValue {
public static void main(String[] args) {
	/*declare a String and 
	 * if String has more than 10 characters ---> String is large
	 * otherwise--> String is small
	 * 
	 */
	
	String str="Welcome home";
	int numOfchars=str.length();
	if(numOfchars>=10) {
		System.out.println("String is large");
	} else {
		System.out.println("String is small");
	}
	
	char character=str.charAt(4);
	System.out.println(character);
	
	// create an object of the class where method is defined   
	Recap obj =new Recap();
	// obj.sum(num1, num2); complier error saying change return type
	 obj.sum(10, 14);
	MethodWithReturnValue obj1=new MethodWithReturnValue();
	int sum=obj1.sum(50, 40);
	System.out.println(sum);
	int large=obj1.findLargest(3,9);
	System.out.println(large);
}
	int sum(int num1, int num2) {
		int c=num1+num2;
		return c;
	}
	// method to find largest number
	
	int findLargest(int num1, int num2) {
		int largest;
	if(num1>num2) {
	largest=num1;
	} else {
		largest=num2;
	}
	return largest;
	
	}//System.out.println(largest);
	
	
}


