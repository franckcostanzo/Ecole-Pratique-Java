package Entity;

public class Moto extends Vehicule {

	
	//attributes
	private int nbRoues;
	private int cylindree;
	
	//constructor
	public Moto (int vitesseMax, String marque, int cylindree, int nbRoues)
	{
		super(vitesseMax, marque);
		setCylindree(cylindree);
		setNbRoues(nbRoues);
	}
	
	public Moto()
	{
		setNbRoues(2);
	}
	
	//setters
	public void setNbRoues(int nbRoues)
	{
		this.nbRoues = nbRoues;
	}
	
	public void setCylindree(int cylindree)
	{
		this.cylindree = cylindree;
	}
	
	//getters
	public int getNbRoues()
	{
		return nbRoues;
	}
	
	public int getCylindree()
	{
		return cylindree;
	}
	
	//methods
	@Override
	public void accelerer ()
	{
		if ((vitesse+20) <= vitesseMax)
		{
			vitesse += 20;
		}
	}
	
	@Override
	public void freiner ()
	{
		if ((vitesse-20) >= 0)
		{
			vitesse -= 20;
		}
	}
	
	@Override
	public void allumerLeMoteur()
	{
		super.allumerLeMoteur();
		System.out.println("La clé a été insérée.");
	}
	
	@Override
	public void couperLeMoteur()
	{
		super.couperLeMoteur();
		System.out.println("La clé a été retirée.");
	}
	
	@Override
	public void presentation()
	{
		System.out.println("Ceci est une moto de cylindrée " + cylindree + "."
							+ "\nC'est un véhicule à " + nbRoues + " roues.");
		super.presentation();
	}
}

