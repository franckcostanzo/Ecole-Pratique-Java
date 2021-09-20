package entity;

public class Carre {

	//attributes
	private double cote;
	
	//constructor
	public Carre (double cote) {
		this.cote = cote;
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
	public double surface () {
		return cote*cote;
	}
}
