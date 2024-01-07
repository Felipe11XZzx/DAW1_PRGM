package Bucles;
import java.util.*;

public class Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Enunciado: Elevar un número a una potencia con un bucle WHILE. El usuario
		 * introduce la base y el exponente por consola. El programa debe calcularnos
		 * mediante un bucle WHILE el resultado de esa operación y mostrarnos el
		 * resultado y la cantidad de iteraciones que ha hecho en dicho bucle.
		 * Condiciones: El exponente tiene que ser mayor o igual a 1.
		 */
		
		int Contador = 0, Base = 0, Producto = 1, Exponente = 0, Repeticion = 0;
		
		
		Scanner Potencia = new Scanner (System.in);
		
		System.out.println("Introduce La Base Del Numero:");
		Base = Potencia.nextInt();

		System.out.println("Introduce El Exponenete Del Numero:");
		Exponente = Potencia.nextInt();

	
		while (Contador < Exponente) {
			
			Contador++;
			
			 Producto = Base * Producto;
			
			Repeticion++;
			
			System.out.println("Veces Que Se Repite El Bucle: " + Repeticion);
			
		}
		
		System.out.println("El Resultado De La Potencia Es: " + Producto);

		Potencia.close();
		
	}

}
