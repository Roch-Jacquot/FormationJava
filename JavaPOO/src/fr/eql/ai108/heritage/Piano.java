package fr.eql.ai108.heritage;

public class Piano extends InstrumentDeMusique {
	
	private int nbTouche;
	private String toucher;
	
	
	//surcharge de la méthode faireDeLaMusique de la superclass InstrumentDeMusique
	public void faireDeLaMusique(String piece) {
		System.out.println("Je joue " + piece);
	}
	
	@Override
	public boolean estLePlusBelInstrumentDuMonde() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	public Piano(String nom, String marque, float prix) {
		super(nom, marque, prix);
		// TODO Auto-generated constructor stub
	}
	
	
	public Piano(String nom, String marque, float prix, int nbTouche, String toucher) {
		super(nom, marque, prix);
		this.nbTouche = nbTouche;
		this.toucher = toucher;
	}


	public int getNbTouche() {
		return nbTouche;
	}


	public void setNbTouche(int nbTouche) {
		this.nbTouche = nbTouche;
	}


	public String getToucher() {
		return toucher;
	}


	public void setToucher(String toucher) {
		this.toucher = toucher;
	}
	
	 
	
}
