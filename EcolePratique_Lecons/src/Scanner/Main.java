package Scanner;

import util.Recup;

public class Main {
	
	public static void main (String [] args) {
		
		System.out.print("Donnez un entier : ");
		int iSaisie = Recup.entier();
		System.out.println("Le nombre récupéré est : " + iSaisie);
		
		System.out.print("Donnez un mot : ");
		String sSaisie = Recup.chaine();
		System.out.println("La chaîne récupérée est : " + sSaisie);
		
		System.out.print("Donnez un nombre : ");
		float fSaisie = Recup.reel();
		System.out.println("Le flottant récupéré est : " + fSaisie);
		
		System.out.print("Donnez un nombre : ");
		double dSaisie = Recup.decimal();
		System.out.println("Le décimal récupéré est : " + dSaisie);
	}
}
