
//non esistono funzioni in Java
//public static void main (String[] args){
//}
public class Methods {
	
	//TIPO_VALORE_RITORNO nomeMetodo(argomenti)
	//argomenti == TipoArg1 nomeArg1, TipoArg2 nomeArg2,...
	
	
	static int sumAll(int[] myarray) {
		int sum = 0;
		for(int x: myarray) {
			sum += x;
		}
		return sum;
		
	}
	 
	//method == function all'interno di una classe
	
	public static void main(String[] args) {
		
		int[] array = new int[] {2,5,7,1};
		
		int result = sumAll(array);
		System.out.println(result);
	}


}
