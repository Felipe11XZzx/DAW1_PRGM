package Control_De_Flujo;
import java.util.*;

public class Un_Dia_Mas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear un programa que recoja por consola una fecha expresada en día mes y año
		 * y le muestre al usuario la fecha correspondiente al día siguiente. Ejemplo:
		 * 28/2/1999 --> más 1 día--> 1/3/1999
		 * 
		 * El programa debe comprobar el código introducido por el usuario para que esté
		 * dentro de rango, comprobando que ese mes tiene los días. NO SE TENDRÁN EN
		 * CUENTA LOS MESES BISIESTOS.
		 */
		
		Scanner Fecha = new Scanner (System.in);
		
		
		System.out.println("Introuduce El Dia:");
		int Dia = Fecha.nextInt();
		
		System.out.println("Introuduce El Mes:");
		int Mes = Fecha.nextInt();
		
		System.out.println("Introuduce El Año:");
		int Año = Fecha.nextInt();
		
		Fecha.close();
		
	
		// CAMBIO DE MES EN ENERO, MARZO, MAYO, JULIO, AGOSTO, NOVIRMBRE, DICIEMBRE.

		if (Dia == 31 && Mes == 1 || Mes == 3 || Mes == 5 || Mes == 7 || Mes == 8 || Mes == 10 || Mes == 12) {
			
			Dia = 1;
			Mes++;
			System.out.println("Cambio de mes en meses de 31--> " + Dia + "/" + Mes + "/" + Año);
			}
		
		
		// DIA NORMAL EN ENERO, MARZO, MAYO, JULIO, AGOSTO, NOVIRMBRE, DICIEMBRE.

		else if (Dia <= 30 && Mes == 1|| Mes == 3 || Mes == 5 || Mes == 7 || Mes == 8 || Mes == 10 || Mes == 12) {
			
			Dia++;
			
			System.out.println("Más 1 día en meses de 31 dias--> " + Dia + "/" + Mes + "/" + Año);}
		
		
		// DIA NORMAL EN FEBRERO.

		else if (Dia <= 27 && Mes == 2) {
			
			Dia++;
			System.out.println("Más 1 día de febrero--> " + Dia + "/" + Mes + "/" + Año);
		}
		
		
		// CAMBIO DE MES DE FEBRERO A MARZO.

		if (Dia == 28 && Mes == 2) {
			
			Dia = 1;
			Mes++;
			System.out.println("Cambio de mes a marzo--> " + Dia + "/" + Mes + "/" + Año);
		}
		
		
		// DIA NORMAL EN ABRIL, JUNIO, SEPTIEMBRE, NOVIEMBRE.

		else if (Dia > 1 && Dia <= 29 && Mes == 4|| Mes == 6 || Mes == 9 || Mes == 11) {
					
			Dia++;	
			System.out.println("Más 1 día en meses de 30 dias--> " + Dia + "/" + Mes + "/" + Año);
				}
		
		
	// CAMBIO DE MES EN ABRIL, JUNIO, SEPTIEMBRE, NOVIEMBRE.
		
		if (Dia == 30 && Mes == 4|| Mes == 6 || Mes == 9 || Mes == 11) {
			
			Dia = 1;
			Mes++;
			System.out.println("Cambio de mes en meses de 30 dias--> " + Dia + "/" + Mes + "/" + Año);
				}
	}
}