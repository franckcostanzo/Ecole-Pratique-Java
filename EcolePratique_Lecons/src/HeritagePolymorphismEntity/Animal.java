package HeritagePolymorphismEntity;

public class Animal {
	
	//attributes
	protected String nom;
	
	//getters
	public String getNom()
	{
		return nom;
	}
	
	//setters
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	//methods
	public void manger()
	{
		System.out.println("Je mange !");
	}
	
	public void manger(String nourriture)
	{
		System.out.println("Je mange " + nourriture + "!");
	}
		
	
	public void crier()
	{
		System.out.println("Je crie !");
	}
	
	public void presentation()
	{
		System.out.println("Je m'appelle " + nom);
	}
}
