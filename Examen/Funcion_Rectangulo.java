package Examen;

public class Funcion_Rectangulo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Rectangulo(14,4);
		
	}
	
	
	static void Rectangulo (int Anchura, int Altura) {
		
		
		for (int i = 0; i < Altura; i++) {
			
			
			for (int j = 0; j < Anchura; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println("");
		}
	}
}