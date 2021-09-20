package entity;

public class Prof {
	
	// Attributs :
	
	public String nom;
	public String prenom;
	public String matiere;
	
	// Constructeur :
	
	public Prof(String nom, String prenom, String matiere) 
	{
		this.nom = nom;
		this.prenom = prenom;
		this.matiere = matiere;
	}
	
	public Prof() {}
	
	// Méthodes :
	
	public String nomPrenom() 
	{
		return (nom + " " + prenom);
	}
	public String affichage() 
	{
		return (nom + " " + prenom
				+ "\r\nProfesseur de " + matiere
				);
	}
}
