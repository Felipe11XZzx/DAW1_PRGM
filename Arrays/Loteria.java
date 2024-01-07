package Arrays;
import java.util.*;

public class Loteria {
	
	
	static int Primitiva  (int [] Apuesta, int [] Primitiva) {
		
		
		int Aciertos = 0;
		
		for (int i = 0; i < Apuesta.length; i++) {
			
			if (Arrays.binarySearch(Primitiva, Apuesta[i]) >= 0) {
			
				Aciertos++;
			}
		}
		
		return Aciertos;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Definir una función que tome como parámetros dos tablas, la primera con los 6
		 * números de una apuesta de la primitiva, y la segunda (ordenada) con los 6
		 * números de la combinación ganadora. La función devolverá el número de
		 * aciertos
		 */
		
		int Apuesta [] = {99, 11, 77, 5, 0, 1};
		int Loteria [] = {77, 1, 11, 99, 5, 8};
		
		Arrays.sort(Loteria);
				
		int Primitiva = Primitiva (Apuesta, Loteria);
		
		System.out.println("El Número De Aciertos Es: " + Primitiva);
	
	}

}
