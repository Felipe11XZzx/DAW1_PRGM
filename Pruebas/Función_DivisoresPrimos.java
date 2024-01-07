package Pruebas;


public class Función_DivisoresPrimos {
	
	
	static int DivisoresPrimos (int Num1) {
		
		
		for (int i = 1; i <= Num1; i++) {
			
			if (Num1 % i == 0) {
				
				System.out.println("Los Divisores Primos Del Numero Son: " + i);
			}
			
		}
		
		return Num1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Escribir una función a la que se le pase un número entero y devuelva el
		 * número de divisores primos que tiene.
		 */		
		
		
		DivisoresPrimos(17);
	}

}
