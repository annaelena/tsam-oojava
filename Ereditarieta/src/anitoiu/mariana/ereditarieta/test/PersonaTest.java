package anitoiu.mariana.ereditarieta.test;

import static org.junit.Assert.*;




import org.junit.Test;
import anitoiu.mariana.ereditarieta.*;

public class PersonaTest {

	@Test
	public void test() {
		Persona p = new Persona(); 
		p.setNome("Luca"); 
		p.setCognome("Rossi");
		
		 		
		assertEquals("Luca, Rossi", p.bigliettoVisita()); 

	}

}
