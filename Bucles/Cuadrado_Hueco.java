package Bucles;


import java.util.Scanner;

public class Cuadrado_Hueco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Se precisa realizar un programa que dibuje con asteriscos un cuadrado de lado
		 * n, siendo n un número introducido por el usuario por consola. No se precisa
		 * controlar la entrada de datos del usuario, se presupone que los datos
		 * introducidos serán correctos Realizar con el código con 2 "For"
		 */	
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese Un Número Entero Para El Tamaño Del Cuadrado: ");
        int Cuadrado = scanner.nextInt();

        for (int C = Cuadrado;  C != 0; C = C -1) {
        	
            for (int Astec = Cuadrado; Astec != 0; Astec = Astec -1) {
            	
                System.out.print(" * ");
            }
            
            System.out.println();
        }
        scanner.close();}


}