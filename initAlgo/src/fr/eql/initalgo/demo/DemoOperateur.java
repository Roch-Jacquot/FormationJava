package fr.eql.initalgo.demo;

public class DemoOperateur {

	public static void main(String[] args) {
		
		int nb1, nb2, nb3;
		
		nb1 = 1 + 3;
		System.out.println(nb1);

		
		//mult
		nb2 = 2 * 6;
		System.out.println(nb2);
		
		//div
		
		nb3 = 5/2;
		System.out.println(nb3);
		
		float nb4 = 5f;
		float nb5 = 2f;
		float resultat = nb4/nb5;
		
		System.out.println(resultat);
		
		//modulo
		
		nb1 = 5%2;
		System.out.println(nb1);
		
		//incrément
		
		int nb6 = 1;
		nb6 +=1;
		++nb6;
		nb6++;
		nb6--;
		System.out.println(nb6);
	}

}