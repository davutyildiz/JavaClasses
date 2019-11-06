package com.class12;

public class StringMIniPulationDemo2 {

	public static void main(String[] args) {
		int a=2;
		if(a==20) {
			System.out.println("NUmber is "+a);
		}else {
			System.err.println("Number was not 20 but is "+a);
			System.out.println("***********");
		}
//System.out.println("\033[31m RED");
		
		
		/* .contains();
		 * 
		 */
		String sentence="It was raining";
		System.out.println(sentence.contains("Was"));
		
		System.out.println("***************");
		
		String sentence1="It was raining";
		String sen="raining";
		System.out.println(sen.contains(sentence1));
		System.out.println("************");
		System.out.println(sentence1.contains(sen));
		
		// Task:
		// Create two strings and initialize them with some value.
		// implement the following methods on those string
		/* sen.length();
		 * sen.equals();
		 * sen.contains();
		 * sen.toLoweCase();
		 * sen.toUpperCase();
		 * sen.equalsIgnoreCase(anotherString);
		 */
		String sen1="It is Snowing";
		String sen2="snowing";
		System.out.println(sen1.length());
		System.out.println(sen1.contains(sen2));
		System.out.println(sen1.toUpperCase());
		System.out.println(sen1.toLowerCase());
		System.out.println(sen1.equalsIgnoreCase(sen2));
		System.out.println("**************");
		/*THIS METHOD tests if a string starts with
		 *  the specific prefix beginning
		 */
		String str3="It is very hot in the class";
		System.out.println("Is this string starts with= "+ str3.startsWith("It"));
		System.out.println("Is this string starts with= "+ str3.startsWith("is",3));
		
		
		// This method test if this string ends with the specified suffix
		System.out.println("Is this string starts with= "+ str3.endsWith("class"));
		
		
		
		
		
		
		
		
		
	
	}

}
