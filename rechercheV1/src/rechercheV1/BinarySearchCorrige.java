package rechercheV1;

public class BinarySearchCorrige {

	public static void main(String[] args) {
		
		//Init

		String[] noms = {"Azkaban", "Bobba", "Edwige", "Ermione", "Fili", 
				"Frodon", "Gandalf", "Gimli", "Gollum", "Han solo", "Mithrandir"};
		String recherche = "Fili";
		int debut = 0;
		int fin = noms.length;
		
		boolean trouve = false ;//flat 
		boolean rechercheTermine = false;

		
		//traitement
		
		
		while(!trouve && !rechercheTermine) {
			
			System.out.print("Portion de " + debut + " à " + fin + " : ");
			
			int milieu = (debut + fin)/2;
			
			if(recherche.equals(noms[milieu])) {
				System.out.println("Trouvé !!! indice : " + milieu);
				trouve = true;
				
			}
			
			if(noms[milieu].compareTo(recherche) < 0) {
				
				System.out.println("Plus grand que " + noms[milieu]);
				debut = milieu + 1;
				
			}
			
			if(noms[milieu].compareTo(recherche) > 0) {
				
				System.out.println("Plus petit que " + noms[milieu]);
				fin = milieu ;
				
			}
			if(fin == -1 || debut == noms.length || debut == fin) {
				rechercheTermine = true;
			}
			
			
		}
		
		if(!trouve) {
			System.out.println("Element non trouvé");
		}
	}

}
