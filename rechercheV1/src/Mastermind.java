

import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {
		//PARAMETRES :
			//tableau GuessJoueur : Char
			//tableau actualOrdi char[]
			//nombre de tours : int
			//gagner : boolean
			//boolean : quitter
		
		
		//TRAITEMENTS
			// 1 - initialiser le tableau ordi 
		Scanner scan = new Scanner(System.in);
		char[] actualOrdi;
		char[] guessJoueur;
		int place;
		int trouve;
		boolean gagne = false;
		
		//String actualOrdi = scan.nextLine();
		String declareDevine = "BJBJ";
		 actualOrdi = selectChaine(declareDevine);
				// 1.1 - afficher le lenght pour que le joueur ne se trompe pas
		
		System.out.println("La machine a déclaré " + actualOrdi.length + " lettes");
		
		
			// 2 - répéter
		do {
					// 2.1 - Demander au joueur d'entrer un String et leconvertir en tableau
			guessJoueur = guess(scan);
			System.out.print("Le joueur a déclaré " + guessJoueur.length + " lettes et elles sont ");
	//		for (char c : GuessJoueur) {
	//			System.out.print(c);
	//		}
			
					// 2.2 - boucler sur les deux tableaux
					place = 0;
					trouve = 0;
			
					for (int i = 0; i < actualOrdi.length; i++) {
						// 2.2.1 - si tabA[i] == tabB[i] : Place ++
						if(actualOrdi[i] == guessJoueur[i]) {
							place ++;
						} else if(actualOrdi[i] != guessJoueur[i]) {
							
						}
						//			si tabA[i] != tabB[i] mais tabB[i] in tabA, TRouve ++
						
						
					}
	
					// 2.3 - Si place == tab.length : gagner = true;
					if(place == actualOrdi.length) {
						gagne = true;
						System.out.println("\nFelicitations, vous avez gagné");
					}
			
					// 2.4 - incrémenter tours;
			
					
		} while(!gagne);
				scan.close();
	}
	
	
	private static char[] guess(Scanner scan) {
		System.out.println("Veuillez constuire une suite de X couleurs à l'aide des couleurs suivantes : "
				+ "Bleu,  Jaune,  Vert,  Rouge,  Marron  et  Noir. Entrez la première lettre des couleurs choisies");
		String monGuess = scan.nextLine();
		char[] guessJoueur = monGuess.toUpperCase().trim().toCharArray();
		
		return guessJoueur;
	}


	public static char[] selectChaine(String declareDevine) {
		
		System.out.println("Veuillez constuire une suite de X couleurs à l'aide des couleurs suivantes : "
				+ "Bleu,  Jaune,  Vert,  Rouge,  Marron  et  Noir. Entrez la première lettre des couleurs choisies");
		
		char[] actualOrdi = declareDevine.toUpperCase().trim().toCharArray();
		return actualOrdi;
	}
}
