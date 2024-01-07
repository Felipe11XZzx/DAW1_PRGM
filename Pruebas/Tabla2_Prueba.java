package Pruebas;
import java.util.*;

public class Tabla2_Prueba {


	public static void main(String[] args) {

		System.out.println("¿Cuántos números quieres guardar en la tabla?.\nIntroduce el número:");

		Scanner entrada = new Scanner(System.in);

		int n=0;

		n = entrada.nextInt();		

		System.out.println("Introduce los números a continuación de uno en uno");

		int valorNumero;

		int []tabla;

		tabla=new int[n];

		double contadorPositivos=0;

		double contadorNegativos=0;

		double contadorCeros=0;

		double sumaPositivos=0;

		double sumaNegativos=0;

		double mediaPos;

		double mediaNeg;

		

		for (int i=0; i<n;i++) {

			tabla[i]=valorNumero=entrada.nextInt();

			if (tabla[i]<0) {

				sumaNegativos=sumaNegativos+tabla[i];

				contadorNegativos++;

			}

			else if (tabla[i]>0) {

				sumaPositivos=sumaPositivos+tabla[i];

				contadorPositivos++;

			}

			else contadorCeros++;

		}

		if (contadorNegativos>0){

			mediaNeg=sumaNegativos/contadorNegativos;

			System.out.println("Media Negativos= "+mediaNeg);

		}

		if (contadorPositivos>0) {

			mediaPos=sumaPositivos/contadorPositivos;

			System.out.println("Media Positivos= "+mediaPos);

		}

		System.out.println("Cantidad de ceros= "+ contadorCeros);

	}

}
