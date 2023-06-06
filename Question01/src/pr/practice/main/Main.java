package pr.practice.main;

import java.util.Scanner;

import pr.practise.calculation.Circle;
import pr.practise.calculation.Triangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter radius of circle");
		double radius=sc.nextDouble();
		
		System.out.println("Enter sides of triangle");
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();
		
		Triangle t=new Triangle(side1,side2,side3);
		Circle c=new Circle(radius);
		
		System.out.println("Print area of triangle "+t.CalculateArea());
		System.out.println("Print perimeter of triangle "+t.CalculatePerimeter());
		System.out.println("Print area of circle "+c.CalculateArea());
		System.out.println("Print perimeter of circle "+c.CalculatePerimeter());

	}

}
