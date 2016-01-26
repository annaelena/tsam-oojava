package anitoiu.mariana.ereditarieta.test;

import static org.junit.Assert.*;



import org.junit.Test;
import anitoiu.mariana.ereditarieta.Sviluppatore;

public class SviluppatoreTest {

	@Test
	public void testCalcolaStipendio() {
		
		Sviluppatore s = new Sviluppatore();
		s.setNome("Luca");
		s.setCognome("Rossi");
		s.setAnzianita(1);
		s.setStipendio(800);
		
		assertEquals(786, s.calcolaStipendio());
		
		
	}

}
