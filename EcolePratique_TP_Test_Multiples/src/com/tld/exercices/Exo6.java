package com.tld.exercices;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exo6 {

//	List<Integer> myList = new ArrayList<Integer>();
	
	public static List<Integer> initIntList (int j)
	{
		
		List<Integer> intList = new ArrayList<Integer>();
		
		for (int i=0; i<j;i++)
			
		{ 
			Random r = new Random();
			int a = r.nextInt((100))+1;
			Integer random = Integer.valueOf(a);
			intList.add(random);
		}
		
		return intList;	
		
	}
	
	public static Long doubleCount (List<Integer> myList)
	{
		
		/*Map<Integer, Long> counts =
		myList.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		Long counting = new Long(0);
		for (Long x :counts.values())
		{
			counting += x;
		}
		return counting;*/
		return myList.size() - myList.stream().mapToInt(Integer::intValue).distinct().count();
	}
}
