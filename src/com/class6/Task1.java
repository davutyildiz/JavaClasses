package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/* ask user to enter boolean value for sale
		 * if no sale ----? i am not shopping
		 * if sale ---> check the price of the item
		 * base on the amount we will have to calculate the price after discount
		 * if price <20 ---> aplly 10% dicount
		 * if price between 20 - 100---->20% discout
		 * if price between 100-500 ------>30% discout
		 * anything -----> 50% discout
		 * 
		 */

		Scanner input=new Scanner(System.in);
		System.out.println("Enter selling or not");
		
		boolean sale=input.nextBoolean();
		int price;
		double disprice;
		
		if (sale==true) { 
			System.out.println("Please enter price");
			price=input.nextInt();
			if (price<20) {
				disprice=price-price*0.1;
			} else if (price>=20 && price<100) {
				disprice=price-price*0.2;
			}else if (price>=100 && price<500) {
				disprice=price-price*0.3;
			}else {
				disprice=price-price*0.5;
			}
			System.out.println("atfer discount " +price +" the price of the item reduce from "+price+ "to "+disprice );
		} if (sale==false) {
			System.out.println("I am not shopping");
		}
		
	}

}
