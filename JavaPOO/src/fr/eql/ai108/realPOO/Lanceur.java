package fr.eql.ai108.realPOO;

public class Lanceur {

	public static void main(String[] args) {
		
		Chien ein = new Chien();
		Chien laika = new Chien("Laika", 9, 0.9f, 15.42f, "Berger", true, 'L');
		
		
		//affectation 
		
				ein.setNom("Ein");
				ein.setAge(7);
				ein.setEstGentil(true);
				ein.setTaille(0.7f);
				ein.setPoids(7);
				ein.setRace("Welsh Corgi");
				ein.setPedigree('E');
				
				
		//System.out.println(laika.nom);

		System.out.println(laika.getNom());
		
		laika.setNom("Spot the Space Dog");
		
		System.out.println(laika.getNom());
		
		
		//acceder à la variable de classe
		System.out.println(Chien.getNbChien());
		System.out.println(laika.getNbChien());
		System.out.println(ein.getNbChien());
		
	}

}
