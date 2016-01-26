package anitoiu.mariana.videoteca;

public class FilmBluRay extends Film {
	
	private int numeroGiorni;
	
	public int calcoloPreventivo() {
		
		
		if (numeroGiorni == 1){
			return 1 ;
		}else{
			int tot = 1;
			if(numeroGiorni >1){
				for ( int i = 0; i < numeroGiorni; i++){
					
				tot += Math.round( tot + tot*( i * 0.1f));
				}
			}
			return tot;
		}
		
		
	}

	public int getNumeroGiorni() {
		return numeroGiorni;
	}

	public void setNumeroGiorni(int numeroGiorni) {
		this.numeroGiorni = numeroGiorni;
	}
	

}
