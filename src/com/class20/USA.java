package com.class20;

 public class USA {
	private String capitalCity="Washington DC";
	public String mainState="Ney York";
	protected String school="Syntax";
	
	public static void main(String[] args) {
		USA us=new USA();
		System.out.println("Access in side packge");
		System.out.println(us.mainState);
		System.out.println(us.school);
		System.out.println(us.capitalCity);
	}

}
