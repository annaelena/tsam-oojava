package anitoiu.mariana.videoteca;

public class Videoteca {
	
	private Film[] films;
	
	public int calcoloTotalePreventivo(){
		
		int tot = 0;
		for (Film f: films){
			tot += f.calcolaPreventivo();
		}
		return tot;
		
	}

}
