package fr.eql.ai108.tp;

public class Exercice9 {

	public static void main(String[] args) {
		/*String var = "                   *";
		
		for(int i = 1; i <= 20; i++) {
			System.out.println(var);
			var = var +"**";
			var = var.substring(1);
			
		}*/
		
		//taille = 5
		//nb Espaces = taille - étage - 1
		//nb étoiles = 2*etage + 1
		//
		
		String var = "*";
		int tot = 12;
		int trial = tot;
		
		for(int i = 0; i <=tot; i++) {
				for(int j = 0; j < trial; j++) {
					System.out.print(" ");
					}
			trial -= 1;
			System.out.println(var);
			var = var + "**";
			
			
		}
		
	}

}

