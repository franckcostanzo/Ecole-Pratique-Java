package HeritageEntity;

public class Sac {
	
	//attributes
	protected int volume;
	protected String matiere;
	protected String couleur;
	
	//constructor
	public Sac(int volume, String matiere, String couleur)
	{
		setVolume(volume);
		setMatiere(matiere);
		setCouleur(couleur);
	}
	
	//default constructor
	public Sac(){}
	
	//setters
	public void setVolume (int volume) 
	{
		this.volume = volume;
	}
	
	public void setMatiere (String matiere)
	{
		this.matiere = matiere;
	}
	
	public void setCouleur (String couleur)
	{
		this.couleur = couleur;
	}
	
	//getters
	public int getVolume ()
	{
		return volume;
	}
	
	public String getMatiere ()
	{
		return matiere;
	}
	
	public String getCouleur ()
	{
		return couleur;
	}
	
	//methods
	public String contenir() {
		double x = volume * (0.5);
		return ("Ce sac peut contenir " + x + "kg.");
	}
	
	
	
}
