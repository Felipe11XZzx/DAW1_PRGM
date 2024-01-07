package Control_De_Flujo;
import java.util.*;

public class Nota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Enunciado: Dada una nota numérica entre 0 y 10 por consola, se pide hacer un
		 * programita que en función de ese valor numérico muestre un mensaje al
		 * usuario: -Si el valor de la nota está entre 0 y 4 mostrará por consola.
		 * Suspenso -Si el valor de la nota está entre 5 y 8 mostrará por consola:
		 * Aprobado -Si el valor de la nota está entre 9 y 10 mostrará por consola:
		 * Sobresaliente
		 */
		
		Scanner Calificacion = new Scanner (System.in);
		
		System.out.println("Introduce La Calificacion Del Alumno:");
		
		double Nota = Calificacion.nextDouble();
		
		Calificacion.close();
		
		if (Nota > 0 && Nota <= 4 ) {
			
			System.out.println("El Alumno Esta Suspenso A Recuperar: " + Nota);
		}
		
		if (Nota >= 5 && Nota <= 8.99) {
			
			System.out.println("El Alumno Esta Aprobado: " + Nota);
		}
		
		if (Nota >= 9 && Nota <= 10) {
			
			System.out.println("El Alumno Esta Aprobado: " + Nota);
		}	
	}
}
