package exercices;

public class Compte {

	public double solde;
	public String titulaire;
	
	public Compte (double solde, String titulaire) {
		this.solde = solde;
		this.titulaire = titulaire;
	}
	
	public Compte () {}
	
	public double depot(double montant) {
		return solde += montant;
		}
	
	public double retrait(double montant) {
		return solde -= montant;
	}
	
	public void afficher() {
		System.out.println("Compte de " + titulaire + ", solde: "+ solde);
	}
	}
