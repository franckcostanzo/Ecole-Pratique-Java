package Test;

import pileouface.TirageAuSort;

public class TirageAuSortTest {

	public static void main(String[] args) 
	{
		
		TirageAuSort t = new TirageAuSort();
		System.out.println("valeur initiale du tirage : " + t.getValeur());
		
		for (int i=0; i<10; i++)
		{
			t.lancerPiece();
			System.out.println("valeur " + (i+1) + ": " +t.getValeur());
		}

	}

}
