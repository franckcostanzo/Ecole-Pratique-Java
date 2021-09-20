package AbstractEntity;

public abstract class Figure {

	//attributes
	protected String nom;
	
	//constructor
	public Figure(String nom) 
	{
		setNom(nom);
	}
	
	public Figure() {}
	
	//setters
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	//getters
	public String getNom()
	{
		return nom;
	}
	
	//methods
	public abstract double areaCalc();
	
//	public abstract void setSide();
//	
//	public abstract double getSide();
	
	
}
