package geometry;

public class Circle extends Shape{

	private double radius;
	
	public Circle(double xValue, double yValue, double radius) {
		super(xValue, yValue);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getCircumference() {
		return 2*this.radius*Math.PI;
	}
	
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
	
}
