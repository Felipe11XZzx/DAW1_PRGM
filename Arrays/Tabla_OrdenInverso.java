package Arrays;
import java.util.*;

public class Tabla_OrdenInverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Escribir una aplicación que solicite al usuario cuántos números desea
		 * introducir. A continuación, introducir por teclado esa cantidad de números
		 * enteros, y por último, mostrar en el orden inverso al introducido.
		 */	
		
		Scanner Numeros = new Scanner (System.in);
		
		
		System.out.println("Introduce La Cantidad De Números:");
		int Nums = 0;
		Nums = Numeros.nextInt();
		
		
		System.out.println("Introduce Los Números De Uno En Uno:");
		
		
		int Valores [];				
		Valores = new int [Nums];
		
		
		
		for (int i = Valores.length - 1; i >= 0; i--) {
			
			Valores[i] = Numeros.nextInt();
			
		}
		
		System.out.println(Arrays.toString(Valores));
		
		Numeros.close();
		
	}
}