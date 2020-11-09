package fr.eql.ai108.collection;

import java.util.HashMap;
import java.util.Map;

public class DemoMapSimple {

	public static void main(String[] args) {
		// instancier une HashMap
		
		Map<String, Integer> listeCourse = new HashMap<String, Integer>();
		
		//ajouter des couples clés/valeur dans la map avec la méthode put
		
		listeCourse.put("kiwi", 6);
		listeCourse.put("lime", 2);
		listeCourse.put("banane", 4);
		
		//REcup une valeur de map avec la methode get
		System.out.println("Quantité de bananes : " + listeCourse.get("banane"));

		
		//Vérifier la présence d'une clé dans la map
		if(listeCourse.containsKey("lime")) {
			//suppression d'un couple clé valeur
			listeCourse.remove("lime");
		}
		
		//Afficher toutes les clés de la map
		
		System.out.println(listeCourse.keySet());
	}

}
