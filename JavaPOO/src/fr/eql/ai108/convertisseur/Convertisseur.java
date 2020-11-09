package fr.eql.ai108.convertisseur;

public class Convertisseur {

	private static double tauxUSD = 1.16D;
	public static double euroToUSD(double amount) {
		
		return amount * tauxUSD;
		
	}

}
