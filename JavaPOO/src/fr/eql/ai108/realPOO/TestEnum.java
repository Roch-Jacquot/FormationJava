package fr.eql.ai108.realPOO;

import java.util.Scanner;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Déclarer et affecter une valeur d'Enum
		GroupeChien unGroupeChien = GroupeChien.SPITZ;
		System.out.println("Valeur de l'enum affectée " + unGroupeChien);
		
		//Afficher toutes les valeurs de mon enum:
		GroupeChien[] groupes = GroupeChien.values();
		
		for (int i = 0; i < groupes.length; i++) {
			System.out.println(groupes[i]);
		}
		for (GroupeChien groupeChien : groupes) {
			System.out.println(groupeChien + "v2");
		}
		
		
		
		
		//Récuperer une String et la transformer en valeur d'enum
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Selectionnez un groupe de Chiens");
		String groupeSelected = scan.nextLine();
		GroupeChien enumValueSelected = GroupeChien.valueOf(groupeSelected.toUpperCase());
		System.out.println(enumValueSelected);
		
		scan.close();
	
	
	}

}
