package Examen_Papel;

public class Rectangulo_hueco {
	
	static void RectanguloHueco (int Altura, int Anchura) {
		
		for (int i = 0; i <= Altura; i++) {
			
			for (int j = 0; j <= Anchura; j++) {
				
				if (i == 0 || i == Altura || j == 0 || j == Anchura) {
					
					System.out.print("*");}
				
				else {
					
                    System.out.print(" ");}
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RectanguloHueco(4, 16);
	}

}
