package exceptions;

public class FileNames {

	private static int CheckFileExtension(String fileName) {
		try {
		if(fileName.isEmpty()) {
			return -1;
		}
		if(fileName.endsWith(".java")) {
			return 1;
		} else {
			return 0;
		}
		} catch (NullPointerException e) {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		String e1 = "homework.java";
		String e2 = "homework.docx";
		String e3 = null;
		String e4 = "";
		System.out.println(CheckFileExtension(e1));
		System.out.println(CheckFileExtension(e2));
		System.out.println(CheckFileExtension(e3));
		System.out.println(CheckFileExtension(e4));
	}

}
