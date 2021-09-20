package action;

import entity.*;
import util.Recup;

public class ActionClasse {
		
	public static Classe demanderNouvelleClasse() 
	{

		Classe newClasse = new Classe();
		System.out.println("Veuillez entrer le nom de votre classe : ");
		newClasse.nom = Recup.chaine();
		newClasse.professeurPrincipal = ActionProf.demanderNouveauProf();
		newClasse.etudiants = ActionStudent.initialisationEtudiants();
		
		return newClasse;
	}
	
	public static Classe[] initialisationClasse() 
	{
//		Classe ClasseArray [] = new Classe [2];
//		for (int i=0;i<ClasseArray.length; i++) {
//			Classe Classe = new Classe();
//			Classe = demanderNouvelleClasse();
//			ClasseArray[i] = Classe;
//		}
//		return ClasseArray;
		Prof[] professeurs = ActionProf.initialisationProfs();
		Student[] etudiants = ActionStudent.initialisationEtudiants();
		Classe classe1 = new Classe();
		classe1.nom = "3ème1";
		classe1.professeurPrincipal = professeurs[0];
		classe1.etudiants = new Student[] { etudiants[0], etudiants[1], etudiants[2], etudiants[3], etudiants[4] };
		Classe classe2 = new Classe();
		classe2.nom = "4ème2";
		classe2.professeurPrincipal = professeurs[1];
		classe2.etudiants = new Student[] { etudiants[5], etudiants[6], etudiants[7], etudiants[8], etudiants[9] };
		Classe classe3 = new Classe();
		classe3.nom = "5ème3";
		classe3.professeurPrincipal = professeurs[2];
		classe3.etudiants = new Student[] { etudiants[10], etudiants[11], etudiants[12], etudiants[13],
				etudiants[14] };
		return new Classe[] { classe1, classe2, classe3 };
	}
}
