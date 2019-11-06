package com.class9;

public class Clock {

	public static void main(String[] args) {
		// 24 hours, 60 minutes
		
		for(int h=0; h<24; h++) {
			//System.out.println(i);
			for(int m=0; m<=59; m++) {
				if(m<10) {
					System.out.println(h+" :0"+m);
				} else {
				System.out.println(h+" :"+m);}
			}
		}

	}

}
