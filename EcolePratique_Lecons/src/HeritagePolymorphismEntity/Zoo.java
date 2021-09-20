package HeritagePolymorphismEntity;

public class Zoo {
	
	//attributes
	protected Animal animal1;
	protected Animal animal2;
	protected Animal animal3;
	
	//constructor
	public Zoo (Animal animal1, Animal animal2, Animal animal3)
	{
		setAnimal1(animal1);
		setAnimal2(animal2);
		setAnimal3(animal3);
//		this.animal1 = animal1;
//		this.animal2 = animal2;
//		this.animal3 = animal3;
	}
	
	//default constructor
	public Zoo () {}
	
//	//setters
	public void setAnimal1 (Animal animal)
	{
		this.animal1 = animal;
	}
	
	public void setAnimal2 (Animal animal)
	{
		this.animal2 = animal;
	}
	
	public void setAnimal3 (Animal animal)
	{
		this.animal3 = animal;
	}
	
	//getters
	public Animal getAnimal1 ()
	{
		return animal1;
	}
	
	public Animal getAnimal2 ()
	{
		return animal1;
	}
	
	public Animal getAnimal3 ()
	{
		return animal1;
	}
	
	
	//method
	public void faireMangerTousLesAnimaux()
	{
		animal1.manger();
		animal2.manger();
		animal3.manger();
	}
	
	public void faireCrierTousLesAnimaux()
	{
		animal1.crier();
		animal2.crier();
		animal3.crier();
	}
	
	public void presenterTousLesAnimaux(Animal a)
	{
		a.presentation();
		animal1.presentation();
		animal2.presentation();
		animal3.presentation();
	}
}
