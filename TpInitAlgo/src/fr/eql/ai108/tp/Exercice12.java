package fr.eql.ai108.tp;

public class Exercice12 {

	public static void main(String[] args) {


		int tot = 10;
		int trial = tot;
		long val = 1L;
		for(int i = 0; i < tot; i++) {
			for(int j = 0; j < trial; j++) {
				System.out.print(" ");
				
			}
			trial -= 1;
			System.out.println(val);
			val = val*11;
		}
		
		System.out.println(val);

		
		
		
		
		int taille = 7;
		int temp = 0;
		
		int[][] tab = new int[taille][taille];
		for(int i = 0; i <tab.length; i++) {
				if(i == 0) {
					temp = taille/2;
					tab[i][temp] = 1;
				
				} else {
					if(i % 2 != 0) {
						temp = taille/2 - i;
						System.out.println(taille/2);
						System.out.println("\nthis is temp before correction " + temp);
						if(temp < 0) {temp = 0;}
						System.out.println("this is temp = " + temp);
						for(int j = temp; j <= temp + i + 1; j+= 2) {
							System.out.println("\nthis is temp + i + 1 = " + (temp + i + 1));
							System.out.println("this is i and j  = " + i + "-" + j);
							tab[i][j] = 1;
						}
					} else if(i % 2 != 0) {
						
					}
				}
		}
		
		
			
			
		
	for(int i = 0; i <tab.length; i++) {
		for(int j = 0;j <tab[i].length; j++) {
			System.out.print(tab[i][j]);
			
		} System.out.println();
	}
		
		
		
	}

}
