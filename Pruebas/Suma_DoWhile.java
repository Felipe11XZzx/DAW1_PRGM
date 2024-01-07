package Pruebas;
import java.util.*;

public class Suma_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un program que pida numeros enteros y muestre la
		 * suma de todos estos con una cadena vacia o un 0.
		 */
		
		Scanner Numeros = new Scanner (System.in);		
		int Suma = 0;
		int Num;
		
		
		do {
			
			System.out.println("Introduce Numeros Para Sumar:");
			
			Num = Numeros.nextInt();
			
			Suma += Num;
			
		}while(Num != 0);
		
		System.out.println("La Suma De Todos Los Numeros Es: " + Suma);
		 
		Numeros.close();
	}

}
