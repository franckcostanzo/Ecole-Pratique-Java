package entity;

public class Rectangle {
	
	//attributes :
	private double largeur;
	private double hauteur;
	
	//constructor :
	public Rectangle(double largeur, double hauteur) 
	{
		this.largeur = largeur;
		this.hauteur = hauteur;
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
	public double surface() {				//gives the area of the rectangle
		return largeur*hauteur;
	}
}
