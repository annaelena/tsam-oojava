package anitoiu.mariana.videotecainterface;

public class Videoteca {
	
	static public int totalePreventivo(NoleggioFilm[] filmnoleggiati) {
		
		
		int tot = 0;
		for(NoleggioFilm nf: filmnoleggiati) {
			int giorni = nf.getNumeroGiorni();
			Supporto s = nf.getSupporto();
			
			if ( s instanceof CalcoloCostoNoleggio) {
				CalcoloCostoNoleggio ccn = (CalcoloCostoNoleggio) s;
				
				tot += ccn.costoNoleggio(giorni);
			}
		}
		
		return tot;
	}

}
