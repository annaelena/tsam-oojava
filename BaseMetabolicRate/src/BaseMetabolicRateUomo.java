

import java.util.Scanner;

public class BaseMetabolicRateUomo {
	
	
		public static void main(String[] args) {
			Scanner tastiera = new Scanner(System.in);
			int kilogrammi, centimetri, eta;
			double altezza, peso, mBM ;
			double mBMSedentario, mBMModeramenteAttivo, mBMAttivo, mBMMoltoAttivo;
			
			System.out.println("inserire il peso in kilogrammi: ");
			kilogrammi = tastiera.nextInt();
			System.out.println("Inserire l'altezza in centimetri: ");
			centimetri = tastiera.nextInt();
			System.out.println("Inserire l'eta in anni");
			eta = tastiera.nextInt();
			altezza = centimetri;
			peso = kilogrammi;
			mBM = 65 + ( 13.8 * peso) + ( 5.0 * altezza) - ( 6.8 * eta);
			mBMSedentario = mBM + (mBM * 20 / 100);
			mBMModeramenteAttivo = mBM + (mBM * 30 / 100);
			mBMAttivo = mBM + (mBM * 40 / 100);
			mBMMoltoAttivo = mBM + (mBM * 50 / 100);
			System.out.println("Uomo il tuo BaseMetabolicRate è :" + mBM);
			System.out.println("Sei sedentario, questo è il tuo BaseMetabolicRate:" +
			 mBMSedentario);
			System.out.println("Sei moderamente attivo, questo è il tuo BaseMetabolicRate:" +
					mBMModeramenteAttivo);
			System.out.println("Sei attivo, questo è il tuo BaseMetabolicRate:" +
					 mBMAttivo );
			System.out.println("Sei molto attivo, questo è il tuo BaseMetabolicRate:" +
					 mBMMoltoAttivo);
			
			
				
			
		}
		

}
