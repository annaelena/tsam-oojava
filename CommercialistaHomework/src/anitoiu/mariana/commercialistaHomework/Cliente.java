package anitoiu.mariana.commercialistaHomework;

public class Cliente {
	
	private String nome;
	private String cognome;
	private String CF;
	private int Parcella;
	//private Commercialista commercialista;
	
	public int calcolaParcella(){
		return Parcella;
	}

	

	public String getNome() {
		return nome;
	}

	public int getParcella() {
		return Parcella;
	}

	public void setParcella(int parcella) {
		Parcella = parcella;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCF() {
		return CF;
	}

	public void setCF(String cF) {
		CF = cF;
	}
	
	

}
