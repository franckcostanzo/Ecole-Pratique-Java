package exec;

import entity.*;

public class Main {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();
		rectangle.setLargeur(5.0);
		rectangle.setHauteur(7.0);
		
		System.out.println("La surface du rectangle est : " + rectangle.surface());
		rectangle.setLargeur(2.0);
		System.out.println("La surface du rectangle est : " + rectangle.surface());
		
		Rectangle rectangle2 = new Rectangle(10.5, 21.0);
		System.out.println("La surface du rectangle est : " + rectangle2.surface());
		
		Carre carre = new Carre();
		carre.setCote(8);
		System.out.println("La surface du carré est : " + carre.surface());
		
		Carre carre2 = new Carre(4.3);
		System.out.println("La surface du carré est : " + carre2.surface());
	}

}
