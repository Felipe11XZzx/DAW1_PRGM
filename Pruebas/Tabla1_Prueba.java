package Pruebas;
import java.util.*;

public class Tabla1_Prueba {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int Aleatorios[];


	Aleatorios = new int[10];


	int Suma = 0;


	for (int Iteraciones = 0; Iteraciones < Aleatorios.length; Iteraciones++) {


		Aleatorios[Iteraciones] = (int) (Math.random() * 100) + 1;


		Suma = Suma + Aleatorios[Iteraciones];
	}


	System.out.println(Arrays.toString(Aleatorios));


	System.out.println("La Suma De Los Arrays Es Igual A: " + Suma);
	
	}

}
