package fr.eql.ai108.tp;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez choisir un nombre");
		
		int nombre = scan.nextInt();
		
		if(nombre % 2 == 0) {
			System.out.println("La moitié du nombre est " + nombre/2);
		} else {
			System.out.println("La somme du triple de ce nombre et de un est " +((3*nombre)+1));
		}
		
		//opérateur ternaire / Ternary operation
		int resultat = nombre%2 == 0 ? nombre/2 : 3*nombre+1;
		System.out.println(resultat);
		
		
		scan.close();
	}

}
