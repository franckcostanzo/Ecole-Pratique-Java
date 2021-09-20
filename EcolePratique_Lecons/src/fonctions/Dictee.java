package fonctions;

import util.Recup;

public class Dictee {

	public static void main(String[] args) {
		
		System.out.println("Bonjour utilisateur, comment voulez-vous calculer ?");
		
		System.out.println("1 : avec for");
		
		System.out.println("2 : avec while");
		
		int choix = Recup.entier();
		float total = 0;
		
		if (choix==1) {
			for (int i =1; i< 10; i+=2) {
				
				float prix = i * 1.37f;
				if (prix >8.3f) {
					prix -=2;
				}
				
				System.out.println("Le prix du sandwich" + i + " est de " + prix);
				total += prix;
				
			}
			
		} else {
			
			while (total != 100) {
				
				int i = 1;
				System.out.println("Donnez le prix " + i);
				
//				float saisie = Recup.reel();
				float prix = i * 1.37f;
				
				if (prix > 8.3f) {
					
					prix -= 3;
					
				}
				
				System.out.println("Le prix du sandwich" + i + " est " + prix);
				total += prix;
				
			}
						
		}
		
		System.out.println("Le prix total est " + total);
		System.out.println("Bienvenue dans l'informatique !");
	}

}
