package Examen;

public class Funcion_RectanguloEspacios {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		RectanguloVacio(16,4);
		
	}
	
	
	static void RectanguloVacio (int Anchura, int Altura) {
		
		
	    for (int i = 0; i <= Altura; i++) {
	    	
            for (int j = 0; j <= Anchura; j++) {
            	
            	
                if (i == 0 || i == Altura || j == 0 || j == Anchura) {
                	
                    System.out.print("*");
                } 
                
                else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }

	}
}