package geometry;

public class Rectangle extends Shape{

	private double length;
	private double width;
	
	public Rectangle(double xValue, double yValue, double length, double width) {
		super(xValue, yValue);
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getCircumference() {
		return 2*this.length+2*this.width;
	}
	
	public double getArea() {
		return this.length*this.width;
	}
	
	
}
