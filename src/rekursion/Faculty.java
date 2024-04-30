package rekursion;

public class Faculty {

	public static int calculateFaculty(int n) {
		if(n == 0) {
			return 1;
		} else {
			return n * calculateFaculty(n-1);
		}
	}
	
	public static int summNaturalNumbers(int n) {
		if(n<0) {
			return 1;
		} else {
			return n + summNaturalNumbers(n-1);
		}
	}
	
	public static int binomialkoeffizient(int n, int k) {
	    if (k == 0 || k == n) {
	        return 1;
	    } else {
	        return binomialkoeffizient(n - 1, k - 1) + binomialkoeffizient(n - 1, k);
	    }
	}
	
	public static void main(String[] args) {
		int n=2;
		int k=6;
		//System.out.println(calculateFaculty(n));
		//System.out.println(summNaturalNumbers(n));
		System.out.println(binomialkoeffizient(n,k));
	}

}
