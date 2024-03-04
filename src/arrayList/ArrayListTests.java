package arrayList;

import java.util.List;

public class ArrayListTests {

	
	public static void reduceToComments(List<String>lines) {
		for(int i=0;lines.size()<i;i++) {
			if(i%4==0) {
				lines.remove(i);
			}
		}
	}
	
	public static void main(String[] args) {
		

	}

}
