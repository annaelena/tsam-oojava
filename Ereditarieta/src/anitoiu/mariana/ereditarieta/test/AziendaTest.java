package anitoiu.mariana.ereditarieta.test;

import static org.junit.Assert.*;


import anitoiu.mariana.ereditarieta.*;

import org.junit.Test;

public class AziendaTest {

	@Test
	public void test() {
		
		Manager d = new Manager();
		d.setStipendio(1000);//metodo del Dipendente
		d.setAnzianita(5);//metodo del Dipendente
		d.setBonus(120);//metodo del Meneger
		
		Sviluppatore s1 = new Sviluppatore();
		s1.setAnzianita(1);//metodo del Dipendente;
		s1.setStipendio(800);//metodo del Dipendente;
		
		Sviluppatore s2 = new Sviluppatore();
		s2.setAnzianita(2);//metodo del Dipendente;
		s2.setStipendio(800);//metodo del Dipendente;
		
		Stagista stag = new Stagista();
		s1.setAnzianita(5);
		stag.setStipendio(1000);
		
		
		Azienda a = new Azienda();
		
		
		//impostare manager + svilupatore su azienda
		
		a.setManagers(new Manager[]{d});
		a.setSviluppatori(new Sviluppatore[]{s1, s2});
		a.setStagisti(new Stagista[] {stag});
		
		assertEquals(17676, a.totaleStipendi());
		
		
		
	}

}
