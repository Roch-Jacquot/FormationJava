package fr.eql.initalgo.demo;

import java.util.Scanner;

public class DemoBoucle {

	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		//La boucle POUR
		
		for(int i = 0; i < 5 ; i++) {
			System.out.println(i + "ème tour de boucle");
		}

		int nbVal, compteur, valeur, totalValeur = 0;
		
		
		System.out.println("Combien de valeurs souhaitez vous additionner?");
		
		nbVal = scan.nextInt();
		
		for(compteur = 0; compteur < nbVal ; compteur++) {
			
			System.out.println("Saisissez un nombre");
			valeur = scan.nextInt();
			totalValeur += valeur;
			
		}
		scan.close();
		System.out.println("Le total des " + nbVal + " valeurs est " + totalValeur) ;
		
		
	}

}
