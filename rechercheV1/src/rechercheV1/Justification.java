package rechercheV1;

public class Justification {
	
	static int tailleMARGE = 5;
	

	public static void main(String[] args) {
		
	//règle de gestion :
		//- les marges sont inclues dans la tailel de la ligne (5car - 110 - 5car)
		
	//PARAMETRES :
//		-taille des marges : entier
//		-taille de la ligne : entier (120)
//		-texte à justifier : chaine de caractères (string)
		
		
		
	//TRAITEMENTS
		
		// 1 - initialiser le String et le convertir en tableau de char
		//String string = "    Ce texte,   qui  est volontairement très            mal  tapé, est justifié   correctement.";
		//String string = "    you                            mom is super faaaaaaaaaaaaat.";
		String string = "q r c J   ";
		System.out.println(string.length());
		char[] monCar = string.toCharArray();
		
		int tailleLIGNE = 120;
		// 2 - définir : nombre de mots
		// 5 - nombre séparateur
		int nbMots = 0;
		int nbSep = 0;
		
		for (int i = 0; i < monCar.length-1; i++) {
			if(monCar[i] != ' ' && monCar[i+1] == ' ')
			{
				nbSep += 1; 
			}
		}
		if(monCar[monCar.length-1] == ' ') {
			nbSep = nbSep - 1;
		}
		nbMots = nbSep + 1;
		System.out.println("il y a " + nbMots + " mots et " + nbSep + " séparateurs");
		
		// 3 - nombre de lettres/caractères,
		// 4 - nombre d'espaces total
		int lettres = 0;
		int espaces = 0;
		for (int i = 0; i < monCar.length; i++) {
			if(monCar[i] == ' ') {
				espaces += 1;
			} else if(monCar[i] != ' ') {
				lettres += 1;
			}
		}
		System.out.println("il y a " + lettres + " lettres et " + espaces + " espaces");
		
		
		// 6 - définir la taille séparateur
		
		int tailleSeparateur = (tailleLIGNE - 2*tailleMARGE - lettres)/nbSep;
		int tailleSepRestant = (tailleLIGNE - 2*tailleMARGE - lettres)%nbSep;
		System.out.println(tailleSeparateur + "   mais il reste " + tailleSepRestant);
		// 7 - fabriquer le texte justifié (table de car)
		// 		ecrire la marge de gauche
		//		Répéter
			//		ecrire un mot : sequence de lettres sans espace
			//		ecrire un separateur : quand j'ai un espace qui suit une lettre
		//jusquà la fin
		//ecrire la marge de droite
		
		char[] monCarJust = new char[120];
		
		for (int i = 0; i < tailleMARGE; i++) {
			monCarJust[i] = '*';
		}

		
		int lag = tailleMARGE;
		int lettresComptees = 0;
		
		for (int i = 0; i <monCar.length; i++) {

			if(monCar[i] != ' ') {
				System.out.println("Première condition ");
				System.out.println("This is the current i of table 1 " + monCar[i] + " at " + i) ;
				
				
				monCarJust[lag] = monCar[i];
				lag ++;
				lettresComptees++;
				System.out.println("This is i + lag of table 2 = " + monCarJust[/*i+*/lag] + " at " + (/*i+*/lag));
				
			} else if (i > 0 && monCar[i] == ' ' && monCar[i-1] != ' ' && lettresComptees < lettres) {
				System.out.println("Deuxième condition ");
				for (int j = 0; j < tailleSeparateur; j++) {
					
					System.out.println("This is i + lag in the tailleSep section = " + (/*i+*/lag));

					monCarJust[lag] = '#';
					lag ++;
					
				}
				
				if(tailleSepRestant > 0) {

					monCarJust[lag] = '#';
					lag ++;
					tailleSepRestant = tailleSepRestant - 1;
					System.out.println("This is i + lag in tailleSepReste = " + (i+lag) + " et il"
							+ " reste " + tailleSepRestant + " Sep restants");
					System.out.println(monCarJust[i+lag]);
					
				}
			}
		
		}
		
		
		
		for (int i = 0; i < tailleMARGE; i++) {
			monCarJust[lag] = '*';
			lag ++;
		}
		
		
		for (char c : monCarJust) {
			System.out.print(c);
		}
		
		System.out.println();
		for (int i = 0; i < monCarJust.length; i++) {
			System.out.println(monCarJust[i] + " index i :" + i);
		}
		
		
		
		
	
	}
}
