package exercices;

public class Chien {
	
	public String nom;
	public String couleur;
	public String age;
	
	public Chien (String nom, String couleur, String age) {
		this.nom = nom;
		this.couleur = couleur;
		this.age = age;
	}
	
	public Chien () {}
	
	public void aboie() {
		System.out.println("Wouaf !");
	}
	
	public void affichage() {
		System.out.println("Je suis " + nom + ", je suis de couleur " + couleur + " et j'ai " + age + " ans.");
	}
}
