package exercices;

import util.Recup;

public class exerciceTrois {
	
	public static void main(String[] args) {
		
		Etudiants etudiant1 = new Etudiants();
		System.out.print("Veuillez entrer un nom : ");
		etudiant1.nom = Recup.chaine();
		System.out.print("Veuillez entrer sa première note : ");
		etudiant1.note1 = Recup.decimal();
		System.out.print("Veuillez entrer sa deuxième note : ");
		etudiant1.note2 = Recup.decimal();
		
		etudiant1.show();
		
		
	}
}
