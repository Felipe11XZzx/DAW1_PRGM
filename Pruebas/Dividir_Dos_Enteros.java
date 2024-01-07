package Pruebas;
import java.util.*;

public class Dividir_Dos_Enteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Crea un programa que realice la division de dos numeros enteros, y 
		 * si el segundo numero es 0 que nos muestre un mensaje por pantalla.
		 */
		Scanner Operacion = new Scanner (System.in);
		
		int Num1, Num2;
		
		System.out.print("Introduce El Primer Numero:");
		Num1 = Operacion.nextInt();

		System.out.print("Introduce El Segundo Numero:");
		Num2 = Operacion.nextInt();
		
		Operacion.close();
		
		if (Num2 != 0) {
			
			System.out.println("El Resultado Es: " + ((double) Num1 / Num2));
		}
		
		else {
			
			System.out.println("Su Division Es Equivalente A Cero");
		}
		
	}

}
