package AbstractEntity;

public class Carre extends Quadrilatere{

	//attributes
	private double cote;
	
	//constructor
	public Carre (String nom, double cote) 
	{
		super(nom);
		setCote(cote);
	}
	
	public Carre(double cote)
	{
		setCote(cote);
	}
	
	public Carre () {}
	
	//setters
	public void setCote(double cote)
	{
		this.cote = cote;
	}
	
	//getters
	public double getCote()
	{
		return cote;
	}
	
	//method
	@Override
	public double areaCalc () {
		return Math.pow(cote, 2);
	}
}
