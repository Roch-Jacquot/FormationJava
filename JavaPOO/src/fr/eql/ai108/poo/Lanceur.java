package fr.eql.ai108.poo;

public class Lanceur {

	public static void main(String[] args) {
		Chien ein = new Chien();
		
		//Attributs initialisés par défauts
		
		System.out.println(ein.age);
		System.out.println(ein.nom);
		System.out.println(ein.estGentil);
		System.out.println(ein.poids);
		
		//affectation 
		
		ein.nom = "Ein";
		ein.age = 7;
		ein.estGentil = true;
		ein.taille = 0.7f;
		ein.poids = 7;
		ein.race = "Welsh Corgi";
		ein.pedigree = 'E';
		
		System.out.println("Je m'appelle " + ein.nom 
				+ ", je suis un " + ein.race + " et j'ai " + ein.age + " ans.");
		
		
		//Appel des méthodes
		
		ein.aboyer();
		ein.ramenerLaBalle(5);
		float rapport = ein.rapportTaillePoids();
		System.out.println(rapport);	
		
		//Attention au NullPointerException
		/*
		Chien milou = null;
		milou.aboyer();
		*/
		
		//Instanciation avec un constructeur surchargé 
		Chien Laika = new Chien("Laika", 9, 0.9f, 15.42f, "Berger", true, 'L');
		System.out.println("Je m'appelle "+ Laika.nom + " et je suis allé dans l'espace à " + Laika.age + " ans.");
	}

}
