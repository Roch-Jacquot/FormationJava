package fr.eql.ai108.realPOO;

public class TestMethodeObject {

	public static void main(String[] args) {
		Chien ein = new Chien("Ein", 8, 0.45f, 7.2f, "Welsh Corgi", 'E');
		Chien laika = new Chien("Laika", 7, 0.75f, 12.45f, "Berger Allemand", 'X');
		
		System.out.println(ein);
		System.out.println(laika);
		
		
		//Equals
		System.out.println(ein.equals(laika));
		System.out.println(ein.equals(ein));
		
		//Test Clone
		
		try {
			Chien copieEin = ein.clone();
			System.out.println(ein.equals(copieEin));
			copieEin.setNom("Iggy");
			System.out.println(ein.getNom());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
