package fr.eql.ai108.realPOO;

public class Jouet {
	private String libelle;
	private float prix;
	
	
	
	public Jouet() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Jouet(String libelle, float prix) {
		super();
		this.libelle = libelle;
		this.prix = prix;
	}



	public String getLibelle() {
		return libelle;
	}



	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}



	public float getPrix() {
		return prix;
	}



	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	
	
}
