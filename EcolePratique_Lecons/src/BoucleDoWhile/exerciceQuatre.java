package BoucleDoWhile;

import util.Recup;

public class exerciceQuatre {
	
	public static void main(String[] args) {
		
		int n = 0;	
		
		do {
	
			System.out.print("Entrer un entier entre 10 et 20 : ");
			n = Recup.entier();
			
			if ((n > 9 ) && ( n < 21)) {
				break;
			} else if ( n < 10) {
				System.out.println("Votre entier : " + n + " est plus petit que 10 !");
			} else if ( n > 20) {
				System.out.println("Votre entier : " + n + " est plus grand que 20 !");
			}
			
			
		}while ( (n < 10) || (n > 20) );
		
		System.out.println("Votre entier : " + n + " est compris entre 10 et 20 !");
	}	
}

