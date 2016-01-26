package anitoiu.mariana.ereditarieta;

//DREAM
public class AziendaSmart {
	
	private Dipendente[] dipendenti;
	
	public int totaleStipendi() {
		int tot = 0;
		for(Dipendente dip: dipendenti){
			
			//AAAH!!!
			//il tipo dato di dip è Dipendente.
			//ma io voglio chiamare il metodo CalclaStipendio()
			//di Sviluppatore, Stagista...
			
			//SECONDO FATTO:
			//il tipo dato di dip è Dipendente A COMLINE TIME.
			//a run-time(ovvero durante l'esecuzione
			//dip è un riferimento a un oggetto che di volta in volta 
			//può essere Sviluppatore, Manger ,Stagista..
			
			//late binding (ovvero legame tra oggetto e il metodo chiamaot
			//avviene a run-time).
			
			
			//NOTE:
			//questo comporta che:
			//- durante lo sviluppo di una determinata classe/metodo
			//NON so quale sarà l'effetivo codice eseguito nella chiamata
			//al metodo
			
			
			//POLIMORFISMO: dip è di due tipi: è un Dipendente( a comline time)
			//ma anche un Sviluppatore o Stagista..
			
			tot += dip.calcolaStipendio();
			
		}
		return tot;
	}

	public Dipendente[] getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(Dipendente[] dipendenti) {
		this.dipendenti = dipendenti;
	}
	

}
