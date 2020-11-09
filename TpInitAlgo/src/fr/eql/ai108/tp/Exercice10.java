package fr.eql.ai108.tp;

import java.util.Scanner;
import java.util.Random;

public class Exercice10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
//		Ecrire un programme qui génère un nombre aléatoire compris entre 0(inclus)et 100(exclu), et 
//		qui propose au joueur de le deviner en 5 essais. A chaque essai, le programme donne un indice 
//		(«C’est plus petit»ou «C’est plus grand»). Si le joueur trouve avant que le nombre total d’essais soit épuisé, 
//		il gagne un point; sinon, il perd un point. A la fin de chaque partie, le joueur ala possibilité d’arrêter de jouer ou 
//		de commencer une nouvelle partie.
		
		boolean jeu = true;
		int valJeu;
		int guess = -1;
		int points = 0;
		
		do {
	
			valJeu = random.nextInt(100);
			//System.out.println("This is valJeu " + valJeu);
			
			for(int i = 0; i < 5 ; i++) {
			
				System.out.println("Veuillez entrer votre guess");
				guess = scan.nextInt();
				
				if(valJeu == guess) {
					System.out.println("Bien joué!");
					points += 1;
					break;
					
				} else {
					
					if(valJeu > guess) {
						System.out.println("C’est plus grand");
						
					} else {
						
						System.out.println("C’est plus petit");
					}
				}
				
			}
			//System.out.println("Le guess en sortie est " + (valJeu != guess));
			if(valJeu != guess) {
				points -= 1;
			}
			
			System.out.println("La valeur était " + valJeu);
			
			System.out.println("La partie est finie, voulez-vous en rejouer une ? (true, false)");
			
			jeu = scan.nextBoolean();
			
			
		
		} while (jeu);

		System.out.println("Vous avez " + points + " points en fin de partie");
		
		scan.close();
		
		
	}
}
