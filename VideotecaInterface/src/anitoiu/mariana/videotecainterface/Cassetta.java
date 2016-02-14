package anitoiu.mariana.videotecainterface;

public class Cassetta extends Supporto {
	
	public int costoNoleggio(int gg) {
		
		int gglimit =1;
		if(gg <= gglimit) {
			return gg * 100;
		}
		else {
			return gg * 100 + 200 * ( gg - gglimit);
		}
	}
	

}
