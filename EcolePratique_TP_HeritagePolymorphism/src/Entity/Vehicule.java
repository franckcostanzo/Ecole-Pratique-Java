package Entity;

public class Vehicule {

	//attributes
	protected boolean allume;
	protected int vitesse;
	protected int vitesseMax;
	protected String marque;
	
	//constructor
	public Vehicule (int vitesseMax, String marque)
	{
		setVitesseMax(vitesseMax);
		setMarque(marque);
	}
	
	public Vehicule ()
	{
		allume = false;
		vitesse = 0;
		vitesseMax = 0;
	}
	
	//setters
	public void setAllume(boolean allume)
	{
		this.allume = allume;	}
	
	public void setVitesse(int vitesse)
	{
		this.vitesse = vitesse;
	}
	
	public void setVitesseMax(int vitesseMax)
	{
		this.vitesseMax = vitesseMax;
	}
	
	public void setMarque(String marque)
	{
		this.marque = marque;
	}
	
	//getters
	public boolean isAllume()
	{
		return allume;
	}
	
	public int getVitesse()
	{
		return vitesse;
	}
	
	public int getVitesseMaxx()
	{
		return vitesseMax;
	}
	
	public String getMarque()
	{
		return marque;
	}
	
	//methods
	public void accelerer ()
	{
		if ((vitesse+10) <= vitesseMax)
		{
			vitesse += 10;
		}
	}
	
	public void accelerer (float acceleration)
	{
		if ((vitesse+acceleration) <= vitesseMax)
		{
			vitesse += acceleration;
		}
	}
	
	public void freiner ()
	{
		if ((vitesse-10) >= 0)
		{
			vitesse -= 10;
		}
	}
	
	public void freiner (float deceleration)
	{
		if ((vitesse-deceleration) >= 0)
		{
			vitesse -= deceleration;
		}
	}
	
	public void allumerLeMoteur()
	{
		System.out.println("Le moteur est allumé.");
		allume = true;
	}
	
	public void couperLeMoteur()
	{
		System.out.println("Le moteur est éteint.");
		allume = false;
		vitesse = 0;
	}
	
	public void presentation()
	{
		System.out.println("C'est un véhicule de marque " + marque + "."
							+"\nSa Vitesse maximum est " + vitesseMax + "km/h.");
	}
}
