package Control_De_Flujo;
import java.util.*;

public class Ventanilla_Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Enunciado: Escribir un programa que asigne la ventanilla a un cliente de un
		 * banco en función de su edad y de su solicitud. EL usuario introduce el tipo
		 * de cliente y su solicitud en el TPV tecleando un número Tipos de clientes: 1.
		 * Jubilados 2. Menores de edad 3. No jubilados
		 * 
		 * Tipos de solicitudes 1. Sacar dinero 2. Ingresar dinero
		 * 
		 * Acciones: - Los jubilados sacan dinero en la ventanilla 10 y si quieren
		 * ingresar van a la ventanilla 11 - Los No jubilados sacan dinero en el cajero
		 * e ingresan en ventanilla 12 - A los menores de edad se les manda a casa
		 */
		
		Scanner Ventanilla = new Scanner (System.in);
		
		System.out.println("Bienvenido Introduce El Tipo De Cliente:");
		int Cliente = Ventanilla.nextInt();
		
		System.out.println("¿Que Tipo De Solicitud Desea Realizar?");
		int Solicitud = Ventanilla.nextInt();
		
		System.out.println("Introduzca Su Edad Por Favor:");
		int Edad = Ventanilla.nextInt();
		
		
		Ventanilla.close();
		
		
			// 	SOLICITUD 1 RETIRO DINERO JUBILADOS
		
			if (Cliente == 1 && Solicitud == 1 && Edad >= 65 && Edad <= 100) {
			
			System.out.println("Por Favor Pase Por La Ventanilla 10.");
			
			}
					
			// 	SOLICITUD 2 INGRESOS DINERO JUBILADOS

			if (Cliente == 1 && Solicitud == 2 && Edad >= 65 && Edad <= 100) {
				
				System.out.println("Por Favor Pase Por Ventanilla 11 Para Ingresos.");
			}
			
			// 	SOLICITUD 1 RETIRO DINERO NO JUBILADOS

			if (Cliente == 3 && Solicitud == 1 && Edad >= 18 && Edad <= 65) {
				
				System.out.println("Por Favor Retire El Dinero Del Cajero.");
			}
			
			// 	SOLICITUD 2 INGRESOS DINERO JUBILADOS

			if (Cliente == 3 && Solicitud == 2 && Edad >= 18 && Edad <= 65) {
				
				System.out.println("Por Favor Ingresos Por La Ventanilla 12.");	
			}

			// 	SOLICITUDES EN MENORES DE EDAD

			else if (Cliente == 2 && Solicitud <= 2 && Edad < 18) {
				
				System.out.println("Accion Invalida, Eres Menor De Edad Vete Para Tu Casa");
			}
	}
}