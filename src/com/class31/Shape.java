package com.class31;
/*Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter. 
 *Create 2 child classes:Circle & Square that should have an implementation of
 * area and perimeter calculation. Test your code.
 */
interface Shape {
void calculateArea(double num);
void calculatePerimeter(double num);

}
class Circle implements Shape{
	

	@Override
	public void  calculateArea(double num) {
		System.out.println(3.14*(num*num));
	}

	@Override
	public void calculatePerimeter(double num) {
		System.out.println(2*(3.14)*num);
		
	}
}
class Square implements Shape{

	@Override
	public void calculateArea(double num) {
		System.out.println(num*num);
		
	}

	@Override
	public void calculatePerimeter(double num) {
		System.out.println(4*num);
		
	}
	
}