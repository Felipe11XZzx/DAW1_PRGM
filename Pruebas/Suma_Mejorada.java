package Pruebas;
import java.util.*;

public class Suma_Mejorada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Pida al usuario numero enteros hasta que se introduzca una cadena vacia, el
		 * programa debe mostrar el numero mas alto, mas pequeño y la media.
		 */
		
		Scanner Dato = new Scanner (System.in);
		
		int Suma = 0;
		String Cadena;
		int Valores = 0;
		
		System.out.println("Introduce Un Numero Para Sumar");
		Cadena = Dato.nextLine();
		
		int Numero = Integer.parseInt(Cadena);
		int Mayor = Numero;
		int Menor = Numero;
		Suma += Numero;
		Valores++;
		
		while(! Cadena.equals("")){
			
			System.out.println("Introduce Un Numero Para Sumar");
			Cadena = Dato.nextLine();

			
			if (! Cadena.equals("")) {
				
				Numero = Integer.parseInt(Cadena);
				Suma += Numero;
				Valores++;
			
			
			if (Numero > Mayor) {
				
				Mayor = Numero;}
			
			if (Numero < Menor) {
				
				Menor  = Numero;}
			
			}
		}
		
		Dato.close();
		
		System.out.println("El Resultado De La Media De Todos Los Valores Es: " + ((double)Suma / Valores));
		System.out.println("El Numero Mayor Es: " + Mayor);
		System.out.println("El Numero Menor Es: " + Menor);

	}

}
