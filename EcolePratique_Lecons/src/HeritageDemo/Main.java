package HeritageDemo;

import HeritageEntity.*;

public class Main {

	public static void main(String[] args) 
	{
//		SacAMain gucci = new SacAMain();
//		
//		gucci.setPrix(4850);
//		gucci.setCouleur("Marron");
//		gucci.setMatiere("Croco");
//		gucci.setVolume(10);
//		
//		System.out.println("La couleur de mon sac est " + gucci.getCouleur() + "."
//							+ "\nSa matière est " + gucci.getMatiere() + "."
//							+ "\n" + gucci.contenir()
//							+ "\n" + gucci.decore());
//		
//		System.out.println(" ");
//
//		SacDeCourse lidl = new SacDeCourse();
//		
//		lidl.setCouleur("blanc");
//		lidl.setMatiere("plastique");
//		lidl.setVolume(50);
//		
//		System.out.println("La couleur de mon sac est " + lidl.getCouleur() + "."
//							+ "\nSa matière est " + lidl.getMatiere() + "."
//							+ "\n" + lidl.contenir()
//							+ "\n" + lidl.soulever());
//		
//		System.out.println(" ");
//		
//		SacDeCourse lidl2 = new SacDeCourse(78, "jute", "rose");
//		
//		System.out.println("La couleur de mon sac est " + lidl2.getCouleur() + "."
//				+ "\nSa matière est " + lidl2.getMatiere() + "."
//				+ "\n" + lidl2.contenir()
//				+ "\n" + lidl2.soulever());
//		
//		System.out.println(" ");
//		
//		
//		
//		SacAMain sacConstruit = new SacAMain(30, "toile", "vert", 36.99f);
//		System.out.println("La couleur de mon sac est " + sacConstruit.getCouleur() + "."
//							+ "\nSa matière est " + sacConstruit.getMatiere() + "."
//							+ "\n" + sacConstruit.contenir()
//							+ "\n" + sacConstruit.decore());
//		
//		System.out.println(" ");
//		
//		SacAMainLongchamp sacLongchamp = new SacAMainLongchamp(30, "toile", "vert", 36.99f);
//		System.out.println("La couleur de mon sac est " + sacLongchamp.getCouleur() + "."
//							+ "\nSa matière est " + sacLongchamp.getMatiere() + "."
//							+ "\n" + sacLongchamp.contenir()
//							+ "\n" + sacLongchamp.decore()
//							+ "\n" + sacLongchamp.estUnLongChamp());
		
		SacAMainChanel sacChanel = new SacAMainChanel(30, "toile", "vert", 36.99f, 25, "or");
		System.out.println("La couleur de mon sac est " + sacChanel.getCouleur() + "."
							+ "\nSa matière est " + sacChanel.getMatiere() + "."
							+ "\n" + sacChanel.contenir()
							+ "\n" + sacChanel.decore()
							+ "\n" + sacChanel.augmentationPrix(10));
		
		
	}

}
