

import java.util.Scanner;

public class BaseMetabolicRateDonna {
	
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		int kilogrammi, centimetri, eta;
		double altezza, peso,fBM;
		double fBMSedentario, fBMModeramenteAttivo, fBMAttivo, fBMMoltoAttivo;
		
		System.out.println("inserire il peso in kilogrammi: ");
		kilogrammi = tastiera.nextInt();
		System.out.println("Inserire l'altezza in centimetri: ");
		centimetri = tastiera.nextInt();
		System.out.println("Inserire l'eta in anni");
		eta = tastiera.nextInt();
		altezza = centimetri;
		peso = kilogrammi;
		fBM = 655 + ( 9.6 * peso) + (1.8 * altezza) - (4.7 * eta);
		fBMSedentario = fBM + (fBM * 20 / 100);
		fBMModeramenteAttivo = fBM + (fBM * 30 / 100);
		fBMAttivo = fBM + (fBM * 40 / 100);
		fBMMoltoAttivo = fBM + (fBM * 50 / 100);
		System.out.println("Donna il tuo BaseMetabolicRate è :" + fBM);
		System.out.println("Sei sedentaria, questo è il tuo BaseMetabolicRate:" +
		 fBMSedentario);
		System.out.println("Sei moderamente attiva, questo è il tuo BaseMetabolicRate:" +
				fBMModeramenteAttivo);
		System.out.println("Sei attiva, questo è il tuo BaseMetabolicRate:" +
				 fBMAttivo );
		System.out.println("Sei molto attiva, questo è il tuo BaseMetabolicRate:" +
				 fBMMoltoAttivo);
		
	}
	

}
