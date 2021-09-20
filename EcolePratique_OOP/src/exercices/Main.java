package exercices;

public class Main {

	public static void main(String[] args) {
		Chien medor = new Chien();
		medor.nom = "Médor";
		medor.age = "3";
		medor.couleur = "marron";
		
		Chien lassie = new Chien();
		lassie.nom = "Lassie";
		lassie.age = "4";
		lassie.couleur = "rousse";
		
		Chien milou = new Chien("Milou", "clair", "4");
		
		medor.affichage();
		lassie.affichage();
		milou.affichage();
		
		medor.aboie();
		lassie.aboie();
		milou.aboie();

	}

}
