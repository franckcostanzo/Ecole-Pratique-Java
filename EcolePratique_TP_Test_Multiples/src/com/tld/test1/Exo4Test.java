package com.tld.test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.tld.exercices.*;

class Exo4Test {

	@Test
	void testIsPresent() {
		assertEquals(true,Exo4.isPresent("abbe",'b'));
	}

}
