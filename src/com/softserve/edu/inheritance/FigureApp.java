package com.softserve.edu.inheritance;

abstract class Figure {
	/* because this is an abstract method the body will be blank */
	public abstract double getArea();
}

class Circle extends Figure {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return (3.14 * (radius * 2));
	}
}

class Rectangle extends Figure {
	private double length, width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}
}

public class FigureApp {
	public static void main(String[] args) {
		Figure[] fig = { new Circle(2), new Circle(1), new Rectangle(3,4) };
		for (Figure currentFig : fig) {
			System.out.println("currentFig is: " + currentFig.getClass().getName() + " Area: " + currentFig.getArea());
		}
	}
}
