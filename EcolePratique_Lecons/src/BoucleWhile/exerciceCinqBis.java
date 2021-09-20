package BoucleWhile;

import util.Recup;

public class exerciceCinqBis {
	/* "n(x) + n(y) +n(x)" 
	 X 1x
	 XX 2x
	 XOX 1x 1y 1x
	 XOOX 1x 2y 1x
	 XOOOX 1x 3y 1x
	 XOOOOX 1x 4y 1x
	 XOOOOOX 1x 5y 1x
	 XXXXXXXX 8x
	 */
	
	public static void main (String[] args) {
		System.out.print("Donnez un entier : ");
		int compteur = Recup.entier();
		
		for (int x = compteur; x > 0; x--) {
			for (int y = x;y < compteur; y++) {
				if ( x == 1 || x == y ) {
					System.out.print("X");
				} else {
					System.out.print("O");
					
				}
			}
			System.out.println("X");
				
//			if ( x == 0) {
//				
//				System.out.println("X");
//				
//			} else if (x == 1){
//				
//				System.out.println("XX");
//				
//			} else if ((2 < x) && (x < 8)){
//				
//				System.out.println( "X" + String.join("", Collections.nCopies((x-2), "O")) + "X");
//				
//			} else if (x == 8) {
//				
//				System.out.println("XXXXXXXX");
//				break;
//				
//			}
		
		}
	}
}
