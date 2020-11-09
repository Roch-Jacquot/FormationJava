package fr.eql.initalgo.demo;

import java.util.Scanner;

public class DemoInput {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);	
		System.out.println("Bienvenue. Choisissez le nom de votre héros");
	
		String nomHeros = scan.nextLine();
		System.out.println(nomHeros);
		
		System.out.println("Quel est l'âge de votre héros?");
		int ageHeros = scan.nextInt();
		System.out.println("Votre héros s'appelle donc " + nomHeros +  " et a " + ageHeros + " ans");
		
		scan.close();
		
	}

}
