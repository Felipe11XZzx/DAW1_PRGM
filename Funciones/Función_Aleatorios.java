package Funciones;
import java.util.*;

public class Función_Aleatorios {
	
	
	 static int Random1 (int Cantidad, int RangoMin, int RangoMax) {

		  Scanner Cant = new Scanner(System.in);
	       System.out.println("Introduce La Cantidad De La Lista");
	       Cantidad = Cant.nextInt();


	       Scanner Minimo = new Scanner(System.in);
	       System.out.println("Introduce El Rango Minimo");
	       RangoMin = Minimo.nextInt();


	       Scanner Maximo = new Scanner(System.in);
	       System.out.println("Introduce El Rango Maximo");
	       RangoMax = Maximo.nextInt();




	       while (Cantidad != 0) {


	           int Lista = Random1(Cantidad, RangoMin, RangoMax);


	           System.out.print(Lista + " | ");


	           Cantidad--;
	       }

	       while (Cantidad != 0) {




	           int Rango = (int) (Math.random()*100);


	           if(Rango > RangoMin && Rango < RangoMax) {


	               Cantidad --;


	               return Rango;}


	       }


	       int aux = 0;


	       return aux;


	 

	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea una función que muestre por consola una serie de números aleatorios
		 * enteros. Los parámetros de la función serán: la cantidad de números
		 * aleatorios que se mostrarán y los valores mínimos y máximos que estos pueden
		 * tomar.
		 */	
		
	
		Random1(5, 16, 55);
	}

}
