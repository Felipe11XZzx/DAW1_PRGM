package Bucles;
import java.util.*;

public class Numero_Par {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Desarrolla un programa que mientras que los datos introducidos por consola
		 * sean pares muestre un mensaje: "número par", hasta que el dato introducido
		 * sea impar en el que mostrará el mensaje: "dato impar, fin del programa".
		 */	
		
		
		Scanner Numero = new Scanner (System.in);
		
		System.out.println("Introduce Un Numero:");
		
		int Dato = Numero.nextInt();
		
		
		while (Dato % 2 == 0) {
			
			System.out.println("Introduce Otro Numero Par");
			Dato = Numero.nextInt();
			
		} 
		
		System.out.println("Dato Impar, Fin Del Programa");
		
		Numero.close();
		
	}

}
