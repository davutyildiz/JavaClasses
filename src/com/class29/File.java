package com.class29;
/*Create a class File that will have the following 
 *behaviors: open, edit, close. Edit and close are implemented method 
 *while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PDFFile
 *that will provide specific implementation of open behaviour:
 *Example: to open .java file we need notepad++ or
 *sublime text, to open .doc file we need Microsoft word to be installed etc
 */
public abstract class  File {
	
	public abstract void open();
	public  void edit() {
		System.out.println("edit file");
	}
	public  void close() {
		System.out.println("close file");	
	}

}
class JavaFile extends File{
	public void open() {
	System.out.println("Open java file need Notepad");	
	}
}

class WordFile extends File{
public void open() {
	System.out.println("Open WordFile  need doc.");	
	}
}
class FDFFile extends File{
public void open() {
	System.out.println("Open FDFFile need Addobe reader");
	}
}