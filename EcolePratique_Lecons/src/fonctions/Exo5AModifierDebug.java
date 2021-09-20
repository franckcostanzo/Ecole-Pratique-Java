package fonctions;

public class Exo5AModifierDebug {

	public static void main(String[] args) {
		// Variables
		String nom1 = "Florent";
		String nom2 = "Yasmine";
		
		int nbCerisesFlorent = 9;
		int nbCerisesYasmine = 7;
		
		// on appel la fonction
		afficheTout(nom1, nbCerisesFlorent, 1);
		afficheTout(nom2, nbCerisesYasmine, 3);
	
	}
	
	
	
	
	
	public static void afficheTout(String prenom, int nbCeriseRamasse, int nbCeriseMangees) {
		System.out.println(prenom + " a cueilli " + nbCeriseRamasse + " cerises");
		System.out.println(prenom + " en mange "+ nbCeriseMangees);
		nbCeriseRamasse *= nbCeriseMangees;
		System.out.println("ça fait maintenant " + nbCeriseRamasse +  " cerises pour " + prenom);
	}
}

