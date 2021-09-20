package action;


import util.Recup;
import entity.*;

public class ActionStudent {
	public static Student demanderNouvelEtudiant() 
	{
		
		Student newStudent = new Student();
		System.out.println("Veuillez entrer le prénom de votre étudiant : ");
		newStudent.prenom = Recup.chaine();
		System.out.println("Veuillez entrer le nom de votre étudiant : ");
		newStudent.nom = Recup.chaine();
		newStudent.adresse = ActionAdresse.demanderNouvelleAdresse();
		for (int i =0; i <3; i++) {
			System.out.println("Veuillez entrer la note " + (i+1) + "  : ");
			newStudent.notes[i] = Recup.entier();
		}
		
		return newStudent;
	}

	public static Student[] initialisationEtudiants() 
	{
//		Student studentArray [] = new Student [5];
//		for (int i=0;i<studentArray.length; i++) {
//			Student student = new Student();
//			student = demanderNouvelEtudiant();
//			studentArray[i] = student;
//		}
//		return studentArray;
//	
		Adresse[] adresses = ActionAdresse.initialisationAdresses();
		return new Student[] { new Student("Audiard", "Jean-Paul", adresses[0], new float[] { 1.2f, 3.5f, 14f}),
				new Student("Lanoux", "Emmanuelle", adresses[1], new float[] { 7.8f, 9.4f, 4f}),
				new Student("Belmondo", "Victor", adresses[2], new float[] { 5.0f, 11.3f, 8f}),
				new Student("Rochefort", "Jacques ", adresses[3], new float[] { 3.2f, 12.8f, 2f}),
				new Student("Riva", "Alexander", adresses[4], new float[] { 9.2f, 7.3f, 11f}),
				new Student("Kristoff", "Jean", adresses[4], new float[] { 9.2f, 7.3f, 11f }),
				new Student("Rondeaux", "Louis", adresses[4], new float[] { 9.2f, 7.3f, 11f }),
				new Student("Perrot", "Claude", adresses[4], new float[] { 9.2f, 7.3f, 11f }),
				new Student("Flickinger", "Alexandre", adresses[4], new float[] { 9.2f, 7.3f, 11f }),
				new Student("Rogers", "Guillaume", adresses[4], new float[] { 9.2f, 7.3f, 11f }),
				new Student("Trousselier", "Octave", adresses[4], new float[] { 9.2f, 7.3f, 11f }),
				new Student("Vinokourov", "Roger", adresses[4], new float[] { 9.2f, 7.3f, 11f }),
				new Student("Lapize", "Andy", adresses[4], new float[] { 9.2f, 7.3f, 11f }),
				new Student("Sagan", "Michael", adresses[4], new float[] { 9.2f, 7.3f, 11f }),
				new Student("Chapperon", "Peter", adresses[4], new float[] { 9.2f, 7.3f, 11f }) };
	}

}
