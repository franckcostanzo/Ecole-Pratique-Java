package BoucleWhile;

import util.Recup;

public class exerciceCinq {
	
	/*Pour chacune des deux figures suivantes, écrire un programme qui la reproduise qui la produise.
	 0000000000
	X 111111111
	XX 22222222
	XOX 3333333
	XOOX 444444
	XOOOX 55555
	XOOOOX 6666
	XOOOOOX 777
	XXXXXXXX 88
	          9*/
	
	/*		x+x+x+x+x+x+x+x+x+x (10x)
	" "+x+x+x+x+x+x+x+x+x (1y +9x)
	" "+" "++x+x+x+x+x+x+x+x (2y +8x)
	" "+" "+" "+x+x+x+x+x+x+x (3y + 7x)
	" "+" "+" "+" "+x+x+x+x+x+x (4y +6x)
	" "+" "+" "+" "+" "+x+x+x+x+x (5y +5x)
	" "+" "+" "+" "+" "+" "+x+x+x+x (6y +4x)
	" "+" "+" "+" "+" "+" "+" "+x+x+x (7y+ 3x)
	" "+" "+" "+" "+" "+" "+" "+" "+x+x (8y + 2x)
	" "+" "+" "+" "+" "+" "+" "+" "+" "+x (9y +1x) */
	
	public static void main(String[] args) {
		
		System.out.print("Donnez un entier : ");
		int answer = Recup.entier();

		
		for (int x = 0; x < answer; x++ ) {
			
			for ( int z = 0; z < x; z++) {
				System.out.print(" ");
				
			}
			for (int y = answer; y > 1; y--) {
				
				if (y > (x + 1)) {
					System.out.print(Integer.toHexString(x).toUpperCase());					
				} 
				
			}
		
			System.out.println(Integer.toHexString(x).toUpperCase());
			
		}
		
		
	}
		
		

}
