package tableau;

/*
 * int tabEntier[]; // déclaration
tabEntier = new int[50]; // allocation
 */

public class exerciceCinq {
	
	public static void main (String[] args) {
		
	int array1 [] = {2, 4, 8, 11, 4};
	int array2 [] = {1, 5, 3};
	int array3 [] = new int[array1.length*array2.length];
	
	
	for (int i = 0; i < array3.length ; ) {
		for (int y = 0; y < array2.length ; y++) {
			for ( int z = 0; z < array1.length ; z++) {
				array3[i] = array1[z]*array2[y];
				i++;
			}
			
		}
	}
	
	for ( int i=0 ; i<array3.length; i++) {
		System.out.println("Le rang" + i 
							+ " correspond à la valeur : " + array3[i]);
	}
		
	}
	
}
