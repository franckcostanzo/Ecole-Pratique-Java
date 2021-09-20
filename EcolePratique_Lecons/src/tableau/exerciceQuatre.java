package tableau;
/*
 * Sur un tableau d’entier, décaler toutes les valeurs à gauche. 
 * (ex : T[2] devient T[3] / T[3] passe à T[2]).
La dernière valeur sera 0.
Tips : utiliser une valeur tampon
 */
public class exerciceQuatre {

	public static void main(String[] args) {
		
		int T [] = { 3,5,8,9,6};
		for (int i = 0 ; i < T.length ; i++){
			if (i == (T.length - 1)){
				T[i] = 0;
				break;
			}
			T[i] = T[i+1];
			
		}
		for ( int i=0 ; i<T.length; i++) {
			System.out.println("Le rang" + i 
								+ " correspond à la valeur : " + T[i]);
		}

	}

}
