package fonctions;

public class exerciceDeuxUn {
	
	public static void main(String[] args) {
		
		afficherPrix(12, 3);
		
	}
	
	public static String afficherPrix(int nbArticle, int montantArticle) {
		return "le prix de " + nbArticle + " est de " + (nbArticle * montantArticle); 
	}
	
	
}
