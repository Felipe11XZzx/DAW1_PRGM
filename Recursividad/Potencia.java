package Recursividad;


public class Potencia {
	
	
	static long elevar (long Numero, long Potencia) {
		
		
		if (Potencia == 0) {
			
			return 1;}
		
		else {
			
			return Numero * elevar (Numero, Potencia -1);}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Diseñar una función que calcule "a" a la "n", donde "a" es real y "n" es
		 * entero no negativo. Realizarlo de manera recursiva
		 */
		
		long Resultado = elevar (5, 0);
		
		System.out.println("Resultado De La Potencia: " + Resultado);
		

	}

}
