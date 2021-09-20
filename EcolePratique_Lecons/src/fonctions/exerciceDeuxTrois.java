package fonctions;

public class exerciceDeuxTrois {

	public static void main(String[] args) {
		/*
		 * Créer une fonction nommée bonjour qui aura 2 arguments :
- nb : le nombre de fois où on dira bonjour
- nom : le nom de la personne.
La fonction affichera <nb> « Bonjour <nom> ».
Dans la fonction principale, on fera 2 appels de la fonction :
La première : bonjour (3, "Kader")
La deuxième : bonjour(5, "Sophie")
		 */
		bonjour (3, "Kader");
		System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
		bonjour(5, "Sophie");
		
	}
	
	public static void bonjour (int nb, String nom) {
		
		for (int x=1; x<=nb; x++) {
				System.out.println(x + " :  bonjour " + nom);
		}
	}
	

}
