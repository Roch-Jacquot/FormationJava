package fr.eql.ai108.tp;

import java.util.Scanner;

public class Exercice6 {

	public static void main(String[] args) {
		
		int nb;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Veuillez entrer un nombre");
		
		nb = scan.nextInt();
		

		for(int i = nb + 1; i < nb+11; i++) {
			System.out.println(i);
			
		}
		
		scan.close();
	}

}
