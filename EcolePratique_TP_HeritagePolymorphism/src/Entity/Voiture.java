package Entity;

public class Voiture extends Vehicule {
	
	//attributes
		private int nbRoues;
		private int nbCheveaux;
		
		//constructor
		public Voiture (int vitesseMax, String marque, int nbCheveaux, int nbRoues)
		{
			super(vitesseMax, marque);
			setNbCheveaux(nbCheveaux);
			setNbRoues(nbRoues);
		}
		
		public Voiture()
		{
			setNbRoues(4);
		}
		
		//setters
		public void setNbRoues(int nbRoues)
		{
			this.nbRoues = nbRoues;
		}
		
		public void setNbCheveaux(int nbCheveaux)
		{
			this.nbCheveaux = nbCheveaux;
		}
		
		//getters
		public int getNbRoues()
		{
			return nbRoues;
		}
		
		public int getNbCheveaux()
		{
			return nbCheveaux;
		}
		
		//methods
		@Override
		public void accelerer ()
		{
			if ((vitesse+30) <= vitesseMax)
			{
				vitesse += 30;
			}
		}
		
		@Override
		public void freiner ()
		{
			if ((vitesse-30) >= 0)
			{
				vitesse -= 30;
			}
		}
		
		@Override
		public void allumerLeMoteur()
		{
			super.allumerLeMoteur();
			System.out.println("La clé de la voiture a été insérée.");
		}
		
		@Override
		public void couperLeMoteur()
		{
			super.couperLeMoteur();
			System.out.println("La clé de la voiture a été retirée.");
		}
		
		@Override
		public void presentation()
		{
			System.out.println("Ceci est une voiture de " + nbCheveaux + " cheveaux." 
								+ "\nC'est un véhicule à " + nbRoues + " roues.");
			super.presentation();
		}
}
