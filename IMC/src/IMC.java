

import java.util.Scanner;

public class IMC {
	private static Scanner tastiera;
	
	public static void main(String[] args) {
		
		tastiera = new Scanner(System.in);
		int kilogrammi, metri, centimetri;
		double altezza, massa, IMC;
		
		System.out.println("Inserire pesso:");
		kilogrammi = tastiera.nextInt();
		System.out.println("Inserire l'altezza: metri spazio centrimetri. ");
		metri = tastiera.nextInt();
		centimetri = tastiera.nextInt();
		
		altezza = metri + centimetri * 0.01;
		massa = kilogrammi;
		IMC = massa /(altezza * altezza);
		System.out.println("L'IMC è" + IMC);
		System.out.println("La categoria di rischio è");
		
		if (IMC < 18.5 )
			System.out.println("Sottopesso");
		else if ( IMC < 25)
			System.out.println("Peso normale");
		else if ( IMC < 30)
			System.out.println("Sovrapesso");
		else
			System.out.println("Obeso");
			
		
	}

}
