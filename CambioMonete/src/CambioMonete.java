

import java.util.Scanner;

/**Cambia Monete  Dato un numero intero, rappresentante un valore in euro, 
 * indicare la combinazione di   banconote da:
 *    500, 200, 100, 50, 20, 10, 5, 2, 1 euro  
 *  che permettono di ottenere tale cifra.  **/


public class CambioMonete {
	
	public static void main(String[] args) {
		
		int numero, numeroIniziale;
		int cinqueCentoEuro, dueCentoEuro, centoEuro, 
		cinquantaEuro, ventiEuro, dieciEuro, cinqueEuro, dueEuro, unEuro;
		
		System.out.println("Inserisci un numero intero:");
		
		Scanner tastiera = new Scanner(System.in);
		
		numero = tastiera.nextInt();
		numeroIniziale = numero;
		
		cinqueCentoEuro = numero / 500;
		numero = numero % 500;
		dueCentoEuro = numero / 200;
		numero = numero % 200;
		centoEuro = numero / 100;
		numero = numero % 100;
		cinquantaEuro = numero / 50;
		numero = numero % 50;
		ventiEuro = numero / 20;
		numero = numero % 20;
		dieciEuro = numero / 10;
		numero = numero % 10;
		cinqueEuro = numero / 5;
		numero = numero % 5;
		dueEuro = numero / 2;
		numero = numero % 2;
		unEuro = numero;
		
		System.out.println(numero + "corisponde a:");
		System.out.println(cinqueCentoEuro + "bancnote da 500€" );
		System.out.println(dueCentoEuro + "bancnote da 200€" );
		System.out.println(centoEuro + "bancnote da 100€" );
		System.out.println(cinquantaEuro + "bancnote da 50€" );
		System.out.println(ventiEuro + "bancnote da 20€" );
		System.out.println(dieciEuro + "bancnote da 10€" );
		System.out.println(cinqueEuro + "bancnote da 5€" );
		System.out.println(dueEuro + "monete da 2€" );
		System.out.println(unEuro + "monete da 1€" );
		
		
		
		
	}

}
