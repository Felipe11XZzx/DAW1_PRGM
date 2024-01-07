package Bucles;
import java.util.*;

public class Suma_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Desarrollar un juego que ayude a mejorar el cáclulo mental de la suma. El
		 * jugador tendrá que introducir la solución de la suma de dos números enteros
		 * aleatorios comprendidos entre 1 y 100. Mientras que la solución introducida
		 * sea correcta, el juego continuará. En caso contrario el programa terminará y
		 * mostrará el número de operaciones realizadas correctamente
		 */
		
		int Num1 = 0; int Num2 = 0; int Resultado = 0; int Operaciones = 0; int Suma = 0;
		
		
		
		do {
			
			Num1 =  (int) (Math.random()*100 + 1);
			Num2 =  (int) (Math.random()*100 + 1);
			
			Suma = Num1 + Num2;
			
			System.out.println("El Primer Sumando Es: " + Num1);
			System.out.println("El Segundo Sumando Es: " + Num2);
			

			Scanner oper = new Scanner (System.in);
			
			System.out.println("Realiza La Suma:");
			
			Resultado = oper.nextInt();
			
			if (Suma == Resultado) {
				
				System.out.println("Suma Correcta Continua.");
			}
			
			else {
				
				System.out.println("Suma Incorrecta.");
			}
			
			Operaciones ++;
			
			
		}while (Suma == Resultado); 			


	
		
		System.out.println("Total De Operaciones Corectas: " + (Operaciones - 1));
	}


}
