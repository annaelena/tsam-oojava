package anitoiu.mariana.ereditarieta.test;

import static org.junit.Assert.*;

import anitoiu.mariana.ereditarieta.*;

import org.junit.Test;

public class AziendaSmartTest {

	@Test
	public void test() {
		
		Manager manag = new Manager();
		manag.setStipendio(1000);//metodo del Dipendente
		manag.setAnzianita(5);//metodo del Dipendente
		manag.setBonus(120);//metodo del Manager
		
		Sviluppatore s1 = new Sviluppatore();
		s1.setAnzianita(1);//metodo del Dipendente
		s1.setStipendio(800);//metodo del Dipendente
		
		
		Sviluppatore s2 = new Sviluppatore();
		s2.setAnzianita(2);//metodo del Dipendente
		s2.setStipendio(800);//metodo del Dipendente
		
		Stagista stag = new Stagista();
		stag.setAnzianita(5);
		stag.setStipendio(1000);
		
		
		AziendaSmart a = new AziendaSmart();
		
		//Primo fatto:
		//si può trattare un oggetto di una classe X
		//come oggetto della sua classe base B
		
		Dipendente dipendenteSviluppatore1 = s1;
		
		//dipendenteSviluppatore1 NON può chiamare i metodi( e accedere 
		//agli attributi) della classe Sviluppatore.
		//può accedere ai soli metodi (e attributi) della classe Dipendente
		
		dipendenteSviluppatore1.setAnzianita(2);
		
		
		//errore. setLinguaggiPreferiti è un metoto 
		//della classe Sviluppatore.
		//dipendenteSviluppatore1.setLinguaggiPreferiti(new String[] {"JAVA"});
		
		
		Dipendente[] dipendenti = new Dipendente[] {
				dipendenteSviluppatore1,
				s2,
				manag,
				stag
		};
		
		a.setDipendenti(dipendenti);
		
		assertEquals(17292, a.totaleStipendi());
		
		
	}
	
	@Test
	public void testPoli2() {
		
		Dipendente s1 = new Sviluppatore();
		s1.setAnzianita(1);//metodo del Dipendente
		s1.setStipendio(800);//metodo del Dipendente
		
		Dipendente d1 = s1; //up cast :)
		
		d1.calcolaStipendio();
		
		//a run time sarebbe corretto.
		//il "problema" è che a compile time d1 è un Dipendente.
		//si veda esempio Main
		//d1.setLinguaggiPreferiti(new String[] {"JAVA"});
		
		//il down cast può creare problemi.
		//Sviluppatore s2 = (Sviluppatore)d1;//down cast :(
		
		if (d1 instanceof Manager) {
			Manager m1 = (Manager)d1;
			System.out.println(m1.calcolaStipendio());
		}
	}

}
