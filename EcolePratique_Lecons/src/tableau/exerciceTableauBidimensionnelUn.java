package tableau;

public class exerciceTableauBidimensionnelUn {
	 
	public static void main(String[] args) {
	
		
		
	}
	
	public static void afficheTab(int tab [][]) {
		for (int sousTab []: tab) {
			for (int nb : sousTab ) {
				System.out.println(nb + " ");
			}
			System.out.println(";");
		}
	}
	
}
