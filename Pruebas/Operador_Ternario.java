package Pruebas;

import java.util.Scanner;

public class Operador_Ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * En el caso de que la expresión tenga un valor de true se retorna el valor
		 * indicado después del cierre de interrogación (?) Y si la expresión tiene un
		 * valor de false se retorna el valor que esté después de los dos puntos (:).
		 * El operador ternario se suele utilizar para decidir que valor asignar.
		 */
		
		
	Scanner Mayor = new Scanner (System.in);
		
		int Num1, Num2;
		
		System.out.println("Introduce El Primer Numero:");
		
		Num1 = Mayor.nextInt();
		
		System.out.println("Introduce El Segundo Numero:");
		
		Num2 = Mayor.nextInt();
		
		Mayor.close();
		
		int mayor;
		
		if (Num1 > Num2) {
		
			mayor = Num1;}
		
		else {
			
			mayor = Num2;
			
		}
		System.out.println("IF: El Mayor Es: " + mayor);
		
		mayor = Num1 > Num2 ? Num1 : Num2;
		
		System.out.println("Operador Ternario: El Mayor Es: " + mayor);
	}

}
