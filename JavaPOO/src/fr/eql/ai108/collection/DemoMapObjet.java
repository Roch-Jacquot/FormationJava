package fr.eql.ai108.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import fr.eql.ai108.valref.Personne;
import fr.eql.ai108.realPOO.Chien;

public class DemoMapObjet {

	public static void main(String[] args) {
		
		Map<Personne, Set<Chien>> personnePokemonMap = new HashMap<Personne, Set<Chien>>();
		
		Personne sacha = new Personne("Ketchum", "Sacha", 10);
		
		Personne ondine = new Personne("Azuria", "Ondine", 12);
		
		Chien pikachu = new Chien("Pikachu", 2, 1.2f, 2.5f, "Electrique", 'P');
		Chien dracofeu = new Chien("Dracofeu", 3, 1.2f, 45f, "Feu", 'D');
		Chien poissireine = new Chien("Poissireine", 2, 4f, 5f, "Eau", 'P');
		Chien roucoups = new Chien("Roucoups", 4, 5f, 1.2f, "Vol", 'R');

		//Création des clés et initialisation des valeurs
		personnePokemonMap.put(sacha, new HashSet<Chien>());
		personnePokemonMap.put(ondine, new HashSet<Chien>());
		
		//ajouter nos polemons aux HashSet
		personnePokemonMap.get(sacha).add(pikachu);
		personnePokemonMap.get(sacha).add(dracofeu);
		personnePokemonMap.get(ondine).add(poissireine);
		personnePokemonMap.get(ondine).add(roucoups);
		
		//affichage des et liés à Ondine
		System.out.println(personnePokemonMap.get(ondine));
		
		//Affichage du set lié à sacha
		System.out.println(personnePokemonMap.get(ondine));
		
		//Parcourir la map
		//Methode 1: keySet() revoie un Set de toutes les clés de la map
		
		Set<Personne> personnes = personnePokemonMap.keySet();
		
		for (Personne personne : personnes) {
			System.out.println("Pokemon de " + personne.getPrenom() + ": " + personnePokemonMap.get(personne));
		}
		
		//Méthode2 : Récupérer un Set d'Entry. Entry est un objet qui encapsule les paires clé/valeur
		//La méthode EntrySet() que possedent les Maps
		
		Set<Entry<Personne, Set<Chien>>> entries = personnePokemonMap.entrySet();
		for (Entry<Personne, Set<Chien>> entry : entries) {
			System.out.println("Pokemon de " + entry.getKey().getPrenom() + ": " + entry.getValue());
		}
		
	}

}
