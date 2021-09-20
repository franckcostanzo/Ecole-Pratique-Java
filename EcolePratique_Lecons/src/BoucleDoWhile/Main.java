package BoucleDoWhile;

public class Main {
	
	public static void main(String[] args) {
		
	int compteur = 1;
	
	// Faire une boucle de 1 jusqu'à 3 inclus
	do {
		System.out.println("Répétition "+ compteur);
		compteur++;
	} while (compteur <= 3);
	
	// 	On Sort de la boucle quand le compteur a dépassé 3
	System.out.println("Je me suis arrêté !");
	
	}
	
}
