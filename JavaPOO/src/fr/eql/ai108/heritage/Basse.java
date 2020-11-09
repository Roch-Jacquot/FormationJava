package fr.eql.ai108.heritage;

public class Basse extends InstrumentDeMusique {

	private int nbCordes;
	private boolean esActive;
	
	//redefinition de la méthode faire de la musique
	@Override
	public void faireDeLaMusique() {
		System.out.println("BimBamBoomBamBam");
	}
	
	@Override
	public boolean estLePlusBelInstrumentDuMonde() {
		// TODO Auto-generated method stub
		return true;
	}


	public Basse(String nom, String marque, float prix) {
		super(nom, marque, prix);
		// TODO Auto-generated constructor stub
	}


	public Basse(String nom, String marque, float prix, int nbCordes, boolean esActive) {
		super(nom, marque, prix);
		this.nbCordes = nbCordes;
		this.esActive = esActive;
	}


	public int getNbCordes() {
		return nbCordes;
	}


	public void setNbCordes(int nbCordes) {
		this.nbCordes = nbCordes;
	}


	public boolean isEsActive() {
		return esActive;
	}


	public void setEsActive(boolean esActive) {
		this.esActive = esActive;
	}
	
}

