package rechercheV1;

public class RechercheV1 {

	public static void main(String[] args) {
		
		boolean trouve = false;
		int compteur = 0;
		String nom = "lol";
		String[] liste = {"Alice", "Bob", "Carole", "David", "Emily", "Fabrice", "George", "John"};
		
		while(!trouve && compteur < liste.length) {
			
			System.out.println("Boucle numéro " + compteur);
			if(liste[compteur].equals(nom)) {
				trouve = true;
				System.out.println("Le nom " + nom + " a été trouvé en position " + compteur + " de la liste");
			}
			
			compteur+=1;
			
		}

	}

}
