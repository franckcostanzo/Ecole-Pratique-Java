package HeritageEntity;

public class SacAMainChanel extends SacAMain{
	
	//attributes
	protected int tailleLogo;
	String matiereSecondaire;
	
	//constructor
	public SacAMainChanel (int volume, String matiere, String couleur, float prix, int tailleLogo, String MatiereSecondaire)
	{
		super(volume, matiere, couleur, prix);
		setTailleLogo(tailleLogo);
		setMatiereSecondaire(MatiereSecondaire);
	}
	
	//default constructor
	public SacAMainChanel () {}
	
	//setters
	public void setTailleLogo (int tailleLogo)
	{
		this.tailleLogo = tailleLogo;
	}
	
	public void setMatiereSecondaire (String matiereSecondaire)
	{
		this.matiereSecondaire = matiereSecondaire;
	}
	
	//getters
	public int getTailleLogo ()
	{
		return tailleLogo;
	}
	
	public String getMatiereSecondaire()
	{
		return matiereSecondaire;
	}
	
	//method
	public String augmentationPrix (float multiplicateur)
	{
		return ( "Ce sac coûte " + prix*multiplicateur + "€, parce qu'il brille!");
	}

}
