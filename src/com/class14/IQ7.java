package com.class14;

public class IQ7 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not?
	int num=10;
	boolean var=true;
	 for(int i=2; i<num/2; i++) {
	if(num%i==0) {
	System.out.println(num+" is not a prime");
	var=false;
	break;
		} 
	} if(var=true) {
		System.out.println(num+" is a prime");
	}
	
	System.out.println("*****************");
	
		  int i,m=0,flag=0;      
		  int n=11;//it is the number to be checked    
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else 
	
	
		 
}
}
