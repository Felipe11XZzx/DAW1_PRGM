package Arrays;
import java.util.*;


public class Ordenar_Tablas {
	
	
	static int [] RellenaPares (int Longitud, int Fin) {
		
		int TablaNumeros [] = new int [Longitud];
		
		int j = 0;
		
		while (j < TablaNumeros.length) {
			
			int NumRandom = (int) (Math.random()* Fin + 1);
			
			if (NumRandom % 2 == 0) {
				
				TablaNumeros[j] = NumRandom;
				j++;
			}
		}
		
			Arrays.sort(TablaNumeros);
			
			return TablaNumeros;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Escribir la función int[ ] rellenaPares(int longitud, int fin), que crea y
		 * devuelve una tabla ordenada de la longitud especificada, que se encuentra
		 * rellena con números pares aleatorios comprendidos en el rango desde 2 hasta
		 * 'fin'(inclusive)
		 */	
		
		int [] Pares = RellenaPares(7, 1000);
		
		System.out.println(Arrays.toString(Pares));

	}
}