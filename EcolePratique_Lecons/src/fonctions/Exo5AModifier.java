package fonctions;

public class Exo5AModifier {

	public static void main(String[] args) {
			
	}
	
	public static void cueilletteCerise(String nom, int nbCueilli) {
		System.out.println(nom + " a cueilli " + nbCueilli + " cerises");
		System.out.println(nom + " en mange 1");
		nbCueilli -= 1;
		System.out.println("ça fait maintenant " + nbCueilli + " cerises");
	}
}
