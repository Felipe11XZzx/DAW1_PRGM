package Bucles;
import java.util.*;

public class Factorial_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Pedir un número y calcular su factorial.
		 * Ej: el factorial de 5 se denota 5! y es igual a 5x4x3x2x1=120
		 * Usar bucle FOR
		 */
		
		Scanner Numero = new Scanner (System.in);
		
		System.out.println("Introduce Un Número Para Calcular Su Factorial:");
		
		int Num = Numero.nextInt();
		
		int Factorial = 1;
		
		Numero.close();
		
		
		for (int y = Num; y > 1; y-- ) {
			
			Factorial = Factorial * y;
			
			System.out.println("Factorial Del Número: " + Factorial + "*" + (y - 1));
		}
		
		System.out.println("\nEl Resultado Del Factorial Es: " + Factorial);
	}

}