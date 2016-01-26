package anitoiu.mariana.commercialistaHomework;

public class Commercialista {
	
	private Cliente[] clienti;
	
	public int totaleIncasso(){
		
		int tot = 0;
		for ( Cliente c: clienti ){
			 
			tot += c.calcolaParcella();
		}
		return tot;
		
	}

	public Cliente[] getClienti() {
		return clienti;
	}

	public void setClienti(Cliente[] clienti) {
		this.clienti = clienti;
	}
	
	

}
