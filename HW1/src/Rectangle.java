/*
* BMCC CIS 485 - Web Programming
* Spring 2014
* Chris Chapman
* HW1
* 
* Rectangle Class
*/

public class Rectangle {
	
	//Instance variables
	double length;
	double width;

	//Constructor methods
	public Rectangle() {
		length = 0;
		width = 0;
	}
	
	public Rectangle(Double l, Double w) {
		this.length = l;
		this.width = w;
	}
	
	//Setter methods
	public void setLength(Double l) {
		this.length = l;
	}
	
	public void setWidth(Double w) {
		this.width = w;
	}
	
	//Utility getter methods
	public Double getPerimeter() {
		return (this.length * 2) + (this.width * 2);
	}
	
	public Double getArea() {
		return this.width * this.length;
	}
}
