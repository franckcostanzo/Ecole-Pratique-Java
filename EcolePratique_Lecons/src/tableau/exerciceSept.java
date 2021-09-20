package tableau;

import java.util.Arrays;

import util.Recup;

public class exerciceSept {
	
	public static void main (String[] args) {
		
		int count = 0;											// initialisation de la valeur qui servira de compte au nombre d'essai
		System.out.println("Combien d'essais veux-tu donner au deuxième joueur ?");
		int countMax = Recup.entier();
		
		System.out.print("Joueur 1 - Donnez moi un mot : ");	//récupération du premier mot
		String mot = Recup.chaine();
		
		char tabMot [] = new char [mot.length()];				// création de la premiere array
		for (int i=0;i<tabMot.length;i++) {						// assignation des valeurs en char du mot saisie dans le tableau tabMot
			tabMot[i] = mot.charAt(i);
		}
		
		String tabComparaison [] = new String [mot.length()];	// création de l'array qui va évoluer pour afficher les lettres trouvées
		for (int i=0; i<tabMot.length ;i++) {					// assignation des valeurs de base pour le tableau de comparaison
			tabComparaison[i] = "_ ";
		}
		
		System.out.println();
		System.out.println("Le mot du joueur1 :");
		for ( int i=0 ; i<tabComparaison.length; i++) {			// affichage de la longueur du mot
			System.out.print(tabComparaison[i]);			
		}
		System.out.println();
		System.out.println();
		
		while (true) {
			
			System.out.println("Essai n° " + (count + 1));
			System.out.println("Joueur 2 - Donnez moi un mot : ");	//récupération du deuxieme mot
			String motDeux = Recup.chaine();
		
			char tabMotDeux [] = new char [motDeux.length()];		// création de la deuxième
			
			if (count == (countMax -1 )) {							// si les essais de joueur2 sont égaux au compte maximum déterminé
				
				System.out.println("Désolé, après "+ countMax + " essais,");
				System.out.println("tu n'as pas trouvé le mot, tu as perdu !");
				break;
				
			}
			
			if (mot.length() == motDeux.length()) {					// on vérifie que la longueur donné par joueur2 est bonne
				
				for (int i=0;i<tabMotDeux.length;i++) {				// assignation des valeurs en char du mot saisie dans le tableau tabMotDeux
					tabMotDeux[i] = motDeux.charAt(i);
					}
					
					for (int i=0;i<tabMot.length ;i++) {			//on compare les lettres dans les mots
						if (tabMot[i] == tabMotDeux[i]) {
							tabComparaison[i] = Character.toString(tabMotDeux[i]) + " "; 
						}
					}
					
					
					System.out.println();
					System.out.println("Le mot du joueur1 :");
					for ( int i=0 ; i<tabComparaison.length; i++) {			// affichage des lettres trouvées par joueur2
						System.out.print(tabComparaison[i]);			
					}
					System.out.println();
					System.out.println();
					
					if (Arrays.equals( tabMot, tabMotDeux)) {				// si le joueur 2 trouve le mot
						
						System.out.println("Bravo tu as trouvé !");
						break;
						
					} 
					
					count++;												// on ajoute 1 au compteur
					
					}
			
			if (mot.length() != motDeux.length()) {							// si la taille du mot ne correspond pas
				
				System.out.println();
				System.out.println("La taille de ton mot ne correspond pas !");
				count++;													// on ajoute 1 au compteur
				
			} 
		}
	}
	
}
