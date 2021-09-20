package action;

import entity.Prof;
import util.Recup;

public class ActionProf {
	
	public static Prof demanderNouveauProf() 
{
		
		Prof newProf = new Prof();
		System.out.println("Veuillez entrer le prénom de votre enseignant : ");
		newProf.prenom = Recup.chaine();
		System.out.println("Veuillez entrer le nom de votre enseignant : ");
		newProf.nom = Recup.chaine();
		System.out.println("Veuillez entrer la matière enseignée par votre enseignant : ");
		newProf.matiere = Recup.chaine();
		
		return newProf;
	}

	public static Prof[] initialisationProfs() 
	{
//		Prof profArray [] = new Prof [2];
//		for (int i=0;i<profArray.length; i++) {
//			Prof prof = new Prof();
//			prof = demanderNouveauProf();
//			profArray[i] = prof;
//		}
//		return profArray;
		return new Prof[] { new Prof("Langevin", "Roger", "Mathématiques"),
							new Prof("Einstein", "Paul", "Géographie"), 
							new Prof("Chartier", "Albert", "Chimie") };
	}
}
