package com.tld.test1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.tld.exercices.Exo2;

class Exo2Test {
	
	
	@Test
	void test() {
		int [] testArray = {4,7,13,78,2,54,5};
		assertArrayEquals(new int[] {2,4,5,7,13,54,78}, Exo2.orderIntArray(testArray));
	}

}
