package com.class30;

public interface Bank {
	// public abstract
	void haveChecking();
	void haveSavings();
}
interface Trustable{
	void trust();
}
class Finance{
	public void financing() {
		System.out.println("Financial transactions must happen");
	}
}
class BOA implements Bank, Trustable{
	@Override
	public void haveChecking() {
	System.out.println("BOA have a checking account");	
	}
	@Override
	public void haveSavings(){
		System.out.println("BOA has a saving account");
	}
	@Override
	public void trust() {
		System.out.println("You can trust BOA with your money");
	}
	
}
class CapitalOne extends Finance  implements Bank,Trustable{
	@Override
	public void haveChecking() {
	System.out.println("CapitalOne have a checking account");	
	}
	@Override
	public void haveSavings(){
		System.out.println("CapitalOne has a saving account");
	}
	@Override
	public void trust(){
		System.out.println("You can trust CapitalOne with your money");
	}
}
class CapitalOneChild extends CapitalOne{
	
}