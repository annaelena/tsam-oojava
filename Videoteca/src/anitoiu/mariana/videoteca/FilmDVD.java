package anitoiu.mariana.videoteca;

public class FilmDVD extends Film{
	
	private int numeroGiorni;
	
	public int calcolaPreventivo(){
		
		int tot = 0;
		
		if(numeroGiorni <= 2){
			tot = Math.round(numeroGiorni * 1.5f);
		}else{
			tot = 3 + (numeroGiorni * 2);
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
