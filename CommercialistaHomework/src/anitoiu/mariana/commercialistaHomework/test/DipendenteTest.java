package anitoiu.mariana.commercialistaHomework.test;

import static org.junit.Assert.*;


import anitoiu.mariana.commercialistaHomework.*;

import org.junit.Test;

public class DipendenteTest {

	@Test
public void testCalcolaParcella() {
		
		Dipendente d = new Dipendente("Test", "Test", "Test");
		int parcella = d.calcolaParcella();

		assertEquals(50 * 1000 , parcella);
		
	}

}
