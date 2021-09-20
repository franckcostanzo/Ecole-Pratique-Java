package StaticEntity;

public class Chien extends Animal 
	{

	//attributes
	protected String couleurBalle;
	
	//setters
	public void setCouleurBalle(String couleur)
	{
		this.couleurBalle = couleur;
	}
	
	//getters
	public String getCouleurBalle()
	{
		return couleurBalle;
	}
	
	//method
	public void rapporterBalle()
	{
		System.out.println("Je peux ramener la baballe " + couleurBalle + " !");
	}

	@Override
	public void manger()
	{
		System.out.println("Je mange des chats!");
	}	
	
	@Override
	public void crier()
	{
		System.out.println("Waouf !");
	}
	
	@Override
	public void presentation()
	{
		System.out.println("Je m'appelle " + nom + ", waouf !");
	}
}
