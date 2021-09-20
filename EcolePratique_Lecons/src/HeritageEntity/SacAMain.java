package HeritageEntity;

public class SacAMain extends Sac{
	
	//attributes
	protected float prix;
	
	//constructor
	public SacAMain (int volume, String matiere, String couleur, float prix) 
	{
		super(volume, matiere, couleur);
		setPrix(prix);
	}
	
	//default constructor
	public SacAMain () {}
	
	//setters
	public void setPrix(float prix)
	{
		this.prix = prix;
	}
	
	//getters
	public float getPrix()
	{
		return prix;
	}
	
	//method
	public String decore()
	{
		return ("C'est un beau sac, il coûte " + prix + "€.");
	}
	
}
