package tableau;

import util.Recup;

public class exerciceTrois {
	
	public static void main(String[] args) {
		
		int moyenne = 0;
		while (true) {
			
		System.out.print("Donnez moi un entier positif : ");
		int x = Recup.entier();
			if ( x > 0) {		
		
				int tab [] = new int[x];
				System.out.println(tab.length);
				
				for (int i=0; i < tab.length;i++) {
					moyenne+= tab[i];
				}
				
				System.out.println(tab[x]);
				System.out.println(tab[(tab.length - 1)]);
				moyenne /= tab.length;
				System.out.println(moyenne);
				break;
			}
			System.out.println("entrée invalide !");
		} 
		
	}
	
}
