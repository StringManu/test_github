package exceptions;

public class TextCorrection {

	private static double divide(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Division durch Null ist nicht erlaubt");
        }
        return x/y;
    }
	
	public static void main(String[] args) {
        try {
            double ergebnis = divide(5,0);
            System.out.println("Ergebnis: " + ergebnis);
        } catch (ArithmeticException e) {
            System.out.println("Division durch Null ist nicht erlaubt");
        }
	}

}
