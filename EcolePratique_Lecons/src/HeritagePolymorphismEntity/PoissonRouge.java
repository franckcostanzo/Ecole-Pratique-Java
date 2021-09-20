package HeritagePolymorphismEntity;

public class PoissonRouge extends Animal {

	//attributes
	protected int surfaceBocal;
	
	//getters
	public int getSurfaceBocal() {
		return surfaceBocal;
	}
	
	//setters
	public void setSurfaceBocal(int surfaceBocal)
	{
		this.surfaceBocal = surfaceBocal;
	}
	
	//method
	public void faisDesBulles()
	{
		System.out.println("Je fais des bulles !");
	}

	@Override
	public void crier()
	{
		System.out.println("Bloop Bloop!");
	}

	@Override
	public void presentation()
	{
		System.out.println("Je m'appelle " + nom + ", bloop !");
	}
}
