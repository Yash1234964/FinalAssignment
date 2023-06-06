package pr.practise.calculation;

import java.util.Scanner;

public class Circle implements Shape {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	@Override
	public double CalculateArea() {
		System.out.println();
		return Math.PI*radius*radius;
	}

	@Override
	public double CalculatePerimeter() {
		// TODO Auto-generated method stub
		return Math.PI*2*radius;
	}

}
