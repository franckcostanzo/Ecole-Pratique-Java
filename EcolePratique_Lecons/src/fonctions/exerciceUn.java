package fonctions;

public class exerciceUn {
	public static void main(String[] args) {
		affichage();
		System.out.println(message());
		System.out.println(tripleEntier(12));
		System.out.println(additionEntier(75, 132));
	}
	
	public static void affichage () {
		System.out.println("Je suis une fonction");
	}
	
	public static String message () {
		return "Je suis un message";
	}
	
	public static int tripleEntier (int valeur) {
		return valeur * 3;
	}
	
	public static int additionEntier (int valeur1, int valeur2) {
		return valeur1+valeur2;
	}
}
