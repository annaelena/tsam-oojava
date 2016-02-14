package anitoiu.mariana.videoteca.test;

import static org.junit.Assert.*;


import anitoiu.mariana.videoteca.*;

import org.junit.Test;

public class VideotecaTest {

	@Test
	public void testTotalePreventivo() {
		
		DVD dvd = new DVD();
		Cassetta cass = new Cassetta();
		BlueRay br = new BlueRay();
		
		NoleggioFilm nfdvd = new NoleggioFilm();
		nfdvd.setSupporto(dvd);
		nfdvd.setNumeroGiorni(2);
		
		NoleggioFilm nfcass = new NoleggioFilm();
		nfcass.setSupporto(cass);
		nfcass.setNumeroGiorni(1);
		
		NoleggioFilm nfbr =new NoleggioFilm();
		nfbr.setNumeroGiorni(1);
		nfbr.setSupporto(br);
		
		
		//Videoteca vt = new Videoteca();
		int tot = Videoteca.totalePreventivo(new NoleggioFilm[] {nfdvd, nfcass, nfbr});
		
		assertEquals(300 + 100 +100, tot);
		
	}

}
