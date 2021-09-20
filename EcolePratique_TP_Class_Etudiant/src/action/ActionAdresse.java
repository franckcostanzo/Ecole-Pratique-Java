package action;

import entity.Adresse;
import util.Recup;


public class ActionAdresse {

	public static void main(String[] args) 
	{
	
	}
	
	public static Adresse demanderNouvelleAdresse() 
	{
		Adresse newAdress = new Adresse();
		System.out.println("Veuillez entrer votre numéro de voie : ");
		newAdress.numeroVoie = Recup.entier();
		System.out.println("Veuillez entrer votre type de voie : ");
		newAdress.typeVoie = Recup.chaine();
		System.out.println("Veuillez entrer votre nom de voie : ");
		newAdress.nomVoie = Recup.chaine();
		System.out.println("Veuillez entrer votre code postal : ");
		newAdress.codePostale = Recup.chaine();
		System.out.println("Veuillez entrer votre ville : ");
		newAdress.ville = Recup.chaine();
		
		return newAdress;
		
		
	}

	public static Adresse[] initialisationAdresses() 
	{
//		Adresse adressArray [] = new Adresse[2];
//		for (int i=0;i<adressArray.length; i++) {
//			Adresse adresse = new Adresse ();
//			adresse = demanderNouvelleAdresse();
//			adressArray[i] = adresse;
//		}
//		return adressArray;
		return new Adresse[] { new Adresse(35, "Avenue", "Gloire", "13100", "Aix en Provence"),
				new Adresse(56, "Rue", "Gloire", "13001", "Marseille"),
				new Adresse(22, "Allée", "de Provence", "04100", "Manosque"),
				new Adresse(88, "Rue", "du Grand Saint-Jean", "34000", "Montpellier"),
				new Adresse(11, "Rue", "de la République", "84000", "Avignon"), };
	}
}

//Adresse newAdress = new Adresse();
//Scanner scanner = new Scanner(System.in);
//while (true) {
//	System.out.println("Veuillez entrer votre numéro de voie : ");
//	boolean hasNextInt = scanner.hasNextInt();
//	if (hasNextInt) {
//		newAdress.numeroVoie = scanner.nextInt();
//		scanner.nextLine();		//fais pour regler le probleme d'appuyer sur entrée qui est compté comme un nextline
//		break;
//	}
//				
//}
//
//System.out.println("Veuillez entrer votre nom de voie : ");
//newAdress.nomVoie = scanner.nextLine();
//scanner.nextLine();
//
//while (true) {
//	System.out.println("Veuillez entrer votre code postal (ex: 75000, 13014... : ");
//	boolean hasNextInt = scanner.hasNextInt();
//	if (hasNextInt){
//		newAdress.numeroVoie = scanner.nextInt();
//		if ((01000 <= newAdress.numeroVoie) && (newAdress.numeroVoie <= 99999)) {
//		scanner.nextLine();
//		break;
//		}
//	}
//				
//}
//
//System.out.println("Veuillez entrer votre ville : ");
//newAdress.ville = scanner.nextLine();
//
//scanner.close();
