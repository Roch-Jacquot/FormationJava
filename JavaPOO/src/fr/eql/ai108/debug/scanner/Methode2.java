package fr.eql.ai108.debug.scanner;

import java.util.Scanner;

public class Methode2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Saisissez un int");
		
		
		//bugfix 2 
		int unInt = Integer.parseInt(scan.nextLine());  //Utilsier un nextLine et le convertir en int
		
		System.out.println(unInt);
		
		
	
		
		
		
		
		
		System.out.println("Saisissez une String");
		String uneString = scan.nextLine();
		System.out.println(uneString);
		System.out.println("Fin de programme");
		
		scan.close();
	}
}
