package Funciones;

public class Funciónes {

	// Ejemplo De Una Función Sin Argumentos Ni Retorno.

	static void Saluda (){

		System.out.println("Hola Mi Nombre Es Luis Felipe Hernandez");
	}


	// Ejemplo De Una Función Con Argumentos Y Retorno.

	static int Suma (int Num1, int Num2) {

		int Resultado = Num1 + Num2;

		System.out.println("El Resultado De La Suma Es: " + Resultado);
		return (Resultado);
	}

	static double Suma (double Num1, double Num2) {

		double Oper = Num1 + Num2;

		System.out.println("El Resultado De La Suma Decimal Es: " + Oper);

		return (Oper);
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Saluda();
		Saluda();
		Saluda();
		Saluda();


		Suma(5, 11);
		Suma(5, 111);
		Suma(5, 99);
		Suma(5, 78);

		// Ejemplo De Una Sobrecarga De Función.

		Suma (11.05, 45.01);
		

	}

}
