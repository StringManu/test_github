package exceptions;

public class Aufgabe64 {

	public static int CheckFileExtension(String fileName) throws  EmptyException{
		try {
			if(fileName==null || fileName.isEmpty()) {
				throw new EmptyException();
			}
			if(fileName.endsWith(".java")) {
				return 1;
			} 
			if(!fileName.endsWith(".java")) {
				return 0;
			}
		} catch (EmptyException e){
			System.err.print("Das File darf nicht Leer sein");
			return -1;
		}
		return 0;
	}
	
	public static void main(String[] args) throws EmptyException {
		String fileName="homework.java";
		String fileName2="homework.doxc";
		String fileName3=null;
		
		System.out.println(CheckFileExtension(fileName));
		System.out.println(CheckFileExtension(fileName2));
		System.out.println(CheckFileExtension(fileName3));
	}

}
