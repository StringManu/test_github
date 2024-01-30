package geometry;

import java.util.ArrayList;

public class Group {

	private ArrayList<Shape> objects = new ArrayList<Shape>();
	
	public Group(ArrayList<Shape> objects) {
		this.objects = objects;
	}

	public ArrayList<Shape> getObjects() {
		return objects;
	}
/**
 * Adds a object to the list of objects
 * @param object
 */
	public void addObject(Shape object) {
		if(!objects.contains(object)) {
			objects.add(object);
		} else {
			System.out.println("Object has already been added");
		}
	}
	/**
	 * removes a object from the list
	 * @param object
	 */
	public void removeObject(Shape object) {
		if(objects.contains(object)) {
			objects.remove(object);
		} else {
			System.out.println("Object is not in the list");
		}
	}
	/**
	 * calculates the area of all objects
	 * @return the area of all objects in the list
	 */
	public double areaOfAllObjects() {
		double a = 0;
		for(Shape b : objects) {
			a=b.getArea()+a;
		}
		return a;
	}
	/**
	 * calculates the circumference of all objects
	 * @return the circumference of all objects in the list
	 */
	public double circumferenceOfAllObjects() {
		double a = 0;
		for(Shape b : objects) {
			a=b.getCircumference()+a;
		}
		return a;
	}
	/**
	 * Finds the largest shape of all in the list
	 * @return the Shape
	 */
	public Shape findLargestShape() {
	        if (objects.isEmpty()) {
	            return null;
	        }
	        
	        Shape largestShape = objects.get(0);
	        double largestArea = largestShape.getArea();
	        for (Shape shape : objects) {
	            double area = shape.getArea();
	            if (area > largestArea) {
	                largestArea = area;
	                largestShape = shape;
	            }
	        }
	        return largestShape;
	    }
	/**
	 * prints out all the objects
	 */
    public void printAllShapes() {
        for (Shape shape : objects) {
            System.out.println("Shape Type: " + shape.getClass().getSimpleName());
            System.out.println("Position: (" + shape.getxValue() + ", " + shape.getyValue() + ")");
            System.out.println("Area: " + shape.getArea());
            System.out.println("Circumference: " + shape.getCircumference());
            System.out.println();
        }
    }
	
}
