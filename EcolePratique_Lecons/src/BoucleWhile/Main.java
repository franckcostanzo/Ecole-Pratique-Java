package BoucleWhile;

import util.Recup;

public class Main {
		
												/*  Boucle While */
	/*¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤*/
	public static void main(String[] args) {
		
	int x = 1;	
	int somme = 0;
	
	while ( x != 0 ) {
		
		System.out.print("Entrer un entier (0 pour arrêter)");
		x = Recup.entier();
		somme = somme +x;
		}
	
	System.out.println("La somme est : " + somme);
	
	
	
	
	
	int n = 0; // la variable "n" est initialisee à 0
	int Somme = 0;
	/* Etant donnee que la condition (n!=0) est fausse dans ce cas là,
	le programme ne rentrera jamais dans la boucle */
	while (n!=0) {
	System.out.println( "Entrer un entier (0 pour arrêter) :");
	n = Recup.entier();
	Somme = Somme + n;
	}
	// La somme sera égale à 0
	System.out.println("La somme est : " + somme);
	
}
}
