package fr.eql.ai108.tp.bibliothèque;

public class Lecteur {
	
	private String nom;
	private String prenom;
	private String adresse;
	private Livre[] livres;
	public Lecteur(String nom, String prenom, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Livre[] getLivres() {
		return livres;
	}
	public void setLivres(Livre[] livres) {
		this.livres = livres;
	}
	
	
}
