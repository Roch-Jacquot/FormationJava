package fr.eql.initalgo.demo;

import java.util.Scanner;

public class DemoBoucleConditionnelles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//La boucle tant que
		/*
		int nombre;
		
		
		System.out.println("Donnez moi un nombre positif");
		
		nombre = scan.nextInt();
		
		while(nombre <= 0) {
			
			System.out.println("Erreur, votre nombre n'est pas positif. Recommencez");
			nombre = scan.nextInt();
		}
		
		System.out.println("Merci, le nombre " + nombre + " est bien positif");
		*/
		
		
		
		
		
		
		// répéter tant que
		
		float versement; 
		float credit = 1000.0f;
		
		do {
			System.out.println("Votre crédit est de " + credit + " euros. Combien voulez-vous rembourse ?");
			
			versement = scan.nextFloat();
			credit -= versement;
			
			
			
			
		} while(credit > 0);
		
		System.out.println("Voilà, vous avez tout remboursé");
	}

}
