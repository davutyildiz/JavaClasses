package com.class5;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		//
		Scanner input= new Scanner(System.in);
		System.out.println("please enter quiz grade");
		double quiz=input.nextDouble();
		System.out.println("please enter midterm grade");
		double midterm=input.nextDouble();
		System.out.println("please enter finalexam grade");
		double finalexam=input.nextDouble();
		double average;
		average=(quiz+midterm+finalexam)/3;
		if (average>=90) {
			System.out.println("grade=A");
			
		}else if (average>=70 && average<90) {
			System.out.println("grade=B");
		} else if (average>=50 && average<70) {
			System.out.println("grade=C");
		}else if(average>=0 && average<50){
			System.out.println("grade=F");
		}else {
			System.out.println("invalid grade");
		}
		
		System.out.println("########################");
		
		boolean isRain = true;

		if (!isRain) {
			System.out.println("classmode inclass");
		} else {
			System.out.println("classmode Online");
		}
input.close();
		
	}

}
