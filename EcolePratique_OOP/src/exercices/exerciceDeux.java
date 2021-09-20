package exercices;

public class exerciceDeux {

	public static void main(String[] args) {
		
		Compte compte1 = new Compte();
		compte1.solde = 4575.25;
		compte1.titulaire = "Bébert";

		compte1.retrait(1000);
		compte1.afficher();
		compte1.depot(500);
		compte1.afficher();
		
	}
	
	

}
