package Funciones;

public class Función_Aleatorios1 {
	
	
	static int Random1 (int Cantidad) {
		
		for (int J = 1; J <= Cantidad; Cantidad--) {
			
			int NumeroRandom = (int) (Math.random()*2);
		
			System.out.println("Cantidad De Números Que Pide La Función: " + NumeroRandom);

		}
		
		
		return (Cantidad);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Sobrecarga la función realizada en el ejercicio anterior
		 * "Función aleatorios 1.0" para que el único parámetro sea la cantidad de
		 * números aleatorios que se muestra por consola. Los números aleatorios serán
		 * reales y estarán comprendidos entre 0 y 1
		 */
		
		Random1 (8);
	}

}
