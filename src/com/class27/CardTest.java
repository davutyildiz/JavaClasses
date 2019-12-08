package com.class27;

public class CardTest {

	public static void main(String[] args) {
		// take an object of the child class and give reference to the parent class
		// type reference variable=object is created
		Card card=new AX();
		card.chargeInterest();
		card.creditLimit();
		
		Card card1=new MC();
		card1.creditLimit();
		
		Card card2=new Visa();
		card2.chargeInterest();
		card2.creditLimit();
		
		Card card3=new Discovery();
		card3.chargeInterest();
		System.out.println("--------------");
		// type[] arrayName={}
		// type[] arrayName=new type[];
		int[] numArray= {10,12,13};
		String[] stringArray= {"aa","bb"};
		
		Card[] cardArray= {card,card1,card2,card3};
		Card[] cardArray1= {new AX(),new MC(),new Visa(), new Discovery()};
		for(Card mycard:cardArray1) {
			mycard.creditLimit();
			mycard.chargeInterest();
		}
		for(int y=0; y<cardArray1.length; y++) {
			cardArray1[y].creditLimit();
		}

		Card c1=new Card();
		c1.chargeInterest();
		c1.creditLimit();

		AX ax1=new AX();
		ax1.chargeInterest();
		ax1.creditLimit();

		MC mc1=new MC();
		mc1.cashBack();
		mc1.chargeInterest();
		mc1.creditLimit();

		MC mc2=new MC();
		MC mc3=new MC();

		Card cc=new MC();
		cc.chargeInterest();
		cc.creditLimit();


		MC[] masterCards= {mc1,mc2,mc3};
		for(MC mCard:masterCards) {
			mCard.cashBack();
			mCard.chargeInterest();
			mCard.creditLimit();
		}

		
		
		
	}

}
