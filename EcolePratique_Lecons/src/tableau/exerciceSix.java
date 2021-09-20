package tableau;

import util.Recup;
import java.util.Arrays;

public class exerciceSix {
	
	public static void main(String[] args) {
		
		System.out.print("Donnez moi un mot : ");
		String mot = Recup.chaine();
		
		char tabMot []= new char [mot.length()];
		char tabInverseMot []= new char [mot.length()];
		
		for (int i=0;i<tabMot.length;i++) {
			tabMot[i] = mot.charAt(i);
		}
		
		
		for (int i=(tabInverseMot.length -1);i>=0 ; i--) {
			tabInverseMot[i] = mot.charAt(i);
		}
		
		if (Arrays.equals( tabMot, tabInverseMot)) {
				System.out.println("Votre mot n'est pas un palindrome !");
			} else {
				System.out.println("Votre mot est un palidrome");
			}
		
		
	}
}
