package fr.eql.ai108.scope;

public class TestScope {

	//une variable ne peut pas être consommée avant sa déclaration
	//En Java, les variables ont un scope(portée) de bloc {}
	//Dans un contexte d'exécution, les scopes enfants ont accès aux variables déclarées
	//dans leur(s) parent(s). mais les scopes parents n'ont pas accès aux scopes de leurs enfants
	public static void main(String[] args) {
		
		int dansLeMain = 42;
		
		if(true) {
			int dansLeIf = 43;
			System.out.println(dansLeMain);
			System.out.println(dansLeIf);
		}
		
//		System.out.println(dansLeIF); //ne marche pas, car la déclaration est dans le IF qui est un scope enfant;
		
		
		for (int i = 0; i < 1; i++) {
			int dansLaBoucle = 44;
			System.out.println(dansLeMain);
			System.out.println(dansLaBoucle);
			if(true) {
				int dansLeIfDansLaBoucle = 45;
				System.out.println(dansLeMain);
				System.out.println(dansLaBoucle);
				System.out.println(dansLeIfDansLaBoucle);
							}
		}
	}

}
