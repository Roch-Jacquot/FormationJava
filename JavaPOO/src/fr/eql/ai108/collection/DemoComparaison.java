package fr.eql.ai108.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.eql.ai108.valref.Personne;

//importer tout : crtl + shit + O

public class DemoComparaison {
	
	
	public static void main(String[] args) {
	
		List<Personne> personnes = new ArrayList<Personne>();
		Personne sacha = new Personne("Ketchum", "Sacha", 10);
		
		Personne pierre = new Personne("Argenta", "Pierre", 13);
		
		Personne ondine = new Personne("Azuria", "Ondine", 12);
		
		//ajouter tous les éléments à une collection d'un coup
		
		Collections.addAll(personnes, sacha, pierre, ondine);
		
		System.out.println("Collection non triée: ");
		System.out.println(personnes);
		
		
		Collections.sort(personnes);
		System.out.println("Collection triée: ");
		System.out.println(personnes);
		
		
		//tri de la collection par age.
		Collections.sort(personnes, new PersonneComparatorByAge());
		
		System.out.println("Collection triée par age: ");
		System.out.println(personnes);
	}

}
