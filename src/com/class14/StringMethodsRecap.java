package com.class14;

public class StringMethodsRecap {

	public static void main(String[] args) {
		// .replace
		String str=" your Syntax Technologies.is your palce to study";
		System.out.println(str.replace('y', 'i'));
		System.out.println("*************");
		
		System.out.println(str.replace("your", "My"));
		System.out.println("****************");

		
		//.replaceAll
		
		String str2="Video provides a powerful way to help you prove your point."
				+ " when you click online Video, you can paste in the embed"
				+ "code for the video you wabt to add";
		System.out.println(str2.replaceAll("way(.*)", ""));
		System.out.println("*************************");
		
		String str3="234523HELL34545650O^#$%^&*!";
		System.out.println(str3.replaceAll("[^0-9]", ""));
		System.out.println(str3.replaceAll("[0-9]", ""));
		System.out.println(str3.replaceAll("[^A-z]", ""));
		System.out.println(str3.replaceAll("[^a-zA-Z]", ""));
		System.out.println("*******************************");
		
		
		System.out.println(str2.replaceFirst(" ", ""));
		
		
		
	}

}
