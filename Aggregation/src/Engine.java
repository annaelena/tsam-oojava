
public class Engine {
	
	String cilindrata;
	Carburatore carburatore; //Aggregazione
	
	
	String caratteristiche() {
		
		String caract = "Motore";
		caract += "Cilindrata:" + cilindrata + "\n";
		caract += carburatore.caratteristiche() + "\n";
		return caract;
	}

}
