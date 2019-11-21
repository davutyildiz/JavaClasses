package com.class22;

public class AcessingStaticVariables {
	public static void main(String[] args) {
		Husky obj=new Husky();
		System.out.println(obj.name);// name is not assing any value in Husky class :null
		obj.name="Sharik";
		System.out.println(obj.name);
		System.out.println(Husky.breed);
		System.out.println(obj.breed);// possible but not prefereable
		
	}

}
