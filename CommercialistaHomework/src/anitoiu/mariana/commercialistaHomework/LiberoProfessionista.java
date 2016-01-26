package anitoiu.mariana.commercialistaHomework;

public class LiberoProfessionista extends Cliente {
	
	private String piva;
	private int numeroFatture;
	
	public int calcoloParcella(){
		
		int tot = 0;
		tot = Math.round(50 + (numeroFatture * 0.5f));
		return tot;
	}

	public String getPiva() {
		return piva;
	}

	public void setPiva(String piva) {
		this.piva = piva;
	}

	public int getNumeroFatture() {
		return numeroFatture;
	}

	public void setNumeroFatture(int numeroFatture) {
		this.numeroFatture = numeroFatture;
	}
	
	

}
