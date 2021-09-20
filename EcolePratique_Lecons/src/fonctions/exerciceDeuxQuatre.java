package fonctions;

import util.Recup;

public class exerciceDeuxQuatre {
	public static void main(String[] args) {
		System.out.println(veutContinuer());
	}
	
	public static boolean veutContinuer() {
		
		while (true) {

			System.out.print("Voulez-vous continuer ? (O/N) ");
			String rep = Recup.chaine().toLowerCase();
			
			if ( rep.equals("o") || rep.equals("n")) {
			return (rep.equals("o"));
			}
			System.out.println("Réponse invalide !");
		
		}
	}
}
