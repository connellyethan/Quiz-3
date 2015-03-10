package main;

import main.GeometricObject;

public class Triangle extends GeometricObject {

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle() {
		super();
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}	

	public double getArea()
	{
		double height = side2*Math.sin(Math.acos(side1/side2));
		double Area = 0.5*side1*height;
		return Area;
	}

	public double getPerimeter()
	{
		double Perimeter = side1 + side2 + side3;
		return Perimeter;
	}

	public String toString()
	{
		return("The three lengths of the triangle are: "+side1+", "+side2+", "+side3+"."+ 
				"\nThe area is: "+getArea()+" square units. The perimeter is: "+getPerimeter()+" units.");
	}
}

