package anitoiu.mariana.commercialistaHomework.test;

import static org.junit.Assert.*;



import anitoiu.mariana.commercialistaHomework.*;

import org.junit.Test;

public class ImprenditoreTest {

	@Test
public void testCalcolaParcella() {
		
		Imprenditore i = new Imprenditore("Test", "Test", "000", "000", "Test", 99);
		int parcella = i.calcolaParcella();

		assertEquals(500 * 1000, parcella);
		
		i.setNumeroFatture(100);
		// TODO assertEquals(500 * 1000, parcella);
		
	}
}
