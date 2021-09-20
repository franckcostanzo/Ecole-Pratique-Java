package com.tld.exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exo2 {
	
	public static int[] orderIntArray(int [] intArray)
	{
		Arrays.sort(intArray);
		
		List<Integer> intList = new ArrayList<Integer>();
		for (int i=0; i<intArray.length;i++)
		{
			intList.add(intArray[i]);
		}
		
		return intArray;
	}

}
