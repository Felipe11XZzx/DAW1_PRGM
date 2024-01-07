package Funciones;
import java.util.*;

public class Prueba_Función {
	
	
	static void Suma () {
		int Num1;
		int Suma = 0;
		int resultado = 0;

		Scanner Numero = new Scanner(System.in);
		System.out.print("Ingrese Un Número: ");
		int N1 = Numero.nextInt();


		Num1 = N1;

		Numero.close();

		if (Num1 >= 1) {

			for(Suma = Num1 -1; Suma > 0; Suma--) {


				resultado = resultado + Suma;
				System.out.print(Suma + " + ");}

		}

		if (Num1 <= 0){

			for(Suma = Num1 +1 ; Suma <0; Suma++) {


				resultado = resultado + Suma;
				System.out.print(Suma + " + ");}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Suma ();
		
		

		

	}
}