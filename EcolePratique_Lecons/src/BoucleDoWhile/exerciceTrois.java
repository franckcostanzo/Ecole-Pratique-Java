package BoucleDoWhile;

import util.Recup;

public class exerciceTrois {
	
	public static void main (String[] args) {
		int m = 0;
			
		
		for (int n=0;(n < 1 || n > 3); n=0) {
	
			System.out.print("Entrer un entier entre 1 et 3 : ");
			n = Recup.entier();
			m =n;
			if ((n > 0 ) && ( n < 4)) {
				break;
			}
			
			System.out.println("Votre entier : " + n + " n'est pas compris entre 1 et 3 !");
			
			
		}
		
		System.out.println("Votre entier : " + m + " est compris entre 1 et 3 !");
	}
}
