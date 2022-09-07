package com.innovation.shapes;

public class Circle {
	
	private float redius;
	static float pi = 3.14F;
	
	public Circle() {
		redius = 1.5F;
	}
	Circle(float redius) {
		this.redius = redius;
	}
	public Circle(float redius, float pi) {
		this.redius = redius;
	}
	
	// methods
	static float calculateCircleArea(float redius) {	
		return pi*redius*redius;	
	}
	static float calculateCircumference(float redius) {
		return 2*pi*redius;
	}
	
	public static void main(String[] args) {
		System.out.println("Circle Area is: "+calculateCircleArea(8.9F));
		System.out.println("Circumference is: "+calculateCircumference(16.4F));
	}
}
