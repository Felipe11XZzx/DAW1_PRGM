package Control_De_Flujo;
import java.util.*;

public class Nota_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Enunciado: Usar un "SWITCH" Dada una nota numérica entre 0 y 10 por consola,
		 * se pide hacer un programita que en función de ese valor numérico muestre un
		 * mensaje al usuario: -Si el valor de la nota está entre 0 y 4 mostrará por
		 * consola. Suspenso -Si el valor de la nota está entre 5 y 8 mostrará por
		 * consola: Aprobado -Si el valor de la nota está entre 9 y 10 mostrará por
		 * consola: Sobresaliente
		 */
		
		Scanner Calificacion = new Scanner (System.in);
		
		System.out.println("Introduce La Calificacion:");
		
		int Nota = Calificacion.nextInt();
		
		Calificacion.close();
		
		switch (Nota) {
		
		case 0, 1, 2, 3, 4:	System.out.println("Estas Suspenso A Recuperar.");
		
		break;
		
		case 5, 6, 7, 8: System.out.println("Estas Aprobado Muy Bien.");
		break;
		
		case 9, 10: System.out.println("Eres Un Alumno Sobresaliente Felcitaciones.");
		break;
		
		default: System.out.println("Nota Invalida O Fuera De Rango");
		
		}
	}

}
