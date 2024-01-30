package geometry;

public class Triangle extends Shape{

	private double lengthSiteA;
	private double lengthSiteB;
	private double lengthSiteC;
	private double triangleHeight;
	
	public Triangle(double xValue, double yValue, double lengthSiteA, double lengthSiteB, double lengthSiteC,
			double triangleHeight) {
		super(xValue, yValue);
		this.lengthSiteA = lengthSiteA;
		this.lengthSiteB = lengthSiteB;
		this.lengthSiteC = lengthSiteC;
		this.triangleHeight = triangleHeight;
	}
	
	public double getCircumference() {
		return this.lengthSiteA + this.lengthSiteB + this.lengthSiteC;
	}
	
	public double getArea() {
		return 0.5*this.lengthSiteC*this.triangleHeight;
	}
	
}
