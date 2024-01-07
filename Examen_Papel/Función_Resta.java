package Examen_Papel;

public class Función_Resta {
	
	static int Resta (int Num1, int Num2) {
		
		int Resultado = Num1 - Num2;
		
		return (Resultado);
	}
	
	
	static double Resta (double Num1, double Num2) {
		
		double resta = Num1 - Num2;
		
		return (resta);
	}
	
	
static long Resta (long Num1, long Num2) {
		
		long rest = Num1 - Num2;
		
		return (rest);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int resultado = 0;
		
		resultado = Resta(11, 7);
		System.out.println("El Resultado Es: " + resultado);
		
		
		double result = 0;
		
		result = Resta(11.48, 10.55);
		System.out.println("El Resultado Es: " + result);
		
		
		long Resultado = 0;
		
		Resultado = Resta(11111111, 99000);
		System.out.println("El Resultado Es: " + Resultado);
	}

}
