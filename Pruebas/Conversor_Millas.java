package Pruebas;
import java.util.*;

public class Conversor_Millas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un programa en el cual se le introduzca la longitud en Millas por
		 * consola y realice la conversion a Kilometros.
		 */
		
		int Millas;
		double Kilometros;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce La Cantidad Que Quieres Convertir");
		Millas = entrada.nextInt();
		
		Kilometros = Millas * 1.609;
		
		entrada.close();

		System.out.println("El Resultafo De La Conversion Es: " + Kilometros);
	}

}
