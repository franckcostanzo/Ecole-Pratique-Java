package ConditionsDeux;

public class Main {

		
	public static void main(String[] args) {
		
														/*  Switch */
				/*¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤*/
		
		int échelle = 1;
		
		// Exercice 1
		
		switch (échelle) {
			case 1:
				System.out.println("Micro tremblement de terre, non ressenti");
				break;
			case 2:
				System.out.println("Très mineur. Non ressenti mais détecté");
				break;
			case 3:
				System.out.println("Mineur. Causant rarement des dommages");
				break;
			case 4:
				System.out.println("Léger. Secousses notables d’objets à l’intérieur des maisons");
				break;
			case 5:
				System.out.println("Modéré. Légers dommages aux édifices bien construits");
				break;
			case 6:
				System.out.println("Fort. Destructeur dans des zones allant jusqu’à 180 kilomètres à la ronde si elles sont"
									+ "peuplées");
				break;
			case 7:
				System.out.println("Majeur. Dommages modérés à sévères dans des zones plus vastes.");
				break;
			case 8:
				System.out.println("Important. Dommages sérieux dans des zones à des centaines de kilomètres à la ronde");
				break;
			case 9:
				System.out.println("Dévastateur. Dévaste des zones sur des milliers de kilomètres à la ronde");
				break;
		
			default:
				System.out.println("erreur saisie");	
			
		}
		System.out.println(" ");
		System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
		System.out.println(" ");
		// Exercice 2
		
		int nombreDonne = 1;
		switch (nombreDonne) {
			case 1:
				System.out.println("un");
				break;
			case 2:
				System.out.println("deux");
				break;
			case 3:
				System.out.println("trois");
				break;
			case 4:
				System.out.println("quatre");
				break;
			case 5:
				System.out.println("cinq");
				break;
			case 6:
				System.out.println("six");
				break;
			case 7:
				System.out.println("sept");
				break;
			case 8:
				System.out.println("huit");
				break;
			case 9:
				System.out.println("neuf");
				break;
		
			default:
				System.out.println("erreur saisie");
		
		
	}
		System.out.println(" ");
		System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");	
		System.out.println(" ");
		
		// Exercice 3
		
		int décompte = 10;
		
		switch (décompte) {
			case 10:
				System.out.println("dix");
			case 9:
				System.out.println("neuf");
			case 8:
				System.out.println("huit");
			case 7:
				System.out.println("sept");
			case 6:
				System.out.println("six");
			case 5:
				System.out.println("cinq");
			case 4:
				System.out.println("quatre");
			case 3:
				System.out.println("trois");
			case 2:
				System.out.println("deux");
			case 1:
				System.out.println("un");
			case 0:
				System.out.println("zero");
				break;
				
			default:
				System.out.println("erreur saisie");
			}
		
		}	
		
	}
 
