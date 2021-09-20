package AbstractDemo;

import AbstractEntity.*;

public class Main {

	public static void main(String[] args) {

		Quadrilatere quad = new Quadrilatere("robert", 4,5,6,8, 3, 11);
		System.out.println("La surface du quadrilatère est : " + quad.areaCalc());
		
		Rectangle rectangle = new Rectangle();
		rectangle.setLargeur(5.0);
		rectangle.setHauteur(7.0);
		rectangle.setNom("koko");
		
		System.out.println(rectangle);
		System.out.println("La surface du rectangle est : " + rectangle.areaCalc());
		rectangle.setLargeur(2.0);
		System.out.println("La surface du rectangle est : " + rectangle.areaCalc());
		
		Rectangle rectangle2 = new Rectangle(10.5, 21.0);
		System.out.println("La surface du rectangle est : " + rectangle2.areaCalc());
		
		Carre carre = new Carre();
		carre.setCote(8);
		System.out.println("La surface du carré est : " + carre.areaCalc());
		
		Carre carre2 = new Carre(4);
		System.out.println("La surface du carré est : " + carre2.areaCalc());
	}

}
