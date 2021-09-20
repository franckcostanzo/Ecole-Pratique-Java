package HeritageEntity;

public class SacDeCourse extends Sac{
	
	//constructor
	public SacDeCourse(int volume, String matiere, String couleur)
	{
		super(volume, matiere, couleur);
	}
	
	//default constructor
	public SacDeCourse(){}
	
	
	//methods
	public String soulever() 
	{
		return "Ce sac peut porter des courses !";
	}
}
