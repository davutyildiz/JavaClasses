package com.class29;

public class FileTest {

	public static void main(String[] args) {
	File file=new JavaFile();
	file.close();
	file.edit();
	file.open();
	System.out.println("_______________");
	File file1=new WordFile();
	file1.close();
	file1.edit();
	file1.open();
	System.out.println("_______________");
	File file2=new FDFFile();
	file2.close();
	file2.edit();
	file2.open();
	}

}
