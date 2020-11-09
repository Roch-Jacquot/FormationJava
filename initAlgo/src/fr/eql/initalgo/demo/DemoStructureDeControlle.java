package fr.eql.initalgo.demo;

import java.util.Scanner;

public class DemoStructureDeControlle {

	public static void main(String[] args) {
		
		int x = 127;
		int y = 255;
		
		//Si avec l'opérateur booléen OU : | soit ||
		
		if((x > 40) || (y < 50)) {
			
			System.out.println("ça passe");
			
		} else {
			
			System.out.println("ça passe pas");
			
		}
		
		//Si avec l'operateur ET : & ou && 
		
		if((x == 42) && (y >= 30)) {
		
			System.out.println("ça passe");
			
		} else  if(x <= 400) {
			
			System.out.println("ça passe dans le else if");
			
		} else {
			
			System.out.println("ça passe pas ni dans le if, ni dans le else if");
		}

		
		// Le OU exclusif : ^
		
		if((x == 0) ^ (y == 255)) {
			System.out.println("Ca passe dans le XOR");
		}
		
		
		
		String chaine1 = "toto";
		String chaine2 = "tata";
		if(!chaine1.equals(chaine2)) {
			System.out.println("ce sont les mêmes");
		}
		
		
		//La structure de controle switch
		
		Scanner scan = new Scanner(System.in);
		String arme = null;
		System.out.println("Un troll vous attaque; quelle arme souhaitez-vous utiliser ? (épée/arc/magie)");
		arme = scan.nextLine();
		
		switch(arme) {
		case "épée" : 
			System.out.println("Vous avez choisi la voie du guerrier;"
					+ " votre coup d'épée fait perdre 2PV au troll");
			break;
		case "arc" : 
			System.out.println("Vous avez choisi la voie du chasseur;"
					+ " votre flèche fait perdre 1PV au troll");
			break;
		case "magie" : 
			System.out.println("Vous avez choisi la voie du magicien;"
					+ " malheureusement le troll est resistant à la magie et vous bouffe");
			break;
		default :
			System.out.println("Vous faites le malin. Vous êtes donc tout nu. Le troll vous bouffe");
			break;
		}
		
		scan.close();
	}

}
