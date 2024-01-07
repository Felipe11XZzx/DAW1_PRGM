package Examen;

public class Funciones_Resta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Operacion = Resta(55,44);
		
		System.out.println("El Resultado Es: " + Operacion);
		
		/////////////////////////////////////////////////////////////
		
		double Result = Resta(11.01 , 9.70);
		
		System.out.println("Funcion Sobrecarga Double: " + Result);
		
		/////////////////////////////////////////////////////////////
		
		long Number = Resta(11000000 , 7000000);
		
		System.out.println("Funcion Sobrecarga Long: " + Number);

	}
		
	static int Resta (int Num1, int Num2) {

		
		int Operacion = Num1 - Num2;
		
		return Operacion;
	}
	
	
	static double Resta (double Num1, double Num2) {
		
		
		double calculo = Num1 - Num2;
		
		return calculo;
	}
	
	
	static long Resta (long Num1, long Num2) {
		
		
		long Resultado = Num1 - Num2;
		
		return Resultado;	
	}
}
