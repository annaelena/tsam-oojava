package anitoiu.mariana.videoteca;

public class Film {
	
	private String titolo;
	private String nomeRegista;
	private int annoProduzione;
	private String nomeAttoriPrincipali;
	private int preventivo;
	
	
	public int getPreventivo() {
		return preventivo;
	}

	public void setPreventivo(int preventivo) {
		this.preventivo = preventivo;
	}

	

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getNomeRegista() {
		return nomeRegista;
	}

	public void setNomeRegista(String nomeRegista) {
		this.nomeRegista = nomeRegista;
	}

	public int getAnnoProduzione() {
		return annoProduzione;
	}

	public void setAnnoProduzione(int annoProduzione) {
		this.annoProduzione = annoProduzione;
	}

	public String getNomeAttoriPrincipali() {
		return nomeAttoriPrincipali;
	}

	public void setNomeAttoriPrincipali(String nomeAttoriPrincipali) {
		this.nomeAttoriPrincipali = nomeAttoriPrincipali;
	}
	public int calcolaPreventivo(){
		return preventivo;
	}
	

}
