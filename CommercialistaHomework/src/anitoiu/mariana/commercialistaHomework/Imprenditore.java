package anitoiu.mariana.commercialistaHomework;

public class Imprenditore extends Cliente{
	
	private String piva;
	private String ragioneSociale;
	int numeroFatture;
	
	public int calcoloParcella() {
		int tot = 0;
		if (numeroFatture < 100) {
			tot = 500;
		}else {
			tot = 500 +(numeroFatture * 1);
		}
		return tot;
	}

	public String getPiva() {
		return piva;
	}

	public void setPiva(String piva) {
		this.piva = piva;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public int getNumeroFatture() {
		return numeroFatture;
	}

	public void setNumeroFatture(int numeroFatture) {
		this.numeroFatture = numeroFatture;
	}
	

}
