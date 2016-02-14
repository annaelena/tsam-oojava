package anitoiu.mariana.harbour.test;

import static org.junit.Assert.*;


import org.junit.Test;

import anitoiu.mariana.harbour.Aereo;

public class AereoTest {

	
		@Test
		public void testPotenzaFuoco() {
			Aereo a = new Aereo();
			a.setnArmamentiAlpha(10);
			a.setnArmamentiBeta(20);
			int pf = a.potenzaFuoco();
			assertEquals(600, pf);
			
		}
		
	}



