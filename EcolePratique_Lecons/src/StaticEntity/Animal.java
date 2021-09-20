package StaticEntity;

public class Animal {
	
	//attributes
	private static int nbOccurences = 0;
	private final int nbPattes;
	protected String nom;
	
	//constructor
	public Animal(int p)
	{
		this.nbPattes = p;
		nbOccurences++;
	}
	
	public Animal()
	{
		nbPattes = 4;
		nbOccurences++;
	}
	//getters
	public String getNom()
	{
		return nom;
	}
	
	public static int getNbOccurences()
	{
		return nbOccurences;
	}
	
	public int getNbPattes()
	{
		return nbPattes;
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
