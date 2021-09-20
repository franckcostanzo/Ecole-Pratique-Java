package tableau;

import util.Recup;

public class exerciceDeux {

	public static void main(String[] args) {
		
	String array2 [] = new String [5];
	
	for (int i = 0; i < array2.length ; i++) {
		System.out.print("donnez moi une chaine de caractère  ");
		array2[i] = Recup.chaine();
	}
	
	for ( int i=0 ; i<array2.length; i++) {
		System.out.println("Le rang " + i 
							+ " correspond à la valeur : " + array2[i]);
	}
	
	}
}
