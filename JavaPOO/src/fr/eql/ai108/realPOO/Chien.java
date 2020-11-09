package fr.eql.ai108.realPOO;

public class Chien {
	
	private String nom;
	private int age;
	private float taille;
	private float poids;
	private String race;
	private boolean estGentil;
	private char pedigree;
	
	private Collier collier;
	private Jouet[] jouets;
	private GroupeChien groupe;
	
	
	//variable de classe
	
	private static int nbChien;
	
	//Constante 
	private static final int AGE_MAX = 30;
	
	//ALT + shift + S + C
	public Chien() {
		nbChien++;}

	//ALT + shift + S + O
	public Chien(String nom, int age, float taille, float poids, String race, boolean estGentil, char pedigree) {
		this.nom = nom;
		this.age = age;
		this.taille = taille;
		this.poids = poids;
		this.race = race;
		this.estGentil = estGentil;
		this.pedigree = pedigree;
		nbChien++;
	}
	
	
	

	public Chien(String nom, int age, float taille, float poids, String race, char pedigree) {
		super();
		this.nom = nom;
		this.age = age;
		this.taille = taille;
		this.poids = poids;
		this.race = race;
		this.pedigree = pedigree;
	}

	public Chien(String nom, int age, float taille, float poids, String race, char pedigree, Collier collier) {
		super();
		this.nom = nom;
		this.age = age;
		this.taille = taille;
		this.poids = poids;
		this.race = race;
		this.pedigree = pedigree;
		this.collier = collier;
	}

	
	public Chien(String nom, int age, float taille, float poids,  String race, boolean estGentil, char pedigree,
			Collier collier) {
		super();
		this.nom = nom;
		this.age = age;
		this.taille = taille;
		this.poids = poids;
		this.estGentil = estGentil;
		this.race = race;
		this.pedigree = pedigree;
		this.collier = collier;
	}
	
	

	public Chien(String nom, int age, float taille, float poids, String race, boolean estGentil,  char pedigree,
			Collier collier, Jouet[] jouets) {
		super();
		this.nom = nom;
		this.age = age;
		this.taille = taille;
		this.poids = poids;
		this.estGentil = estGentil;
		this.race = race;
		this.pedigree = pedigree;
		this.collier = collier;
		this.jouets = jouets;
	}
	
	
	

	public Chien(String nom, int age, float taille, float poids, String race, boolean estGentil, char pedigree,
			Jouet[] jouets) {
		super();
		this.nom = nom;
		this.age = age;
		this.taille = taille;
		this.poids = poids;
		this.estGentil = estGentil;
		this.race = race;
		this.pedigree = pedigree;
		this.jouets = jouets;
	}
	
	

	public Chien(String nom, int age, float taille, float poids, String race, boolean estGentil, char pedigree,
			Jouet[] jouets, GroupeChien groupe) {
		super();
		this.nom = nom;
		this.age = age;
		this.taille = taille;
		this.poids = poids;
		this.estGentil = estGentil;
		this.race = race;
		this.pedigree = pedigree;
		this.jouets = jouets;
		this.groupe = groupe;
	}

	//Redef de la methode toString;
	@Override
	public String toString() {
		return "Chien [nom=" + nom + ", age=" + age + ", taille=" + taille + ", poids=" + poids + ", race=" + race
				+ ", estGentil=" + estGentil + ", pedigree=" + pedigree + "]";
	}
	
	
	//Méthode Hashcode et Equals (Alt shift S H)
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (estGentil ? 1231 : 1237);
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + pedigree;
		result = prime * result + Float.floatToIntBits(poids);
		result = prime * result + ((race == null) ? 0 : race.hashCode());
		result = prime * result + Float.floatToIntBits(taille);
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chien other = (Chien) obj;
		if (age != other.age)
			return false;
		if (estGentil != other.estGentil)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (pedigree != other.pedigree)
			return false;
		if (Float.floatToIntBits(poids) != Float.floatToIntBits(other.poids))
			return false;
		if (race == null) {
			if (other.race != null)
				return false;
		} else if (!race.equals(other.race))
			return false;
		if (Float.floatToIntBits(taille) != Float.floatToIntBits(other.taille))
			return false;
		return true;
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
	
	//Setters et Getters Alt + Shift + S + R
	//getter
	public String getNom() {
		return nom;
	}
	
	//setter
	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getTaille() {
		return taille;
	}

	public void setTaille(float taille) {
		this.taille = taille;
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	public boolean isEstGentil() {
		return estGentil;
	}

	public void setEstGentil(boolean estGentil) {
		this.estGentil = estGentil;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public char getPedigree() {
		return pedigree;
	}

	public void setPedigree(char pedigree) {
		this.pedigree = pedigree;
	}
	
	public static int getNbChien() {
		return nbChien;
	}

	public Collier getCollier() {
		return collier;
	}

	public void setCollier(Collier collier) {
		this.collier = collier;
	}

	public Jouet[] getJouets() {
		return jouets;
	}

	public void setJouets(Jouet[] jouets) {
		this.jouets = jouets;
	}

	public GroupeChien getGroupe() {
		return groupe;
	}

	public void setGroupe(GroupeChien groupe) {
		this.groupe = groupe;
	}

	//Méthode Clone
	
	@Override
	protected Chien clone() throws CloneNotSupportedException {

		Chien newInstance = new Chien(this.nom, this.age, this.taille, this.poids, this.race, this.pedigree);
		return newInstance;
	}


	
	
	
	
	
	
	
	
}
