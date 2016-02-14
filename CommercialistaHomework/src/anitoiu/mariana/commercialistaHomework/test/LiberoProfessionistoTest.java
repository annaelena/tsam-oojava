package anitoiu.mariana.commercialistaHomework.test;

import static org.junit.Assert.*;



import anitoiu.mariana.commercialistaHomework.*;


import org.junit.Test;

public class LiberoProfessionistoTest {

	@Test
	public void testCalcolaParcella() {
		LiberoProfessionista l = new LiberoProfessionista("Test", "Test", "000", "000", 99);
		int parcella = l.calcoloParcella();

		assertEquals(49550, parcella);
		
		
	}

}
