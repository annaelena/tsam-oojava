package anitoiu.mariana.azienda;

public class Dipendente {
	
	private String nome;
	private String cognome;
	private ContrattoLavoro contratto;
	
	public int stipendio() {
		return contratto.getPagabase();
	}
	
	public ContrattoLavoro getContratto() {
		return contratto;
	}

	public void setContratto(ContrattoLavoro contratto) {
		this.contratto = contratto;
	}

	public String getNome() {
		return nome;
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

	
	

}
