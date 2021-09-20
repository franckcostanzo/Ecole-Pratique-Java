package com.tld.exercices;

public class Exo4 {
	
	
	public static boolean isPresent(String word, char a)
	{
		for (int i=0;i<word.length();i++)
		{
			if (a == word.charAt(i)) return true;
		}
		
		return false;
	}
}
