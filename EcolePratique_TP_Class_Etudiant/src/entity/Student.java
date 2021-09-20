package entity;

public class Student {
	
	// Attributs :
	
	public String nom;
	public String prenom;
	public Adresse adresse;
	public float[] notes; 
	
	// Constructeur :
	
	public Student (String nom, String prenom, Adresse adresse) 
	{
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		
	}
	
	public Student (String nom, String prenom, Adresse adresse, float[] notes) 
	{
		this(nom, prenom, adresse);
		this.notes = notes;
	}
	
	public Student () 
	{
		notes = new float[3];
	}
	
	// Méthodes :
	
	public String nomPrenom() // retourne le nom et le prénom, séparé par un espace
	{			
		return (nom + " " + prenom);
	}
	
	public float moyenne() 	// retourne la moyenne de l’étudiant
	{			
		return ((notes[0] + notes[1] + notes[2]) / 3);				
	}
	
	public String getAdressePostale() // Affiche le nom, le prénom et son adresse postale
	{	
		return (nom + " " + prenom + "\r\n " + adresse);								
	}
	
	public String affichage() 
	{			// affiche le nom et le prénom de l’étudiant, ainsi que son adresse, ses notes et sa moyenne
		return (nom + " " + prenom 
				+ "\r\n" + adresse.getPostalAdress() 
				+ "\r\n" + notes[0] +" "+ notes[1] +" " + notes[2] 
				+ "\r\n" + ((notes[0] + notes[1] + notes[2]) / 3));						
	}
	
	
}


