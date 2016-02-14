package anitoiu.mariana.commercialistaHomework.test;

import static org.junit.Assert.*;



import org.junit.Test;
import anitoiu.mariana.commercialistaHomework.*;

public class CommercialistaTest {

	@Test
	public void testTotaleIncasso() {
		Dipendente angelo = new Dipendente("Angelo", "Rossi", "000");
		Imprenditore marco = new Imprenditore("Marco", "Verdi", "000", "000", "Ferramenta di Marco", 99);
		LiberoProfessionista paolo = new LiberoProfessionista("Paolo", "Bianchi", "000", "000", 15);

		Cliente[] clienti = new Cliente[] {
				angelo,
				marco,
				paolo
		};
		
		Commercialista c = new Commercialista();
		c.setClienti(clienti);
		
		assertEquals(550000, c.totaleIncasso());
		
	
	}
}
