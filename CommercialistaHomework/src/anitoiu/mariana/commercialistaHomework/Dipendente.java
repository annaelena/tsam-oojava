package anitoiu.mariana.commercialistaHomework;

public class Dipendente extends Cliente implements CalcoloParcella {
	
	
	public Dipendente()
	{
		
	}
	public Dipendente(String nome, String cognome,String cf) {
		super(nome, cognome, cf);
	}
	
	// (ABSTRACT)
	// questo metodi sulla classe
	// cliente � astratto.
	// se lo implemento, il metodo in questa classe
	// non � + astratto.
	// se la classe implementa tutti i metodi astratti delle classi
	// base => la classe non � pi� astratta.
	//public int calcolaParcella() {
	//	return 50 * 1000;
	//}
	
	// (INTERFACE)
	
		public int calcolaParcella() {
			return 50 * 1000;
		}
	
	

}
