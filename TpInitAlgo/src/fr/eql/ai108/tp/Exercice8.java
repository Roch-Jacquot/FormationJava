package fr.eql.ai108.tp;

import java.util.Scanner;

public class Exercice8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nb;
		int tot = 1;
		
		System.out.println("Veuillez indiquer un nombre");

		nb = scan.nextInt();
		
		for(int i = 1; i <= nb; i++) {
			tot *= i;
			//System.out.println(i);
			System.out.println(tot);
		}
		
		System.out.println("Le résultat est " + tot);
		scan.close();
	}

}
