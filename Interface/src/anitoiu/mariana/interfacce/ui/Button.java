package anitoiu.mariana.interfacce.ui;

public class Button {
	
	//l'oggetto button vuole comunicare a chi lo utilizza 
	//l'evento relativo al click
	
	private ButtonInterface binterface;
	
	public void setListener(ButtonInterface callback) {
		binterface = callback;
	}
	
	//questo metodo è chiamato dal sistema
	//quando qualcuno preme il pulsante neii'UI
	
	public void userClick() {
		//voglio informare l'oggetto che mi sta utilizzando.
		
		//usando la ButtonInterface posso informare
		//gli oggett che si sono "registrati" mediante
		//la setlistener e che implementano l'interfaccia ButtonInterface
		
		if (binterface != null) {
			binterface.onClick();
		}
	  }
	}


