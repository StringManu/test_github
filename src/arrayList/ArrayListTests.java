package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTests {
	
	public static void reduceToComments(List<String> list) {
	    for (int i = list.size() - 1; i >= 0; i--) {
	        if ((i + 1) % 4 != 0) {
	            list.remove(i);
	        }
	    }
	}
	
	public static List<String> list1=new ArrayList<String>();
	public static List<Double> list2=new ArrayList<Double>();
	
	public static void befuellen(List<String> list) {
		list.add("Apfel");
		list.add("Banane");
		list.add("Orange");
		list.add("Erdbeere");
		list.add("Kirsche");
		list.add("Birne");
		list.add("Melone");
		list.add("Traube");
		list.add("Pfirsich");
		list.add("Mango");
		list.add("Ananas");
		list.add("Kiwi");
		list.add("Himbeere");
		list.add("Blaubeere");
		list.add("Granatapfel");
		list.add("Pflaume");
		list.add("Feige");
		list.add("Limette");
		list.add("Zitrone");
		list.add("Grapefruit");
	}
	
	public static void trimNonGrowingNumbers(List<Double> numbers) {
		for(int i=1;i<numbers.size();i++) {
			if(numbers.get(i)<numbers.get(i-1)) {
				numbers.remove(i);
			}
		}
	}
	
	public static void befuellen2(List<Double> list) {
		list.add(1.2);
		list.add(2.4);
		list.add(15.2);
		list.add(18.8);
		list.add(18.8);
		list.add(19.2);
		list.add(14.9);
		list.add(20.5);
	}
	
	public static void main(String[] args) {
		befuellen(list1);
		reduceToComments(list1);
		System.out.println(list1);
		befuellen2(list2);
		trimNonGrowingNumbers(list2);
		System.out.println(list2);
	}

}
