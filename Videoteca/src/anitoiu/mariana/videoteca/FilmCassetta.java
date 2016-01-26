package anitoiu.mariana.videoteca;

public class FilmCassetta extends Film {
	
	private int numeroGiorni;
	
	public int calcolaPreventivo(){
		
		int tot = 0;
		if(numeroGiorni == 1){
			tot = 1;
		}else{
			tot = 1 + ( numeroGiorni * 2);
		}
		return tot;
	}

	public int getNumeroGiorni() {
		return numeroGiorni;
	}

	public void setNumeroGiorni(int numeroGiorni) {
		this.numeroGiorni = numeroGiorni;
	}
	

}
