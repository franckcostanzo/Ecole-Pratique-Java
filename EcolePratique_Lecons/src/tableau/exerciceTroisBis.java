package tableau;

public class exerciceTroisBis {
	
	public static void main (String[] args) {
		
		String array3 [] = {"Bonjour ", "comm", "ça va les ", "j’aime ", "progr ", "du c "};
		String array4 [] = {"tout le monde ", "ent", "gens ", "beaucoup ", "ammer ", "ode "};
		String array5 [] = new String[array3.length];
		for ( int i=0 ; (i<array3.length || i<array4.length); i++) {
			array5[i] = array3[i] + array4[i];
		}
		
		for ( int i=0 ; i<array5.length; i++) {
			System.out.println("Le rang" + i + " correspond à la valeur : " + array5[i]);
		}
		
	}
	
}
