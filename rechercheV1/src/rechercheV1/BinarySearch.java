package rechercheV1;

public class BinarySearch {

	public static void main(String[] args) {
		String[] liste = {"Adele", "Alice", "Anatole", "Bill", "Bob", "Brice", "Carole", "Cedrit", "Denis"};
		
		String nom = "Adele";
		
		String tps = "";
		
		int i = 0;
		
		int var = 0;
		
		int min = 0;
		int max = liste.length - 1;
		
		//String.equals renvoie 0 si s1 = s2, 
		//inféreur à zéro si s1 < s2
		//supérieur à zero si s1 > s2
		
		
		while(min <= max && tps != nom) {
			
			var = (min + max)/2;
			
			tps = liste[var];
			
			System.out.println("Element selectionné: " + tps + " à l'indice " + var);
			
			if(tps.compareTo(nom) < 0) {
				
				System.out.println("The value is smaller than the name");
				
				min = var + 1;
				
				
				
			} else if(tps.compareTo(nom) > 0) {
				
				System.out.println("The value is bigger than the name");
				
				max = var - 1;
				
			}
			i++;
			
		}
		
		if(tps == nom) {
			System.out.println("Le nom " + nom + " se trouve à l'indice " + var);
		} else {
			System.out.println("Le nom " + nom + " ne se trouve pas dans la liste");
		}

		
		
		/*
		 
String s1 = "Benoit";
                String s2 = "Zoe";

                // s1.compareTo(s2) :
                // 0   si s1 = s2
                // <0  si s1 < s2
                // >0  si s1 > s2
                
                if(s1.compareTo(s2) > 0)
                {
                        System.out.println(s1 + " est plus grand que " + s2);
                }
                else if (s1.compareTo(s2) == 0)
                {
                        System.out.println(s1 + " est égal à " + s2);
                }
                else
                {
                        System.out.println(s1 + " est plus petit que " + s2);
                }
		 */
	}

}
