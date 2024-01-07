package Arrays;

import java.util.*;

public class Tabla_Pares_Impares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Leer y almacenar n números enteros en una tabla, a partir de la que se
		 * construirán otras dos tablas con los elementos con valores pares e impares de
		 * la primera, respectivamente. Las tablas pares e impares deben mostrarse
		 * ordenadas.
		 */

		Scanner Datos = new Scanner(System.in);

		int Numeros;

		System.out.println("Cantidad De Números a Introducir:");
		Numeros = Datos.nextInt();

		int Nums[] = new int[Numeros];

		int Pares[] = new int[Numeros];

		int Impares[] = new int[Numeros];
		
		System.out.println("Introduce Los Números:");

		for (int i = 0; i < Numeros; i++) {

			Nums[i] = Datos.nextInt();

			if (Nums[i] % 2 == 0) {

				Pares[i] = Nums[i];
			}

			else {

				Impares[i] = Nums[i];
			}
		}

		Arrays.sort(Impares);
		Arrays.sort(Pares);

		for (int i = 0; i < Numeros; i++) {

			if (Pares[i] != 0) {

				System.out.println("Números Pares Introducidos: " + Pares[i]);
			}
			
		}

			for (int i = 0; i < Numeros; i++) {

				if (Impares[i] != 0) {

					System.out.println("Números Impares Introducidos: " + Impares[i]);
				}
			}

		Datos.close();
		
	}
}
