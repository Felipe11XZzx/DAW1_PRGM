package Funciones;

import java.util.Scanner;

public class Función_Sobrecargada1 {
	
static double Suma (double Num1, double Num2) {
		
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
	
	static void Suma () {
		
		/*
		 * Crea una función sobrecarga de la función "suma" que calcule la suma de todos
		 * los números enteros menores de un número dado hasta el cero. También con los
		 * negativos. Debe devolver el resultado de la operación, no mostrarlo por
		 * consola. Añádela al código anterior
		 * 
		 * Ej: a la función le paso un 4 y me devuelve un 10 (4+3+2+1); Ej: -3 --> -6
		 * (-3 + -2 + -1)
		 */
		
		int Num1;
		int Suma = 0;
		int resultado = 0;

		Scanner Numero = new Scanner(System.in);
		System.out.print("Ingrese Un Número: ");
		int N1 = Numero.nextInt();


		Num1 = N1;


		if (Num1 >= 1) {

			for(Suma = Num1 -1; Suma > 0; Suma--) {


				resultado = resultado + Suma;
				System.out.print(Suma + " + ");}

		}
		

		if (Num1 <= 0){

			for(Suma = Num1 +1 ; Suma <0; Suma++) {


				resultado = resultado + Suma;
				System.out.print(Suma + " + ");}
		}
		
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
		
		
		// FUNCIÓN SOBRECARGADA SUMA
		
		Suma();
		

	}

}
