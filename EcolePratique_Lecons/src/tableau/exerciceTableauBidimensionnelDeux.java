package tableau;

public class exerciceTableauBidimensionnelDeux {

	public static void main(String[] args) {
		int tab [][] = {
				{1,2,3},
				{4,5,6}
			};
		
		int xmin = 1000000;
		int xmax = 0;
		int sum = 0;
		int tailleTab = 0;
		
		
		for (int sousTab [] : tab) {
			for (int i=0; i<sousTab.length;i++) {
				sum += sousTab[i];
				tailleTab ++;
				if (xmin > sousTab[i]) {
					xmin=sousTab[i];
				}
				if (xmax < sousTab[i]) {
					xmax=sousTab[i];
				}
			}
			
		}
		
		
		int moyenne = sum / tailleTab;
		
		System.out.println("la valeur minimale est : " + xmin);
		System.out.println("la valeur maximale est : " + xmax);
		System.out.println("la somme des valeurs est : " + sum);
		System.out.println("la moyenne des valeurs est : " + moyenne);
		
	}

}
