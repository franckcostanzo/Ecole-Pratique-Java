package fonctions;


public class exerciceDeuxDeux {
	public static void main(String[] args) {
		System.out.println(echelleRichter(4))    ;
		
	}
	/*
	 * Exercice 2
Reprendre l’exercice de l’échelle de Richter (Vu dans les conditions)
Créer une fonction qui reprend l’exercice de l’échelle de Richter. En paramètre de cette fonction, il y
aura la magnitude
1) Version 1 : La fonction ne retourne rien et affiche seulement le message
2) Version 2 : La fonction retourne un String, qui sera le message en fonction de la magnitude.

A chaque fois, adaptez la fonction main pour vous adaptez.
	 */
	public static String echelleRichter (int magnitude) {
		
	switch (magnitude) {
		case 1:
			return "Micro tremblement de terre, non ressenti";
		case 2:
			return "Très mineur. Non ressenti mais détecté";
		case 3:
			return "Mineur. Causant rarement des dommages";
		case 4:
			return "Léger. Secousses notables d’objets à l’intérieur des maisons";
		case 5:
			return "Modéré. Légers dommages aux édifices bien construits";
		case 6:
			return "Fort. Destructeur dans des zones allant jusqu’à 180 kilomètres à la ronde si elles sont"
								+ "peuplées";
		case 7:
			return "Majeur. Dommages modérés à sévères dans des zones plus vastes.";
		case 8:
			return "Important. Dommages sérieux dans des zones à des centaines de kilomètres à la ronde";
		case 9:
			return "Dévastateur. Dévaste des zones sur des milliers de kilomètres à la ronde";
	
		default:
			return "erreur saisie";
		}
	}
}
