package util;

import java.util.Scanner;

/*********************************************************************
Nom du programme  :  Recup.java
Boite a outils pour la lecture console
**********************************************************************/
public class Recup {
	
	private static Scanner sc = new Scanner(System.in);
	
	// Lecture d'une chaine terminee par un "RETURN" 
	public static String chaine() {
		String result = sc.nextLine();
		return result;
	}
	
	// Lecture d'un caractere : uniquement le premier caractere de la nouvelle ligne
	public static char caractere () {
		char result = 0;
		try {
			String chaine = chaine();
			result = chaine.charAt(0);
		}
		catch (Exception e) {
			System.out.println("La saisie est invalide");
			System.exit(0);
		}
		return result;
	}

	public static int entier ()	{	
		int result = 0;
		try {
			result = sc.nextInt();
			if(sc.hasNextLine()) sc.nextLine();
		}
		catch (Exception e) {
			System.out.println("La saisie est invalide");
			System.exit(0);
		}
		return result;
	}
	
	public static short entierCourt ()	{	
		short result = 0;		
		try {
			result = sc.nextShort();
			if(sc.hasNextLine()) sc.nextLine();
		} catch (Exception e) {
			System.out.println("La saisie est invalide");
			System.exit(0);
		}
		return result;
	}
	
	public static long entierLong ()	{		
		long result = 0;
		try {
			result = sc.nextLong();
			if(sc.hasNextLine()) sc.nextLine();
		} catch (Exception e) {
			System.out.println("La saisie est invalide");
			System.exit(0);
		}
		return result;
	}
	public static float reel ()	{		
		float result = 0;
		try {
			result = sc.nextFloat();
			if(sc.hasNextLine()) sc.nextLine();
		} catch (Exception e) {
			System.out.println("La saisie est invalide");
			System.exit(0);
		}
		return result;
	}
	public static double decimal ()	{		
		double result = 0;
		try {
			result = sc.nextDouble();
			if(sc.hasNextLine()) sc.nextLine();
		} catch (Exception e) {
			System.out.println("La saisie est invalide");
			System.exit(0);
		}
		return result;
	}

	// alias 
	public static String 	s() { return chaine(); };
	public static char 		c() { return caractere(); };
	public static int 		i() { return entier(); };
	public static double	d() { return decimal(); };
	
}


