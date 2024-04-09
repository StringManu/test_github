package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class Kaese_Klasse {

	//private = Sichtbarkeit auf die eigene Klasse beschränkt
	// static = unabhängig von einem Objekt, gehört zur Klasse
	//final = Wert der VAriable nach Initialisierung unverändert
	private static final Pattern vegetables = Pattern.compile(	
			"Zucchini|Paprikas?|Zwiebeln?|Tomaten?|Melanzani"
			);
	
	public static void insertCheeseAroundVegetable(List<String> ingredients) {
		//For-Schleife mit Iterator als Laufvariable
		for(ListIterator<String> iterator = ingredients.listIterator();
				iterator.hasNext();) {
			// Auslesen der momentanen Zutat
			String ingredient = iterator.next();
			// Überprüfen, ob die Zutat zu unserem Pattern passt
			if(vegetables.matcher(ingredient).matches()) {
				iterator.add("Käse");
			}
		}
	}
	
	public static void main(String[] args) {
		List<String> ingredients = new ArrayList<>();
		Collections.addAll(ingredients, "Gnocchi", "Zucchini", "Paprika", "Milch", "Zwiebln", "Melanzani");
		 insertCheeseAroundVegetable(ingredients);
		System.out.println(ingredients);
		}

}
