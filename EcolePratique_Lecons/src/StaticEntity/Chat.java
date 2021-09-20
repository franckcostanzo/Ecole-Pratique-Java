package StaticEntity;

public class Chat extends Animal 
{
	//attributes
	protected String couleurCollier;
	
	//getters
	public String getCouleurCollier()
	{
		return couleurCollier;
	}
	
	//setters
	public void setCouleurCollier(String couleurCollier)
	{
		this.couleurCollier = couleurCollier;
	}
	
	//method
	public void griffe()
	{
		System.out.println("Je griffe !");
	}
	
	@Override
	public void crier()
	{
		System.out.println("Miaou !");
	}
	
	@Override
	public void presentation()
	{
		System.out.println("Je m'appelle " + nom + ", Miaou !");
	}
	
	@Override
	//methods
	public void manger()
	{
		System.out.println("Je mange des croquettes!");
	}
	
}
