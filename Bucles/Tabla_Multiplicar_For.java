package Bucles;
import java.util.*;

public class Tabla_Multiplicar_For {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		/*
		 * Implementar una aplicación que pida al usuario un número comprendido entre 1
		 * y 10. Hay que mostrar la tabla de multiplicar de dicho número, asegurándose
		 * de que el número introducido se encuentra en el rango establecido, es decir,
		 * seguirá pidiendo números al usuario hasta que introduzca uno que esté entre
		 * esos valores para mostrarle dicha tabla de multiplicar. Por ejemplo:
		 * Introduce un valor entre 1 y 10 32 Introduce un valor entre 1 y 10 2 La tabla
		 * de multiplicar del 2 es: 2x0=0 2x1=2 2x2=4 .
		 */
		
		
		Scanner Tabla = new Scanner (System.in);

		System.out.println("Introduce La Tabla Del Número:");
		int Numero = Tabla.nextInt();


		for (int i = 1; i <= 10; i++) {



			if (Numero >= 1 || Numero <= 10) {

				int Multiplicacion = Numero * i;

				int Resultado = Multiplicacion;

				System.out.println(Multiplicacion + " X " + i + " = " + Resultado);}

		}

		Tabla.close();
		
	}
}