package Bucles;
import java.util.*;

public class Numero_Aleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Desarrolla un código que recree el juego "número secreto" que consiste en
		 * acertar un número entre 0 y 99 (generado aleatoriamente). Para ello se
		 * introduce por teclado una serie de números para los que el programa nos da la
		 * pista si el número a acertar es mayor o menor. El proceso termina cuando el
		 * usuario acierta el número o cuando se rinde (introduciendo un -1 para
		 * rendirse).
		 */
		
		

		int Num = 0; int Secreto;
		
		Scanner Numero = new Scanner (System.in);
		System.out.println("Introduce Un Numero:");
		
		Secreto = (int) (Math.random()*101);
		System.out.println( "Este Es El Numero Secreto: " + Secreto);

		
		
		while (Num != Secreto) {
			
			Num =	Numero.nextInt();
			
			if (Num <= 0 || Num > 101) {
				
				System.out.println("Numero Invalido");
				
				System.exit(0);
			}

			
			if (Num > Secreto) {
				
				System.out.println("El Numero Esta En Un Rango Menor.");
			}
			
			
			if (Num < Secreto) {
				
				System.out.println("El Numero Esta En Un Rango Mayor");
			}
			
			
			if (Num == Secreto) {
				
				System.out.println("Enhorabuna Has Adivinado El Numero Secreto.");
			}
			
			
			else if (Num == -1) {
				
				System.out.println("Eres Muy Flojo Te Das Por Vencido");
			}
			
		}
		Numero.close();

	}

}