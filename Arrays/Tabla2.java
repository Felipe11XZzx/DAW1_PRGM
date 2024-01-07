package Arrays;
import java.util.*;

public class Tabla2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Introduce por teclado un número n, a continuación solicita al usuario que
		 * teclee n números. Realiza la media de los números positivos, la media de los
		 * negativos y cuenta el número de ceros introducidos
		 */
		
		System.out.println("Introduce La Cantidad De Numeros Que Deas");

		Scanner Numeros = new Scanner (System.in);
		
		int numeros;
		numeros = Numeros.nextInt();
		
		System.out.println("Introduce Los Numeros De Uno En Uno:");
		
		int ValoresI;
		
		
		int TablaNumeros [];
		TablaNumeros = new int [numeros];
		
		int Ceros = 0;
		double ContadorNegativos = 0;
		double ContadorPositivos = 0;
		double Positivos = 0;
		double Negativos = 0;
		double MediaPositivos;
		double MediaNegativos;
		
		
		for (int i = 0; i < numeros; i++) {
			
			TablaNumeros[i] = ValoresI = Numeros.nextInt();
			
			if (TablaNumeros[i] < 0) {
				
				Negativos = Negativos + TablaNumeros[i];
				
				ContadorNegativos++;
			}
			
			else if (TablaNumeros[i] > 0) {
				
				Positivos = Positivos + TablaNumeros[i];
				
				ContadorPositivos++;
			}
			
			else {
				
				Ceros++;
			}
			
}
		
		if (ContadorNegativos > 0) {
			
			MediaNegativos = Negativos / ContadorNegativos;
			
			System.out.println("La Media De Los Numeros Negativos Introducidos Es: " + MediaNegativos);
		}


		if (ContadorPositivos > 0) {
			
			MediaPositivos = Positivos / ContadorPositivos;
			
			System.out.println("La Media De Los Numeros Positivos Introducidos Es: " + MediaPositivos);
		}
		
		System.out.println("La Cantidad De Ceros Introducidos Es: " + Ceros);

		
		Numeros.close();
		
	}

}
