package Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import pileouface.TirageAuSort;

class TirageAuSortTest2 {
	
	//test l'instanciation de la classe TirageAuSort
	@Test
	void testTirageAuSort() {
		TirageAuSort tirageAuSort = new TirageAuSort();
		assertNotNull(tirageAuSort);
	}

	//test que la méthode .lancerPiece fourni soit le résultat "pile" ou "face"
	@Test
	void testLancerPiece() {
		TirageAuSort t = new TirageAuSort();
		String resultat = t.lancerPiece();
		assertTrue(resultat.equals("pile") || resultat.equals("face"));
	}

	//test que le getter .getValeur retourne soit "pile" soit "face" qui sont les deux
	//seules valeurs que le membre de classe private String valeur (de la Classe TirageAuSort) peut prendre
	@Test
	void testGetValeur() {
		TirageAuSort tirageAuSort = new TirageAuSort();
		String resultat = tirageAuSort.getValeur(); //ici on test .getValeur
		assertTrue(resultat.equals("pile") || resultat.equals("face"));
	}

}
