package geometry;

public abstract class Shape {

	private double xValue;
	private double yValue;
	
	public Shape(double xValue, double yValue) {
		super();
		this.xValue = xValue;
		this.yValue = yValue;
	}
	
	public double getxValue() {
		return xValue;
	}
	public void setxValue(double xValue) {
		this.xValue = xValue;
	}
	public double getyValue() {
		return yValue;
	}
	public void setyValue(double yValue) {
		this.yValue = yValue;
	}

	public abstract double getCircumference();
	
	public abstract double getArea();
	
}
