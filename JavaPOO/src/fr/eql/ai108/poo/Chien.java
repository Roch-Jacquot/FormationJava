package fr.eql.ai108.poo;

public class Chien {
	public String nom;
	public int age;
	public float taille;
	public float poids;
	public String race;
	public boolean estGentil;
	public char pedigree;
	
	//Constructeur surchargé

	
	//Constructeurs vide
	public Chien() {}
	
	
	public Chien(String nom, int age, float taille, float poids, String race, boolean estGentil, char pedigree) {
		this.nom = nom;
		this.age = age;
		this.taille = taille;
		this.poids = poids;
		this.race = race;
		this.estGentil = estGentil;
		this.pedigree = pedigree;
	}
	
	
	public void aboyer() {
		System.out.println("Woof woof!");
		
	}
	
	public void ramenerLaBalle(int nbFois) {
		System.out.println("Je ramène " + nbFois + " la balle");
		
	}
	
	public float rapportTaillePoids() {
		return taille/poids;
	}
}
