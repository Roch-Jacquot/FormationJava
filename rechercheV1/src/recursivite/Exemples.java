package recursivite;

public class Exemples {

	public static void main(String[] args) {
		afficherR("a", 10);

	}
	
	public static void afficherR(String lettre, int n) {
		
		System.out.println(lettre);
		
		if(n > 1) {
			afficherR(lettre, n-1);;
		}
	}

}
