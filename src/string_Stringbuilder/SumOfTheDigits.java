package string_Stringbuilder;

public class SumOfTheDigits {
	
	public static long digitSum(long value) {
		long ergebnis=0;
		String valueAlsString = Long.toString(value);
		for(int i=0;i<valueAlsString.toCharArray().length;i++) {
			ergebnis += Character.getNumericValue(valueAlsString.toCharArray()[i]);
		} return ergebnis;
	}
	
	public static void main(String[] args) {
		long hallo=15357892;
		System.out.println(digitSum(hallo));
	}

}
