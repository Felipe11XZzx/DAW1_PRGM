package Bucles;

public class Cuadrado_Asteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Se precisa realizar un programa que dibuje con asteriscos un cuadrado de lado
		 * n, siendo n un número introducido por el usuario por consola. No se precisa
		 * controlar la entrada de datos del usuario, se presupone que los datos
		 * introducidos serán correcto, Realizar con el código con 2 "For"
		 */
		
		
		int Alto = 7; int Largo = 15; 
		
		
		for (int i = 0; i < Alto; i ++) {
			
			for (int j = 0; j < Largo; j++ ) {
				
				System.out.print("*");
			}
			
			System.out.println();}

	}

}