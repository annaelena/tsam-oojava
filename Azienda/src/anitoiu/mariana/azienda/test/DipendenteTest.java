package anitoiu.mariana.azienda.test;

import static org.junit.Assert.*;


import org.junit.Test;

import anitoiu.mariana.azienda.ContrattoLavoro;
import anitoiu.mariana.azienda.Dipendente;

public class DipendenteTest {

	@Test
	public void testStipendio() {
		ContrattoLavoro contratto = new ContrattoLavoro();
		contratto.setTipo("Apprendista");
		contratto.setPagabase(600*100);

		Dipendente bill = new Dipendente();
		bill.setCognome("Gates");
		bill.setNome("Bill");
		bill.setContratto(contratto);
		
		assertEquals(600*100, bill.stipendio());

		
	}

}
