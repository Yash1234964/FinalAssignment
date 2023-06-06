package pr.practise.calculation;

public class Triangle implements Shape {

	private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
	
	@Override
	public double CalculateArea() {
		// TODO Auto-generated method stub
		double semiPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
	}

	@Override
	public double CalculatePerimeter() {
		// TODO Auto-generated method stub
		return side1 + side2 + side3;
	}

}
