package anitoiu.mariana.videoteca.test;

import static org.junit.Assert.*;

import anitoiu.mariana.videoteca.*;


import org.junit.Test;

public class FilmBluRayTest {

	@Test
	public void testCalcolaPreventivo() {
		
		FilmBluRay a1 = new FilmBluRay();
		a1.setTitolo("xyz");
		a1.setAnnoProduzione(1987);
		a1.setPreventivo(4);
		
		assertEquals(4, a1.calcolaPreventivo());

	
		
	}

}
