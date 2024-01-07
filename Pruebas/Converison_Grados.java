package Pruebas;
import java.util.*;

public class Converison_Grados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Crea un programa en el cual se le introduzca la temperatura en fahrenheit por
		 * consola y realice la conversion a grados centigrados.
		 */
		
		double Fahrenheit;
		double Centigrados;
		
		Scanner Conversion = new Scanner (System.in);
		
		System.out.println("Cantidad De Temperatura A Convertir:");
		
		Fahrenheit = Conversion.nextDouble();
		
		Centigrados = (Fahrenheit - 32) * 5/9;
		
		Conversion.close();
		
		System.out.println("El Resultado De La Conversion A Centigrados Es: " + Centigrados);
	}

}
