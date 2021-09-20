package InterfaceDemo;

import InterfaceEntity.*;

public class Demo 
{

	public static void main(String[] args) 
	{
		Carre carre = new Carre();
		carre.cote = 6;
		System.out.println(carre.calculSurface());
		System.out.println(carre.calculPerimetre());
		carre.youpikai();
		
		Rectangle rect = new Rectangle();
		rect.hauteur = 4;
		rect.largeur = 12;
		System.out.println(rect.calculSurface());
	}

}
