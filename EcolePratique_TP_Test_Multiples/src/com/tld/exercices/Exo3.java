package com.tld.exercices;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exo3 
{
	public Set<String> chkdList = 
			new HashSet<>(Arrays.asList("Maison","chien","avion","voiture","cuisine"));
	
	/*public static Set<String> checkWordList ( Set<String> wordList)
	{
		Set<String> chckgList = new HashSet<>();
		chckgList.add(wordList.get(0));
		for(int i=1;i<wordList.size();i++)
		{
			if (!chckgList.contains(wordList.get(i))) chckgList.add(wordList.get(i));
		}
		
		return chckgList;
		
	}*/
	
	public static void addWordList ( List<String> wordList, String word )
	{
		if (!wordList.contains(word)) wordList.add(word);
	}
	
	public static void deleteWordList ( List<String> wordList, String word )
	{
		if (wordList.contains(word)) wordList.removeAll(Collections.singleton(word)); 	
	}
}
