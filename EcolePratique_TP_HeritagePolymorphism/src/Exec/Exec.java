package Exec;

import Entity.*;

public class Exec {
	
	public static void main(String[] args)
	{
		
		Moto yamaha = new Moto();
		yamaha.setCylindree(750);
		yamaha.setMarque("Yamaha");
		yamaha.setVitesseMax(250);
		
		Voiture twingo = new Voiture(120, "twingo", 90, 4);
		
		Vehicule[] tabVehicule = new Vehicule[2];
		tabVehicule[0] = yamaha;
		tabVehicule[1] = twingo;
		
		for (Vehicule vehicule : tabVehicule)
		{
			vehicule.presentation();
			vehicule.allumerLeMoteur();
			System.out.println("**Véhicule allumé : " + vehicule.isAllume() + "**");
			vehicule.accelerer();
			vehicule.accelerer();
			System.out.println("Le véhicule va à " + vehicule.getVitesse() + " km/h.");
			vehicule.freiner(20);
			System.out.println("Le véhicule va à " + vehicule.getVitesse() + " km/h.");
			vehicule.couperLeMoteur();
			System.out.println("**Véhicule allumé : " + vehicule.isAllume() + "**");
			System.out.println("Le véhicule va à " + vehicule.getVitesse() + " km/h.");
			System.out.println("-------------------");
		}
		
		
		
		
	}
}
