package Pruebas;
import java.util.*;

public class Dividir_While {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Crea un programa que realice la division de dos numeros enteros,
		 * si el segundo numero es un 0 el programa debe repetirse hasta que se
		 * introduzca un numero valido.
		 */
		
		Scanner Division = new Scanner (System.in);
		
		
		System.out.println("Introduce El Primer Numero:");
		int Num1 = Division.nextInt();
		
		System.out.println("Introduce El Segundo Numero:");
		int Num2 = Division.nextInt();
		
		
		while (Num2 == 0) {
			
			System.out.println("No Puedo Dividir Entre 0");
			System.out.println("Introduce El Segundo Numero Otra Vez:");
			Num2 = Division.nextInt();
		}
			
		System.out.println("El Resultado Es: " + ((double)Num1 / Num2));
			
		Division.close();
	}
}
