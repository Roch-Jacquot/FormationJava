package fr.eql.ai108.valref;

public class PassageParValeurDansMethode {

	public static void main(String[] args) {
		
		int nombre = 100;
		doubler(nombre);
		System.out.println("Après appel de la méthode doubler, nombre vaut " + nombre);
		nombre = doublerVraiment(nombre);

	}
	
	public static void doubler (int nb) {
		nb*= 2;
		System.out.println("Dans la méthode doubler, nb vaut " + nb);
	}
	
	public static int doublerVraiment(int nb) {
		
		return nb *= 2;
	}

}
