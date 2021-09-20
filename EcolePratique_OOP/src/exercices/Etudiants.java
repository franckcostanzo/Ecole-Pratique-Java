package exercices;

public class Etudiants {
	
	public String nom;
	public double note1;
	public double note2;
	
	public Etudiants (String nom, int note1, int note2) {
		this.nom = nom;
		this.note1 = note1;
		this.note2 = note2;
	}
	
	public Etudiants () {}
	
	public double calculeMoyenne() {
		return (note1+note2)/2;
	}
	
	public void show() {
		System.out.println(nom + " a eu la moyenne :" + calculeMoyenne());
	}
			
}
