package Bucles;
import java.util.*;

public class Triangulo_Asteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Pedir por consola un número n y dibujar un triángulo recctángulo de n
		 * elementos de lado, utilizando para ello asteriscos. Por ejemplo, para n=3 * *
		 *    ***
		 *    **
		 *    */
		
		
		Scanner Rectangulo = new Scanner (System.in);
		
		System.out.println("Introduce El Tamaño Del Rectangulo:");
		
		int Figura = Rectangulo.nextInt();
		
		Rectangulo.close();
		
		
		for (int Ancho = 0; Ancho < Figura; Figura--) {
			
			for (int Largo = 0; Largo < Figura; Largo ++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();}	
	}
}