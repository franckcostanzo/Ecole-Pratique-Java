package com.tld.test1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import com.tld.exercices.Exo1;

class Exo1Test {

	@BeforeAll
	static void beforeAll()
	{
	
	}
	
	@Test
	void testIntToInteger() 
	{
		assertEquals(new Integer(8),Exo1.intToInteger(8));
	}

}
