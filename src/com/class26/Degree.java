package com.class26;

public class Degree {
	String degree;
	public String getDegree(){
		System.out.println("I got a degree");
		return degree;
	}

}
class Undergraduate extends Degree{
	public String getDegree(){
		System.out.println("I am an undergraduate");
		return degree;
}
}

class Postgraduate extends Degree{
	public String getDegree(){
		System.out.println("I am a Postgraduate");
		return degree;
}
}

