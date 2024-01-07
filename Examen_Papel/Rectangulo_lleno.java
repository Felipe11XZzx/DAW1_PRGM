package Examen_Papel;

public class Rectangulo_lleno {
	
	
	static void Rectangulo (int Altura, int Anchura) {
		
		
		for (int i = 0; i < Altura; i++) {
			
			for (int j = 0; j < Anchura; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Rectangulo (4,16);
	}

}
