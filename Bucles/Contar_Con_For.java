package Bucles;
import java.util.*;

public class Contar_Con_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Escribe una aplicación que pida un número por consola n y muestre todos los
		 * números de 1 a n
		 */
		
		Scanner Numero = new Scanner (System.in);
		
		System.out.println("Introduce Un Numero:");
		
		int Num1 = Numero.nextInt();
		
		
		for (int i = 1; i <= Num1; i ++) {
			
			System.out.print(i + " | ");
		}
		
		Scanner Numero2 = new Scanner (System.in);
		
		System.out.println("Introduce Un Numero:");
		
		int Num2 = Numero2.nextInt();
		
		
		for (int J = 0; J < Num2; Num2 --) {
			
			System.out.print(Num2 + " | ");
		}
		
		
		Numero.close();
		Numero2.close();
		
	}

}
