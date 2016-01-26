package anitoiu.mariana.ereditarieta.test;

import static org.junit.Assert.*;



import org.junit.Test;

import anitoiu.mariana.ereditarieta.*;

public class DipendenteTest {

	@Test
	public void test() {
		Dipendente d = new Dipendente();
		//metodi della classe Persona
		d.setNome("Marco");
		d.setCognome("Bianchi");
		
		assertEquals("Marco, Bianchi", d.bigliettoVisita());
		
		//metodi specifici della classe Dipendente
		
		d.setStipendio(1000);
		d.setAnzianita(5);
		d.setAzienda(new Azienda());
		
		int stip = d.calcolaStipendio();
		
		assertEquals(2000,stip);
	}

}
