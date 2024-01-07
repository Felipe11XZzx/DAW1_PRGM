package Arrays;

public class Función_MaximoValorTabla {
	
	
	static int MaximoTabla (int t []) {
		
		int Maximo = t [0];
		
		for (int Posicion : t) {
			
			if (Posicion > Maximo) {
				
				Maximo = Posicion;}
		}
		
		return Maximo;}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Diseñar la función: int maximo(int t[]), que devuelva el máximo valor
		 * contenido en la tabla 't'
		 */
		
		
		int Tabla [] = {11, 99, 8, 7, 6 , 5};
		
		 int Numero =MaximoTabla(Tabla);
		
		System.out.println((Numero));
	}
}