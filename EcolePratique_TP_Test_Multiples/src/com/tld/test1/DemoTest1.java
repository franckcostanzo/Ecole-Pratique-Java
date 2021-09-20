package com.tld.test1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("ma petite mémé des îles")
public class DemoTest1 {

	
	@BeforeAll
	static void beforeAll()
	{
		System.out.println("Execution de code préalable à tous les les tests");
	}
	
	@AfterAll
	static void afterAl()
	{
		System.out.println("Execution de code apres l'execution de tous les tests");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("  Execution avant chaque test");
	}
	
	@AfterEach
	void afterEach()
	{
		System.out.println(" Execution après chaque test");
	}
	
	@Test
	void testOk1()
	{
		System.out.println("test1 Ok");
	}
	
	@Test
	void testOk2()
	{
		System.out.println("test2 Ok");
	}
	
}
