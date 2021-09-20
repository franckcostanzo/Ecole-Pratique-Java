package fonctions;

public class Main {
	
	public static void main(String[] args) {
		afficheSalutations();
		afficheSalutationPerso("Billy");
	}
	
	public static void afficheSalutations() {
		System.out.println("Bonjour tout le monde !");
	}
	
	private static void afficheSalutationPerso(String prenom) {
		System.out.println("Salut " + prenom + " !");

	}
}
