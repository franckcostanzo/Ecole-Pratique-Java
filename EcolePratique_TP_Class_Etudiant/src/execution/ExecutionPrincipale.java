package execution;
import util.Recup;
import entity.*;
import action.*;

public class ExecutionPrincipale {
	
	public static void main(String[] args) 
	{
		
		while (true) 
		{
			
			System.out.println("Menu Principal"
								+"\r\n--------------"
								+ "\r\n1) Afficher les moyennes de chaque classe"
								+ "\r\n2) Afficher le détail d'une classe"
								+ "\r\n3) Afficher tous les étudiants"
								+ "\r\n4) Afficher le détail d'un étudiant"
								+ "\r\n5) Afficher tous les professeurs"
								+ "\r\n0) Quitter");
			System.out.println(" ");
			
			System.out.print("Faites votre choix : ");
			int choix = Recup.entier();
			System.out.println(" ");
			
			if (choix == 0) 
			{
				System.out.println("Merci au revoir !");
				break;
			}
			
			switch (choix) 
			{
				
				case 1:
					moyennesClasses();
					break;
				case 2:
					affichageDetailClasses();
					break;
				case 3:
					affichageDesEtudiants();
					break;
				case 4:
					suiviDesEtudiants();
					break;
				case 5:
					afficherProfPrincipaux();
					break;
				default :
						System.out.println("Votre choix est incorrect !");
						System.out.println(" ");
			}
		}

	}
	
	public static void moyennesClasses() 
	{
		
		Classe toutesLesClasses [] = ActionClasse.initialisationClasse();
		
		System.out.println(" ");
		System.out.println("Moyennes de chaque classe"
							+"\r\n-------------------------");
		for (int i =0; i<toutesLesClasses.length; i++) 
		{
			System.out.println(toutesLesClasses[i].affichageMoyenne());
			System.out.println(" ");
		}
	}
	
	public static void affichageDetailClasses() 
	{
		
		Classe toutesLesClasses [] = ActionClasse.initialisationClasse();
		while (true) {
			
			System.out.println(" ");
			System.out.println("Afficher le détail d'une classe"
								+"\r\n-------------------------");
			for (int i = 0; i< toutesLesClasses.length; i++) 
			{
				System.out.println((i+1) + ") " + toutesLesClasses[i].nom);
			}
			System.out.println("0) Revenir au Menu Principal");
			
			System.out.println(" ");
			System.out.print("Faites votre choix : ");
			int choix = Recup.entier();
			System.out.println(" ");
			
			if (choix == 0) 
			{
				System.out.println("Retour au menu Principal");
				System.out.println(" ");
				break;
			} else if ( choix <= (toutesLesClasses.length)) {
				System.out.println(toutesLesClasses[(choix -1)].affichage());
				System.out.println(" ");
				break;
			} else 
			{
				System.out.println("Votre choix est incorrect !");
				System.out.println(" ");
						
			}
			
		}
	}
	
	public static void affichageDesEtudiants() 
	{
		
		Classe toutesLesClasses [] = ActionClasse.initialisationClasse();
		System.out.println("Tous les étudiants"
				+"\r\n------------------");
		for (int i=0; i< toutesLesClasses.length; i++) 
		{
			System.out.println(toutesLesClasses[i].nom);
			for (int j=0; j<toutesLesClasses[i].etudiants.length;j++) 
			{
				System.out.println(toutesLesClasses[i].etudiants[j].nomPrenom());
			}
			System.out.println(" ");
		}
		
		
		
	}
		
	public static void suiviDesEtudiants() 
	{
		
		Classe toutesLesClasses [] = ActionClasse.initialisationClasse();
		while (true) {
			
			System.out.println(" ");
			System.out.println("Tous les étudiants"
								+"\r\n------------------");
			for (int i = 0; i< toutesLesClasses.length; i++) 
			{
				System.out.println((i+1) + ") " + toutesLesClasses[i].nom);
			}
			System.out.println("0) Revenir au Menu Principal");
			
			System.out.println(" ");
			System.out.print("Faites votre choix : ");
			int choix = Recup.entier();
			System.out.println(" ");
			
			if (choix == 0) 
			{
				System.out.println("Retour au menu Principal");
				System.out.println(" ");
				break;
			} else if ( choix <= (toutesLesClasses.length)) {
				for (int i = 0; i< toutesLesClasses[(choix -1)].etudiants.length; i++) 
				{
					System.out.println((i+1) + ") " + toutesLesClasses[(choix -1)].etudiants[i].nomPrenom());
				}
				System.out.println("0) Revenir au Menu Principal");
				
				System.out.println(" ");
				System.out.print("Faites votre choix : ");
				int choix2 = Recup.entier();
				System.out.println(" ");
				
				if (choix2 == 0) 
				{
					System.out.println("Retour au menu Principal");
					System.out.println(" ");
					break;
				} else if ( choix2 <= (toutesLesClasses[(choix -1)].etudiants.length)) 
				{
					System.out.println(toutesLesClasses[(choix -1)].etudiants[(choix2-1)].affichage());
					System.out.println(" ");
					break;
				} else 
				{
					System.out.println("Votre choix est incorrect !");
					System.out.println(" ");
				}

				
			} else 
			{
				System.out.println("Votre choix est incorrect !");
				System.out.println(" ");
						
			}
			
		}
		
	}
	
	public static void afficherProfPrincipaux() 
	{
		Classe toutesLesClasses [] = ActionClasse.initialisationClasse();
		System.out.println("tous les professeurs"
				+"\r\n-----------------------------");
		for (int i = 0; i<toutesLesClasses.length;i++) 
		{
			System.out.println(toutesLesClasses[i].nom
					+"\r\nProfesseur Principal : " + toutesLesClasses[i].professeurPrincipal.affichage());
			System.out.println(" ");
		}
	}
	

}
