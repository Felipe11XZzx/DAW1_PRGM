package Bucles;

public class Recorrer_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Dado el string="Textodelstring."
		 * recorre dicho string con un while sacando por consola cada letra de principio
		 * a fin.
		 * Nota, la primera posición del string es la 0.
		 */
		
		String Texto = "Textodelstring";
		
		int Contador = 0;
		int Letra = 0;
		
		int Palabra = Texto.length();
		
		char Posicion = Texto.charAt(0);
		
		while(Contador < Palabra) {
			
			Contador++;
			
			Posicion = Texto.charAt(Letra);
			
			System.out.println(Posicion);
			
			Letra++;
		}

		
		
	}

}
