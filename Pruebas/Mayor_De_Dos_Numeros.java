package Pruebas;
import java.util.*;

public class Mayor_De_Dos_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un programa que indique si un numero es mayor que otro 
		 * evalua todos los casos posibles.
		 */
		Scanner Mayor = new Scanner (System.in);
		
		int Num1, Num2;
		
		System.out.println("Introduce El Primer Numero:");
		
		Num1 = Mayor.nextInt();
		
		System.out.println("Introduce El Segundo Numero:");
		
		Num2 = Mayor.nextInt();
		
		Mayor.close();
		
		if (Num1 > Num2) {
			
			System.out.println("El Primer Numero Introducido Es Mayor Que El Segundo" + Num1);
		}
		
		else if (Num2 > Num1) {
			
			System.out.println("El Segundo Numero Introducido Es Mayor Que El Primero" + Num2);
		}
		
		else {
			
			System.out.println("Son Iguales");
		}
		
		
		
		
	}

}
