package StaticDemo;

import StaticEntity.*;

public class demoStatic {

	public static void main(String[] args) {
		
		Animal koala = new Animal();
		Animal dodo = new Animal(2);
		
		System.out.println(Animal.getNbOccurences());
		System.out.println(koala.getNbPattes());
		System.out.println(dodo.getNbPattes());
		
	}

}
