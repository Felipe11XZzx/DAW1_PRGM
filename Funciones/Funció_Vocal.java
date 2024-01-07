package Funciones;
import java.util.*;

public class Funció_Vocal {
	
	
	static boolean Vocal (char Letra) {
		
		boolean Vocal = false;
		
		Scanner Abecedario = new Scanner (System.in);
		
		System.out.println("Introduce Una Letra:");
		
		Letra = Abecedario.next().charAt(0);
		
		Abecedario.close();
		
		if (Letra == 'A' || Letra == 'E' || Letra == 'I' || Letra == '0' || Letra == 'U'
				|| Letra == 'a' || Letra == 'e' || Letra == 'i' || Letra == 'o' || Letra == 'u') {
			
			Vocal = true;
			
			System.out.println("Es Una De Las Vocales: " + Letra);
		}
		
		else {
			
			Vocal = false;
			
			System.out.println("Es Una Letra Normal Del Abecedario: " + Letra);
		}
		
		return (Vocal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Crear un función que, mediante un booleano, indique si el carácter que se le
		 * pasa como parámetro de entrada(char) corresponde con una vocal. Usa dicha
		 * función desde el método principal para comprobar si un carácter introducido
		 * por el usuario por consola es o no una vocal.
		 */
		
		Vocal('A');
	}

}
