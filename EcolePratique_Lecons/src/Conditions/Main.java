package Conditions;

public class Main {

	public static void main(String[] args) {
		
												/*  If simple  */
		/*¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤*/
		if (true) { 				// En mettant true, l'instruction sera toujours active. 
									// Inversement si on met (false), l'instruction sera toujours inactive
			System.out.println("C'est toujours vrai");
		}
		
		boolean b1 = 1 < 2; 		//On initialise un boolean qui est toujours vrai
		
		if (b1) { 				 	//La condition b1 est vrai, donc l'instruction sera lancée.
			System.out.println("C'est aussi toujours vrai");
		}
		
		int y1 = 2;
		if (y1 < 5) {
			System.out.println("y est bien plus petit que 5");
		} else {
			System.out.println("y est bien plus grand que 5");
		}
		
		
												/*  If - else simple */
		/*¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤*/
		int x = 12;
		int y = 3;
		int z = 500;
		
		if ( ( x * y ) > z) {
			System.out.println( "( x * y ) > z est vrai, "); 
			System.out.println( x + " * " + y + " = " + (x * y) + " , " + (x * y) +  " est supérieur à " + z);
		} else {
			System.out.println( "( x * y ) > z est faux, ");
			System.out.println( x + " * " + y + " = " + (x * y) + " , " + (x * y) + " est inférieur à " + z);
		}
		
		//-----------------------------------
		int a = 45;
		int b = -1;
		
		if ((a<0) && (b<0)) {
			System.out.println("Vrai, les deux sont négatifs");
		} else {
			System.out.println("Faux, au moins un des deux est postif ou égal à 0");
		}
		
		//-----------------------------------
		if ((a<0) || (b<0)){
			System.out.println("Vrai, au moins un des deux est négatifs");
		} else {
			System.out.println("Faux, aucun des deux est négatif");
		}
		
		//-----------------------------------
		if ( !(x<0) ) {
			System.out.println("Vrai, x est positif");
		} else {
			System.out.println("faux, x est negatif");
		}
		
		//-----------------------------------
		int o = 1;
		int p = 0;
		if (( p != 0) && ((o / p) > 1)) {
				System.out.println("OK");
			} 	else {
			
			System.out.println("KO");
		}
		
		//-----------------------------------
		int prix = 0;
		boolean isKid = false;
		boolean isRegistred = false;
		if (isKid) { 
			prix = 6;
			System.out.println("Vous êtes un enfant, ");
			} else {
			prix = 10;
			System.out.println("Vous êtes un adulte, ");
			}
		if (!isRegistred) {
			prix += 2;
			System.out.println("mais vous n'êtes pas un client enregistré, ");
		} else {
			System.out.println("et vous êtes un client fidèle, ");
		}
		System.out.println("Le prix du billet est : " + prix + " €.");
		
		//-----------------------------------
		double prixOrdinateur = 799.99;
		double prixEcran = 149.99;
		double prixClavier = 17.99;
		
		boolean taxeAPayer = true;
		int nbOrdinateur = 1;
		int nbEcran = 1;
		int nbClavier = 1;
		double prixTotal = (nbOrdinateur * prixOrdinateur) + (nbEcran * prixEcran) + (nbClavier * prixClavier);
		
		if (taxeAPayer) {
		if (prixTotal <1000) {
			prixTotal += ((prixTotal*7)/100);
		} else if ((prixTotal >= 1000) && (prixTotal <2500)) {
			prixTotal += ((prixTotal*12)/100);
		} else if (prixTotal >= 2500) {
			prixTotal += ((prixTotal*25)/100);
		}
		}
		System.out.println("Le prix total est de " + prixTotal);
		
		//-----------------------------------
		// Exercice Transition If vers Switch
		//-----------------------------------
		
		int age = 10;
		String categorie;
		if ((age >=6) && (age <= 10)){
			if ((age == 6)) {
				categorie = "poussin";
			} else if ( age == 7) {
				categorie = "benjamin";
			} else if ( age == 8) {
				categorie = "cadet";
			} else {
				categorie = "adolescent";
				
		}
			System.out.println(categorie);
		}
		
		if ((age >=6) && (age <= 10)) {
		switch (age) {
			case 6:
				categorie = "poussin";
				break;
			case 7:
				categorie = "benjamin";
				break;
			case 8:
				categorie = "cadet";
				break;
			default:
				categorie = "adolescent";
				break;
		}
			System.out.println(categorie);
		}
		

}
}
