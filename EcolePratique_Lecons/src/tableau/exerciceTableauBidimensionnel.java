package tableau;

public class exerciceTableauBidimensionnel {

	public static void main(String[] args) {
		
		int tab [][] = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		
		for (int sousTab []: tab) {
			for (int nb : sousTab) {
				System.out.print(nb + " ");
			}
			System.out.println(";");
		}
		

	}

}
