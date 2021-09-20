package exercices;

import util.Recup;

public class exerciceTroisBis {
	
	public static void main(String[] args) {
		
		System.out.print("Veuillez entrer votre nombre d'étudiants : ");
		int nbEtudiants = Recup.entier();
		Etudiants[] tabEtudiants= new Etudiants[nbEtudiants];
		
		for (int i=0;i<nbEtudiants;i++) {
		tabEtudiants[i] = new Etudiants();
		System.out.print("Veuillez entrer un nom : ");
		tabEtudiants[i].nom = Recup.chaine();
		System.out.print("Veuillez entrer sa première note : ");
		tabEtudiants[i].note1 = Recup.decimal();
		System.out.print("Veuillez entrer sa deuxième note : ");
		tabEtudiants[i].note2 = Recup.decimal();
		}
		
		for (int i=0;i<nbEtudiants;i++) {
			tabEtudiants[i].show();
		}
	}
	
}
