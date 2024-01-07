package Funciones;

public class Función_DiferenciaHoras {
	
	static int DiferenciaTiempo (int Hora1, int Min1, int Hora2, int Min2) {
	
		
	int Tiempo1 = Hora1 * 60 + Min1;
	
	int Tiempo2 = Hora2 * 60 + Min2;
	
	int MinMenos = Tiempo1 - Tiempo2;
	
	
	if (Min1 < 0 || Min2 < 0) {
		
		System.out.println("Tiempo Incorrecto"); System.exit(0);}
	

	System.out.println("La Diferencia De Ambas Horas En Minutos Es: " + MinMenos + " Minutos");
	
	return (MinMenos);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Diseña una función a la que se le pasan las horas y minutos de dos instantes
		 * de tiempo con el siguiente prototipo
		 * static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2)
		 * La función devolverá la cantidad de minutos que existen de diferencia entre
		 * los dos instantes utilizados.
		 */

		
		DiferenciaTiempo (11, 55, 11, 00);
		

	}

}
