package com.Junit.It;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void testSomme() {
		assertEquals(util.somme(10, 10), 20);
	}

	@Test
	void testProduit() {
		assertEquals(util.produit(10, 10), 100);
	}
	
	@Test
	public void  tesHomeControlleur() {
			HomeController homeController= new HomeController();
			
		String result=homeController.home();
		
	      assertEquals(result, "Hello World");
	}
}
