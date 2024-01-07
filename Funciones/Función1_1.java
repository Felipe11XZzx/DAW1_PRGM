package Funciones;
import java.util.*;

public class Función1_1 {

	
	static double  Suma (double Num1, double Num2) {
		
		/* FUNCIÓN 1.0 

		 * Usando una función llamada "suma", o como quieras, programa para que se pidan
		 * al usuario por consola 2 números de tipo double y se sumen en una función que
		 * devuelva como parámetro un número de tipo "double". Debe haber una llamada a
		 * la función suma desde el método principal.
		 */
		
		Scanner Numeros = new Scanner (System.in);
		
		System.out.println("Introduce El Primer Valor Decimal:");
		Num1 = Numeros.nextDouble();
		
		System.out.println("Introduce El Segundo Valor Decimal:");
		Num2 = Numeros.nextDouble();
		
		Numeros.close();
		
		double Resultado = Num1 + Num2;
				
		System.out.println("El Resultado Es Equivalente A: " + Resultado);		
		
		return (Resultado);

	}
	
	static int ParImpar (int Num1) {
		
		/* FUNCIÓN 1.1
		 
		 * En el código del ejercicio anterior añade una función llamada: "parImpar" que
		 * sea capaz de decir por consola si el número que se le pasa( de tipo int) como
		 * parámetro es par o no. Si el número es par mostrará un mensaje diciendo que
		 * es par, si el número es impar dirá que es impar, nada más.
		 */
		
		if (Num1 % 2 == 0) {
			
			System.out.println("Es Un Número Par: " + Num1);
		}
		
		else {
			
			System.out.print("Es Un Número Impar");
		}
		
		return (Num1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Ayúdate de ambas funciones (desde el método main) para saber si la suma de
		 * dos números pedidos por consola es par o impar (quitando la parte decimal).
		 */	
		
		
		double Num1 = 0; double Num2 = 0;
		
		int resultado = (int) Suma(Num1, Num2);
		
		System.out.println("Resultado De La Suma Decimal Quitandole La Parte Decimal: " + resultado);
		
		ParImpar (resultado);

			
	}

}