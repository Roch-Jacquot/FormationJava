package fr.eql.initalgo.demo;

public class DemoVariables {

	public static void main(String[] args) {
		// LES NOMBRES
		//byte : entier court codé sur un octet (-128 à + 127)
		byte temperature; 
		temperature = 42; 
		System.out.println(temperature);
		temperature = 36;
		System.out.println(temperature);
		// cette grandeur est tpro élevée pour un byte
		//temperature = 300;

		//short : entier court stocké sur 2 octets (-32768 à +32767)
		short vitesse = 32000;
		System.out.println(vitesse);
		
		
		//int : entier codé sur 4 octets (-2*10^9 à  2*10^9)
		int distance = 420000000;
		System.out.println(distance);
		distance = 0b111; //en binaire
		System.out.println(distance);
		distance = 0xFF; // hexa
		System.out.println(distance);
		
		
		//long: entier long codé sur 8 octets (-9*10^18 à +9*10^18)
		//un long doit être suffixé par un L
		long annneLumiere = 9460700000000000L;
		
		
		//float un nombre à virgule codé sur 4 octets ()
		// une float doit être suffixé par un f;
		float pi = 3.141592653f;
		System.out.println(pi);
		
		
		//double : nb à virgule flottante codé sur 8 octets
		
		double grosFloat = 0.333333333333333333333333333333d;
		
		//Booleen est stocké sur un octet
		
		boolean unBool = true;
		System.out.println(unBool);
		
		
		//Les chaines de caractères
		
		
		//char s'écrit par convention entre '' et est stocké sur 2 octets
		
		char caractere = 'a';
		System.out.println(caractere);
		
		//Chaine de caractèeres
		
		// premiere façon de déclarer
		
		String phrase;
		phrase = "Une chaine de fautes";
		
		System.out.println(phrase);
		System.out.println(phrase.charAt(14));
		
		//Deuxième facon de declarer un String
		String phrase2 = new String("this is a test");
		System.out.println(phrase2);
		
		String phrase3 = new String();
		phrase3 = "This is my String; yeaaa";
		
		System.out.println(phrase3);
		
		
		//Concaténation des Chaînes de caractères
		
		String concat = phrase + " " + phrase2 + " " + phrase3;
		
		System.out.println(concat);
	}

}
