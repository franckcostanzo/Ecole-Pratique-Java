package Scanner;

import util.Recup;

public class exercice1 {
	
	public static void main (String[] args) {
		
		System.out.print("Comment vous appelz-vous ?  ");
		String stringAnswer = Recup.chaine();
		System.out.println("Bonjour, " + stringAnswer + " !");
		
		System.out.print("Donnez un entier : ");
		int intAnswer = Recup.entier();
		System.out.println("Son double est : " + (intAnswer*2)  + " !");
		
	}
}
