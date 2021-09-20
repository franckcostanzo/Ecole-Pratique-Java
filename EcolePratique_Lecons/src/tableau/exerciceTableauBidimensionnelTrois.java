package tableau;

public class exerciceTableauBidimensionnelTrois {

	public static void main(String[] args) {
		int tab [][] = {
				{1,2,3},
				{4,5,6}
			};
		
		int xmin = 1000000;
		int xmax = 0;
		int sum = 0;
		int tailleTab = 0;
		
		int count =0;
		
		
		
		for (int sousTab [] : tab) {
			
			int sumIntermédiaire = 0;
			int tailleTabIntermédiaire = 0;
			int xminIntermédiaire = 1000000;
			int xmaxIntermédiaire = 0;
			
			
			for (int i=0; i<sousTab.length;i++) {
				
				sum += sousTab[i];
				tailleTab ++;
				sumIntermédiaire +=	sousTab[i];
				tailleTabIntermédiaire ++;

				if (xmin > sousTab[i]) {
					xmin=sousTab[i];
				}
				if (xmax < sousTab[i]) {
					xmax=sousTab[i];
				}
				if (xminIntermédiaire > sousTab[i]) {
					xminIntermédiaire=sousTab[i];
				}
				if (xmaxIntermédiaire < sousTab[i]) {
					xmaxIntermédiaire=sousTab[i];
				}
				
				
			}
			
			int moyenneIntermédiaire = sumIntermédiaire / tailleTabIntermédiaire;
			
			System.out.println("la valeur minimale de la ligne " + count + " est : " + xminIntermédiaire);
			System.out.println("la valeur maximale de la ligne " + count + " est : " + xmaxIntermédiaire);
			System.out.println("la somme des valeurs de la ligne " + count + " est : " + sumIntermédiaire);
			System.out.println("la moyenne des valeurs de la ligne " + count + " est : " + moyenneIntermédiaire);
			System.out.println(" ");
			
			count++;

			
		}
		
		int moyenne = sum / tailleTab;
		
		System.out.println("la valeur minimale est : " + xmin);
		System.out.println("la valeur maximale est : " + xmax);
		System.out.println("la somme des valeurs est : " + sum);
		System.out.println("la moyenne des valeurs est : " + moyenne);
		
	}

}
