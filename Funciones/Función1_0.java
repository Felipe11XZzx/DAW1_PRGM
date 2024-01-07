package Funciones;
import java.util.*;

public class Función1_0 {

	
	static void Suma () {
		
		Scanner Numeros = new Scanner (System.in);
		
		System.out.println("Introduce El Primer Valor Decimal");
		double Num1 = Numeros.nextDouble();
		
		System.out.println("Introduce El Segundo Valor Decimal");
		double Num2 = Numeros.nextDouble();
		
		Numeros.close();
		
		double Resultado = Num1 + Num2;
		
		System.out.println("El Resultado Es Equivalente A: " + Resultado);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* FUNCIÓN 1.0 

		 * Usando una función llamada "suma", o como quieras, programa para que se pidan
		 * al usuario por consola 2 números de tipo double y se sumen en una función que
		 * devuelva como parámetro un número de tipo "double". Debe haber una llamada a
		 * la función suma desde el método principal.
		 */

		Suma();
	}

}
