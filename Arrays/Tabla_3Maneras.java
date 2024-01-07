package Arrays;
import java.util.*;

public class Tabla_3Maneras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Crea una tabla de 10 elementos y muestra todos sus elementos usando tres
		 * maneras diferentes: - System.out.println(Arrays.toString('tabla'); - Con un
		 * 'for' - Con un 'for' extendido
		 */
		
		String Frutas [] = {"Pera", "Kiwi", "Melón", "Fresa", "Mora", "Piña", "Coco", "Caqui", "Manzana", "Sandia", "Guayaba"};
		
		System.out.println(Arrays.toString(Frutas));
		
		
		for (String Mercancia : Frutas) {
			
			System.out.println(" | " + Mercancia + " | ");
		}
		
		for (int i = 0 ; i < Frutas.length; i++) {
			
			System.out.print(" / " + Frutas[i] + " / ");
		}
		
	}

}
