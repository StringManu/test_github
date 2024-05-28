package exceptions;

public class Aufgabe63 {

	public static double divide(double x, double y) {
		if(y==0) {
			throw new ArithmeticException("Die Gesamtpunktzahl der Aufgabe darf nicht null sein!");
		}
		try {
			return x/y;
		} catch (ArithmeticException e){
			System.err.println(e.getMessage());
			return x/y;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(divide(6,3));
	}

}
