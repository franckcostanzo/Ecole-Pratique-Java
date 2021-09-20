package AbstractEntity;

public class Rectangle extends Quadrilatere{
	
	//attributes :
	private double largeur;
	private double hauteur;
	
	//constructor :
	public Rectangle(String nom, double largeur, double hauteur) 
	{
		super(nom);
		setLargeur(largeur);
		setHauteur(hauteur);;
	}
	
	public Rectangle(double largeur, double hauteur) 
	{
		setLargeur(largeur);
		setHauteur(hauteur);;
	}
	
	public Rectangle() {}
	
	//getters :	
	public double getLargeur()
	{
		return largeur;
	}
	
	public double getHauteur()
	{
		return hauteur;
	}
	
	//setters :
	public void setLargeur(double largeur)
	{
		this.largeur = largeur;
	}
	
	public void setHauteur(double hauteur)
	{
		this.hauteur = hauteur;
	}

	//method :
	@Override
	public double areaCalc() {				//gives the area of the rectangle
		return largeur*hauteur;
	}
	
	@Override
	public String toString()
	{
		return ("Figure : ["+ nom +"]"
				+"\nC'est un rectangle."
				+"\nLargeur = " + getLargeur()
				+"\nHauteur = " +getHauteur());
	}
}
