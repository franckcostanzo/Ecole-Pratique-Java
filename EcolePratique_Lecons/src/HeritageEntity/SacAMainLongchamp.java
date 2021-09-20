package HeritageEntity;

public class SacAMainLongchamp extends SacAMain {
	//attributes
	protected String marque = "Longchamp";
	
	//constructor
	public SacAMainLongchamp(int volume, String matiere, String couleur, float prix)
	{
		super(volume, matiere, couleur, prix);
	}
	
	//default constructor
	public SacAMainLongchamp() {}
	
	
	//getters
	public String getMarque()
	{
		return marque;
	}
	
	//methods
	public String estUnLongChamp()
	{
		return ( "Ce sac est un " + marque + ".");
	}
}
