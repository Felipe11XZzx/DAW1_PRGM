package Arrays;
import java.util.*;

public class Tabla1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Crear una tabla de longitud 10 que se inicializará con números aleatorios
		 * comprendidos entre 1 y 100. Mostrar la suma de todos los números aleatorios
		 * que se guardan en la tabla.
		 */
		
		int Tabla1 [];
		
		
		Tabla1= new int [10];
		
		
		int Suma = 0;
		
		
		for (int i = 0; i < Tabla1.length; i ++) {
			
			Tabla1[i] = (int) (Math.random()*100 + 1);
			
			System.out.println("Tabla1 :" + Tabla1[i]);
			
			Suma = Suma + Tabla1[i];
		} 
		
		System.out.println(Arrays.toString(Tabla1));
		
		System.out.println("La Suma De Los Valores Es: " + Suma);

	}
	

}
