package fr.eql.ai108.tp;

import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		/*Ecrire un programme qui demande l'âge d'un enfant à l'utilisateur. Ensuite, il l'informe 
		 * de sacatégorie :–
		 * « Poussin » de 6 à 7 ans–
		 * « Pupille » de 8 à 9 ans–
		 * « Minime » de 10 à 11 ans–
		 * « Cadet » après 12 ans*/
		
		System.out.println("Veuillez m'indiquer l'âge de votre enfant, il doit avoir plus de 5 ans");
		
		int age = scan.nextInt();
		
		if(age == 6 || age == 7) {
			System.out.println("Poussin");
			
		} else if(age == 8 || age == 9) {
			System.out.println("Pupille");
			
		} else if(age == 10 || age ==11) {
			System.out.println("Minime");
			
		} else if(age >= 12) {
			System.out.println("Cadet");
			
		}
		
		scan.close();
		
	}

}
