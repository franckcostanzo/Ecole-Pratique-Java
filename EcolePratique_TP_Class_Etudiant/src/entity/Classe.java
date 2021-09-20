package entity;

public class Classe 
{
	
	// Attributs :
	
	public String nom;
	public Prof professeurPrincipal;
	public Student[] etudiants;
	
	// Constructeur :
	
	public Classe (String nom, Prof professeurPrincipal, Student[] etudiants) 
	{
		this.nom = nom;
		this.professeurPrincipal = professeurPrincipal;
		this.etudiants = etudiants;
		
	}
	
	public Classe () 
	{
		etudiants = new Student[5];
	}
	
	//getters :
	
	
	// Méthodes :
	
	public float plusBasseMoyenne() 
	{						/*: renvoie la moyenne la plus basse de la classe*/
		float plusBasseMoyenne = 20;
		for (int i = 0; i < etudiants.length; i++) {		
			float moyenneDeComparaison = etudiants[i].moyenne();
			if (moyenneDeComparaison < plusBasseMoyenne) {
				plusBasseMoyenne = moyenneDeComparaison;
			}
			
		}
		return plusBasseMoyenne;
	}
	
	public float plusHauteMoyenne() 
	{						/*: renvoie la moyenne la plus haute de la classe*/
		float plusHauteMoyenne = 0;
		for (int i = 0; i < etudiants.length; i++) {
			float moyenneDeComparaison = etudiants[i].moyenne();
			if (moyenneDeComparaison > plusHauteMoyenne) {
				plusHauteMoyenne = moyenneDeComparaison;
			}
			
		}
		return plusHauteMoyenne;
		
	}
	
	public float moyenneClasse() 
	{ 							/*: renvoie la moyenne de la classe*/
		float moyenneClasse = 0;
		for (int i = 0; i < etudiants.length; i++) {
			moyenneClasse += etudiants[i].moyenne();
		}
		return (moyenneClasse /5);
	}

	
	
	public String affichageMoyenne() 
	{						//: renvoie une chaine de caractère contenant le nom de la 
															//classe, la moyenne la plus basse, la moyenne de la classe et la moyenne la plus haute.
		return (nom
				+ "\r\nPlus basse moyenne :" + plusBasseMoyenne()
				+ "\r\nPlus haute moyenne :" + plusHauteMoyenne()
				+ "\r\nMoyenne de classe :" + moyenneClasse()
				);
	}
	
	
	public String[] tableauEtudiants() 
	{					//: renvoie le nom et le prenom des étudiants dans un tableau
		String tableauEtudiants[] = new String[etudiants.length];
		for (int i = 0; i<etudiants.length;i++) {
			tableauEtudiants[i] = etudiants[i].nom + " " + etudiants[i].prenom;
		}
		return tableauEtudiants;
	}
	
	
	public String affichage() 
	{								/*: renvoie une chaine de caractère contenant le nom de la classe, 
															l’affichage du professeur principal, l’affichage des étudiants.*/
		String affichageClasse = nom + "\r\nProfesseur Principal : " 
								+ "\r\n"+ professeurPrincipal.nomPrenom()
								+"\r\nélèves :";
		for (int i = 0; i<etudiants.length;i++) {
			affichageClasse += "\r\n" + etudiants[i].nom + " " + etudiants[i].prenom;
		}
		return affichageClasse;
	}
	
	
}
